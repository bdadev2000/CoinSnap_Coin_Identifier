package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
final class zzajd implements zzaji {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzajd(long[] jArr, long[] jArr2, long j7) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j7 == C.TIME_UNSET ? zzgd.zzr(jArr2[jArr2.length - 1]) : j7;
    }

    public static zzajd zzb(long j7, zzahv zzahvVar, long j9) {
        int length = zzahvVar.zzd.length;
        int i9 = length + 1;
        long[] jArr = new long[i9];
        long[] jArr2 = new long[i9];
        jArr[0] = j7;
        long j10 = 0;
        jArr2[0] = 0;
        for (int i10 = 1; i10 <= length; i10++) {
            int i11 = i10 - 1;
            j7 += zzahvVar.zzb + zzahvVar.zzd[i11];
            j10 += zzahvVar.zzc + zzahvVar.zze[i11];
            jArr[i10] = j7;
            jArr2[i10] = j10;
        }
        return new zzajd(jArr, jArr2, j9);
    }

    private static Pair zzf(long j7, long[] jArr, long[] jArr2) {
        double d2;
        int zzc = zzgd.zzc(jArr, j7, true, true);
        long j9 = jArr[zzc];
        long j10 = jArr2[zzc];
        int i9 = zzc + 1;
        if (i9 == jArr.length) {
            return Pair.create(Long.valueOf(j9), Long.valueOf(j10));
        }
        long j11 = jArr[i9];
        long j12 = jArr2[i9];
        if (j11 == j9) {
            d2 = 0.0d;
        } else {
            d2 = (j7 - j9) / (j11 - j9);
        }
        return Pair.create(Long.valueOf(j7), Long.valueOf(((long) (d2 * (j12 - j10))) + j10));
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final long zze(long j7) {
        return zzgd.zzr(((Long) zzf(j7, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        Pair zzf = zzf(zzgd.zzu(Math.max(0L, Math.min(j7, this.zzc))), this.zzb, this.zza);
        zzaeu zzaeuVar = new zzaeu(zzgd.zzr(((Long) zzf.first).longValue()), ((Long) zzf.second).longValue());
        return new zzaer(zzaeuVar, zzaeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
