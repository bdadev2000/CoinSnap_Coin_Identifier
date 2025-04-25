package com.glority.android.core.route.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b¨\u0006'"}, d2 = {"Lcom/glority/android/core/route/utils/UrlUtils;", "", "()V", "AF_SHOT_TIMES_LOG_EVENT", "", "getAF_SHOT_TIMES_LOG_EVENT", "()Ljava/lang/String;", "setAF_SHOT_TIMES_LOG_EVENT", "(Ljava/lang/String;)V", "MODULE", "getMODULE", "setMODULE", "URL_BACKGROUND", "getURL_BACKGROUND", "setURL_BACKGROUND", "URL_FOREGROUND", "getURL_FOREGROUND", "setURL_FOREGROUND", "URL_GET_SKUS", "getURL_GET_SKUS", "setURL_GET_SKUS", "URL_GET_USER_CREATE_AT", "getURL_GET_USER_CREATE_AT", "setURL_GET_USER_CREATE_AT", "URL_GET_VIP_STEP", "getURL_GET_VIP_STEP", "setURL_GET_VIP_STEP", "URL_GET_VIP_TYPE", "getURL_GET_VIP_TYPE", "setURL_GET_VIP_TYPE", "URL_PERSIST_DATA_READ", "getURL_PERSIST_DATA_READ", "setURL_PERSIST_DATA_READ", "URL_PERSIST_DATA_WRITE", "getURL_PERSIST_DATA_WRITE", "setURL_PERSIST_DATA_WRITE", "URL_SHOW_CAPTURE", "getURL_SHOW_CAPTURE", "setURL_SHOW_CAPTURE", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlUtils {
    private static String AF_SHOT_TIMES_LOG_EVENT;
    public static final UrlUtils INSTANCE = new UrlUtils();
    private static String MODULE;
    private static String URL_BACKGROUND;
    private static String URL_FOREGROUND;
    private static String URL_GET_SKUS;
    private static String URL_GET_USER_CREATE_AT;
    private static String URL_GET_VIP_STEP;
    private static String URL_GET_VIP_TYPE;
    private static String URL_PERSIST_DATA_READ;
    private static String URL_PERSIST_DATA_WRITE;
    private static String URL_SHOW_CAPTURE;

    private UrlUtils() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "utils");
        MODULE = stringPlus;
        URL_PERSIST_DATA_READ = Intrinsics.stringPlus(stringPlus, "/persist_data_read");
        URL_PERSIST_DATA_WRITE = Intrinsics.stringPlus(MODULE, "/persist_data_write");
        URL_GET_SKUS = Intrinsics.stringPlus(MODULE, "/get_skus");
        URL_SHOW_CAPTURE = Intrinsics.stringPlus(MODULE, "/show_capture");
        URL_GET_VIP_TYPE = Intrinsics.stringPlus(MODULE, "/get_vip_type");
        URL_BACKGROUND = Intrinsics.stringPlus(MODULE, "/background");
        URL_FOREGROUND = Intrinsics.stringPlus(MODULE, "/foreground");
        URL_GET_VIP_STEP = Intrinsics.stringPlus(MODULE, "/get_vip_step");
        AF_SHOT_TIMES_LOG_EVENT = Intrinsics.stringPlus(MODULE, "/af_shot_times_log_event");
        URL_GET_USER_CREATE_AT = Intrinsics.stringPlus(MODULE, "/get_user_create_at");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final void setMODULE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        MODULE = str;
    }

    public final String getURL_PERSIST_DATA_READ() {
        return URL_PERSIST_DATA_READ;
    }

    public final void setURL_PERSIST_DATA_READ(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_PERSIST_DATA_READ = str;
    }

    public final String getURL_PERSIST_DATA_WRITE() {
        return URL_PERSIST_DATA_WRITE;
    }

    public final void setURL_PERSIST_DATA_WRITE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_PERSIST_DATA_WRITE = str;
    }

    public final String getURL_GET_SKUS() {
        return URL_GET_SKUS;
    }

    public final void setURL_GET_SKUS(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_GET_SKUS = str;
    }

    public final String getURL_SHOW_CAPTURE() {
        return URL_SHOW_CAPTURE;
    }

    public final void setURL_SHOW_CAPTURE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_SHOW_CAPTURE = str;
    }

    public final String getURL_GET_VIP_TYPE() {
        return URL_GET_VIP_TYPE;
    }

    public final void setURL_GET_VIP_TYPE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_GET_VIP_TYPE = str;
    }

    public final String getURL_BACKGROUND() {
        return URL_BACKGROUND;
    }

    public final void setURL_BACKGROUND(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_BACKGROUND = str;
    }

    public final String getURL_FOREGROUND() {
        return URL_FOREGROUND;
    }

    public final void setURL_FOREGROUND(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_FOREGROUND = str;
    }

    public final String getURL_GET_VIP_STEP() {
        return URL_GET_VIP_STEP;
    }

    public final void setURL_GET_VIP_STEP(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_GET_VIP_STEP = str;
    }

    public final String getAF_SHOT_TIMES_LOG_EVENT() {
        return AF_SHOT_TIMES_LOG_EVENT;
    }

    public final void setAF_SHOT_TIMES_LOG_EVENT(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        AF_SHOT_TIMES_LOG_EVENT = str;
    }

    public final String getURL_GET_USER_CREATE_AT() {
        return URL_GET_USER_CREATE_AT;
    }

    public final void setURL_GET_USER_CREATE_AT(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_GET_USER_CREATE_AT = str;
    }
}
