package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzafo implements zzafj {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzafo(int i9, int i10, int i11, int i12) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = i11;
    }

    public static zzafo zzb(zzfu zzfuVar) {
        int zzi = zzfuVar.zzi();
        zzfuVar.zzL(8);
        int zzi2 = zzfuVar.zzi();
        int zzi3 = zzfuVar.zzi();
        zzfuVar.zzL(4);
        int zzi4 = zzfuVar.zzi();
        zzfuVar.zzL(12);
        return new zzafo(zzi, zzi2, zzi3, zzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final int zza() {
        return 1751742049;
    }
}
