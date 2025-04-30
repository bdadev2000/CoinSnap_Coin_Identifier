package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public class zzadh implements zzaet {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzadh(long j7, long j9, int i9, int i10, boolean z8) {
        long zzc;
        this.zza = j7;
        this.zzb = j9;
        this.zzc = i10 == -1 ? 1 : i10;
        this.zze = i9;
        if (j7 == -1) {
            this.zzd = -1L;
            zzc = C.TIME_UNSET;
        } else {
            this.zzd = j7 - j9;
            zzc = zzc(j7, j9, i9);
        }
        this.zzf = zzc;
    }

    private static long zzc(long j7, long j9, int i9) {
        return (Math.max(0L, j7 - j9) * 8000000) / i9;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j7) {
        return zzc(j7, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        long j9 = this.zzd;
        if (j9 != -1) {
            long j10 = this.zzc;
            long j11 = (((this.zze * j7) / 8000000) / j10) * j10;
            if (j9 != -1) {
                j11 = Math.min(j11, j9 - j10);
            }
            long max = this.zzb + Math.max(j11, 0L);
            long zzb = zzb(max);
            zzaeu zzaeuVar = new zzaeu(zzb, max);
            if (this.zzd != -1 && zzb < j7) {
                long j12 = max + this.zzc;
                if (j12 < this.zza) {
                    return new zzaer(zzaeuVar, new zzaeu(zzb(j12), j12));
                }
            }
            return new zzaer(zzaeuVar, zzaeuVar);
        }
        zzaeu zzaeuVar2 = new zzaeu(0L, this.zzb);
        return new zzaer(zzaeuVar2, zzaeuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
