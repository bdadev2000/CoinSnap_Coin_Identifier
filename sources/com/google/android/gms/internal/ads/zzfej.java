package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfej implements zzenh {
    final /* synthetic */ zzfek zza;

    public zzfej(zzfek zzfekVar) {
        this.zza = zzfekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdor zzdorVar;
        zzffg zzffgVar;
        zzdor zzdorVar2 = (zzdor) obj;
        synchronized (this.zza) {
            this.zza.zzi = zzdorVar2;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdE)).booleanValue()) {
                zzffh zzd = zzdorVar2.zzd();
                zzffgVar = this.zza.zzd;
                zzd.zza = zzffgVar;
            }
            zzdorVar = this.zza.zzi;
            zzdorVar.zzk();
        }
    }
}
