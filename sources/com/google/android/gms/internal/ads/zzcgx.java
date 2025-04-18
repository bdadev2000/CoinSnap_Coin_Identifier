package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;

@TargetApi(21)
/* loaded from: classes3.dex */
public final class zzcgx extends zzcgw {
    public zzcgx(zzcfo zzcfoVar, zzbbu zzbbuVar, boolean z2, @Nullable zzefj zzefjVar) {
        super(zzcfoVar, zzbbuVar, z2, zzefjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfw, android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzT(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
