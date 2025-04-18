package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzflv extends zzbah {
    final /* synthetic */ zzgfa zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzft zzb;
    final /* synthetic */ zzflw zzc;

    public zzflv(zzflw zzflwVar, zzgfa zzgfaVar, com.google.android.gms.ads.internal.client.zzft zzftVar) {
        this.zza = zzgfaVar;
        this.zzb = zzftVar;
        this.zzc = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzb(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to load app open ad with error parcel: " + zzeVar.zzb().toString() + " for ad unit: " + this.zzb.zza);
        new zzfmn(this.zzc, this.zza).zza(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzd(zzbaf zzbafVar) {
        new zzfmn(this.zzc, this.zza).zzb(zzbafVar);
    }
}
