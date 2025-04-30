package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;

@TargetApi(21)
/* loaded from: classes2.dex */
public final class zzcim extends zzcil {
    public zzcim(zzchd zzchdVar, zzbdm zzbdmVar, boolean z8, @Nullable zzegk zzegkVar) {
        super(zzchdVar, zzbdmVar, z8, zzegkVar);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            return zzS(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        return null;
    }
}
