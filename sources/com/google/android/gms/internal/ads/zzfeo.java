package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfeo implements zzenh {
    final /* synthetic */ zzfeq zza;

    public zzfeo(zzfeq zzfeqVar) {
        this.zza = zzfeqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdor zzdorVar;
        zzffg zzffgVar;
        zzdor zzdorVar2 = (zzdor) obj;
        synchronized (this.zza) {
            this.zza.zzd = zzdorVar2;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdE)).booleanValue()) {
                zzffh zzd = zzdorVar2.zzd();
                zzffgVar = this.zza.zzc;
                zzd.zza = zzffgVar;
            }
            zzdorVar = this.zza.zzd;
            zzdorVar.zzk();
        }
    }
}
