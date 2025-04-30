package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfgj implements zzepr {
    final /* synthetic */ zzfgk zza;

    public zzfgj(zzfgk zzfgkVar) {
        this.zza = zzfgkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdrh zzdrhVar;
        zzfhg zzfhgVar;
        synchronized (this.zza) {
            try {
                this.zza.zzi = (zzdrh) obj;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdy)).booleanValue()) {
                    zzfhh zzd = ((zzdrh) obj).zzd();
                    zzfhgVar = this.zza.zzd;
                    zzd.zza = zzfhgVar;
                }
                zzdrhVar = this.zza.zzi;
                zzdrhVar.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
