package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzc implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzb zzb;

    public zzc(zzb zzbVar, long j3) {
        this.zza = j3;
        this.zzb = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
