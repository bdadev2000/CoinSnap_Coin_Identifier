package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeid implements zzgfk {
    final /* synthetic */ zzeie zza;

    public zzeid(zzeie zzeieVar) {
        this.zza = zzeieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzcrv zzcrvVar;
        zzcyc zzcycVar;
        zzcrvVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcrvVar.zzd().zza(th);
        zzcycVar = this.zza.zzd;
        zzcycVar.zzdB(zza);
        zzfhz.zzb(zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcqr) obj).zzk();
    }
}
