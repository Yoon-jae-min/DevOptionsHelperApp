package com.devoptionshelper.guide

enum class GuideCategory {
    COMMON,
    DEBUGGING,
    NETWORKING,
    INPUT,
    DRAWING,
    RENDERING,
    MEDIA,
    MONITORING,
    APPS,
    AUTOFILL,
    STORAGE,
    LOCATION,
    SECURITY,
    INPUT_METHOD,
    OPTIONAL
}

data class DevOptionGuideItem(
    val id: String,
    val titleResId: Int,
    val summaryResId: Int,
    val descriptionResId: Int,
    val category: GuideCategory
)
