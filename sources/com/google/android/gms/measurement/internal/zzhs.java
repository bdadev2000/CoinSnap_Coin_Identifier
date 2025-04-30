package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzhs implements Runnable {
    private final /* synthetic */ zzae zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzhn zzc;

    public zzhs(zzhn zzhnVar, zzae zzaeVar, zzo zzoVar) {
        this.zza = zzaeVar;
        this.zzb = zzoVar;
        this.zzc = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc zzncVar;
        zznc zzncVar2;
        zznc zzncVar3;
        zzncVar = this.zzc.zza;
        zzncVar.zzr();
        if (this.zza.zzc.zza() == null) {
            zzncVar3 = this.zzc.zza;
            zzncVar3.zza(this.zza, this.zzb);
        } else {
            zzncVar2 = this.zzc.zza;
            zzncVar2.zzb(this.zza, this.zzb);
        }
    }
}
