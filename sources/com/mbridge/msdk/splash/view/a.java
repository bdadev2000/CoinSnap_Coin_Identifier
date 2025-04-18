package com.mbridge.msdk.splash.view;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.splash.signal.c;

/* loaded from: classes4.dex */
public final class a extends b {
    com.mbridge.msdk.splash.d.a a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15338b = "SplashWebViewClient";

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.c.b.a.a().b(), new ValueCallback<String>() { // from class: com.mbridge.msdk.splash.view.a.1
                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable th2) {
            ad.b("SplashWebViewClient", "onPageStarted", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
            if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.b.a.f12506c && com.mbridge.msdk.click.b.a.a(((c) windVaneWebView.getObject()).b().get(0), windVaneWebView.getUrl(), com.mbridge.msdk.click.b.a.f12505b)) {
                return false;
            }
            com.mbridge.msdk.splash.d.a aVar = this.a;
            if (aVar != null) {
                aVar.a(false, str);
                return true;
            }
            return true;
        } catch (Throwable th2) {
            ad.b("SplashWebViewClient", "shouldOverrideUrlLoading", th2);
            return false;
        }
    }
}
