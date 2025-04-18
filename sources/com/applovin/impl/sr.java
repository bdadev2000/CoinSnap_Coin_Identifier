package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class sr extends com.applovin.impl.sdk.x {
    private final com.applovin.impl.sdk.t a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f8085b;

    /* loaded from: classes.dex */
    public interface a {
        void a(Uri uri, com.applovin.impl.adview.l lVar);

        void a(com.applovin.impl.adview.l lVar);

        void a(com.applovin.impl.adview.l lVar, Bundle bundle);

        void b(Uri uri, com.applovin.impl.adview.l lVar);

        void b(com.applovin.impl.adview.l lVar);

        void c(com.applovin.impl.adview.l lVar);

        void d(com.applovin.impl.adview.l lVar);
    }

    public sr(com.applovin.impl.sdk.k kVar) {
        this.a = kVar.L();
    }

    public void a(WeakReference weakReference) {
        this.f8085b = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, str);
        return true;
    }

    private void a(WebView webView, String str) {
        if (com.applovin.impl.sdk.t.a()) {
            this.a.d("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof com.applovin.impl.adview.l)) {
            return;
        }
        com.applovin.impl.adview.l lVar = (com.applovin.impl.adview.l) webView;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        a aVar = (a) this.f8085b.get();
        if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.b(lVar);
                return;
            }
            if ("/close_ad".equals(path)) {
                aVar.a(lVar);
                return;
            }
            if ("/skip_ad".equals(path)) {
                aVar.d(lVar);
                return;
            }
            if ("/direct_download".equals(path)) {
                aVar.a(lVar, up.a(parse));
                return;
            }
            if ("/load_url".equals(path)) {
                aVar.a(parse, lVar);
                return;
            }
            if ("/template_error".equals(path)) {
                aVar.b(parse, lVar);
                return;
            }
            if ("/fully_watched".equals(path)) {
                aVar.c(lVar);
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.a.k("WebViewButtonClient", "Unknown URL: ".concat(str));
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.a.k("WebViewButtonClient", "Path: " + path);
            }
        }
    }
}
