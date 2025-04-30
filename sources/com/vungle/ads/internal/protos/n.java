package com.vungle.ads.internal.protos;

import com.google.protobuf.V2;
import com.google.protobuf.W2;
import com.google.protobuf.X2;

/* loaded from: classes3.dex */
public enum n implements V2 {
    UNKNOWN_METRIC_TYPE(0),
    AD_REQUEST_TO_RESPONSE_DURATION_MS(1),
    AD_RESPONSE_TO_SHOW_DURATION_MS(2),
    AD_SHOW_TO_DISPLAY_DURATION_MS(3),
    AD_DISPLAY_TO_CLICK_DURATION_MS(4),
    IOS_STORE_KIT_LOAD_TIME_MS(5),
    INIT_REQUEST_TO_RESPONSE_DURATION_MS(6),
    ASSET_DOWNLOAD_DURATION_MS(7),
    LOCAL_ASSETS_USED(8),
    REMOTE_ASSETS_USED(9),
    TEMPLATE_DOWNLOAD_DURATION_MS(10),
    AD_REQUEST_TO_CALLBACK_DURATION_MS(11),
    AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS(12),
    ASSET_FILE_SIZE(13),
    USER_AGENT_LOAD_DURATION_MS(14),
    TEMPLATE_ZIP_SIZE(15),
    CACHED_ASSETS_USED(16),
    LOAD_AD_API(17),
    TPAT_FIRED(18),
    TPAT_SUCCESS(19),
    WIN_NOTIF_FIRED(20),
    WIN_NOTIF_SUCCESS(21),
    AD_EXPIRED_BEFORE_PLAY(22),
    PLAY_AD_API(23),
    AD_LOAD_FAIL(24),
    VIEW_NOT_VISIBLE_ON_PLAY(25),
    MRAID_DOWNLOAD_JS_RETRY_SUCCESS(26),
    OMSDK_DOWNLOAD_JS_RETRY_SUCCESS(27),
    PRIVACY_URL_OPENED(28),
    NOTIFICATION_REDIRECT(29),
    AD_PLAY_RESET_ON_DEINIT(30),
    TEMPLATE_HTML_SIZE(31),
    SKOVERLAY_PRESENTED_FOR_AD(2000),
    SAFARI_PRESENTED_FOR_AD(2001),
    STORE_KIT_PRESENTED_FOR_AD(2002),
    STORE_KIT_NOT_READY(2003),
    LAUNCH_STORE_KIT_REQUEST(2004),
    LAUNCH_SKOVERLAY_REQUEST(2005),
    LAUNCH_SAFARI_REQUEST(2006),
    IDFV_RESTRICTED(2007),
    NOTIFICATION_WAIT_FOR_CONNECTIVITY(2008),
    IDFV_VALUE_CHANGED(2009),
    HARDWARE_ACCELERATE_DISABLED(3001),
    UNRECOGNIZED(-1);

    public static final int AD_DISPLAY_TO_CLICK_DURATION_MS_VALUE = 4;

    @Deprecated
    public static final int AD_EXPIRED_BEFORE_PLAY_VALUE = 22;
    public static final int AD_LOAD_FAIL_VALUE = 24;
    public static final int AD_PLAY_RESET_ON_DEINIT_VALUE = 30;
    public static final int AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS_VALUE = 12;
    public static final int AD_REQUEST_TO_CALLBACK_DURATION_MS_VALUE = 11;
    public static final int AD_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 1;
    public static final int AD_RESPONSE_TO_SHOW_DURATION_MS_VALUE = 2;
    public static final int AD_SHOW_TO_DISPLAY_DURATION_MS_VALUE = 3;
    public static final int ASSET_DOWNLOAD_DURATION_MS_VALUE = 7;
    public static final int ASSET_FILE_SIZE_VALUE = 13;
    public static final int CACHED_ASSETS_USED_VALUE = 16;
    public static final int HARDWARE_ACCELERATE_DISABLED_VALUE = 3001;
    public static final int IDFV_RESTRICTED_VALUE = 2007;
    public static final int IDFV_VALUE_CHANGED_VALUE = 2009;
    public static final int INIT_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 6;
    public static final int IOS_STORE_KIT_LOAD_TIME_MS_VALUE = 5;
    public static final int LAUNCH_SAFARI_REQUEST_VALUE = 2006;
    public static final int LAUNCH_SKOVERLAY_REQUEST_VALUE = 2005;
    public static final int LAUNCH_STORE_KIT_REQUEST_VALUE = 2004;
    public static final int LOAD_AD_API_VALUE = 17;
    public static final int LOCAL_ASSETS_USED_VALUE = 8;
    public static final int MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 26;
    public static final int NOTIFICATION_REDIRECT_VALUE = 29;
    public static final int NOTIFICATION_WAIT_FOR_CONNECTIVITY_VALUE = 2008;
    public static final int OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 27;
    public static final int PLAY_AD_API_VALUE = 23;
    public static final int PRIVACY_URL_OPENED_VALUE = 28;
    public static final int REMOTE_ASSETS_USED_VALUE = 9;
    public static final int SAFARI_PRESENTED_FOR_AD_VALUE = 2001;
    public static final int SKOVERLAY_PRESENTED_FOR_AD_VALUE = 2000;
    public static final int STORE_KIT_NOT_READY_VALUE = 2003;
    public static final int STORE_KIT_PRESENTED_FOR_AD_VALUE = 2002;
    public static final int TEMPLATE_DOWNLOAD_DURATION_MS_VALUE = 10;
    public static final int TEMPLATE_HTML_SIZE_VALUE = 31;
    public static final int TEMPLATE_ZIP_SIZE_VALUE = 15;
    public static final int TPAT_FIRED_VALUE = 18;
    public static final int TPAT_SUCCESS_VALUE = 19;
    public static final int UNKNOWN_METRIC_TYPE_VALUE = 0;
    public static final int USER_AGENT_LOAD_DURATION_MS_VALUE = 14;
    public static final int VIEW_NOT_VISIBLE_ON_PLAY_VALUE = 25;
    public static final int WIN_NOTIF_FIRED_VALUE = 20;
    public static final int WIN_NOTIF_SUCCESS_VALUE = 21;
    private static final W2 internalValueMap = new W2() { // from class: com.vungle.ads.internal.protos.l
        @Override // com.google.protobuf.W2
        public n findValueByNumber(int i9) {
            return n.forNumber(i9);
        }
    };
    private final int value;

    n(int i9) {
        this.value = i9;
    }

    public static n forNumber(int i9) {
        if (i9 != 3001) {
            switch (i9) {
                case 0:
                    return UNKNOWN_METRIC_TYPE;
                case 1:
                    return AD_REQUEST_TO_RESPONSE_DURATION_MS;
                case 2:
                    return AD_RESPONSE_TO_SHOW_DURATION_MS;
                case 3:
                    return AD_SHOW_TO_DISPLAY_DURATION_MS;
                case 4:
                    return AD_DISPLAY_TO_CLICK_DURATION_MS;
                case 5:
                    return IOS_STORE_KIT_LOAD_TIME_MS;
                case 6:
                    return INIT_REQUEST_TO_RESPONSE_DURATION_MS;
                case 7:
                    return ASSET_DOWNLOAD_DURATION_MS;
                case 8:
                    return LOCAL_ASSETS_USED;
                case 9:
                    return REMOTE_ASSETS_USED;
                case 10:
                    return TEMPLATE_DOWNLOAD_DURATION_MS;
                case 11:
                    return AD_REQUEST_TO_CALLBACK_DURATION_MS;
                case 12:
                    return AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS;
                case 13:
                    return ASSET_FILE_SIZE;
                case 14:
                    return USER_AGENT_LOAD_DURATION_MS;
                case 15:
                    return TEMPLATE_ZIP_SIZE;
                case 16:
                    return CACHED_ASSETS_USED;
                case 17:
                    return LOAD_AD_API;
                case 18:
                    return TPAT_FIRED;
                case 19:
                    return TPAT_SUCCESS;
                case 20:
                    return WIN_NOTIF_FIRED;
                case 21:
                    return WIN_NOTIF_SUCCESS;
                case 22:
                    return AD_EXPIRED_BEFORE_PLAY;
                case 23:
                    return PLAY_AD_API;
                case 24:
                    return AD_LOAD_FAIL;
                case 25:
                    return VIEW_NOT_VISIBLE_ON_PLAY;
                case 26:
                    return MRAID_DOWNLOAD_JS_RETRY_SUCCESS;
                case 27:
                    return OMSDK_DOWNLOAD_JS_RETRY_SUCCESS;
                case 28:
                    return PRIVACY_URL_OPENED;
                case 29:
                    return NOTIFICATION_REDIRECT;
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    return AD_PLAY_RESET_ON_DEINIT;
                case 31:
                    return TEMPLATE_HTML_SIZE;
                default:
                    switch (i9) {
                        case 2000:
                            return SKOVERLAY_PRESENTED_FOR_AD;
                        case 2001:
                            return SAFARI_PRESENTED_FOR_AD;
                        case 2002:
                            return STORE_KIT_PRESENTED_FOR_AD;
                        case 2003:
                            return STORE_KIT_NOT_READY;
                        case 2004:
                            return LAUNCH_STORE_KIT_REQUEST;
                        case 2005:
                            return LAUNCH_SKOVERLAY_REQUEST;
                        case 2006:
                            return LAUNCH_SAFARI_REQUEST;
                        case 2007:
                            return IDFV_RESTRICTED;
                        case 2008:
                            return NOTIFICATION_WAIT_FOR_CONNECTIVITY;
                        case 2009:
                            return IDFV_VALUE_CHANGED;
                        default:
                            return null;
                    }
            }
        }
        return HARDWARE_ACCELERATE_DISABLED;
    }

    public static W2 internalGetValueMap() {
        return internalValueMap;
    }

    public static X2 internalGetVerifier() {
        return m.INSTANCE;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static n valueOf(int i9) {
        return forNumber(i9);
    }
}
