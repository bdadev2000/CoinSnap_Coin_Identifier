package com.glority.android.core.route.adjust;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlAdjust.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/glority/android/core/route/adjust/UrlAdjust;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "setMODULE", "(Ljava/lang/String;)V", "URL_ADJUST_GET_ADJUST_ID", "getURL_ADJUST_GET_ADJUST_ID", "setURL_ADJUST_GET_ADJUST_ID", "URL_ADJUST_GET_SKU_EVENT_NAME", "getURL_ADJUST_GET_SKU_EVENT_NAME", "URL_ADJUST_SEND_SUBSCRIPTION", "getURL_ADJUST_SEND_SUBSCRIPTION", "setURL_ADJUST_SEND_SUBSCRIPTION", "URL_ADJUST_SEND_TRACK_EVENT", "getURL_ADJUST_SEND_TRACK_EVENT", "setURL_ADJUST_SEND_TRACK_EVENT", "URL_ENABLE_ADJUST_DATA_COLLECTION", "getURL_ENABLE_ADJUST_DATA_COLLECTION", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlAdjust {
    public static final UrlAdjust INSTANCE = new UrlAdjust();
    private static String MODULE;
    private static String URL_ADJUST_GET_ADJUST_ID;
    private static final String URL_ADJUST_GET_SKU_EVENT_NAME;
    private static String URL_ADJUST_SEND_SUBSCRIPTION;
    private static String URL_ADJUST_SEND_TRACK_EVENT;
    private static final String URL_ENABLE_ADJUST_DATA_COLLECTION;

    private UrlAdjust() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "adjust");
        MODULE = stringPlus;
        URL_ADJUST_SEND_TRACK_EVENT = Intrinsics.stringPlus(stringPlus, "/URL_ADJUST_SEND_TRACK_EVENT");
        URL_ADJUST_SEND_SUBSCRIPTION = Intrinsics.stringPlus(MODULE, "/URL_ADJUST_SEND_SUBSCRIPTION");
        URL_ADJUST_GET_ADJUST_ID = Intrinsics.stringPlus(MODULE, "/URL_ADJUST_GET_ADJUST_ID");
        URL_ENABLE_ADJUST_DATA_COLLECTION = Intrinsics.stringPlus(MODULE, "/URL_ENABLE_ADJUST_DATA_COLLECTION");
        URL_ADJUST_GET_SKU_EVENT_NAME = Intrinsics.stringPlus(MODULE, "/URL_ADJUST_GET_SKU_EVENT_NAME");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final void setMODULE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        MODULE = str;
    }

    public final String getURL_ADJUST_SEND_TRACK_EVENT() {
        return URL_ADJUST_SEND_TRACK_EVENT;
    }

    public final void setURL_ADJUST_SEND_TRACK_EVENT(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_ADJUST_SEND_TRACK_EVENT = str;
    }

    public final String getURL_ADJUST_SEND_SUBSCRIPTION() {
        return URL_ADJUST_SEND_SUBSCRIPTION;
    }

    public final void setURL_ADJUST_SEND_SUBSCRIPTION(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_ADJUST_SEND_SUBSCRIPTION = str;
    }

    public final String getURL_ADJUST_GET_ADJUST_ID() {
        return URL_ADJUST_GET_ADJUST_ID;
    }

    public final void setURL_ADJUST_GET_ADJUST_ID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_ADJUST_GET_ADJUST_ID = str;
    }

    public final String getURL_ENABLE_ADJUST_DATA_COLLECTION() {
        return URL_ENABLE_ADJUST_DATA_COLLECTION;
    }

    public final String getURL_ADJUST_GET_SKU_EVENT_NAME() {
        return URL_ADJUST_GET_SKU_EVENT_NAME;
    }
}
