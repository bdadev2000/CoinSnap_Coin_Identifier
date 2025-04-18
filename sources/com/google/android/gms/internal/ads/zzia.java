package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzia {
    private final long zza;
    private final long zzb;
    private long zzc = C.TIME_UNSET;
    private long zzd = C.TIME_UNSET;
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = C.TIME_UNSET;
    private long zze = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private long zzm = C.TIME_UNSET;
    private long zzn = C.TIME_UNSET;

    public /* synthetic */ zzia(float f10, float f11, long j3, float f12, long j10, long j11, float f13, zzhz zzhzVar) {
        this.zza = j10;
        this.zzb = j11;
    }

    private static long zzf(long j3, long j10, float f10) {
        return (((float) j10) * 9.999871E-4f) + (((float) j3) * 0.999f);
    }

    private final void zzg() {
        long j3;
        long j10 = this.zzc;
        if (j10 != C.TIME_UNSET) {
            j3 = this.zzd;
            if (j3 == C.TIME_UNSET) {
                long j11 = this.zzf;
                if (j11 != C.TIME_UNSET && j10 < j11) {
                    j10 = j11;
                }
                j3 = this.zzg;
                if (j3 == C.TIME_UNSET || j10 <= j3) {
                    j3 = j10;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.zze == j3) {
            return;
        }
        this.zze = j3;
        this.zzh = j3;
        this.zzm = C.TIME_UNSET;
        this.zzn = C.TIME_UNSET;
        this.zzl = C.TIME_UNSET;
    }

    public final float zza(long j3, long j10) {
        if (this.zzc == C.TIME_UNSET) {
            return 1.0f;
        }
        long j11 = j3 - j10;
        long j12 = this.zzm;
        if (j12 == C.TIME_UNSET) {
            this.zzm = j11;
            this.zzn = 0L;
        } else {
            long max = Math.max(j11, zzf(j12, j11, 0.999f));
            this.zzm = max;
            this.zzn = zzf(this.zzn, Math.abs(j11 - max), 0.999f);
        }
        if (this.zzl != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j13 = (this.zzn * 3) + this.zzm;
        if (this.zzh > j13) {
            float zzs = (float) zzen.zzs(1000L);
            long[] jArr = {j13, this.zze, this.zzh - (((this.zzk - 1.0f) * zzs) + ((this.zzi - 1.0f) * zzs))};
            for (int i10 = 1; i10 < 3; i10++) {
                long j14 = jArr[i10];
                if (j14 > j13) {
                    j13 = j14;
                }
            }
            this.zzh = j13;
        } else {
            j13 = Math.max(this.zzh, Math.min(j3 - (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f), j13));
            this.zzh = j13;
            long j15 = this.zzg;
            if (j15 != C.TIME_UNSET && j13 > j15) {
                this.zzh = j15;
                j13 = j15;
            }
        }
        long j16 = j3 - j13;
        if (Math.abs(j16) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float max2 = Math.max(this.zzj, Math.min((((float) j16) * 1.0E-7f) + 1.0f, this.zzi));
        this.zzk = max2;
        return max2;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j3 = this.zzh;
        if (j3 == C.TIME_UNSET) {
            return;
        }
        long j10 = j3 + this.zzb;
        this.zzh = j10;
        long j11 = this.zzg;
        if (j11 != C.TIME_UNSET && j10 > j11) {
            this.zzh = j11;
        }
        this.zzl = C.TIME_UNSET;
    }

    public final void zzd(zzaq zzaqVar) {
        long j3 = zzaqVar.zza;
        this.zzc = zzen.zzs(C.TIME_UNSET);
        this.zzf = zzen.zzs(C.TIME_UNSET);
        this.zzg = zzen.zzs(C.TIME_UNSET);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j3) {
        this.zzd = j3;
        zzg();
    }
}
