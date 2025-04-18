package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class rr extends pi {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f26379a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f26380b;

    /* loaded from: classes2.dex */
    public interface a {
        void a(Uri uri, com.applovin.impl.adview.l lVar);

        void a(com.applovin.impl.adview.l lVar);

        void a(com.applovin.impl.adview.l lVar, Bundle bundle);

        void b(Uri uri, com.applovin.impl.adview.l lVar);

        void b(com.applovin.impl.adview.l lVar);

        void c(com.applovin.impl.adview.l lVar);

        void d(com.applovin.impl.adview.l lVar);
    }

    public rr(com.applovin.impl.sdk.j jVar) {
        this.f26379a = jVar.J();
    }

    public void a(WeakReference weakReference) {
        this.f26380b = weakReference;
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f30048a, view, url);
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f30048a, view, url);
    }

    public boolean safedk_rr_shouldOverrideUrlLoading_3ca823a62a3da5da31e939a061f992f2(WebView p02, String p12) {
        a(p02, p12);
        return true;
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f30048a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f30048a, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/rr;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_rr_shouldOverrideUrlLoading_3ca823a62a3da5da31e939a061f992f2 = safedk_rr_shouldOverrideUrlLoading_3ca823a62a3da5da31e939a061f992f2(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f30048a, webView, str, safedk_rr_shouldOverrideUrlLoading_3ca823a62a3da5da31e939a061f992f2);
        return safedk_rr_shouldOverrideUrlLoading_3ca823a62a3da5da31e939a061f992f2;
    }

    private void a(WebView webView, String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f26379a.d("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof com.applovin.impl.adview.l)) {
            return;
        }
        com.applovin.impl.adview.l lVar = (com.applovin.impl.adview.l) webView;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        a aVar = (a) this.f26380b.get();
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
                aVar.a(lVar, tp.a(parse));
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
            if (com.applovin.impl.sdk.n.a()) {
                this.f26379a.k("WebViewButtonClient", "Unknown URL: ".concat(str));
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f26379a.k("WebViewButtonClient", "Path: " + path);
            }
        }
    }
}
