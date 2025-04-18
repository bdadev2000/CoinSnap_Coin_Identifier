package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class zzaol implements zzadq {
    private final zzaoi zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaol(zzaoi zzaoiVar, int i10, long j3, long j10) {
        this.zza = zzaoiVar;
        this.zzb = i10;
        this.zzc = j3;
        long j11 = (j10 - j3) / zzaoiVar.zzd;
        this.zzd = j11;
        this.zze = zzb(j11);
    }

    private final long zzb(long j3) {
        return zzen.zzu(j3 * this.zzb, 1000000L, this.zza.zzc, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        long max = Math.max(0L, Math.min((this.zza.zzc * j3) / (this.zzb * 1000000), this.zzd - 1));
        long zzb = zzb(max);
        zzadr zzadrVar = new zzadr(zzb, this.zzc + (this.zza.zzd * max));
        if (zzb < j3 && max != this.zzd - 1) {
            long j10 = max + 1;
            return new zzado(zzadrVar, new zzadr(zzb(j10), (j10 * this.zza.zzd) + this.zzc));
        }
        return new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}
