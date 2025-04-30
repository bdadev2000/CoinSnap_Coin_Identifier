package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhbl implements zzhbc {
    final zzhbt zza;
    final int zzb;
    final zzhfg zzc;
    final boolean zzd;
    final boolean zze;

    public zzhbl(zzhbt zzhbtVar, int i9, zzhfg zzhfgVar, boolean z8, boolean z9) {
        this.zza = zzhbtVar;
        this.zzb = i9;
        this.zzc = zzhfgVar;
        this.zzd = z8;
        this.zze = z9;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zzb - ((zzhbl) obj).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final zzhdd zzb(zzhdd zzhddVar, zzhde zzhdeVar) {
        ((zzhbi) zzhddVar).zzbj((zzhbo) zzhdeVar);
        return zzhddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final zzhdj zzc(zzhdj zzhdjVar, zzhdj zzhdjVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final zzhfg zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final zzhfh zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final boolean zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final boolean zzg() {
        return this.zzd;
    }
}
