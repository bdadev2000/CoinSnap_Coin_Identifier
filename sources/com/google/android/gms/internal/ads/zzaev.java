package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaev implements zzaep {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzaev(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.zza = i2;
        this.zzb = i4;
        this.zzc = i5;
        this.zzd = i6;
        this.zze = i7;
    }

    public static zzaev zzb(zzek zzekVar) {
        int zzi = zzekVar.zzi();
        zzekVar.zzM(12);
        int zzi2 = zzekVar.zzi();
        int zzi3 = zzekVar.zzi();
        int zzi4 = zzekVar.zzi();
        zzekVar.zzM(4);
        int zzi5 = zzekVar.zzi();
        int zzi6 = zzekVar.zzi();
        zzekVar.zzM(8);
        return new zzaev(zzi, zzi2, zzi3, zzi4, zzi5, zzi6);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final int zza() {
        return 1752331379;
    }
}
