package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
final class zzfod extends zzbxl {
    final /* synthetic */ zzggh zza;
    final /* synthetic */ zzbxf zzb;
    final /* synthetic */ zzfoe zzc;

    public zzfod(zzfoe zzfoeVar, zzggh zzgghVar, zzbxf zzbxfVar) {
        this.zza = zzgghVar;
        this.zzb = zzbxfVar;
        this.zzc = zzfoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxm
    public final void zze(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxm
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to load rewarded ad with error: " + zzeVar.zzb().toString() + ", adUnitId: " + this.zzc.zze.zza);
        new zzfnz(this.zzc, this.zza).zza(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxm
    public final void zzg() {
        new zzfnz(this.zzc, this.zza).zzb(this.zzb);
    }
}
