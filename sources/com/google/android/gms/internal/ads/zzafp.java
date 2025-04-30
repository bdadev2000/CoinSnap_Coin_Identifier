package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzafp implements zzafj {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzafp(int i9, int i10, int i11, int i12, int i13, int i14) {
        this.zza = i9;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
    }

    public static zzafp zzb(zzfu zzfuVar) {
        int zzi = zzfuVar.zzi();
        zzfuVar.zzL(12);
        int zzi2 = zzfuVar.zzi();
        int zzi3 = zzfuVar.zzi();
        int zzi4 = zzfuVar.zzi();
        zzfuVar.zzL(4);
        int zzi5 = zzfuVar.zzi();
        int zzi6 = zzfuVar.zzi();
        zzfuVar.zzL(8);
        return new zzafp(zzi, zzi2, zzi3, zzi4, zzi5, zzi6);
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final int zza() {
        return 1752331379;
    }
}
