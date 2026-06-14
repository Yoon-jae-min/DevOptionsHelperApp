package com.devoptionshelper.guide

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.devoptionshelper.R
import com.google.android.material.card.MaterialCardView

sealed class GuideListEntry {
    data class Header(val category: GuideCategory) : GuideListEntry()
    data class Item(val guideItem: DevOptionGuideItem) : GuideListEntry()
}

class GuideListAdapter(
    private val context: Context,
    private val onItemClick: (DevOptionGuideItem) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val allItems = mutableListOf<DevOptionGuideItem>()
    private val entries = mutableListOf<GuideListEntry>()

    fun submitItems(items: List<DevOptionGuideItem>) {
        allItems.clear()
        allItems.addAll(items)
        filter("")
    }

    fun filter(query: String): Boolean {
        val normalizedQuery = query.trim()
        val matchedItems = if (normalizedQuery.isEmpty()) {
            allItems
        } else {
            allItems.filter { item ->
                context.getString(item.titleResId)
                    .contains(normalizedQuery, ignoreCase = true)
            }
        }
        rebuildEntries(matchedItems)
        notifyDataSetChanged()
        return matchedItems.isNotEmpty()
    }

    private fun rebuildEntries(items: List<DevOptionGuideItem>) {
        entries.clear()
        for (category in SECTION_ORDER) {
            val sectionItems = items.filter { it.category == category }
            if (sectionItems.isNotEmpty()) {
                entries.add(GuideListEntry.Header(category))
                sectionItems.forEach { entries.add(GuideListEntry.Item(it)) }
            }
        }
    }

    override fun getItemViewType(position: Int): Int = when (entries[position]) {
        is GuideListEntry.Header -> VIEW_TYPE_HEADER
        is GuideListEntry.Item -> VIEW_TYPE_ITEM
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            VIEW_TYPE_HEADER -> HeaderViewHolder(
                inflater.inflate(R.layout.item_guide_header, parent, false)
            )
            else -> ItemViewHolder(
                inflater.inflate(R.layout.item_guide_item, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val entry = entries[position]) {
            is GuideListEntry.Header -> (holder as HeaderViewHolder).bind(entry.category)
            is GuideListEntry.Item -> (holder as ItemViewHolder).bind(entry.guideItem, onItemClick)
        }
    }

    override fun getItemCount(): Int = entries.size

    private class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title: TextView = itemView.findViewById(R.id.tvSectionTitle)
        private val description: TextView = itemView.findViewById(R.id.tvSectionDesc)

        fun bind(category: GuideCategory) {
            when (category) {
                GuideCategory.COMMON -> {
                    title.setText(R.string.guide_section_common_title)
                    description.setText(R.string.guide_section_common_desc)
                }
                GuideCategory.DEBUGGING -> {
                    title.setText(R.string.guide_section_debugging_title)
                    description.setText(R.string.guide_section_debugging_desc)
                }
                GuideCategory.NETWORKING -> {
                    title.setText(R.string.guide_section_networking_title)
                    description.setText(R.string.guide_section_networking_desc)
                }
                GuideCategory.INPUT -> {
                    title.setText(R.string.guide_section_input_title)
                    description.setText(R.string.guide_section_input_desc)
                }
                GuideCategory.DRAWING -> {
                    title.setText(R.string.guide_section_drawing_title)
                    description.setText(R.string.guide_section_drawing_desc)
                }
                GuideCategory.RENDERING -> {
                    title.setText(R.string.guide_section_rendering_title)
                    description.setText(R.string.guide_section_rendering_desc)
                }
                GuideCategory.MEDIA -> {
                    title.setText(R.string.guide_section_media_title)
                    description.setText(R.string.guide_section_media_desc)
                }
                GuideCategory.MONITORING -> {
                    title.setText(R.string.guide_section_monitoring_title)
                    description.setText(R.string.guide_section_monitoring_desc)
                }
                GuideCategory.APPS -> {
                    title.setText(R.string.guide_section_apps_title)
                    description.setText(R.string.guide_section_apps_desc)
                }
                GuideCategory.AUTOFILL -> {
                    title.setText(R.string.guide_section_autofill_title)
                    description.setText(R.string.guide_section_autofill_desc)
                }
                GuideCategory.STORAGE -> {
                    title.setText(R.string.guide_section_storage_title)
                    description.setText(R.string.guide_section_storage_desc)
                }
                GuideCategory.LOCATION -> {
                    title.setText(R.string.guide_section_location_title)
                    description.setText(R.string.guide_section_location_desc)
                }
                GuideCategory.SECURITY -> {
                    title.setText(R.string.guide_section_security_title)
                    description.setText(R.string.guide_section_security_desc)
                }
                GuideCategory.INPUT_METHOD -> {
                    title.setText(R.string.guide_section_input_method_title)
                    description.setText(R.string.guide_section_input_method_desc)
                }
                GuideCategory.OPTIONAL -> {
                    title.setText(R.string.guide_section_optional_title)
                    description.setText(R.string.guide_section_optional_desc)
                }
            }
        }
    }

    private class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val card: MaterialCardView = itemView.findViewById(R.id.cardGuideItem)
        private val title: TextView = itemView.findViewById(R.id.tvGuideTitle)
        private val summary: TextView = itemView.findViewById(R.id.tvGuideSummary)
        private val badge: TextView = itemView.findViewById(R.id.tvGuideBadge)

        fun bind(item: DevOptionGuideItem, onItemClick: (DevOptionGuideItem) -> Unit) {
            title.setText(item.titleResId)
            summary.setText(item.summaryResId)
            when (item.category) {
                GuideCategory.COMMON -> {
                    badge.setText(R.string.guide_badge_common)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_common)
                }
                GuideCategory.DEBUGGING -> {
                    badge.setText(R.string.guide_badge_debugging)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_debugging)
                }
                GuideCategory.NETWORKING -> {
                    badge.setText(R.string.guide_badge_networking)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_networking)
                }
                GuideCategory.INPUT -> {
                    badge.setText(R.string.guide_badge_input)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_input)
                }
                GuideCategory.DRAWING -> {
                    badge.setText(R.string.guide_badge_drawing)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_drawing)
                }
                GuideCategory.RENDERING -> {
                    badge.setText(R.string.guide_badge_rendering)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_rendering)
                }
                GuideCategory.MEDIA -> {
                    badge.setText(R.string.guide_badge_media)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_media)
                }
                GuideCategory.MONITORING -> {
                    badge.setText(R.string.guide_badge_monitoring)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_monitoring)
                }
                GuideCategory.APPS -> {
                    badge.setText(R.string.guide_badge_apps)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_apps)
                }
                GuideCategory.AUTOFILL -> {
                    badge.setText(R.string.guide_badge_autofill)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_autofill)
                }
                GuideCategory.STORAGE -> {
                    badge.setText(R.string.guide_badge_storage)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_storage)
                }
                GuideCategory.LOCATION -> {
                    badge.setText(R.string.guide_badge_location)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_location)
                }
                GuideCategory.SECURITY -> {
                    badge.setText(R.string.guide_badge_security)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_security)
                }
                GuideCategory.INPUT_METHOD -> {
                    badge.setText(R.string.guide_badge_input_method)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_input_method)
                }
                GuideCategory.OPTIONAL -> {
                    badge.setText(R.string.guide_badge_optional)
                    badge.setBackgroundResource(R.drawable.bg_guide_badge_optional)
                }
            }
            card.setOnClickListener { onItemClick(item) }
        }
    }

    companion object {
        private const val VIEW_TYPE_HEADER = 0
        private const val VIEW_TYPE_ITEM = 1
        private val SECTION_ORDER = listOf(
            GuideCategory.COMMON,
            GuideCategory.DEBUGGING,
            GuideCategory.NETWORKING,
            GuideCategory.INPUT,
            GuideCategory.DRAWING,
            GuideCategory.RENDERING,
            GuideCategory.MEDIA,
            GuideCategory.MONITORING,
            GuideCategory.APPS,
            GuideCategory.AUTOFILL,
            GuideCategory.STORAGE,
            GuideCategory.LOCATION,
            GuideCategory.SECURITY,
            GuideCategory.INPUT_METHOD,
            GuideCategory.OPTIONAL
        )
    }
}
