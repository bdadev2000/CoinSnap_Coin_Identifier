package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes3.dex */
final class zzfok implements Runnable {
    final /* synthetic */ zzfol zza;
    private final WebView zzb;

    public zzfok(zzfol zzfolVar) {
        WebView webView;
        this.zza = zzfolVar;
        webView = zzfolVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
