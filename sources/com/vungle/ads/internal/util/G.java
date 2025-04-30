package com.vungle.ads.internal.util;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class G {
    public static final G INSTANCE = new G();

    private G() {
    }

    public final int dpToPixels(Context context, int i9) {
        G7.j.e(context, "context");
        return (int) ((i9 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final WebView getWebView(Context context) throws InstantiationException {
        G7.j.e(context, "context");
        try {
            return new WebView(context);
        } catch (Exception e4) {
            throw new InstantiationException(e4.getMessage());
        }
    }
}
