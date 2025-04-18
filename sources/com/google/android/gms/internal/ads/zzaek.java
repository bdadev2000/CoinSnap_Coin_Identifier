package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaek implements zzaef {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaek(int i10, int i11, int i12, int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzaek zzb(zzed zzedVar) {
        int zzi = zzedVar.zzi();
        zzedVar.zzM(8);
        int zzi2 = zzedVar.zzi();
        int zzi3 = zzedVar.zzi();
        zzedVar.zzM(4);
        int zzi4 = zzedVar.zzi();
        zzedVar.zzM(12);
        return new zzaek(zzi, zzi2, zzi3, zzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final int zza() {
        return 1751742049;
    }
}
