package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcib implements Runnable {
    final /* synthetic */ zzcic zza;

    public zzcib(zzcic zzcicVar) {
        this.zza = zzcicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
