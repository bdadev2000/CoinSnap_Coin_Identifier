package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzael implements zzaef {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzael(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i10;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
    }

    public static zzael zzb(zzed zzedVar) {
        int zzi = zzedVar.zzi();
        zzedVar.zzM(12);
        int zzi2 = zzedVar.zzi();
        int zzi3 = zzedVar.zzi();
        int zzi4 = zzedVar.zzi();
        zzedVar.zzM(4);
        int zzi5 = zzedVar.zzi();
        int zzi6 = zzedVar.zzi();
        zzedVar.zzM(8);
        return new zzael(zzi, zzi2, zzi3, zzi4, zzi5, zzi6);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final int zza() {
        return 1752331379;
    }
}
