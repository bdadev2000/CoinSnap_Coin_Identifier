package com.iab.omid.library.applovin.utils;

import U0.l;
import U0.m;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.util.Set;

/* loaded from: classes3.dex */
public class i {
    public void a(@NonNull WebView webView, @NonNull String str) {
        int i9 = T0.e.f2954a;
        if (l.f3110c.b()) {
            m.f3112a.createWebView(webView).removeWebMessageListener(str);
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public void a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull T0.d dVar) {
        T0.e.a(webView, str, set, dVar);
    }
}
