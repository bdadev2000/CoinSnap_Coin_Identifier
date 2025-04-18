package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class zzaij implements zzaii {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzaij(long[] jArr, long[] jArr2, long j2, long j3, int i2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = i2;
    }

    @Nullable
    public static zzaij zzb(long j2, long j3, zzadt zzadtVar, zzek zzekVar) {
        int zzm;
        zzekVar.zzM(10);
        int zzg = zzekVar.zzg();
        if (zzg <= 0) {
            return null;
        }
        int i2 = zzadtVar.zzd;
        long zzt = zzeu.zzt(zzg, (i2 >= 32000 ? 1152 : 576) * 1000000, i2, RoundingMode.FLOOR);
        int zzq = zzekVar.zzq();
        int zzq2 = zzekVar.zzq();
        int zzq3 = zzekVar.zzq();
        zzekVar.zzM(2);
        long j4 = j3 + zzadtVar.zzc;
        long[] jArr = new long[zzq];
        long[] jArr2 = new long[zzq];
        int i3 = 0;
        long j5 = j3;
        while (i3 < zzq) {
            long j6 = zzt;
            jArr[i3] = (i3 * zzt) / zzq;
            jArr2[i3] = Math.max(j5, j4);
            if (zzq3 == 1) {
                zzm = zzekVar.zzm();
            } else if (zzq3 == 2) {
                zzm = zzekVar.zzq();
            } else if (zzq3 == 3) {
                zzm = zzekVar.zzo();
            } else {
                if (zzq3 != 4) {
                    return null;
                }
                zzm = zzekVar.zzp();
            }
            j5 += zzm * zzq2;
            i3++;
            zzt = j6;
        }
        long j7 = zzt;
        if (j2 != -1 && j2 != j5) {
            StringBuilder r2 = androidx.compose.foundation.text.input.a.r("VBRI data size mismatch: ", j2, ", ");
            r2.append(j5);
            zzea.zzf("VbriSeeker", r2.toString());
        }
        return new zzaij(jArr, jArr2, j7, j5, zzadtVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zze(long j2) {
        return this.zza[zzeu.zzc(this.zzb, j2, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        long[] jArr = this.zza;
        int zzc = zzeu.zzc(jArr, j2, true, true);
        zzaeb zzaebVar = new zzaeb(jArr[zzc], this.zzb[zzc]);
        if (zzaebVar.zzb < j2) {
            long[] jArr2 = this.zza;
            if (zzc != jArr2.length - 1) {
                int i2 = zzc + 1;
                return new zzady(zzaebVar, new zzaeb(jArr2[i2], this.zzb[i2]));
            }
        }
        return new zzady(zzaebVar, zzaebVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return true;
    }
}
