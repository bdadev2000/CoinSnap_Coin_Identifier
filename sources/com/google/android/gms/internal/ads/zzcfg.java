package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcfg implements Runnable {
    final /* synthetic */ zzcfh zza;

    public zzcfg(zzcfh zzcfhVar) {
        this.zza = zzcfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzu.zzy().zzc(this.zza);
    }
}
