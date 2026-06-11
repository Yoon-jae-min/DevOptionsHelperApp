package com.devoptionshelper

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.devoptionshelper.databinding.ActivityGuideBinding
import com.devoptionshelper.guide.DevOptionGuideData
import com.devoptionshelper.guide.GuideListAdapter

class GuideActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGuideBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuideBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setNavigationOnClickListener { finish() }

        val adapter = GuideListAdapter { item ->
            startActivity(
                Intent(this, GuideDetailActivity::class.java)
                    .putExtra(GuideDetailActivity.EXTRA_GUIDE_ID, item.id)
            )
        }
        binding.recyclerGuide.layoutManager = LinearLayoutManager(this)
        binding.recyclerGuide.adapter = adapter
        adapter.submitItems(DevOptionGuideData.items)
    }
}
