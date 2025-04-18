package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzffx implements zzeoq {
    final /* synthetic */ zzffy zza;

    public zzffx(zzffy zzffyVar) {
        this.zza = zzffyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdqi zzdqiVar;
        zzfgu zzfguVar;
        zzdqi zzdqiVar2 = (zzdqi) obj;
        synchronized (this.zza) {
            try {
                this.zza.zzi = zzdqiVar2;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdx)).booleanValue()) {
                    zzfgv zzd = zzdqiVar2.zzd();
                    zzfguVar = this.zza.zzd;
                    zzd.zza = zzfguVar;
                }
                zzdqiVar = this.zza.zzi;
                zzdqiVar.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
