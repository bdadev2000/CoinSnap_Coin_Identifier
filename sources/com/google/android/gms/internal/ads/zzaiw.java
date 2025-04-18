package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaiw implements zzais {
    private final zzek zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaiw(zzain zzainVar) {
        zzek zzekVar = zzainVar.zza;
        this.zza = zzekVar;
        zzekVar.zzL(12);
        this.zzc = zzekVar.zzp() & 255;
        this.zzb = zzekVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final int zzc() {
        int i2 = this.zzc;
        if (i2 == 8) {
            return this.zza.zzm();
        }
        if (i2 == 16) {
            return this.zza.zzq();
        }
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        if (i3 % 2 != 0) {
            return this.zze & 15;
        }
        int zzm = this.zza.zzm();
        this.zze = zzm;
        return (zzm & 240) >> 4;
    }
}
