package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzegu implements zzgee {
    final /* synthetic */ zzegv zza;

    public zzegu(zzegv zzegvVar) {
        this.zza = zzegvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzcqh zzcqhVar;
        zzcwo zzcwoVar;
        zzcqhVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcqhVar.zzd().zza(th2);
        zzcwoVar = this.zza.zzd;
        zzcwoVar.zzdB(zza);
        zzfgl.zzb(zza.zza, th2, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcpd) obj).zzk();
    }
}
