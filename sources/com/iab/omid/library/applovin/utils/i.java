package com.iab.omid.library.applovin.utils;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.util.Set;
import l2.n;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes4.dex */
public class i {
    public void a(@NonNull WebView webView, @NonNull String str) {
        int i10 = k2.e.a;
        if (n.f21120d.b()) {
            ((WebViewProviderBoundaryInterface) k2.e.c(webView).f26021c).removeWebMessageListener(str);
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public void a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull k2.d dVar) {
        k2.e.a(webView, str, set, dVar);
    }
}
