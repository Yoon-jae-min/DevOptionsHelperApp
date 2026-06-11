package com.devoptionshelper

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.Settings
import android.widget.CompoundButton
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.devoptionshelper.databinding.ActivityMainBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var suppressSwitchCallback = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this) {}
        binding.adViewBanner.loadAd(AdRequest.Builder().build())

        updateUi()
        setupClickListeners()
    }

    override fun onResume() {
        super.onResume()
        binding.adViewBanner.resume()
        updateUi()
    }

    override fun onPause() {
        binding.adViewBanner.pause()
        super.onPause()
    }

    override fun onDestroy() {
        binding.adViewBanner.destroy()
        super.onDestroy()
    }

    private fun setupClickListeners() {
        binding.switchDevOptions.setOnCheckedChangeListener(switchListener)
        binding.btnOpenDevOptionsMenu.setOnClickListener {
            openDeveloperOptionsShortcut()
        }
        binding.btnOpenDevOptionsMenu.setOnLongClickListener {
            if (!isDeveloperOptionsEnabled()) {
                showEnableDeveloperOptionsDialog()
                true
            } else {
                false
            }
        }
        binding.btnShowPermissionHelp.setOnClickListener {
            showPermissionHelpDialog()
        }
        binding.btnOpenGuide.setOnClickListener {
            startActivity(Intent(this, GuideActivity::class.java))
        }
    }

    private val switchListener = CompoundButton.OnCheckedChangeListener { _, isChecked ->
        if (suppressSwitchCallback) return@OnCheckedChangeListener
        if (!hasWriteSecureSettingsPermission()) {
            revertSwitchToSystemState()
            showPermissionHelpDialog()
            return@OnCheckedChangeListener
        }
        if (isChecked != isDeveloperOptionsEnabled()) {
            toggleDeveloperOptions()
        }
    }

    private fun hasWriteSecureSettingsPermission(): Boolean {
        return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.WRITE_SECURE_SETTINGS
        ) == PackageManager.PERMISSION_GRANTED
    }

    private fun isDeveloperOptionsEnabled(): Boolean {
        return try {
            Settings.Global.getInt(
                contentResolver,
                DEVELOPMENT_SETTINGS_ENABLED_KEY,
                0
            ) != 0
        } catch (e: Exception) {
            false
        }
    }

    private fun updateUi() {
        val enabled = isDeveloperOptionsEnabled()
        val hasPermission = hasWriteSecureSettingsPermission()

        binding.tvStatus.text = if (enabled) {
            getString(R.string.status_developer_options_on)
        } else {
            getString(R.string.status_developer_options_off)
        }

        revertSwitchToSystemState()
        binding.switchDevOptions.alpha = if (hasPermission) 1f else 0.65f

        binding.tvQuickToggleHint.text = if (hasPermission) {
            getString(R.string.quick_toggle_ready)
        } else {
            getString(R.string.quick_toggle_need_permission)
        }

        if (enabled) {
            binding.tvShortcutDesc.text = getString(R.string.shortcut_desc_on)
            binding.btnOpenDevOptionsMenu.text = getString(R.string.btn_open_dev_options_on)
        } else {
            binding.tvShortcutDesc.text = getString(R.string.shortcut_desc_off)
            binding.btnOpenDevOptionsMenu.text = getString(R.string.btn_open_dev_options_off)
        }
    }

    private fun revertSwitchToSystemState() {
        suppressSwitchCallback = true
        binding.switchDevOptions.isChecked = isDeveloperOptionsEnabled()
        suppressSwitchCallback = false
    }

    private fun toggleDeveloperOptions() {
        if (!hasWriteSecureSettingsPermission()) {
            showPermissionHelpDialog()
            updateUi()
            return
        }

        val currentlyEnabled = isDeveloperOptionsEnabled()
        val newValue = if (currentlyEnabled) 0 else 1

        try {
            Settings.Global.putInt(contentResolver, DEVELOPMENT_SETTINGS_ENABLED_KEY, newValue)
            updateUi()
            Toast.makeText(
                this,
                if (newValue == 1) getString(R.string.toast_dev_options_on)
                else getString(R.string.toast_dev_options_off),
                Toast.LENGTH_SHORT
            ).show()
        } catch (e: SecurityException) {
            showPermissionHelpDialog()
            updateUi()
        } catch (e: Exception) {
            Toast.makeText(this, getString(R.string.toast_error), Toast.LENGTH_LONG).show()
            updateUi()
        }
    }

    private fun showPermissionHelpDialog() {
        showScrollableMessageDialog(
            R.string.dialog_permission_title,
            R.string.dialog_permission_message
        )
    }

    private fun showScrollableMessageDialog(titleResId: Int, messageResId: Int) {
        val padding = (24 * resources.displayMetrics.density).toInt()
        val textView = TextView(this).apply {
            text = getString(messageResId)
            setPadding(padding, padding / 2, padding, 0)
            textSize = 14f
            setTextIsSelectable(true)
        }
        val scrollView = ScrollView(this).apply {
            addView(textView)
        }
        AlertDialog.Builder(this)
            .setTitle(titleResId)
            .setView(scrollView)
            .setPositiveButton(android.R.string.ok, null)
            .show()
    }

    private fun openDeveloperOptionsShortcut() {
        if (isDeveloperOptionsEnabled()) {
            if (startFirstAvailableActivity(DEV_OPTIONS_SETTINGS_INTENTS)) return
        } else {
            if (startFirstAvailableActivity(ENABLE_DEV_OPTIONS_SETTINGS_INTENTS)) {
                Toast.makeText(
                    this,
                    getString(R.string.toast_enable_dev_options_hint),
                    Toast.LENGTH_LONG
                ).show()
                return
            }
        }

        Toast.makeText(this, getString(R.string.toast_cannot_open_settings), Toast.LENGTH_LONG).show()
    }

    private fun showEnableDeveloperOptionsDialog() {
        AlertDialog.Builder(this)
            .setTitle(R.string.dialog_enable_dev_options_title)
            .setMessage(R.string.dialog_enable_dev_options_message)
            .setPositiveButton(android.R.string.ok, null)
            .show()
    }

    private fun startFirstAvailableActivity(intents: List<Intent>): Boolean {
        for (intent in intents) {
            if (intent.resolveActivity(packageManager) == null) continue
            try {
                startActivity(intent)
                return true
            } catch (e: Exception) {
                // try next fallback
            }
        }
        return false
    }

    companion object {
        private const val DEVELOPMENT_SETTINGS_ENABLED_KEY = "development_settings_enabled"

        private val DEV_OPTIONS_SETTINGS_INTENTS = listOf(
            Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS),
            Intent(Settings.ACTION_SETTINGS)
        )

        /** 휴대전화/디바이스 정보 — 빌드 번호 7회 탭으로 개발자 옵션 활성화 */
        private val ENABLE_DEV_OPTIONS_SETTINGS_INTENTS = listOf(
            Intent(Settings.ACTION_DEVICE_INFO_SETTINGS),
            Intent("android.settings.DEVICE_INFO_SETTINGS"),
            Intent(Settings.ACTION_SETTINGS)
        )
    }
}
