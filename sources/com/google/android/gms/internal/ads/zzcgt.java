package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;

@TargetApi(21)
/* loaded from: classes3.dex */
public final class zzcgt extends zzcgs {
    public zzcgt(zzcfk zzcfkVar, zzbbl zzbblVar, boolean z10, @Nullable zzeea zzeeaVar) {
        super(zzcfkVar, zzbblVar, z10, zzeeaVar);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            return zzV(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        return null;
    }
}
