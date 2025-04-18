package com.iab.omid.library.applovin.utils;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes3.dex */
public class i {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.webkit.internal.WebViewProviderAdapter] */
    public void a(@NonNull WebView webView, @NonNull String str) {
        int i2 = WebViewCompat.f21802a;
        if (WebViewFeatureInternal.f21830h.c()) {
            WebViewProviderBoundaryInterface createWebView = WebViewGlueCommunicator.b().createWebView(webView);
            new Object().f21834a = createWebView;
            createWebView.removeWebMessageListener(str);
            return;
        }
        throw WebViewFeatureInternal.a();
    }

    public void a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.a(webView, str, set, webMessageListener);
    }
}
