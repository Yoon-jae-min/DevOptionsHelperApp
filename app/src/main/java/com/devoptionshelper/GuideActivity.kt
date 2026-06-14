package com.devoptionshelper

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.recyclerview.widget.LinearLayoutManager
import com.devoptionshelper.databinding.ActivityGuideBinding
import com.devoptionshelper.guide.DevOptionGuideData
import com.devoptionshelper.guide.GuideListAdapter

class GuideActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGuideBinding
    private lateinit var adapter: GuideListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuideBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setNavigationOnClickListener { finish() }

        adapter = GuideListAdapter(this) { item ->
            startActivity(
                Intent(this, GuideDetailActivity::class.java)
                    .putExtra(GuideDetailActivity.EXTRA_GUIDE_ID, item.id)
            )
        }
        binding.recyclerGuide.layoutManager = LinearLayoutManager(this)
        binding.recyclerGuide.adapter = adapter
        adapter.submitItems(DevOptionGuideData.items)

        binding.etGuideSearch.doAfterTextChanged { text ->
            val hasResults = adapter.filter(text?.toString().orEmpty())
            binding.tvGuideSearchEmpty.visibility =
                if (hasResults) View.GONE else View.VISIBLE
            binding.recyclerGuide.visibility =
                if (hasResults) View.VISIBLE else View.GONE
        }
    }
}
