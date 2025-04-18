package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaiv implements zzais {
    private final int zza;
    private final int zzb;
    private final zzek zzc;

    public zzaiv(zzain zzainVar, zzaf zzafVar) {
        zzek zzekVar = zzainVar.zza;
        this.zzc = zzekVar;
        zzekVar.zzL(12);
        int zzp = zzekVar.zzp();
        if ("audio/raw".equals(zzafVar.zzn)) {
            int zzj = zzeu.zzj(zzafVar.zzD) * zzafVar.zzB;
            if (zzp == 0 || zzp % zzj != 0) {
                zzea.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzj + ", stsz sample size: " + zzp);
                zzp = zzj;
            }
        }
        this.zza = zzp == 0 ? -1 : zzp;
        this.zzb = zzekVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final int zzc() {
        int i2 = this.zza;
        return i2 == -1 ? this.zzc.zzp() : i2;
    }
}
