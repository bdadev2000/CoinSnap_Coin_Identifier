package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzmf implements Runnable {
    private final /* synthetic */ zznc zza;
    private final /* synthetic */ Runnable zzb;

    public zzmf(zzme zzmeVar, zznc zzncVar, Runnable runnable) {
        this.zza = zzncVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzr();
        this.zza.zza(this.zzb);
        this.zza.zzw();
    }
}
