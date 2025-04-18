package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* loaded from: classes2.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f22794a;

    /* renamed from: b, reason: collision with root package name */
    private final WebViewRenderProcessClient f22795b = new a();

    /* loaded from: classes2.dex */
    public class a extends WebViewRenderProcessClient {
        public a() {
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                com.applovin.impl.sdk.ad.b currentAd = ((b) webView).getCurrentAd();
                d.this.f22794a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    d.this.f22794a.J().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    public d(com.applovin.impl.sdk.j jVar) {
        this.f22794a = jVar;
    }

    public WebViewRenderProcessClient a() {
        return this.f22795b;
    }
}
