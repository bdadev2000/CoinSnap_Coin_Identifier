package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes4.dex */
final class zzfpj implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    public zzfpj(zzfpk zzfpkVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfpk.zzj(this.zza, this.zzb);
    }
}
