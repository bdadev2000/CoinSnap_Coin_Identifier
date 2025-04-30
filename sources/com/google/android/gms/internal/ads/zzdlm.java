package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdlm implements zzgfp {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdlo zzb;

    public zzdlm(zzdlo zzdloVar, String str, boolean z8) {
        this.zzb = zzdloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfj)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdlt zzdltVar;
        zzdlt zzdltVar2;
        zzdltVar = this.zzb.zze;
        zzdltVar.zzT((zzchd) obj);
        zzdlo zzdloVar = this.zzb;
        zzdltVar2 = zzdloVar.zze;
        zzccn zzp = zzdltVar2.zzp();
        zzehg zzf = zzdloVar.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
