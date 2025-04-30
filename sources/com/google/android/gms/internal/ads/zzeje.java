package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeje implements zzgfp {
    final /* synthetic */ zzejf zza;

    public zzeje(zzejf zzejfVar) {
        this.zza = zzejfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzctg zzctgVar;
        zzczn zzcznVar;
        zzctgVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzctgVar.zzd().zza(th);
        zzcznVar = this.zza.zzd;
        zzcznVar.zzdB(zza);
        zzfil.zzb(zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcsf) obj).zzj();
    }
}
