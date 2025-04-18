package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class zzaoy implements zzaea {
    private final zzaov zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaoy(zzaov zzaovVar, int i2, long j2, long j3) {
        this.zza = zzaovVar;
        this.zzb = i2;
        this.zzc = j2;
        long j4 = (j3 - j2) / zzaovVar.zzd;
        this.zzd = j4;
        this.zze = zzb(j4);
    }

    private final long zzb(long j2) {
        return zzeu.zzt(j2 * this.zzb, 1000000L, this.zza.zzc, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        long max = Math.max(0L, Math.min((this.zza.zzc * j2) / (this.zzb * 1000000), this.zzd - 1));
        long zzb = zzb(max);
        zzaeb zzaebVar = new zzaeb(zzb, this.zzc + (this.zza.zzd * max));
        if (zzb >= j2 || max == this.zzd - 1) {
            return new zzady(zzaebVar, zzaebVar);
        }
        long j3 = max + 1;
        return new zzady(zzaebVar, new zzaeb(zzb(j3), (j3 * this.zza.zzd) + this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return true;
    }
}
