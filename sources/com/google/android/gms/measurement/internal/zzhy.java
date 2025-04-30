package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzhy implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhn zzb;

    public zzhy(zzhn zzhnVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc zzncVar;
        zznc zzncVar2;
        zzncVar = this.zzb.zza;
        zzncVar.zzr();
        zzncVar2 = this.zzb.zza;
        zzncVar2.zzd(this.zza);
    }
}
