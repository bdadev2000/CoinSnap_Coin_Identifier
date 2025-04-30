package com.google.android.gms.ads.internal.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zza implements Runnable {
    final /* synthetic */ zzb zza;

    public zza(zzb zzbVar) {
        this.zza = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb = Thread.currentThread();
        this.zza.zza();
    }
}
