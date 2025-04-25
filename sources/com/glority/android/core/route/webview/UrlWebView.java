package com.glority.android.core.route.webview;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlWebView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/glority/android/core/route/webview/UrlWebView;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "URL_CLOSE", "getURL_CLOSE", "URL_OPEN", "getURL_OPEN", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlWebView {
    public static final UrlWebView INSTANCE = new UrlWebView();
    private static final String MODULE;
    private static final String URL_CLOSE;
    private static final String URL_OPEN;

    private UrlWebView() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "com.glority.android.web");
        MODULE = stringPlus;
        URL_OPEN = Intrinsics.stringPlus(stringPlus, "/open");
        URL_CLOSE = Intrinsics.stringPlus(stringPlus, "/close");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final String getURL_OPEN() {
        return URL_OPEN;
    }

    public final String getURL_CLOSE() {
        return URL_CLOSE;
    }
}
