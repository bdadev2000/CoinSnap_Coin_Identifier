package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfmr extends zzbxi {
    final /* synthetic */ zzgfa zza;
    final /* synthetic */ zzbxc zzb;
    final /* synthetic */ zzfms zzc;

    public zzfmr(zzfms zzfmsVar, zzgfa zzgfaVar, zzbxc zzbxcVar) {
        this.zza = zzgfaVar;
        this.zzb = zzbxcVar;
        this.zzc = zzfmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to load rewarded ad with error: " + zzeVar.zzb().toString() + ", adUnitId: " + this.zzc.zze.zza);
        new zzfmn(this.zzc, this.zza).zza(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzg() {
        new zzfmn(this.zzc, this.zza).zzb(this.zzb);
    }
}
