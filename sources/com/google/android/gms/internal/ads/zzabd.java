package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzabd {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg = new boolean[15];
    private int zzh;

    public final long zza() {
        long j7 = this.zze;
        if (j7 == 0) {
            return 0L;
        }
        return this.zzf / j7;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final void zzc(long j7) {
        long j9 = this.zzd;
        if (j9 == 0) {
            this.zza = j7;
        } else if (j9 == 1) {
            long j10 = j7 - this.zza;
            this.zzb = j10;
            this.zzf = j10;
            this.zze = 1L;
        } else {
            long j11 = j7 - this.zzc;
            int i9 = (int) (j9 % 15);
            if (Math.abs(j11 - this.zzb) <= 1000000) {
                this.zze++;
                this.zzf += j11;
                boolean[] zArr = this.zzg;
                if (zArr[i9]) {
                    zArr[i9] = false;
                    this.zzh--;
                }
            } else {
                boolean[] zArr2 = this.zzg;
                if (!zArr2[i9]) {
                    zArr2[i9] = true;
                    this.zzh++;
                }
            }
        }
        this.zzd++;
        this.zzc = j7;
    }

    public final void zzd() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zze() {
        long j7 = this.zzd;
        if (j7 == 0) {
            return false;
        }
        return this.zzg[(int) ((j7 - 1) % 15)];
    }

    public final boolean zzf() {
        return this.zzd > 15 && this.zzh == 0;
    }
}
