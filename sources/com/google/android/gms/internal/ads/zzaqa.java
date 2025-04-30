package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class zzaqa implements zzaet {
    private final zzapx zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaqa(zzapx zzapxVar, int i9, long j7, long j9) {
        this.zza = zzapxVar;
        this.zzb = i9;
        this.zzc = j7;
        long j10 = (j9 - j7) / zzapxVar.zzd;
        this.zzd = j10;
        this.zze = zzb(j10);
    }

    private final long zzb(long j7) {
        return zzgd.zzt(j7 * this.zzb, 1000000L, this.zza.zzc, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        long max = Math.max(0L, Math.min((this.zza.zzc * j7) / (this.zzb * 1000000), this.zzd - 1));
        long zzb = zzb(max);
        zzaeu zzaeuVar = new zzaeu(zzb, this.zzc + (this.zza.zzd * max));
        if (zzb < j7 && max != this.zzd - 1) {
            long j9 = max + 1;
            return new zzaer(zzaeuVar, new zzaeu(zzb(j9), (j9 * this.zza.zzd) + this.zzc));
        }
        return new zzaer(zzaeuVar, zzaeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
