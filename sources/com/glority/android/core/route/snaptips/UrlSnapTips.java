package com.glority.android.core.route.snaptips;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlSnapTips.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/glority/android/core/route/snaptips/UrlSnapTips;", "", "()V", "MODULE", "", "URL_SNAP_TIPS", "getURL_SNAP_TIPS", "()Ljava/lang/String;", "setURL_SNAP_TIPS", "(Ljava/lang/String;)V", "URL_SNAP_TIPS_CLOSE_TRACK", "getURL_SNAP_TIPS_CLOSE_TRACK", "setURL_SNAP_TIPS_CLOSE_TRACK", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlSnapTips {
    public static final UrlSnapTips INSTANCE = new UrlSnapTips();
    private static final String MODULE;
    private static String URL_SNAP_TIPS;
    private static String URL_SNAP_TIPS_CLOSE_TRACK;

    private UrlSnapTips() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), LogEvents.snaptips);
        MODULE = stringPlus;
        URL_SNAP_TIPS = Intrinsics.stringPlus(stringPlus, "/open_snap_tips");
        URL_SNAP_TIPS_CLOSE_TRACK = Intrinsics.stringPlus(stringPlus, "/snap_tips_close");
    }

    public final String getURL_SNAP_TIPS() {
        return URL_SNAP_TIPS;
    }

    public final void setURL_SNAP_TIPS(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_SNAP_TIPS = str;
    }

    public final String getURL_SNAP_TIPS_CLOSE_TRACK() {
        return URL_SNAP_TIPS_CLOSE_TRACK;
    }

    public final void setURL_SNAP_TIPS_CLOSE_TRACK(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_SNAP_TIPS_CLOSE_TRACK = str;
    }
}
