package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zziz implements Runnable {
    private final /* synthetic */ zzon zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzic zzc;

    public zziz(zzic zzicVar, zzon zzonVar, zzo zzoVar) {
        this.zza = zzonVar;
        this.zzb = zzoVar;
        this.zzc = zzicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznv zznvVar;
        zznv zznvVar2;
        zznv zznvVar3;
        zznvVar = this.zzc.zza;
        zznvVar.zzr();
        if (this.zza.zza() == null) {
            zznvVar3 = this.zzc.zza;
            zznvVar3.zza(this.zza.zza, this.zzb);
        } else {
            zznvVar2 = this.zzc.zza;
            zznvVar2.zza(this.zza, this.zzb);
        }
    }
}
