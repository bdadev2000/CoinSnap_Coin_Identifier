package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzgb {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzgb(long j7) {
        zzi(0L);
    }

    public static long zzg(long j7) {
        return (j7 * 1000000) / 90000;
    }

    public static long zzh(long j7) {
        return (j7 * 90000) / 1000000;
    }

    public final synchronized long zza(long j7) {
        try {
            if (!zzj()) {
                long j9 = this.zza;
                if (j9 == 9223372036854775806L) {
                    Long l = (Long) this.zzd.get();
                    l.getClass();
                    j9 = l.longValue();
                }
                this.zzb = j9 - j7;
                notifyAll();
            }
            this.zzc = j7;
        } catch (Throwable th) {
            throw th;
        }
        return j7 + this.zzb;
    }

    public final synchronized long zzb(long j7) {
        if (j7 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j9 = this.zzc;
            if (j9 != C.TIME_UNSET) {
                long zzh = zzh(j9);
                long j10 = (4294967296L + zzh) / 8589934592L;
                long j11 = (((-1) + j10) * 8589934592L) + j7;
                long j12 = (j10 * 8589934592L) + j7;
                if (Math.abs(j11 - zzh) < Math.abs(j12 - zzh)) {
                    j7 = j11;
                } else {
                    j7 = j12;
                }
            }
            return zza(zzg(j7));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzc(long j7) {
        if (j7 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j9 = this.zzc;
            if (j9 != C.TIME_UNSET) {
                long zzh = zzh(j9);
                long j10 = zzh / 8589934592L;
                long j11 = (j10 * 8589934592L) + j7;
                long j12 = ((j10 + 1) * 8589934592L) + j7;
                if (j11 >= zzh) {
                    j7 = j11;
                } else {
                    j7 = j12;
                }
            }
            return zza(zzg(j7));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzd() {
        long j7 = this.zza;
        return (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) ? C.TIME_UNSET : j7;
    }

    public final synchronized long zze() {
        long j7;
        try {
            j7 = this.zzc;
        } catch (Throwable th) {
            throw th;
        }
        return j7 != C.TIME_UNSET ? j7 + this.zzb : zzd();
    }

    public final synchronized long zzf() {
        return this.zzb;
    }

    public final synchronized void zzi(long j7) {
        this.zza = j7;
        this.zzb = j7 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = C.TIME_UNSET;
    }

    public final synchronized boolean zzj() {
        return this.zzb != C.TIME_UNSET;
    }
}
