package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes2.dex */
final class zzfpv implements Runnable {
    final /* synthetic */ zzfpw zza;
    private final WebView zzb;

    public zzfpv(zzfpw zzfpwVar) {
        WebView webView;
        this.zza = zzfpwVar;
        webView = zzfpwVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
