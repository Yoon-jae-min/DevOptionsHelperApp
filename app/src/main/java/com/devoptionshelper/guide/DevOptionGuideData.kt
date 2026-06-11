package com.devoptionshelper.guide

import com.devoptionshelper.R

object DevOptionGuideData {

    val items: List<DevOptionGuideItem> = listOf(
        DevOptionGuideItem(
            id = "memory",
            titleResId = R.string.guide_memory_title,
            summaryResId = R.string.guide_memory_summary,
            descriptionResId = R.string.guide_memory_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "bug_report",
            titleResId = R.string.guide_bug_report_title,
            summaryResId = R.string.guide_bug_report_summary,
            descriptionResId = R.string.guide_bug_report_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "desktop_backup_password",
            titleResId = R.string.guide_desktop_backup_title,
            summaryResId = R.string.guide_desktop_backup_summary,
            descriptionResId = R.string.guide_desktop_backup_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "stay_awake",
            titleResId = R.string.guide_stay_awake_title,
            summaryResId = R.string.guide_stay_awake_summary,
            descriptionResId = R.string.guide_stay_awake_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "bluetooth_stack_log",
            titleResId = R.string.guide_bluetooth_stack_log_title,
            summaryResId = R.string.guide_bluetooth_stack_log_summary,
            descriptionResId = R.string.guide_bluetooth_stack_log_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "bluetooth_hci_snoop",
            titleResId = R.string.guide_bluetooth_hci_title,
            summaryResId = R.string.guide_bluetooth_hci_summary,
            descriptionResId = R.string.guide_bluetooth_hci_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "bluetooth_hci_filter",
            titleResId = R.string.guide_bluetooth_hci_filter_title,
            summaryResId = R.string.guide_bluetooth_hci_filter_summary,
            descriptionResId = R.string.guide_bluetooth_hci_filter_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "bluetooth_hci_filter_pbap",
            titleResId = R.string.guide_bluetooth_hci_filter_pbap_title,
            summaryResId = R.string.guide_bluetooth_hci_filter_pbap_summary,
            descriptionResId = R.string.guide_bluetooth_hci_filter_pbap_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "bluetooth_hci_filter_map",
            titleResId = R.string.guide_bluetooth_hci_filter_map_title,
            summaryResId = R.string.guide_bluetooth_hci_filter_map_summary,
            descriptionResId = R.string.guide_bluetooth_hci_filter_map_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "oem_unlock",
            titleResId = R.string.guide_oem_unlock_title,
            summaryResId = R.string.guide_oem_unlock_summary,
            descriptionResId = R.string.guide_oem_unlock_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "running_services",
            titleResId = R.string.guide_running_services_title,
            summaryResId = R.string.guide_running_services_summary,
            descriptionResId = R.string.guide_running_services_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "picture_color_mode",
            titleResId = R.string.guide_picture_color_title,
            summaryResId = R.string.guide_picture_color_summary,
            descriptionResId = R.string.guide_picture_color_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "webview_implementation",
            titleResId = R.string.guide_webview_title,
            summaryResId = R.string.guide_webview_summary,
            descriptionResId = R.string.guide_webview_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "auto_system_update",
            titleResId = R.string.guide_auto_update_title,
            summaryResId = R.string.guide_auto_update_summary,
            descriptionResId = R.string.guide_auto_update_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "demo_mode",
            titleResId = R.string.guide_demo_mode_title,
            summaryResId = R.string.guide_demo_mode_summary,
            descriptionResId = R.string.guide_demo_mode_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "quick_settings_tiles",
            titleResId = R.string.guide_quick_tiles_title,
            summaryResId = R.string.guide_quick_tiles_summary,
            descriptionResId = R.string.guide_quick_tiles_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "grammatical_gender",
            titleResId = R.string.guide_grammatical_gender_title,
            summaryResId = R.string.guide_grammatical_gender_summary,
            descriptionResId = R.string.guide_grammatical_gender_desc,
            category = GuideCategory.COMMON
        ),
        DevOptionGuideItem(
            id = "usb_debugging",
            titleResId = R.string.guide_usb_debugging_title,
            summaryResId = R.string.guide_usb_debugging_summary,
            descriptionResId = R.string.guide_usb_debugging_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "revoke_usb_debugging",
            titleResId = R.string.guide_revoke_usb_debugging_title,
            summaryResId = R.string.guide_revoke_usb_debugging_summary,
            descriptionResId = R.string.guide_revoke_usb_debugging_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "at_commands_3gpp",
            titleResId = R.string.guide_at_commands_title,
            summaryResId = R.string.guide_at_commands_summary,
            descriptionResId = R.string.guide_at_commands_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "wireless_debugging",
            titleResId = R.string.guide_wireless_debugging_title,
            summaryResId = R.string.guide_wireless_debugging_summary,
            descriptionResId = R.string.guide_wireless_debugging_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "adb_auth_timeout",
            titleResId = R.string.guide_adb_auth_timeout_title,
            summaryResId = R.string.guide_adb_auth_timeout_summary,
            descriptionResId = R.string.guide_adb_auth_timeout_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "bug_report_shortcut",
            titleResId = R.string.guide_bug_report_shortcut_title,
            summaryResId = R.string.guide_bug_report_shortcut_summary,
            descriptionResId = R.string.guide_bug_report_shortcut_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "verbose_vendor_logging",
            titleResId = R.string.guide_verbose_vendor_logging_title,
            summaryResId = R.string.guide_verbose_vendor_logging_summary,
            descriptionResId = R.string.guide_verbose_vendor_logging_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "view_attribute_inspection",
            titleResId = R.string.guide_view_attribute_title,
            summaryResId = R.string.guide_view_attribute_summary,
            descriptionResId = R.string.guide_view_attribute_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "select_debug_app",
            titleResId = R.string.guide_select_debug_app_title,
            summaryResId = R.string.guide_select_debug_app_summary,
            descriptionResId = R.string.guide_select_debug_app_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "wait_for_debugger",
            titleResId = R.string.guide_wait_debugger_title,
            summaryResId = R.string.guide_wait_debugger_summary,
            descriptionResId = R.string.guide_wait_debugger_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "verify_apps_over_usb",
            titleResId = R.string.guide_verify_apps_usb_title,
            summaryResId = R.string.guide_verify_apps_usb_summary,
            descriptionResId = R.string.guide_verify_apps_usb_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "debuggable_bytecode",
            titleResId = R.string.guide_debuggable_bytecode_title,
            summaryResId = R.string.guide_debuggable_bytecode_summary,
            descriptionResId = R.string.guide_debuggable_bytecode_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "logger_buffer_size",
            titleResId = R.string.guide_logger_buffer_title,
            summaryResId = R.string.guide_logger_buffer_summary,
            descriptionResId = R.string.guide_logger_buffer_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "samsung_verbose_debug",
            titleResId = R.string.guide_samsung_verbose_title,
            summaryResId = R.string.guide_samsung_verbose_summary,
            descriptionResId = R.string.guide_samsung_verbose_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "feature_flags",
            titleResId = R.string.guide_feature_flags_title,
            summaryResId = R.string.guide_feature_flags_summary,
            descriptionResId = R.string.guide_feature_flags_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "gpu_debug_layers",
            titleResId = R.string.guide_gpu_debug_layers_title,
            summaryResId = R.string.guide_gpu_debug_layers_summary,
            descriptionResId = R.string.guide_gpu_debug_layers_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "enable_angle",
            titleResId = R.string.guide_enable_angle_title,
            summaryResId = R.string.guide_enable_angle_summary,
            descriptionResId = R.string.guide_enable_angle_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "disable_game_default_fps",
            titleResId = R.string.guide_disable_game_fps_title,
            summaryResId = R.string.guide_disable_game_fps_summary,
            descriptionResId = R.string.guide_disable_game_fps_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "graphics_driver",
            titleResId = R.string.guide_graphics_driver_title,
            summaryResId = R.string.guide_graphics_driver_summary,
            descriptionResId = R.string.guide_graphics_driver_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "app_compatibility",
            titleResId = R.string.guide_app_compatibility_title,
            summaryResId = R.string.guide_app_compatibility_summary,
            descriptionResId = R.string.guide_app_compatibility_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "show_refresh_rate",
            titleResId = R.string.guide_show_refresh_rate_title,
            summaryResId = R.string.guide_show_refresh_rate_summary,
            descriptionResId = R.string.guide_show_refresh_rate_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "settings_overlay",
            titleResId = R.string.guide_settings_overlay_title,
            summaryResId = R.string.guide_settings_overlay_summary,
            descriptionResId = R.string.guide_settings_overlay_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "virtual_modem",
            titleResId = R.string.guide_virtual_modem_title,
            summaryResId = R.string.guide_virtual_modem_summary,
            descriptionResId = R.string.guide_virtual_modem_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "system_tracing",
            titleResId = R.string.guide_system_tracing_title,
            summaryResId = R.string.guide_system_tracing_summary,
            descriptionResId = R.string.guide_system_tracing_desc,
            category = GuideCategory.DEBUGGING
        ),
        DevOptionGuideItem(
            id = "wireless_display_cert",
            titleResId = R.string.guide_wireless_display_cert_title,
            summaryResId = R.string.guide_wireless_display_cert_summary,
            descriptionResId = R.string.guide_wireless_display_cert_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "wifi_verbose_logging",
            titleResId = R.string.guide_wifi_verbose_title,
            summaryResId = R.string.guide_wifi_verbose_summary,
            descriptionResId = R.string.guide_wifi_verbose_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "wifi_scan_throttle",
            titleResId = R.string.guide_wifi_scan_throttle_title,
            summaryResId = R.string.guide_wifi_scan_throttle_summary,
            descriptionResId = R.string.guide_wifi_scan_throttle_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "wifi_mac_randomization",
            titleResId = R.string.guide_wifi_mac_random_title,
            summaryResId = R.string.guide_wifi_mac_random_summary,
            descriptionResId = R.string.guide_wifi_mac_random_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "always_mobile_data",
            titleResId = R.string.guide_always_mobile_data_title,
            summaryResId = R.string.guide_always_mobile_data_summary,
            descriptionResId = R.string.guide_always_mobile_data_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "tethering_hw_accel",
            titleResId = R.string.guide_tethering_hw_accel_title,
            summaryResId = R.string.guide_tethering_hw_accel_summary,
            descriptionResId = R.string.guide_tethering_hw_accel_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "network_download_rate_limit",
            titleResId = R.string.guide_network_rate_limit_title,
            summaryResId = R.string.guide_network_rate_limit_summary,
            descriptionResId = R.string.guide_network_rate_limit_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "default_usb_config",
            titleResId = R.string.guide_default_usb_config_title,
            summaryResId = R.string.guide_default_usb_config_summary,
            descriptionResId = R.string.guide_default_usb_config_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "show_unnamed_bt_devices",
            titleResId = R.string.guide_unnamed_bt_title,
            summaryResId = R.string.guide_unnamed_bt_summary,
            descriptionResId = R.string.guide_unnamed_bt_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "show_unsupported_ble_devices",
            titleResId = R.string.guide_unsupported_ble_title,
            summaryResId = R.string.guide_unsupported_ble_summary,
            descriptionResId = R.string.guide_unsupported_ble_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "disable_absolute_volume",
            titleResId = R.string.guide_disable_absolute_volume_title,
            summaryResId = R.string.guide_disable_absolute_volume_summary,
            descriptionResId = R.string.guide_disable_absolute_volume_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "disable_avc_blocklist",
            titleResId = R.string.guide_disable_avc_blocklist_title,
            summaryResId = R.string.guide_disable_avc_blocklist_summary,
            descriptionResId = R.string.guide_disable_avc_blocklist_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "disable_ble_audio_hw_offload",
            titleResId = R.string.guide_disable_ble_audio_offload_title,
            summaryResId = R.string.guide_disable_ble_audio_offload_summary,
            descriptionResId = R.string.guide_disable_ble_audio_offload_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "disable_a2dp_hw_offload",
            titleResId = R.string.guide_disable_a2dp_offload_title,
            summaryResId = R.string.guide_disable_a2dp_offload_summary,
            descriptionResId = R.string.guide_disable_a2dp_offload_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "bluetooth_avrcp_version",
            titleResId = R.string.guide_bt_avrcp_title,
            summaryResId = R.string.guide_bt_avrcp_summary,
            descriptionResId = R.string.guide_bt_avrcp_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "hd_audio",
            titleResId = R.string.guide_hd_audio_title,
            summaryResId = R.string.guide_hd_audio_summary,
            descriptionResId = R.string.guide_hd_audio_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "bt_audio_sample_rate",
            titleResId = R.string.guide_bt_sample_rate_title,
            summaryResId = R.string.guide_bt_sample_rate_summary,
            descriptionResId = R.string.guide_bt_sample_rate_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "bt_audio_bits_per_sample",
            titleResId = R.string.guide_bt_bits_per_sample_title,
            summaryResId = R.string.guide_bt_bits_per_sample_summary,
            descriptionResId = R.string.guide_bt_bits_per_sample_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "bt_audio_channel_mode",
            titleResId = R.string.guide_bt_channel_mode_title,
            summaryResId = R.string.guide_bt_channel_mode_summary,
            descriptionResId = R.string.guide_bt_channel_mode_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "bt_audio_ldac_quality",
            titleResId = R.string.guide_bt_ldac_quality_title,
            summaryResId = R.string.guide_bt_ldac_quality_summary,
            descriptionResId = R.string.guide_bt_ldac_quality_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "bluetooth_map",
            titleResId = R.string.guide_bluetooth_map_title,
            summaryResId = R.string.guide_bluetooth_map_summary,
            descriptionResId = R.string.guide_bluetooth_map_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "bluetooth_pbap",
            titleResId = R.string.guide_bluetooth_pbap_title,
            summaryResId = R.string.guide_bluetooth_pbap_summary,
            descriptionResId = R.string.guide_bluetooth_pbap_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "bluetooth_sap",
            titleResId = R.string.guide_bluetooth_sap_title,
            summaryResId = R.string.guide_bluetooth_sap_summary,
            descriptionResId = R.string.guide_bluetooth_sap_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "nfc_verbose_vendor_log",
            titleResId = R.string.guide_nfc_verbose_title,
            summaryResId = R.string.guide_nfc_verbose_summary,
            descriptionResId = R.string.guide_nfc_verbose_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "nfc_nci_unfiltered_log",
            titleResId = R.string.guide_nfc_nci_log_title,
            summaryResId = R.string.guide_nfc_nci_log_summary,
            descriptionResId = R.string.guide_nfc_nci_log_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "network_5g_mode",
            titleResId = R.string.guide_5g_mode_title,
            summaryResId = R.string.guide_5g_mode_summary,
            descriptionResId = R.string.guide_5g_mode_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "video_ringback_tones",
            titleResId = R.string.guide_video_ringback_title,
            summaryResId = R.string.guide_video_ringback_summary,
            descriptionResId = R.string.guide_video_ringback_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "ims_ts32_profile",
            titleResId = R.string.guide_ims_ts32_title,
            summaryResId = R.string.guide_ims_ts32_summary,
            descriptionResId = R.string.guide_ims_ts32_desc,
            category = GuideCategory.NETWORKING
        ),
        DevOptionGuideItem(
            id = "show_taps",
            titleResId = R.string.guide_show_taps_title,
            summaryResId = R.string.guide_show_taps_summary,
            descriptionResId = R.string.guide_show_taps_desc,
            category = GuideCategory.INPUT
        ),
        DevOptionGuideItem(
            id = "pointer_location",
            titleResId = R.string.guide_pointer_location_title,
            summaryResId = R.string.guide_pointer_location_summary,
            descriptionResId = R.string.guide_pointer_location_desc,
            category = GuideCategory.INPUT
        ),
        DevOptionGuideItem(
            id = "show_key_presses",
            titleResId = R.string.guide_show_key_presses_title,
            summaryResId = R.string.guide_show_key_presses_summary,
            descriptionResId = R.string.guide_show_key_presses_desc,
            category = GuideCategory.INPUT
        ),
        DevOptionGuideItem(
            id = "show_surface_updates",
            titleResId = R.string.guide_surface_updates_title,
            summaryResId = R.string.guide_surface_updates_summary,
            descriptionResId = R.string.guide_surface_updates_desc,
            category = GuideCategory.DRAWING
        ),
        DevOptionGuideItem(
            id = "show_layout_bounds",
            titleResId = R.string.guide_layout_bounds_title,
            summaryResId = R.string.guide_layout_bounds_summary,
            descriptionResId = R.string.guide_layout_bounds_desc,
            category = GuideCategory.DRAWING
        ),
        DevOptionGuideItem(
            id = "force_rtl",
            titleResId = R.string.guide_force_rtl_title,
            summaryResId = R.string.guide_force_rtl_summary,
            descriptionResId = R.string.guide_force_rtl_desc,
            category = GuideCategory.DRAWING
        ),
        DevOptionGuideItem(
            id = "window_animation_scale",
            titleResId = R.string.guide_window_anim_scale_title,
            summaryResId = R.string.guide_window_anim_scale_summary,
            descriptionResId = R.string.guide_window_anim_scale_desc,
            category = GuideCategory.DRAWING
        ),
        DevOptionGuideItem(
            id = "transition_animation_scale",
            titleResId = R.string.guide_transition_anim_scale_title,
            summaryResId = R.string.guide_transition_anim_scale_summary,
            descriptionResId = R.string.guide_transition_anim_scale_desc,
            category = GuideCategory.DRAWING
        ),
        DevOptionGuideItem(
            id = "animator_duration_scale",
            titleResId = R.string.guide_animator_scale_title,
            summaryResId = R.string.guide_animator_scale_summary,
            descriptionResId = R.string.guide_animator_scale_desc,
            category = GuideCategory.DRAWING
        ),
        DevOptionGuideItem(
            id = "simulate_secondary_display",
            titleResId = R.string.guide_secondary_display_title,
            summaryResId = R.string.guide_secondary_display_summary,
            descriptionResId = R.string.guide_secondary_display_desc,
            category = GuideCategory.DRAWING
        ),
        DevOptionGuideItem(
            id = "smallest_width",
            titleResId = R.string.guide_smallest_width_title,
            summaryResId = R.string.guide_smallest_width_summary,
            descriptionResId = R.string.guide_smallest_width_desc,
            category = GuideCategory.DRAWING
        ),
        DevOptionGuideItem(
            id = "display_cutout",
            titleResId = R.string.guide_display_cutout_title,
            summaryResId = R.string.guide_display_cutout_summary,
            descriptionResId = R.string.guide_display_cutout_desc,
            category = GuideCategory.DRAWING
        ),
        DevOptionGuideItem(
            id = "transparent_navigation",
            titleResId = R.string.guide_transparent_nav_title,
            summaryResId = R.string.guide_transparent_nav_summary,
            descriptionResId = R.string.guide_transparent_nav_desc,
            category = GuideCategory.DRAWING
        ),
        DevOptionGuideItem(
            id = "show_text_ids",
            titleResId = R.string.guide_show_text_ids_title,
            summaryResId = R.string.guide_show_text_ids_summary,
            descriptionResId = R.string.guide_show_text_ids_desc,
            category = GuideCategory.DRAWING
        ),
        DevOptionGuideItem(
            id = "show_view_updates",
            titleResId = R.string.guide_show_view_updates_title,
            summaryResId = R.string.guide_show_view_updates_summary,
            descriptionResId = R.string.guide_show_view_updates_desc,
            category = GuideCategory.RENDERING
        ),
        DevOptionGuideItem(
            id = "show_hw_layer_updates",
            titleResId = R.string.guide_hw_layer_updates_title,
            summaryResId = R.string.guide_hw_layer_updates_summary,
            descriptionResId = R.string.guide_hw_layer_updates_desc,
            category = GuideCategory.RENDERING
        ),
        DevOptionGuideItem(
            id = "debug_gpu_overdraw",
            titleResId = R.string.guide_gpu_overdraw_title,
            summaryResId = R.string.guide_gpu_overdraw_summary,
            descriptionResId = R.string.guide_gpu_overdraw_desc,
            category = GuideCategory.RENDERING
        ),
        DevOptionGuideItem(
            id = "debug_non_rect_clip",
            titleResId = R.string.guide_non_rect_clip_title,
            summaryResId = R.string.guide_non_rect_clip_summary,
            descriptionResId = R.string.guide_non_rect_clip_desc,
            category = GuideCategory.RENDERING
        ),
        DevOptionGuideItem(
            id = "force_dark_mode",
            titleResId = R.string.guide_force_dark_title,
            summaryResId = R.string.guide_force_dark_summary,
            descriptionResId = R.string.guide_force_dark_desc,
            category = GuideCategory.RENDERING
        ),
        DevOptionGuideItem(
            id = "force_4x_msaa",
            titleResId = R.string.guide_force_msaa_title,
            summaryResId = R.string.guide_force_msaa_summary,
            descriptionResId = R.string.guide_force_msaa_desc,
            category = GuideCategory.RENDERING
        ),
        DevOptionGuideItem(
            id = "disable_hw_overlays",
            titleResId = R.string.guide_disable_hw_overlay_title,
            summaryResId = R.string.guide_disable_hw_overlay_summary,
            descriptionResId = R.string.guide_disable_hw_overlay_desc,
            category = GuideCategory.RENDERING
        ),
        DevOptionGuideItem(
            id = "simulate_color_space",
            titleResId = R.string.guide_color_space_sim_title,
            summaryResId = R.string.guide_color_space_sim_summary,
            descriptionResId = R.string.guide_color_space_sim_desc,
            category = GuideCategory.RENDERING
        ),
        DevOptionGuideItem(
            id = "gpuwatch",
            titleResId = R.string.guide_gpuwatch_title,
            summaryResId = R.string.guide_gpuwatch_summary,
            descriptionResId = R.string.guide_gpuwatch_desc,
            category = GuideCategory.RENDERING
        ),
        DevOptionGuideItem(
            id = "disable_usb_audio",
            titleResId = R.string.guide_disable_usb_audio_title,
            summaryResId = R.string.guide_disable_usb_audio_summary,
            descriptionResId = R.string.guide_disable_usb_audio_desc,
            category = GuideCategory.MEDIA
        ),
        DevOptionGuideItem(
            id = "media_transcoding",
            titleResId = R.string.guide_media_transcoding_title,
            summaryResId = R.string.guide_media_transcoding_summary,
            descriptionResId = R.string.guide_media_transcoding_desc,
            category = GuideCategory.MEDIA
        ),
        DevOptionGuideItem(
            id = "media_drm",
            titleResId = R.string.guide_media_drm_title,
            summaryResId = R.string.guide_media_drm_summary,
            descriptionResId = R.string.guide_media_drm_desc,
            category = GuideCategory.MEDIA
        ),
        DevOptionGuideItem(
            id = "strict_mode",
            titleResId = R.string.guide_strict_mode_title,
            summaryResId = R.string.guide_strict_mode_summary,
            descriptionResId = R.string.guide_strict_mode_desc,
            category = GuideCategory.MONITORING
        ),
        DevOptionGuideItem(
            id = "hwui_profile",
            titleResId = R.string.guide_hwui_profile_title,
            summaryResId = R.string.guide_hwui_profile_summary,
            descriptionResId = R.string.guide_hwui_profile_desc,
            category = GuideCategory.MONITORING
        ),
        DevOptionGuideItem(
            id = "dont_keep_activities",
            titleResId = R.string.guide_dont_keep_activities_title,
            summaryResId = R.string.guide_dont_keep_activities_summary,
            descriptionResId = R.string.guide_dont_keep_activities_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "background_process_limit",
            titleResId = R.string.guide_bg_process_limit_title,
            summaryResId = R.string.guide_bg_process_limit_summary,
            descriptionResId = R.string.guide_bg_process_limit_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "background_check",
            titleResId = R.string.guide_background_check_title,
            summaryResId = R.string.guide_background_check_summary,
            descriptionResId = R.string.guide_background_check_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "always_show_crash_dialog",
            titleResId = R.string.guide_crash_dialog_title,
            summaryResId = R.string.guide_crash_dialog_summary,
            descriptionResId = R.string.guide_crash_dialog_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "show_background_anr",
            titleResId = R.string.guide_bg_anr_title,
            summaryResId = R.string.guide_bg_anr_summary,
            descriptionResId = R.string.guide_bg_anr_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "stop_cached_apps",
            titleResId = R.string.guide_stop_cached_apps_title,
            summaryResId = R.string.guide_stop_cached_apps_summary,
            descriptionResId = R.string.guide_stop_cached_apps_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "notification_channel_warnings",
            titleResId = R.string.guide_notif_channel_warn_title,
            summaryResId = R.string.guide_notif_channel_warn_summary,
            descriptionResId = R.string.guide_notif_channel_warn_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "disable_screen_share_protection",
            titleResId = R.string.guide_screen_share_protect_title,
            summaryResId = R.string.guide_screen_share_protect_summary,
            descriptionResId = R.string.guide_screen_share_protect_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "reset_notification_importance",
            titleResId = R.string.guide_reset_notif_importance_title,
            summaryResId = R.string.guide_reset_notif_importance_summary,
            descriptionResId = R.string.guide_reset_notif_importance_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "standby_apps",
            titleResId = R.string.guide_standby_apps_title,
            summaryResId = R.string.guide_standby_apps_summary,
            descriptionResId = R.string.guide_standby_apps_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "tare",
            titleResId = R.string.guide_tare_title,
            summaryResId = R.string.guide_tare_summary,
            descriptionResId = R.string.guide_tare_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "force_allow_on_external",
            titleResId = R.string.guide_force_external_title,
            summaryResId = R.string.guide_force_external_summary,
            descriptionResId = R.string.guide_force_external_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "resizable_activities",
            titleResId = R.string.guide_resizable_activities_title,
            summaryResId = R.string.guide_resizable_activities_summary,
            descriptionResId = R.string.guide_resizable_activities_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "freeform_windows",
            titleResId = R.string.guide_freeform_title,
            summaryResId = R.string.guide_freeform_summary,
            descriptionResId = R.string.guide_freeform_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "force_desktop_mode",
            titleResId = R.string.guide_force_desktop_title,
            summaryResId = R.string.guide_force_desktop_summary,
            descriptionResId = R.string.guide_force_desktop_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "multi_window_all_apps",
            titleResId = R.string.guide_multi_window_all_title,
            summaryResId = R.string.guide_multi_window_all_summary,
            descriptionResId = R.string.guide_multi_window_all_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "reset_shortcut_rate_limit",
            titleResId = R.string.guide_reset_shortcut_title,
            summaryResId = R.string.guide_reset_shortcut_summary,
            descriptionResId = R.string.guide_reset_shortcut_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "disable_app_compat_policy",
            titleResId = R.string.guide_disable_app_compat_title,
            summaryResId = R.string.guide_disable_app_compat_summary,
            descriptionResId = R.string.guide_disable_app_compat_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "stop_limiting_child_processes",
            titleResId = R.string.guide_child_process_limit_title,
            summaryResId = R.string.guide_child_process_limit_summary,
            descriptionResId = R.string.guide_child_process_limit_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "force_note_role",
            titleResId = R.string.guide_force_note_role_title,
            summaryResId = R.string.guide_force_note_role_summary,
            descriptionResId = R.string.guide_force_note_role_desc,
            category = GuideCategory.APPS
        ),
        DevOptionGuideItem(
            id = "autofill_logging_level",
            titleResId = R.string.guide_autofill_log_title,
            summaryResId = R.string.guide_autofill_log_summary,
            descriptionResId = R.string.guide_autofill_log_desc,
            category = GuideCategory.AUTOFILL
        ),
        DevOptionGuideItem(
            id = "autofill_max_requests",
            titleResId = R.string.guide_autofill_max_requests_title,
            summaryResId = R.string.guide_autofill_max_requests_summary,
            descriptionResId = R.string.guide_autofill_max_requests_desc,
            category = GuideCategory.AUTOFILL
        ),
        DevOptionGuideItem(
            id = "autofill_max_datasets",
            titleResId = R.string.guide_autofill_max_datasets_title,
            summaryResId = R.string.guide_autofill_max_datasets_summary,
            descriptionResId = R.string.guide_autofill_max_datasets_desc,
            category = GuideCategory.AUTOFILL
        ),
        DevOptionGuideItem(
            id = "autofill_reset_defaults",
            titleResId = R.string.guide_autofill_reset_title,
            summaryResId = R.string.guide_autofill_reset_summary,
            descriptionResId = R.string.guide_autofill_reset_desc,
            category = GuideCategory.AUTOFILL
        ),
        DevOptionGuideItem(
            id = "shared_data",
            titleResId = R.string.guide_shared_data_title,
            summaryResId = R.string.guide_shared_data_summary,
            descriptionResId = R.string.guide_shared_data_desc,
            category = GuideCategory.STORAGE
        ),
        DevOptionGuideItem(
            id = "mock_location_app",
            titleResId = R.string.guide_mock_location_title,
            summaryResId = R.string.guide_mock_location_summary,
            descriptionResId = R.string.guide_mock_location_desc,
            category = GuideCategory.LOCATION
        ),
        DevOptionGuideItem(
            id = "force_gnss_measurements",
            titleResId = R.string.guide_force_gnss_title,
            summaryResId = R.string.guide_force_gnss_summary,
            descriptionResId = R.string.guide_force_gnss_desc,
            category = GuideCategory.LOCATION
        ),
        DevOptionGuideItem(
            id = "disable_message_sandboxing",
            titleResId = R.string.guide_msg_sandbox_title,
            summaryResId = R.string.guide_msg_sandbox_summary,
            descriptionResId = R.string.guide_msg_sandbox_desc,
            category = GuideCategory.SECURITY
        ),
        DevOptionGuideItem(
            id = "stylus_handwriting",
            titleResId = R.string.guide_stylus_handwriting_title,
            summaryResId = R.string.guide_stylus_handwriting_summary,
            descriptionResId = R.string.guide_stylus_handwriting_desc,
            category = GuideCategory.INPUT_METHOD
        ),
        DevOptionGuideItem(
            id = "show_external_code",
            titleResId = R.string.guide_show_external_code_title,
            summaryResId = R.string.guide_show_external_code_summary,
            descriptionResId = R.string.guide_show_external_code_desc,
            category = GuideCategory.OPTIONAL
        )
    )

    fun findById(id: String): DevOptionGuideItem? = items.find { it.id == id }
}
