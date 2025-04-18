package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
final class zzfnk extends zzbaq {
    final /* synthetic */ zzggh zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfu zzb;
    final /* synthetic */ zzfnl zzc;

    public zzfnk(zzfnl zzfnlVar, zzggh zzgghVar, com.google.android.gms.ads.internal.client.zzfu zzfuVar) {
        this.zza = zzgghVar;
        this.zzb = zzfuVar;
        this.zzc = zzfnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzb(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to load app open ad with error parcel: " + zzeVar.zzb().toString() + " for ad unit: " + this.zzb.zza);
        new zzfnz(this.zzc, this.zza).zza(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzd(zzbao zzbaoVar) {
        new zzfnz(this.zzc, this.zza).zzb(zzbaoVar);
    }
}
