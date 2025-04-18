package com.facebook.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AnalyticsEvents {

    @NotNull
    public static final String EVENT_DEVICE_SHARE_BUTTON_CREATE = "fb_device_share_button_create";

    @NotNull
    public static final String EVENT_DEVICE_SHARE_BUTTON_DID_TAP = "fb_device_share_button_did_tap";

    @NotNull
    public static final String EVENT_FOA_DISAMBIGUATION_DIALOG_CANCELLED = "foa_disambiguation_dialog_cancelled";

    @NotNull
    public static final String EVENT_FOA_DISAMBIGUATION_DIALOG_FB_DID_TAP = "foa_disambiguation_dialog_fb_did_tap";

    @NotNull
    public static final String EVENT_FOA_DISAMBIGUATION_DIALOG_IG_DID_TAP = "foa_disambiguation_dialog_ig_did_tap";

    @NotNull
    public static final String EVENT_FOA_FB_LOGIN_BUTTON_CREATE = "foa_fb_login_button_create";

    @NotNull
    public static final String EVENT_FOA_FB_LOGIN_BUTTON_DID_TAP = "foa_fb_login_button_did_tap";

    @NotNull
    public static final String EVENT_FOA_IG_LOGIN_BUTTON_CREATE = "foa_ig_login_button_create";

    @NotNull
    public static final String EVENT_FOA_IG_LOGIN_BUTTON_DID_TAP = "foa_ig_login_button_did_tap";

    @NotNull
    public static final String EVENT_FOA_LOGIN_BUTTON_CREATE = "foa_login_button_create";

    @NotNull
    public static final String EVENT_FOA_LOGIN_BUTTON_DID_TAP = "foa_login_button_did_tap";

    @NotNull
    public static final String EVENT_FRIEND_PICKER_USAGE = "fb_friend_picker_usage";

    @NotNull
    public static final String EVENT_LIKE_BUTTON_CREATE = "fb_like_button_create";

    @NotNull
    public static final String EVENT_LIKE_BUTTON_DID_TAP = "fb_like_button_did_tap";

    @NotNull
    public static final String EVENT_LIKE_VIEW_CANNOT_PRESENT_DIALOG = "fb_like_control_cannot_present_dialog";

    @NotNull
    public static final String EVENT_LIKE_VIEW_DIALOG_DID_SUCCEED = "fb_like_control_dialog_did_succeed";

    @NotNull
    public static final String EVENT_LIKE_VIEW_DID_LIKE = "fb_like_control_did_like";

    @NotNull
    public static final String EVENT_LIKE_VIEW_DID_PRESENT_DIALOG = "fb_like_control_did_present_dialog";

    @NotNull
    public static final String EVENT_LIKE_VIEW_DID_PRESENT_FALLBACK = "fb_like_control_did_present_fallback_dialog";

    @NotNull
    public static final String EVENT_LIKE_VIEW_DID_UNDO_QUICKLY = "fb_like_control_did_undo_quickly";

    @NotNull
    public static final String EVENT_LIKE_VIEW_DID_UNLIKE = "fb_like_control_did_unlike";

    @NotNull
    public static final String EVENT_LIKE_VIEW_ERROR = "fb_like_control_error";

    @NotNull
    public static final String EVENT_LOGIN_BUTTON_CREATE = "fb_login_button_create";

    @NotNull
    public static final String EVENT_LOGIN_BUTTON_DID_TAP = "fb_login_button_did_tap";

    @NotNull
    public static final String EVENT_LOGIN_VIEW_USAGE = "fb_login_view_usage";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_COMPLETE = "fb_native_dialog_complete";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_START = "fb_native_dialog_start";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_LIKE = "fb_dialogs_present_like";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_MESSAGE = "fb_dialogs_present_message";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_OG_MESSAGE = "fb_dialogs_present_message_og";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_OG_SHARE = "fb_dialogs_present_share_og";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_PHOTO_MESSAGE = "fb_dialogs_present_message_photo";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_PHOTO_SHARE = "fb_dialogs_present_share_photo";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_SHARE = "fb_dialogs_present_share";

    @NotNull
    public static final String EVENT_NATIVE_DIALOG_TYPE_VIDEO_SHARE = "fb_dialogs_present_share_video";

    @NotNull
    public static final String EVENT_NATIVE_LOGIN_DIALOG_COMPLETE = "fb_dialogs_native_login_dialog_complete";

    @NotNull
    public static final String EVENT_NATIVE_LOGIN_DIALOG_START = "fb_dialogs_native_login_dialog_start";

    @NotNull
    public static final String EVENT_PLACE_PICKER_USAGE = "fb_place_picker_usage";

    @NotNull
    public static final String EVENT_SDK_INITIALIZE = "fb_sdk_initialize";

    @NotNull
    public static final String EVENT_SEND_BUTTON_CREATE = "fb_send_button_create";

    @NotNull
    public static final String EVENT_SEND_BUTTON_DID_TAP = "fb_send_button_did_tap";

    @NotNull
    public static final String EVENT_SHARE_BUTTON_CREATE = "fb_share_button_create";

    @NotNull
    public static final String EVENT_SHARE_BUTTON_DID_TAP = "fb_share_button_did_tap";

    @NotNull
    public static final String EVENT_SHARE_DIALOG_SHOW = "fb_share_dialog_show";

    @NotNull
    public static final String EVENT_SHARE_MESSENGER_DIALOG_SHOW = "fb_messenger_share_dialog_show";

    @NotNull
    public static final String EVENT_SHARE_RESULT = "fb_share_dialog_result";

    @NotNull
    public static final String EVENT_SMART_LOGIN_SERVICE = "fb_smart_login_service";

    @NotNull
    public static final String EVENT_USER_SETTINGS_USAGE = "fb_user_settings_vc_usage";

    @NotNull
    public static final String EVENT_WEB_LOGIN_COMPLETE = "fb_dialogs_web_login_dialog_complete";

    @NotNull
    public static final AnalyticsEvents INSTANCE = new AnalyticsEvents();

    @NotNull
    public static final String PARAMETER_ACTION_ID = "action_id";

    @NotNull
    public static final String PARAMETER_APP_ID = "app_id";

    @NotNull
    public static final String PARAMETER_CALL_ID = "call_id";

    @NotNull
    public static final String PARAMETER_DIALOG_OUTCOME = "fb_dialog_outcome";

    @NotNull
    public static final String PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED = "Cancelled";

    @NotNull
    public static final String PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED = "Completed";

    @NotNull
    public static final String PARAMETER_DIALOG_OUTCOME_VALUE_FAILED = "Failed";

    @NotNull
    public static final String PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN = "Unknown";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_AUXILIARY_POSITION = "auxiliary_position";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_CURRENT_ACTION = "current_action";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_ERROR_JSON = "error";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT = "horizontal_alignment";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_OBJECT_ID = "object_id";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_OBJECT_TYPE = "object_type";

    @NotNull
    public static final String PARAMETER_LIKE_VIEW_STYLE = "style";

    @NotNull
    public static final String PARAMETER_NATIVE_LOGIN_DIALOG_COMPLETE_TIME = "fb_native_login_dialog_complete_time";

    @NotNull
    public static final String PARAMETER_NATIVE_LOGIN_DIALOG_START_TIME = "fb_native_login_dialog_start_time";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_PAGE_ID = "fb_share_dialog_content_page_id";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_PHOTO = "photo";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_STATUS = "status";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_TYPE = "fb_share_dialog_content_type";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_UNKNOWN = "unknown";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_UUID = "fb_share_dialog_content_uuid";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_CONTENT_VIDEO = "video";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_SHOW = "fb_share_dialog_show";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC = "automatic";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_SHOW_NATIVE = "native";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_SHOW_UNKNOWN = "unknown";

    @NotNull
    public static final String PARAMETER_SHARE_DIALOG_SHOW_WEB = "web";

    @NotNull
    public static final String PARAMETER_SHARE_ERROR_MESSAGE = "error_message";

    @NotNull
    public static final String PARAMETER_SHARE_MESSENGER_GENERIC_TEMPLATE = "GenericTemplate";

    @NotNull
    public static final String PARAMETER_SHARE_MESSENGER_MEDIA_TEMPLATE = "MediaTemplate";

    @NotNull
    public static final String PARAMETER_SHARE_OUTCOME = "fb_share_dialog_outcome";

    @NotNull
    public static final String PARAMETER_SHARE_OUTCOME_CANCELLED = "cancelled";

    @NotNull
    public static final String PARAMETER_SHARE_OUTCOME_ERROR = "error";

    @NotNull
    public static final String PARAMETER_SHARE_OUTCOME_SUCCEEDED = "succeeded";

    @NotNull
    public static final String PARAMETER_SHARE_OUTCOME_UNKNOWN = "unknown";

    @NotNull
    public static final String PARAMETER_WEB_LOGIN_E2E = "fb_web_login_e2e";

    @NotNull
    public static final String PARAMETER_WEB_LOGIN_SWITCHBACK_TIME = "fb_web_login_switchback_time";

    private AnalyticsEvents() {
    }
}
