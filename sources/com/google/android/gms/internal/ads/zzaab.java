package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzaab {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg = new boolean[15];
    private int zzh;

    public final long zza() {
        long j3 = this.zze;
        if (j3 == 0) {
            return 0L;
        }
        return this.zzf / j3;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final void zzc(long j3) {
        long j10 = this.zzd;
        if (j10 == 0) {
            this.zza = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.zza;
            this.zzb = j11;
            this.zzf = j11;
            this.zze = 1L;
        } else {
            long j12 = j3 - this.zzc;
            int i10 = (int) (j10 % 15);
            if (Math.abs(j12 - this.zzb) <= 1000000) {
                this.zze++;
                this.zzf += j12;
                boolean[] zArr = this.zzg;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.zzh--;
                }
            } else {
                boolean[] zArr2 = this.zzg;
                if (!zArr2[i10]) {
                    zArr2[i10] = true;
                    this.zzh++;
                }
            }
        }
        this.zzd++;
        this.zzc = j3;
    }

    public final void zzd() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zze() {
        long j3 = this.zzd;
        if (j3 == 0) {
            return false;
        }
        return this.zzg[(int) ((j3 - 1) % 15)];
    }

    public final boolean zzf() {
        return this.zzd > 15 && this.zzh == 0;
    }
}
