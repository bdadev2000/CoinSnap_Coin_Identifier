package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaew {
    protected final zzaeh zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private long[] zzl;
    private int[] zzm;

    public zzaew(int i2, int i3, long j2, int i4, zzaeh zzaehVar) {
        i3 = i3 != 1 ? 2 : i3;
        this.zzd = j2;
        this.zze = i4;
        this.zza = zzaehVar;
        this.zzb = zzh(i2, i3 == 2 ? 1667497984 : 1651965952);
        this.zzc = i3 == 2 ? zzh(i2, 1650720768) : -1;
        this.zzk = -1L;
        this.zzl = new long[512];
        this.zzm = new int[512];
    }

    private static int zzh(int i2, int i3) {
        return (((i2 % 10) + 48) << 8) | ((i2 / 10) + 48) | i3;
    }

    private final long zzi(int i2) {
        return (this.zzd * i2) / this.zze;
    }

    private final zzaeb zzj(int i2) {
        return new zzaeb(this.zzm[i2] * zzi(1), this.zzl[i2]);
    }

    public final zzady zza(long j2) {
        if (this.zzj == 0) {
            zzaeb zzaebVar = new zzaeb(0L, this.zzk);
            return new zzady(zzaebVar, zzaebVar);
        }
        int zzi = (int) (j2 / zzi(1));
        int zzb = zzeu.zzb(this.zzm, zzi, true, true);
        if (this.zzm[zzb] == zzi) {
            zzaeb zzj = zzj(zzb);
            return new zzady(zzj, zzj);
        }
        zzaeb zzj2 = zzj(zzb);
        int i2 = zzb + 1;
        return i2 < this.zzl.length ? new zzady(zzj2, zzj(i2)) : new zzady(zzj2, zzj2);
    }

    public final void zzb(long j2, boolean z2) {
        if (this.zzk == -1) {
            this.zzk = j2;
        }
        if (z2) {
            if (this.zzj == this.zzm.length) {
                long[] jArr = this.zzl;
                this.zzl = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzm;
                this.zzm = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzl;
            int i2 = this.zzj;
            jArr2[i2] = j2;
            this.zzm[i2] = this.zzi;
            this.zzj = i2 + 1;
        }
        this.zzi++;
    }

    public final void zzc() {
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
        this.zzm = Arrays.copyOf(this.zzm, this.zzj);
    }

    public final void zzd(int i2) {
        this.zzf = i2;
        this.zzg = i2;
    }

    public final void zze(long j2) {
        if (this.zzj == 0) {
            this.zzh = 0;
        } else {
            this.zzh = this.zzm[zzeu.zzc(this.zzl, j2, true, true)];
        }
    }

    public final boolean zzf(int i2) {
        return this.zzb == i2 || this.zzc == i2;
    }

    public final boolean zzg(zzadc zzadcVar) throws IOException {
        int i2 = this.zzg;
        int zzf = i2 - this.zza.zzf(zzadcVar, i2, false);
        this.zzg = zzf;
        boolean z2 = zzf == 0;
        if (z2) {
            if (this.zzf > 0) {
                this.zza.zzs(zzi(this.zzh), Arrays.binarySearch(this.zzm, this.zzh) >= 0 ? 1 : 0, this.zzf, 0, null);
            }
            this.zzh++;
        }
        return z2;
    }
}
