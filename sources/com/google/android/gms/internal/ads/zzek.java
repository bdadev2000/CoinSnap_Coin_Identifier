package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzek {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzek(long j3) {
        zzi(0L);
    }

    public static long zzg(long j3) {
        return (j3 * 1000000) / 90000;
    }

    public static long zzh(long j3) {
        return (j3 * 90000) / 1000000;
    }

    public final synchronized long zza(long j3) {
        if (!zzj()) {
            long j10 = this.zza;
            if (j10 == 9223372036854775806L) {
                Long l10 = (Long) this.zzd.get();
                l10.getClass();
                j10 = l10.longValue();
            }
            this.zzb = j10 - j3;
            notifyAll();
        }
        this.zzc = j3;
        return j3 + this.zzb;
    }

    public final synchronized long zzb(long j3) {
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j10 = this.zzc;
        if (j10 != C.TIME_UNSET) {
            long zzh = zzh(j10);
            long j11 = (4294967296L + zzh) / 8589934592L;
            long j12 = (((-1) + j11) * 8589934592L) + j3;
            long j13 = (j11 * 8589934592L) + j3;
            if (Math.abs(j12 - zzh) < Math.abs(j13 - zzh)) {
                j3 = j12;
            } else {
                j3 = j13;
            }
        }
        return zza(zzg(j3));
    }

    public final synchronized long zzc(long j3) {
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j10 = this.zzc;
        if (j10 != C.TIME_UNSET) {
            long zzh = zzh(j10);
            long j11 = zzh / 8589934592L;
            long j12 = (j11 * 8589934592L) + j3;
            long j13 = ((j11 + 1) * 8589934592L) + j3;
            if (j12 >= zzh) {
                j3 = j12;
            } else {
                j3 = j13;
            }
        }
        return zza(zzg(j3));
    }

    public final synchronized long zzd() {
        long j3 = this.zza;
        return (j3 == Long.MAX_VALUE || j3 == 9223372036854775806L) ? C.TIME_UNSET : j3;
    }

    public final synchronized long zze() {
        long j3;
        j3 = this.zzc;
        return j3 != C.TIME_UNSET ? j3 + this.zzb : zzd();
    }

    public final synchronized long zzf() {
        return this.zzb;
    }

    public final synchronized void zzi(long j3) {
        this.zza = j3;
        this.zzb = j3 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = C.TIME_UNSET;
    }

    public final synchronized boolean zzj() {
        return this.zzb != C.TIME_UNSET;
    }
}
