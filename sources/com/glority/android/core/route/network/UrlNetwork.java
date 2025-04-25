package com.glority.android.core.route.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlNetwork.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/glority/android/core/route/network/UrlNetwork;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "URL_GET_ACCESS_TOKEN", "getURL_GET_ACCESS_TOKEN", "URL_GET_ADDITIONAL_HTTP_HEADERS", "getURL_GET_ADDITIONAL_HTTP_HEADERS", "URL_GET_MD5_ENCRYPT_KEY", "getURL_GET_MD5_ENCRYPT_KEY", "URL_GET_TRACKING_APIS", "getURL_GET_TRACKING_APIS", "URL_GET_USER_ID", "getURL_GET_USER_ID", "URL_GET_USER_TYPE", "getURL_GET_USER_TYPE", "URL_NETWORK_CHANGED", "getURL_NETWORK_CHANGED", "URL_PING_SERVER", "getURL_PING_SERVER", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlNetwork {
    public static final UrlNetwork INSTANCE = new UrlNetwork();
    private static final String MODULE;
    private static final String URL_GET_ACCESS_TOKEN;
    private static final String URL_GET_ADDITIONAL_HTTP_HEADERS;
    private static final String URL_GET_MD5_ENCRYPT_KEY;
    private static final String URL_GET_TRACKING_APIS;
    private static final String URL_GET_USER_ID;
    private static final String URL_GET_USER_TYPE;
    private static final String URL_NETWORK_CHANGED;
    private static final String URL_PING_SERVER;

    private UrlNetwork() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "network");
        MODULE = stringPlus;
        URL_GET_USER_ID = Intrinsics.stringPlus(stringPlus, "/getUserId");
        URL_GET_ACCESS_TOKEN = Intrinsics.stringPlus(stringPlus, "/getAccessToken");
        URL_GET_USER_TYPE = Intrinsics.stringPlus(stringPlus, "/getUserType");
        URL_PING_SERVER = Intrinsics.stringPlus(stringPlus, "/pingServer");
        URL_NETWORK_CHANGED = Intrinsics.stringPlus(stringPlus, "/networkChanged");
        URL_GET_TRACKING_APIS = Intrinsics.stringPlus(stringPlus, "/getTrackingAPIs");
        URL_GET_MD5_ENCRYPT_KEY = Intrinsics.stringPlus(stringPlus, "/getMd5EncryptKey");
        URL_GET_ADDITIONAL_HTTP_HEADERS = Intrinsics.stringPlus(stringPlus, "/getAdditionalHttpHeaders");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final String getURL_GET_USER_ID() {
        return URL_GET_USER_ID;
    }

    public final String getURL_GET_ACCESS_TOKEN() {
        return URL_GET_ACCESS_TOKEN;
    }

    public final String getURL_GET_USER_TYPE() {
        return URL_GET_USER_TYPE;
    }

    public final String getURL_PING_SERVER() {
        return URL_PING_SERVER;
    }

    public final String getURL_NETWORK_CHANGED() {
        return URL_NETWORK_CHANGED;
    }

    public final String getURL_GET_TRACKING_APIS() {
        return URL_GET_TRACKING_APIS;
    }

    public final String getURL_GET_MD5_ENCRYPT_KEY() {
        return URL_GET_MD5_ENCRYPT_KEY;
    }

    public final String getURL_GET_ADDITIONAL_HTTP_HEADERS() {
        return URL_GET_ADDITIONAL_HTTP_HEADERS;
    }
}
