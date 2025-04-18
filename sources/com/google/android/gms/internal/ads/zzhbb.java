package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhbb implements zzhas {
    final int zza;
    final zzhel zzb;
    final boolean zzc;
    final boolean zzd;

    public zzhbb(zzhbj zzhbjVar, int i2, zzhel zzhelVar, boolean z2, boolean z3) {
        this.zza = i2;
        this.zzb = zzhelVar;
        this.zzc = z2;
        this.zzd = z3;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzhbb) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final zzhel zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final zzhem zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final boolean zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final boolean zze() {
        return this.zzc;
    }
}
