package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6694a;
    private final WebViewRenderProcessClient b = new a();

    /* loaded from: classes.dex */
    public class a extends WebViewRenderProcessClient {
        public a() {
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                com.applovin.impl.sdk.ad.b currentAd = ((b) webView).getCurrentAd();
                d.this.f6694a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    d.this.f6694a.L().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.f6694a = kVar;
    }

    public WebViewRenderProcessClient a() {
        return this.b;
    }
}
