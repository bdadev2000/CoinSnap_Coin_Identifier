package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaeu implements zzaep {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaeu(int i2, int i3, int i4, int i5) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
    }

    public static zzaeu zzb(zzek zzekVar) {
        int zzi = zzekVar.zzi();
        zzekVar.zzM(8);
        int zzi2 = zzekVar.zzi();
        int zzi3 = zzekVar.zzi();
        zzekVar.zzM(4);
        int zzi4 = zzekVar.zzi();
        zzekVar.zzM(12);
        return new zzaeu(zzi, zzi2, zzi3, zzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final int zza() {
        return 1751742049;
    }
}
