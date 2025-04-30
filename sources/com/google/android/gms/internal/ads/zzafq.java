package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzafq {
    protected final zzafa zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long[] zzk;
    private int[] zzl;

    public zzafq(int i9, int i10, long j7, int i11, zzafa zzafaVar) {
        i10 = i10 != 1 ? 2 : i10;
        this.zzd = j7;
        this.zze = i11;
        this.zza = zzafaVar;
        this.zzb = zzi(i9, i10 == 2 ? 1667497984 : 1651965952);
        this.zzc = i10 == 2 ? zzi(i9, 1650720768) : -1;
        this.zzk = new long[512];
        this.zzl = new int[512];
    }

    private static int zzi(int i9, int i10) {
        return (((i9 % 10) + 48) << 8) | ((i9 / 10) + 48) | i10;
    }

    private final long zzj(int i9) {
        return (this.zzd * i9) / this.zze;
    }

    private final zzaeu zzk(int i9) {
        return new zzaeu(this.zzl[i9] * zzj(1), this.zzk[i9]);
    }

    public final zzaer zza(long j7) {
        int zzj = (int) (j7 / zzj(1));
        int zzb = zzgd.zzb(this.zzl, zzj, true, true);
        if (this.zzl[zzb] == zzj) {
            zzaeu zzk = zzk(zzb);
            return new zzaer(zzk, zzk);
        }
        zzaeu zzk2 = zzk(zzb);
        int i9 = zzb + 1;
        if (i9 < this.zzk.length) {
            return new zzaer(zzk2, zzk(i9));
        }
        return new zzaer(zzk2, zzk2);
    }

    public final void zzb(long j7) {
        if (this.zzj == this.zzl.length) {
            long[] jArr = this.zzk;
            this.zzk = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.zzl;
            this.zzl = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.zzk;
        int i9 = this.zzj;
        jArr2[i9] = j7;
        this.zzl[i9] = this.zzi;
        this.zzj = i9 + 1;
    }

    public final void zzc() {
        this.zzk = Arrays.copyOf(this.zzk, this.zzj);
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
    }

    public final void zzd() {
        this.zzi++;
    }

    public final void zze(int i9) {
        this.zzf = i9;
        this.zzg = i9;
    }

    public final void zzf(long j7) {
        if (this.zzj == 0) {
            this.zzh = 0;
        } else {
            this.zzh = this.zzl[zzgd.zzc(this.zzk, j7, true, true)];
        }
    }

    public final boolean zzg(int i9) {
        return this.zzb == i9 || this.zzc == i9;
    }

    public final boolean zzh(zzadv zzadvVar) throws IOException {
        boolean z8;
        int i9;
        int i10 = this.zzg;
        int zzf = i10 - this.zza.zzf(zzadvVar, i10, false);
        this.zzg = zzf;
        if (zzf == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (this.zzf > 0) {
                zzafa zzafaVar = this.zza;
                long zzj = zzj(this.zzh);
                if (Arrays.binarySearch(this.zzl, this.zzh) >= 0) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                zzafaVar.zzs(zzj, i9, this.zzf, 0, null);
            }
            this.zzh++;
        }
        return z8;
    }
}
