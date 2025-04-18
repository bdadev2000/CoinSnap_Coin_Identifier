package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgyu implements zzgyl {
    final int zza;
    final zzhca zzb;
    final boolean zzc;
    final boolean zzd;

    public zzgyu(zzgzc zzgzcVar, int i10, zzhca zzhcaVar, boolean z10, boolean z11) {
        this.zza = i10;
        this.zzb = zzhcaVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzgyu) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final zzhca zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final zzhcb zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean zze() {
        return this.zzc;
    }
}
