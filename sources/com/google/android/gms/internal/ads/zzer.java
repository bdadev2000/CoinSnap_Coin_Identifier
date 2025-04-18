package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;

/* loaded from: classes3.dex */
public final class zzer {

    @GuardedBy
    private long zza;

    @GuardedBy
    private long zzb;

    @GuardedBy
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzer(long j2) {
        zzi(0L);
    }

    public static long zzg(long j2) {
        return (j2 * 1000000) / 90000;
    }

    public static long zzh(long j2) {
        return (j2 * 90000) / 1000000;
    }

    public final synchronized long zza(long j2) {
        try {
            if (!zzj()) {
                long j3 = this.zza;
                if (j3 == 9223372036854775806L) {
                    Long l2 = (Long) this.zzd.get();
                    l2.getClass();
                    j3 = l2.longValue();
                }
                this.zzb = j3 - j2;
                notifyAll();
            }
            this.zzc = j2;
        } catch (Throwable th) {
            throw th;
        }
        return j2 + this.zzb;
    }

    public final synchronized long zzb(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.zzc;
            if (j3 != -9223372036854775807L) {
                long zzh = zzh(j3);
                long j4 = (4294967296L + zzh) / 8589934592L;
                long j5 = (((-1) + j4) * 8589934592L) + j2;
                long j6 = (j4 * 8589934592L) + j2;
                j2 = Math.abs(j5 - zzh) < Math.abs(j6 - zzh) ? j5 : j6;
            }
            return zza(zzg(j2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzc(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.zzc;
            if (j3 != -9223372036854775807L) {
                long zzh = zzh(j3);
                long j4 = zzh / 8589934592L;
                long j5 = (j4 * 8589934592L) + j2;
                j2 = j5 >= zzh ? j5 : ((j4 + 1) * 8589934592L) + j2;
            }
            return zza(zzg(j2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzd() {
        long j2 = this.zza;
        if (j2 == Long.MAX_VALUE || j2 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j2;
    }

    public final synchronized long zze() {
        long j2;
        try {
            j2 = this.zzc;
        } catch (Throwable th) {
            throw th;
        }
        return j2 != -9223372036854775807L ? j2 + this.zzb : zzd();
    }

    public final synchronized long zzf() {
        return this.zzb;
    }

    public final synchronized void zzi(long j2) {
        this.zza = j2;
        this.zzb = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized boolean zzj() {
        return this.zzb != -9223372036854775807L;
    }
}
