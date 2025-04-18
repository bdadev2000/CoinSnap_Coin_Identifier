package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzdki implements zzgfk {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdkk zzb;

    public zzdki(zzdkk zzdkkVar, String str, boolean z2) {
        this.zzb = zzdkkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfe)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdkp zzdkpVar;
        zzdkp zzdkpVar2;
        zzdkpVar = this.zzb.zze;
        zzdkpVar.zzT((zzcfo) obj);
        zzdkk zzdkkVar = this.zzb;
        zzdkpVar2 = zzdkkVar.zze;
        zzcas zzp = zzdkpVar2.zzp();
        zzegf zzf = zzdkkVar.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
