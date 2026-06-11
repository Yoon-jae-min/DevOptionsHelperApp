package com.devoptionshelper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devoptionshelper.databinding.ActivityGuideDetailBinding
import com.devoptionshelper.guide.DevOptionGuideData
import com.devoptionshelper.guide.GuideCategory

class GuideDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGuideDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuideDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val guideId = intent.getStringExtra(EXTRA_GUIDE_ID)
        val item = guideId?.let { DevOptionGuideData.findById(it) }
        if (item == null) {
            finish()
            return
        }

        binding.toolbar.title = getString(item.titleResId)
        binding.toolbar.setNavigationOnClickListener { finish() }

        binding.tvGuideTitle.setText(item.titleResId)
        binding.tvGuideDescription.setText(item.descriptionResId)

        when (item.category) {
            GuideCategory.COMMON -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_common)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_common)
            }
            GuideCategory.DEBUGGING -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_debugging)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_debugging)
            }
            GuideCategory.NETWORKING -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_networking)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_networking)
            }
            GuideCategory.INPUT -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_input)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_input)
            }
            GuideCategory.DRAWING -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_drawing)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_drawing)
            }
            GuideCategory.RENDERING -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_rendering)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_rendering)
            }
            GuideCategory.MEDIA -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_media)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_media)
            }
            GuideCategory.MONITORING -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_monitoring)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_monitoring)
            }
            GuideCategory.APPS -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_apps)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_apps)
            }
            GuideCategory.AUTOFILL -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_autofill)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_autofill)
            }
            GuideCategory.STORAGE -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_storage)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_storage)
            }
            GuideCategory.LOCATION -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_location)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_location)
            }
            GuideCategory.SECURITY -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_security)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_security)
            }
            GuideCategory.INPUT_METHOD -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_input_method)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_input_method)
            }
            GuideCategory.OPTIONAL -> {
                binding.tvGuideBadge.setText(R.string.guide_badge_optional)
                binding.tvGuideBadge.setBackgroundResource(R.drawable.bg_guide_badge_optional)
            }
        }
    }

    companion object {
        const val EXTRA_GUIDE_ID = "extra_guide_id"
    }
}
