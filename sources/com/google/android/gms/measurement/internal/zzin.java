package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzin implements Runnable {
    private final /* synthetic */ zzae zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzic zzc;

    public zzin(zzic zzicVar, zzae zzaeVar, zzo zzoVar) {
        this.zza = zzaeVar;
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
        if (this.zza.zzc.zza() == null) {
            zznvVar3 = this.zzc.zza;
            zznvVar3.zza(this.zza, this.zzb);
        } else {
            zznvVar2 = this.zzc.zza;
            zznvVar2.zzb(this.zza, this.zzb);
        }
    }
}
