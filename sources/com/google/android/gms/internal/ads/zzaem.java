package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaem {
    protected final zzadx zza;
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

    public zzaem(int i10, int i11, long j3, int i12, zzadx zzadxVar) {
        i11 = i11 != 1 ? 2 : i11;
        this.zzd = j3;
        this.zze = i12;
        this.zza = zzadxVar;
        this.zzb = zzh(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.zzc = i11 == 2 ? zzh(i10, 1650720768) : -1;
        this.zzk = -1L;
        this.zzl = new long[512];
        this.zzm = new int[512];
    }

    private static int zzh(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private final long zzi(int i10) {
        return (this.zzd * i10) / this.zze;
    }

    private final zzadr zzj(int i10) {
        return new zzadr(this.zzm[i10] * zzi(1), this.zzl[i10]);
    }

    public final zzado zza(long j3) {
        if (this.zzj != 0) {
            int zzi = (int) (j3 / zzi(1));
            int zzc = zzen.zzc(this.zzm, zzi, true, true);
            if (this.zzm[zzc] == zzi) {
                zzadr zzj = zzj(zzc);
                return new zzado(zzj, zzj);
            }
            zzadr zzj2 = zzj(zzc);
            int i10 = zzc + 1;
            if (i10 < this.zzl.length) {
                return new zzado(zzj2, zzj(i10));
            }
            return new zzado(zzj2, zzj2);
        }
        zzadr zzadrVar = new zzadr(0L, this.zzk);
        return new zzado(zzadrVar, zzadrVar);
    }

    public final void zzb(long j3, boolean z10) {
        if (this.zzk == -1) {
            this.zzk = j3;
        }
        if (z10) {
            if (this.zzj == this.zzm.length) {
                long[] jArr = this.zzl;
                this.zzl = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzm;
                this.zzm = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzl;
            int i10 = this.zzj;
            jArr2[i10] = j3;
            this.zzm[i10] = this.zzi;
            this.zzj = i10 + 1;
        }
        this.zzi++;
    }

    public final void zzc() {
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
        this.zzm = Arrays.copyOf(this.zzm, this.zzj);
    }

    public final void zzd(int i10) {
        this.zzf = i10;
        this.zzg = i10;
    }

    public final void zze(long j3) {
        if (this.zzj == 0) {
            this.zzh = 0;
        } else {
            this.zzh = this.zzm[zzen.zzd(this.zzl, j3, true, true)];
        }
    }

    public final boolean zzf(int i10) {
        return this.zzb == i10 || this.zzc == i10;
    }

    public final boolean zzg(zzacs zzacsVar) throws IOException {
        boolean z10;
        int i10;
        int i11 = this.zzg;
        int zzf = i11 - this.zza.zzf(zzacsVar, i11, false);
        this.zzg = zzf;
        if (zzf == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.zzf > 0) {
                zzadx zzadxVar = this.zza;
                long zzi = zzi(this.zzh);
                if (Arrays.binarySearch(this.zzm, this.zzh) >= 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                zzadxVar.zzs(zzi, i10, this.zzf, 0, null);
            }
            this.zzh++;
        }
        return z10;
    }
}
