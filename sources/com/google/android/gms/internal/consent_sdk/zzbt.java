package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzbt extends WebViewClient {
    final /* synthetic */ zzbu zza;

    public /* synthetic */ zzbt(zzbu zzbuVar, zzbs zzbsVar) {
        this.zza = zzbuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbt;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(g.f30053h, webView, str);
        safedk_zzbt_onLoadResource_2660ffb8318e14997e294194bcd8a464(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbt;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f30053h, webView, str);
        safedk_zzbt_onPageFinished_82070f5eadea1da6912418d728bd8d1f(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        zzca zzcaVar;
        zzcaVar = this.zza.zzb;
        zzcaVar.zzf(i2, str, str2);
    }

    public void safedk_zzbt_onLoadResource_2660ffb8318e14997e294194bcd8a464(WebView p02, String p12) {
        zzca zzcaVar;
        if (zzbu.zzf(this.zza, p12)) {
            zzcaVar = this.zza.zzb;
            zzcaVar.zze(p12);
        }
    }

    public void safedk_zzbt_onPageFinished_82070f5eadea1da6912418d728bd8d1f(WebView p02, String p12) {
        boolean z2;
        z2 = this.zza.zzc;
        if (z2) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        this.zza.zzc = true;
    }

    @TargetApi(24)
    public boolean safedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6(WebView p02, WebResourceRequest p12) {
        zzca zzcaVar;
        String uri = p12.getUrl().toString();
        if (!zzbu.zzf(this.zza, uri)) {
            return false;
        }
        zzcaVar = this.zza.zzb;
        zzcaVar.zze(uri);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f30053h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(g.f30053h, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbt;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6 = safedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(g.f30053h, webView, webResourceRequest, safedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6);
        return safedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbt;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad = safedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f30053h, webView, str, safedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad);
        return safedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad;
    }

    public boolean safedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad(WebView p02, String p12) {
        zzca zzcaVar;
        if (!zzbu.zzf(this.zza, p12)) {
            return false;
        }
        zzcaVar = this.zza.zzb;
        zzcaVar.zze(p12);
        return true;
    }
}
