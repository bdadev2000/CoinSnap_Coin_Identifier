package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
final class zzaib implements zzahy {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;

    @Nullable
    private final long[] zzg;

    private zzaib(long j3, int i10, long j10, int i11, long j11, @Nullable long[] jArr) {
        this.zza = j3;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = i11;
        this.zze = j11;
        this.zzg = jArr;
        this.zzf = j11 != -1 ? j3 + j11 : -1L;
    }

    @Nullable
    public static zzaib zzb(zzaia zzaiaVar, long j3) {
        long[] jArr;
        long zza = zzaiaVar.zza();
        if (zza == C.TIME_UNSET) {
            return null;
        }
        long j10 = zzaiaVar.zzc;
        if (j10 == -1 || (jArr = zzaiaVar.zzf) == null) {
            zzadj zzadjVar = zzaiaVar.zza;
            return new zzaib(j3, zzadjVar.zzc, zza, zzadjVar.zzf, -1L, null);
        }
        zzadj zzadjVar2 = zzaiaVar.zza;
        return new zzaib(j3, zzadjVar2.zzc, zza, zzadjVar2.zzf, j10, jArr);
    }

    private final long zzf(int i10) {
        return (this.zzc * i10) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zze(long j3) {
        long j10;
        double d10;
        if (zzh()) {
            long j11 = j3 - this.zza;
            if (j11 > this.zzb) {
                long[] jArr = this.zzg;
                zzdb.zzb(jArr);
                double d11 = (j11 * 256.0d) / this.zze;
                int zzd = zzen.zzd(jArr, (long) d11, true, true);
                long zzf = zzf(zzd);
                long j12 = jArr[zzd];
                int i10 = zzd + 1;
                long zzf2 = zzf(i10);
                if (zzd == 99) {
                    j10 = 256;
                } else {
                    j10 = jArr[i10];
                }
                if (j12 == j10) {
                    d10 = 0.0d;
                } else {
                    d10 = (d11 - j12) / (j10 - j12);
                }
                return Math.round(d10 * (zzf2 - zzf)) + zzf;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        double d10;
        if (!zzh()) {
            zzadr zzadrVar = new zzadr(0L, this.zza + this.zzb);
            return new zzado(zzadrVar, zzadrVar);
        }
        long max = Math.max(0L, Math.min(j3, this.zzc));
        double d11 = (max * 100.0d) / this.zzc;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = this.zzg;
                zzdb.zzb(jArr);
                double d13 = jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = jArr[i10 + 1];
                }
                d12 = ((d10 - d13) * (d11 - i10)) + d13;
            }
        }
        long j10 = this.zze;
        zzadr zzadrVar2 = new zzadr(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d12 / 256.0d) * j10), j10 - 1)));
        return new zzado(zzadrVar2, zzadrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return this.zzg != null;
    }
}
