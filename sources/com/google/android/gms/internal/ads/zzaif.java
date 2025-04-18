package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
final class zzaif implements zzaii {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaif(long[] jArr, long[] jArr2, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j2 == -9223372036854775807L ? zzeu.zzr(jArr2[jArr2.length - 1]) : j2;
    }

    public static zzaif zzb(long j2, zzaha zzahaVar, long j3) {
        int length = zzahaVar.zzd.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j2;
        long j4 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i4 = i3 - 1;
            j2 += zzahaVar.zzb + zzahaVar.zzd[i4];
            j4 += zzahaVar.zzc + zzahaVar.zze[i4];
            jArr[i3] = j2;
            jArr2[i3] = j4;
        }
        return new zzaif(jArr, jArr2, j3);
    }

    private static Pair zzf(long j2, long[] jArr, long[] jArr2) {
        int zzc = zzeu.zzc(jArr, j2, true, true);
        long j3 = jArr[zzc];
        long j4 = jArr2[zzc];
        int i2 = zzc + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((jArr[i2] == j3 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j2 - j3) / (r6 - j3)) * (jArr2[i2] - j4))) + j4));
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zze(long j2) {
        return zzeu.zzr(((Long) zzf(j2, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        Pair zzf = zzf(zzeu.zzu(Math.max(0L, Math.min(j2, this.zzc))), this.zzb, this.zza);
        zzaeb zzaebVar = new zzaeb(zzeu.zzr(((Long) zzf.first).longValue()), ((Long) zzf.second).longValue());
        return new zzady(zzaebVar, zzaebVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return true;
    }
}
