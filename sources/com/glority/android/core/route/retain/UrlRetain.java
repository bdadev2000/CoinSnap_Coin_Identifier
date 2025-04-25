package com.glority.android.core.route.retain;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlRetain.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/glority/android/core/route/retain/UrlRetain;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "setMODULE", "(Ljava/lang/String;)V", "URL_RETAIN_CLOSE", "getURL_RETAIN_CLOSE", "setURL_RETAIN_CLOSE", "URL_RETAIN_OPEN", "getURL_RETAIN_OPEN", "setURL_RETAIN_OPEN", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlRetain {
    public static final UrlRetain INSTANCE = new UrlRetain();
    private static String MODULE;
    private static String URL_RETAIN_CLOSE;
    private static String URL_RETAIN_OPEN;

    private UrlRetain() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "retain");
        MODULE = stringPlus;
        URL_RETAIN_OPEN = Intrinsics.stringPlus(stringPlus, "/open");
        URL_RETAIN_CLOSE = Intrinsics.stringPlus(MODULE, "/close");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final void setMODULE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        MODULE = str;
    }

    public final String getURL_RETAIN_OPEN() {
        return URL_RETAIN_OPEN;
    }

    public final void setURL_RETAIN_OPEN(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_RETAIN_OPEN = str;
    }

    public final String getURL_RETAIN_CLOSE() {
        return URL_RETAIN_CLOSE;
    }

    public final void setURL_RETAIN_CLOSE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_RETAIN_CLOSE = str;
    }
}
