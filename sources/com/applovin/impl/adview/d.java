package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final WebViewRenderProcessClient f3698b = new a();

    /* loaded from: classes.dex */
    public class a extends WebViewRenderProcessClient {
        public a() {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                com.applovin.impl.sdk.ad.b currentAd = ((b) webView).getCurrentAd();
                d.this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    d.this.a.L().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    public WebViewRenderProcessClient a() {
        return this.f3698b;
    }
}
