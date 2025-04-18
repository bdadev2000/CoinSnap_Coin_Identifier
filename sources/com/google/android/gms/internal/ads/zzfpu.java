package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes4.dex */
final class zzfpu implements Runnable {
    final /* synthetic */ zzfpv zza;
    private final WebView zzb;

    public zzfpu(zzfpv zzfpvVar) {
        WebView webView;
        this.zza = zzfpvVar;
        webView = zzfpvVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
