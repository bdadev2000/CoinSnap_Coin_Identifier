package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfay implements zzenh {
    final /* synthetic */ zzfaz zza;

    public zzfay(zzfaz zzfazVar) {
        this.zza = zzfazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfar zzfarVar;
        zzfar zzfarVar2;
        zzdsm zzdsmVar;
        zzcox zzcoxVar = (zzcox) obj;
        synchronized (this.zza) {
            zzcox zzcoxVar2 = this.zza.zza;
            if (zzcoxVar2 != null) {
                zzcoxVar2.zzb();
            }
            zzfaz zzfazVar = this.zza;
            zzfazVar.zza = zzcoxVar;
            zzcoxVar.zzc(zzfazVar);
            zzfaz zzfazVar2 = this.zza;
            zzfarVar = zzfazVar2.zzg;
            zzfarVar2 = zzfazVar2.zzg;
            zzdsmVar = zzfazVar2.zzi;
            zzfarVar.zzk(new zzcoy(zzcoxVar, zzfazVar2, zzfarVar2, zzdsmVar));
            zzcoxVar.zzk();
        }
    }
}
