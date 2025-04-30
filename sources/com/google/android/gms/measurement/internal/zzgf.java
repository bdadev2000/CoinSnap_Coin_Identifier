package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzgf implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzgg zzb;

    public zzgf(zzgg zzggVar, boolean z8) {
        this.zza = z8;
        this.zzb = zzggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc zzncVar;
        zzncVar = this.zzb.zza;
        zzncVar.zza(this.zza);
    }
}
