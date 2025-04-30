package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfgo implements zzepr {
    final /* synthetic */ zzfgq zza;

    public zzfgo(zzfgq zzfgqVar) {
        this.zza = zzfgqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdrh zzdrhVar;
        zzfhg zzfhgVar;
        synchronized (this.zza) {
            try {
                this.zza.zzd = (zzdrh) obj;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdy)).booleanValue()) {
                    zzfhh zzd = ((zzdrh) obj).zzd();
                    zzfhgVar = this.zza.zzc;
                    zzd.zza = zzfhgVar;
                }
                zzdrhVar = this.zza.zzd;
                zzdrhVar.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
