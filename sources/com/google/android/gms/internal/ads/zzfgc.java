package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
final class zzfgc implements zzeoq {
    final /* synthetic */ zzfge zza;

    public zzfgc(zzfge zzfgeVar) {
        this.zza = zzfgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdqi zzdqiVar;
        zzfgu zzfguVar;
        zzdqi zzdqiVar2 = (zzdqi) obj;
        synchronized (this.zza) {
            try {
                this.zza.zzd = zzdqiVar2;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdx)).booleanValue()) {
                    zzfgv zzd = zzdqiVar2.zzd();
                    zzfguVar = this.zza.zzc;
                    zzd.zza = zzfguVar;
                }
                zzdqiVar = this.zza.zzd;
                zzdqiVar.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
