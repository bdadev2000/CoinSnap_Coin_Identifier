package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfly extends com.google.android.gms.ads.internal.client.zzbn {
    final /* synthetic */ zzgfa zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zzb;
    final /* synthetic */ zzflz zzc;

    public zzfly(zzflz zzflzVar, zzgfa zzgfaVar, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zza = zzgfaVar;
        this.zzb = zzbyVar;
        this.zzc = zzflzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to load interstitial ad with error: " + zzeVar.zzb().toString() + " for ad unit: " + this.zzc.zze.zza);
        new zzfmn(this.zzc, this.zza).zza(zzeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() {
        new zzfmn(this.zzc, this.zza).zzb(this.zzb);
    }
}
