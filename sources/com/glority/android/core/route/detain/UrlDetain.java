package com.glority.android.core.route.detain;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import com.glority.android.core.proguard.NotProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlDetain.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/glority/android/core/route/detain/UrlDetain;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "setMODULE", "(Ljava/lang/String;)V", "URL_DETAIN_CLOSE", "getURL_DETAIN_CLOSE", "setURL_DETAIN_CLOSE", "URL_DETAIN_OPEN", "getURL_DETAIN_OPEN", "setURL_DETAIN_OPEN", "URL_DETAIN_OPEN_WITH_REQUEST_CODE", "getURL_DETAIN_OPEN_WITH_REQUEST_CODE", "setURL_DETAIN_OPEN_WITH_REQUEST_CODE", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlDetain {
    public static final UrlDetain INSTANCE = new UrlDetain();
    private static String MODULE;
    private static String URL_DETAIN_CLOSE;
    private static String URL_DETAIN_OPEN;
    private static String URL_DETAIN_OPEN_WITH_REQUEST_CODE;

    private UrlDetain() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "detain");
        MODULE = stringPlus;
        URL_DETAIN_OPEN = Intrinsics.stringPlus(stringPlus, "/open");
        URL_DETAIN_CLOSE = Intrinsics.stringPlus(MODULE, "/close");
        URL_DETAIN_OPEN_WITH_REQUEST_CODE = Intrinsics.stringPlus(MODULE, "/openWithRequestCode");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final void setMODULE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        MODULE = str;
    }

    public final String getURL_DETAIN_OPEN() {
        return URL_DETAIN_OPEN;
    }

    public final void setURL_DETAIN_OPEN(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_DETAIN_OPEN = str;
    }

    public final String getURL_DETAIN_CLOSE() {
        return URL_DETAIN_CLOSE;
    }

    public final void setURL_DETAIN_CLOSE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_DETAIN_CLOSE = str;
    }

    public final String getURL_DETAIN_OPEN_WITH_REQUEST_CODE() {
        return URL_DETAIN_OPEN_WITH_REQUEST_CODE;
    }

    public final void setURL_DETAIN_OPEN_WITH_REQUEST_CODE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_DETAIN_OPEN_WITH_REQUEST_CODE = str;
    }
}
