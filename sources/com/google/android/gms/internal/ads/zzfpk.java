package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes2.dex */
final class zzfpk implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfpl zzc;

    public zzfpk(zzfpl zzfplVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
        this.zzc = zzfplVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfpl.zzj(this.zza, this.zzb);
    }
}
