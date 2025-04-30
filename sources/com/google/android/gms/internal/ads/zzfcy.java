package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfcy implements zzepr {
    final /* synthetic */ zzfcz zza;

    public zzfcy(zzfcz zzfczVar) {
        this.zza = zzfczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcr zzfcrVar;
        zzfcr zzfcrVar2;
        zzdvc zzdvcVar;
        zzcrz zzcrzVar = (zzcrz) obj;
        synchronized (this.zza) {
            try {
                zzcrz zzcrzVar2 = this.zza.zza;
                if (zzcrzVar2 != null) {
                    zzcrzVar2.zzb();
                }
                zzfcz zzfczVar = this.zza;
                zzfczVar.zza = zzcrzVar;
                zzcrzVar.zzc(zzfczVar);
                zzfcz zzfczVar2 = this.zza;
                zzfcrVar = zzfczVar2.zzg;
                zzfcrVar2 = zzfczVar2.zzg;
                zzdvcVar = zzfczVar2.zzi;
                zzfcrVar.zzk(new zzcsa(zzcrzVar, zzfczVar2, zzfcrVar2, zzdvcVar));
                zzcrzVar.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
