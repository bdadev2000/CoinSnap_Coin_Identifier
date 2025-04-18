package com.vungle.ads.internal.util;

import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 {
    public static final g0 INSTANCE = new g0();

    private g0() {
    }

    public final int dpToPixels(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final WebView getWebView(Context context) throws InstantiationException {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return new WebView(context);
        } catch (Exception e2) {
            throw new InstantiationException(e2.getMessage());
        }
    }
}
