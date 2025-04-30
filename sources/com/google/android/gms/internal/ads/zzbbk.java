package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbbk implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbbc zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbbm zze;

    public zzbbk(zzbbm zzbbmVar, final zzbbc zzbbcVar, final WebView webView, final boolean z8) {
        this.zzb = zzbbcVar;
        this.zzc = webView;
        this.zzd = z8;
        this.zze = zzbbmVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbbj
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzbbk.this.zze.zzd(zzbbcVar, webView, (String) obj, z8);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
