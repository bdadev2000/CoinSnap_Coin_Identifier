package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
final class zzahv implements zzahy {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzahv(long[] jArr, long[] jArr2, long j3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j3 == C.TIME_UNSET ? zzen.zzs(jArr2[jArr2.length - 1]) : j3;
    }

    public static zzahv zzb(long j3, zzagq zzagqVar, long j10) {
        int length = zzagqVar.zzd.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j3;
        long j11 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j3 += zzagqVar.zzb + zzagqVar.zzd[i12];
            j11 += zzagqVar.zzc + zzagqVar.zze[i12];
            jArr[i11] = j3;
            jArr2[i11] = j11;
        }
        return new zzahv(jArr, jArr2, j10);
    }

    private static Pair zzf(long j3, long[] jArr, long[] jArr2) {
        double d10;
        int zzd = zzen.zzd(jArr, j3, true, true);
        long j10 = jArr[zzd];
        long j11 = jArr2[zzd];
        int i10 = zzd + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        long j12 = jArr[i10];
        long j13 = jArr2[i10];
        if (j12 == j10) {
            d10 = 0.0d;
        } else {
            d10 = (j3 - j10) / (j12 - j10);
        }
        return Pair.create(Long.valueOf(j3), Long.valueOf(((long) (d10 * (j13 - j11))) + j11));
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zze(long j3) {
        return zzen.zzs(((Long) zzf(j3, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        Pair zzf = zzf(zzen.zzv(Math.max(0L, Math.min(j3, this.zzc))), this.zzb, this.zza);
        zzadr zzadrVar = new zzadr(zzen.zzs(((Long) zzf.first).longValue()), ((Long) zzf.second).longValue());
        return new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}
