package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzazs implements Runnable {
    final ValueCallback zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzazr
        @Override // android.webkit.ValueCallback
        public final void onReceiveValue(Object obj) {
            zzazs zzazsVar = zzazs.this;
            zzazsVar.zze.zzd(zzazsVar.zzb, zzazsVar.zzc, (String) obj, zzazsVar.zzd);
        }
    };
    final /* synthetic */ zzazk zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzazu zze;

    public zzazs(zzazu zzazuVar, zzazk zzazkVar, WebView webView, boolean z2) {
        this.zzb = zzazkVar;
        this.zzc = webView;
        this.zzd = z2;
        this.zze = zzazuVar;
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
