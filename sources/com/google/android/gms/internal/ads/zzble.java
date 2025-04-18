package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* loaded from: classes3.dex */
public final class zzble extends zzbkr {
    public static final /* synthetic */ int zza = 0;

    @Nullable
    private WebViewClient zzb;
    private final H5AdsRequestHandler zzc;
    private final WebView zzd;

    public zzble(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        zzfxz.zzf(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.google.android.gms.internal.ads.zzbld
            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final void onH5AdsEvent(String str) {
                int i2 = zzble.zza;
                webView.evaluateJavascript(str, null);
            }
        });
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    @Nullable
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzble;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(g.f30053h, webView, str);
        safedk_zzble_onLoadResource_c845a0d175ad9b1bf24fc2847e1db935(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        CreativeInfoManager.onWebViewPageFinished(g.f30053h, view, url);
    }

    public void safedk_zzble_onLoadResource_c845a0d175ad9b1bf24fc2847e1db935(WebView p02, String p12) {
        if (zzc(p02) && !this.zzc.handleH5AdsRequest(p12)) {
            super.onLoadResource(p02, p12);
        }
    }

    @RequiresApi
    public boolean safedk_zzble_shouldOverrideUrlLoading_0be9d1166e4d2b898d60c29b83c26642(WebView p02, WebResourceRequest p12) {
        if (!zzc(this.zzd)) {
            return false;
        }
        if (this.zzc.handleH5AdsRequest(p12.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(p02, p12);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    @RequiresApi
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzble;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_zzble_shouldOverrideUrlLoading_0be9d1166e4d2b898d60c29b83c26642 = safedk_zzble_shouldOverrideUrlLoading_0be9d1166e4d2b898d60c29b83c26642(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(g.f30053h, webView, webResourceRequest, safedk_zzble_shouldOverrideUrlLoading_0be9d1166e4d2b898d60c29b83c26642);
        return safedk_zzble_shouldOverrideUrlLoading_0be9d1166e4d2b898d60c29b83c26642;
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzble;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zzble_shouldOverrideUrlLoading_f701eacbdc6b72fb27f9ba331f2da8f5 = safedk_zzble_shouldOverrideUrlLoading_f701eacbdc6b72fb27f9ba331f2da8f5(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f30053h, webView, str, safedk_zzble_shouldOverrideUrlLoading_f701eacbdc6b72fb27f9ba331f2da8f5);
        return safedk_zzble_shouldOverrideUrlLoading_f701eacbdc6b72fb27f9ba331f2da8f5;
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(@Nullable WebViewClient webViewClient) {
        zzfxz.zzf(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }

    public boolean safedk_zzble_shouldOverrideUrlLoading_f701eacbdc6b72fb27f9ba331f2da8f5(WebView p02, String p12) {
        if (!zzc(p02)) {
            return false;
        }
        if (this.zzc.handleH5AdsRequest(p12)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(p02, p12);
    }
}
