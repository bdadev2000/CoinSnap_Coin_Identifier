package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzja {
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

    public /* synthetic */ zzja(float f9, float f10, long j7, float f11, long j9, long j10, float f12, zziz zzizVar) {
        this.zza = j9;
        this.zzb = j10;
    }

    private static long zzf(long j7, long j9, float f9) {
        return (((float) j9) * 9.999871E-4f) + (((float) j7) * 0.999f);
    }

    private final void zzg() {
        long j7;
        long j9 = this.zzc;
        if (j9 != C.TIME_UNSET) {
            j7 = this.zzd;
            if (j7 == C.TIME_UNSET) {
                long j10 = this.zzf;
                if (j10 != C.TIME_UNSET && j9 < j10) {
                    j9 = j10;
                }
                j7 = this.zzg;
                if (j7 == C.TIME_UNSET || j9 <= j7) {
                    j7 = j9;
                }
            }
        } else {
            j7 = -9223372036854775807L;
        }
        if (this.zze == j7) {
            return;
        }
        this.zze = j7;
        this.zzh = j7;
        this.zzm = C.TIME_UNSET;
        this.zzn = C.TIME_UNSET;
        this.zzl = C.TIME_UNSET;
    }

    public final float zza(long j7, long j9) {
        long j10;
        if (this.zzc == C.TIME_UNSET) {
            return 1.0f;
        }
        long j11 = j7 - j9;
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
            float zzr = (float) zzgd.zzr(1000L);
            long[] jArr = {j13, this.zze, this.zzh - (((this.zzk - 1.0f) * zzr) + ((this.zzi - 1.0f) * zzr))};
            j10 = jArr[0];
            for (int i9 = 1; i9 < 3; i9++) {
                long j14 = jArr[i9];
                if (j14 > j10) {
                    j10 = j14;
                }
            }
            this.zzh = j10;
        } else {
            long max2 = Math.max(this.zzh, Math.min(j7 - (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f), j13));
            this.zzh = max2;
            long j15 = this.zzg;
            if (j15 != C.TIME_UNSET && max2 > j15) {
                this.zzh = j15;
                j10 = j15;
            } else {
                j10 = max2;
            }
        }
        long j16 = j7 - j10;
        if (Math.abs(j16) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float max3 = Math.max(this.zzj, Math.min((((float) j16) * 1.0E-7f) + 1.0f, this.zzi));
        this.zzk = max3;
        return max3;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j7 = this.zzh;
        if (j7 == C.TIME_UNSET) {
            return;
        }
        long j9 = j7 + this.zzb;
        this.zzh = j9;
        long j10 = this.zzg;
        if (j10 != C.TIME_UNSET && j9 > j10) {
            this.zzh = j10;
        }
        this.zzl = C.TIME_UNSET;
    }

    public final void zzd(zzbk zzbkVar) {
        long j7 = zzbkVar.zzc;
        this.zzc = zzgd.zzr(C.TIME_UNSET);
        this.zzf = zzgd.zzr(C.TIME_UNSET);
        this.zzg = zzgd.zzr(C.TIME_UNSET);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j7) {
        this.zzd = j7;
        zzg();
    }
}
