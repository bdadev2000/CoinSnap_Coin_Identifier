package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public class zzacf implements zzadq {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacf(long j3, long j10, int i10, int i11, boolean z10) {
        long zzc;
        this.zza = j3;
        this.zzb = j10;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        if (j3 == -1) {
            this.zzd = -1L;
            zzc = C.TIME_UNSET;
        } else {
            this.zzd = j3 - j10;
            zzc = zzc(j3, j10, i10);
        }
        this.zzf = zzc;
    }

    private static long zzc(long j3, long j10, int i10) {
        return (Math.max(0L, j3 - j10) * 8000000) / i10;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j3) {
        return zzc(j3, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        long j10 = this.zzd;
        if (j10 != -1) {
            long j11 = this.zzc;
            long j12 = (((this.zze * j3) / 8000000) / j11) * j11;
            if (j10 != -1) {
                j12 = Math.min(j12, j10 - j11);
            }
            long max = this.zzb + Math.max(j12, 0L);
            long zzb = zzb(max);
            zzadr zzadrVar = new zzadr(zzb, max);
            if (this.zzd != -1 && zzb < j3) {
                long j13 = max + this.zzc;
                if (j13 < this.zza) {
                    return new zzado(zzadrVar, new zzadr(zzb(j13), j13));
                }
            }
            return new zzado(zzadrVar, zzadrVar);
        }
        zzadr zzadrVar2 = new zzadr(0L, this.zzb);
        return new zzado(zzadrVar2, zzadrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
