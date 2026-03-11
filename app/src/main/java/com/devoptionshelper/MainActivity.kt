package com.devoptionshelper

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.devoptionshelper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateToggleState()
        setupClickListeners()
    }

    override fun onResume() {
        super.onResume()
        updateToggleState()
    }

    private fun setupClickListeners() {
        binding.btnToggleDevOptions.setOnClickListener {
            toggleDeveloperOptions()
        }
        binding.btnOpenDevOptionsMenu.setOnClickListener {
            openDeveloperOptionsMenu()
        }
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

    private fun updateToggleState() {
        val enabled = isDeveloperOptionsEnabled()
        binding.tvStatus.text = if (enabled) {
            getString(R.string.status_developer_options_on)
        } else {
            getString(R.string.status_developer_options_off)
        }
        binding.btnToggleDevOptions.text = if (enabled) {
            getString(R.string.btn_turn_off)
        } else {
            getString(R.string.btn_turn_on)
        }
        binding.btnOpenDevOptionsMenu.isEnabled = enabled
        binding.cardDevOptionsMenu.alpha = if (enabled) 1f else 0.5f
    }

    private fun toggleDeveloperOptions() {
        val currentlyEnabled = isDeveloperOptionsEnabled()
        val newValue = if (currentlyEnabled) 0 else 1

        try {
            Settings.Global.putInt(contentResolver, DEVELOPMENT_SETTINGS_ENABLED_KEY, newValue)
            updateToggleState()
            Toast.makeText(
                this,
                if (newValue == 1) getString(R.string.toast_dev_options_on)
                else getString(R.string.toast_dev_options_off),
                Toast.LENGTH_SHORT
            ).show()
        } catch (e: SecurityException) {
            showPermissionRequiredDialog()
        } catch (e: Exception) {
            Toast.makeText(this, getString(R.string.toast_error), Toast.LENGTH_LONG).show()
        }
    }

    private fun showPermissionRequiredDialog() {
        AlertDialog.Builder(this)
            .setTitle(R.string.dialog_permission_title)
            .setMessage(getString(R.string.dialog_permission_message))
            .setPositiveButton(android.R.string.ok, null)
            .show()
    }

    private fun openDeveloperOptionsMenu() {
        try {
            val intent = Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS")
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, getString(R.string.toast_cannot_open_settings), Toast.LENGTH_LONG).show()
        }
    }

    companion object {
        private const val DEVELOPMENT_SETTINGS_ENABLED_KEY = "development_settings_enabled"
    }
}
