package com.glority.android.core.route.analysis;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlTracking.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b-\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0006¨\u00061"}, d2 = {"Lcom/glority/android/core/route/analysis/UrlTracking;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "URL_CHECK_PARAMETERS", "getURL_CHECK_PARAMETERS", "URL_CHECK_SELF_PARAMETERS", "getURL_CHECK_SELF_PARAMETERS", "URL_DATA_COLLECT_MESSAGE", "getURL_DATA_COLLECT_MESSAGE", "URL_DEVICE_INFO", "getURL_DEVICE_INFO", "URL_ENABLE_APP_DATA_COLLECTION", "getURL_ENABLE_APP_DATA_COLLECTION", "URL_ENABLE_FIREBASE_DATA_COLLECTION", "getURL_ENABLE_FIREBASE_DATA_COLLECTION", "URL_FIREBASE_GET_AD_ID", "getURL_FIREBASE_GET_AD_ID", "URL_FIREBASE_GET_APPSFLYER_ID", "getURL_FIREBASE_GET_APPSFLYER_ID", "URL_FIREBASE_PUSH_MESSAGE", "getURL_FIREBASE_PUSH_MESSAGE", "URL_FIREBASE_SEND_TOKEN_TO_SERVER", "getURL_FIREBASE_SEND_TOKEN_TO_SERVER", "URL_FIREBASE_SET_USER_PROPERTY", "getURL_FIREBASE_SET_USER_PROPERTY", "URL_GET_LONG_ID", "getURL_GET_LONG_ID", "URL_LOG_EVENT", "getURL_LOG_EVENT", "URL_LOG_EVENT_SELF", "getURL_LOG_EVENT_SELF", "URL_LOG_EXCEPTION", "getURL_LOG_EXCEPTION", "URL_LOG_SET_USER_ID", "getURL_LOG_SET_USER_ID", "URL_PAGE_END", "getURL_PAGE_END", "URL_PAGE_START", "getURL_PAGE_START", "URL_SEND_ERROR_EVENT", "getURL_SEND_ERROR_EVENT", "URL_UPDATE_ADVERTISING_ID", "getURL_UPDATE_ADVERTISING_ID", "URL_USER_CONVERSION_MESSAGE", "getURL_USER_CONVERSION_MESSAGE", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlTracking {
    public static final UrlTracking INSTANCE = new UrlTracking();
    private static final String MODULE;
    private static final String URL_CHECK_PARAMETERS;
    private static final String URL_CHECK_SELF_PARAMETERS;
    private static final String URL_DATA_COLLECT_MESSAGE;
    private static final String URL_DEVICE_INFO;
    private static final String URL_ENABLE_APP_DATA_COLLECTION;
    private static final String URL_ENABLE_FIREBASE_DATA_COLLECTION;
    private static final String URL_FIREBASE_GET_AD_ID;
    private static final String URL_FIREBASE_GET_APPSFLYER_ID;
    private static final String URL_FIREBASE_PUSH_MESSAGE;
    private static final String URL_FIREBASE_SEND_TOKEN_TO_SERVER;
    private static final String URL_FIREBASE_SET_USER_PROPERTY;
    private static final String URL_GET_LONG_ID;
    private static final String URL_LOG_EVENT;
    private static final String URL_LOG_EVENT_SELF;
    private static final String URL_LOG_EXCEPTION;
    private static final String URL_LOG_SET_USER_ID;
    private static final String URL_PAGE_END;
    private static final String URL_PAGE_START;
    private static final String URL_SEND_ERROR_EVENT;
    private static final String URL_UPDATE_ADVERTISING_ID;
    private static final String URL_USER_CONVERSION_MESSAGE;

    private UrlTracking() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "tracking");
        MODULE = stringPlus;
        URL_PAGE_START = Intrinsics.stringPlus(stringPlus, "/pageStart");
        URL_PAGE_END = Intrinsics.stringPlus(stringPlus, "/pageEnd");
        URL_LOG_EVENT = Intrinsics.stringPlus(stringPlus, "/logEvent");
        URL_LOG_EVENT_SELF = Intrinsics.stringPlus(stringPlus, "/logEventSelf");
        URL_LOG_SET_USER_ID = Intrinsics.stringPlus(stringPlus, "/setUserId");
        URL_UPDATE_ADVERTISING_ID = Intrinsics.stringPlus(stringPlus, "/updateAdvertisingId");
        URL_DATA_COLLECT_MESSAGE = Intrinsics.stringPlus(stringPlus, "/dataCollectMessage");
        URL_USER_CONVERSION_MESSAGE = Intrinsics.stringPlus(stringPlus, "/userConversionMessage");
        URL_LOG_EXCEPTION = Intrinsics.stringPlus(stringPlus, "/logException");
        URL_FIREBASE_GET_AD_ID = Intrinsics.stringPlus(stringPlus, "/firebaseGetADId");
        URL_FIREBASE_GET_APPSFLYER_ID = Intrinsics.stringPlus(stringPlus, "/get_appsFlyer_ID");
        URL_FIREBASE_SEND_TOKEN_TO_SERVER = Intrinsics.stringPlus(stringPlus, "/firebaseSendTokenToServer");
        URL_FIREBASE_PUSH_MESSAGE = Intrinsics.stringPlus(stringPlus, "/firebasePushMessage");
        URL_FIREBASE_SET_USER_PROPERTY = Intrinsics.stringPlus(stringPlus, "/firebaseSetUserProperty");
        URL_ENABLE_FIREBASE_DATA_COLLECTION = Intrinsics.stringPlus(stringPlus, "/enableFirebaseDataCollection");
        URL_ENABLE_APP_DATA_COLLECTION = Intrinsics.stringPlus(stringPlus, "/enableAppDataCollection");
        URL_CHECK_PARAMETERS = Intrinsics.stringPlus(stringPlus, "/check_parameters");
        URL_CHECK_SELF_PARAMETERS = Intrinsics.stringPlus(stringPlus, "/check_self_parameters");
        URL_DEVICE_INFO = Intrinsics.stringPlus(stringPlus, "/device_info");
        URL_SEND_ERROR_EVENT = Intrinsics.stringPlus(stringPlus, "/send_error_event");
        URL_GET_LONG_ID = Intrinsics.stringPlus(stringPlus, "/URL_get_long_id");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final String getURL_PAGE_START() {
        return URL_PAGE_START;
    }

    public final String getURL_PAGE_END() {
        return URL_PAGE_END;
    }

    public final String getURL_LOG_EVENT() {
        return URL_LOG_EVENT;
    }

    public final String getURL_LOG_EVENT_SELF() {
        return URL_LOG_EVENT_SELF;
    }

    public final String getURL_LOG_SET_USER_ID() {
        return URL_LOG_SET_USER_ID;
    }

    public final String getURL_UPDATE_ADVERTISING_ID() {
        return URL_UPDATE_ADVERTISING_ID;
    }

    public final String getURL_DATA_COLLECT_MESSAGE() {
        return URL_DATA_COLLECT_MESSAGE;
    }

    public final String getURL_USER_CONVERSION_MESSAGE() {
        return URL_USER_CONVERSION_MESSAGE;
    }

    public final String getURL_LOG_EXCEPTION() {
        return URL_LOG_EXCEPTION;
    }

    public final String getURL_FIREBASE_GET_AD_ID() {
        return URL_FIREBASE_GET_AD_ID;
    }

    public final String getURL_FIREBASE_GET_APPSFLYER_ID() {
        return URL_FIREBASE_GET_APPSFLYER_ID;
    }

    public final String getURL_FIREBASE_SEND_TOKEN_TO_SERVER() {
        return URL_FIREBASE_SEND_TOKEN_TO_SERVER;
    }

    public final String getURL_FIREBASE_PUSH_MESSAGE() {
        return URL_FIREBASE_PUSH_MESSAGE;
    }

    public final String getURL_FIREBASE_SET_USER_PROPERTY() {
        return URL_FIREBASE_SET_USER_PROPERTY;
    }

    public final String getURL_ENABLE_FIREBASE_DATA_COLLECTION() {
        return URL_ENABLE_FIREBASE_DATA_COLLECTION;
    }

    public final String getURL_ENABLE_APP_DATA_COLLECTION() {
        return URL_ENABLE_APP_DATA_COLLECTION;
    }

    public final String getURL_CHECK_PARAMETERS() {
        return URL_CHECK_PARAMETERS;
    }

    public final String getURL_CHECK_SELF_PARAMETERS() {
        return URL_CHECK_SELF_PARAMETERS;
    }

    public final String getURL_DEVICE_INFO() {
        return URL_DEVICE_INFO;
    }

    public final String getURL_SEND_ERROR_EVENT() {
        return URL_SEND_ERROR_EVENT;
    }

    public final String getURL_GET_LONG_ID() {
        return URL_GET_LONG_ID;
    }
}
