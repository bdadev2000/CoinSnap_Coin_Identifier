package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes3.dex */
final class zzfoj extends WebViewClient {
    final /* synthetic */ zzfol zza;

    public zzfoj(zzfol zzfolVar) {
        this.zza = zzfolVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + String.valueOf(webView));
        if (this.zza.zza() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            this.zza.zzn(null);
        }
        webView.destroy();
        return true;
    }
}
