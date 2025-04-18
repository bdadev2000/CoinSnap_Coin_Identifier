package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
final class zzail implements zzaii {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;

    @Nullable
    private final long[] zzg;

    private zzail(long j2, int i2, long j3, int i3, long j4, @Nullable long[] jArr) {
        this.zza = j2;
        this.zzb = i2;
        this.zzc = j3;
        this.zzd = i3;
        this.zze = j4;
        this.zzg = jArr;
        this.zzf = j4 != -1 ? j2 + j4 : -1L;
    }

    @Nullable
    public static zzail zzb(zzaik zzaikVar, long j2) {
        long[] jArr;
        long zza = zzaikVar.zza();
        if (zza == -9223372036854775807L) {
            return null;
        }
        long j3 = zzaikVar.zzc;
        if (j3 == -1 || (jArr = zzaikVar.zzf) == null) {
            zzadt zzadtVar = zzaikVar.zza;
            return new zzail(j2, zzadtVar.zzc, zza, zzadtVar.zzf, -1L, null);
        }
        zzadt zzadtVar2 = zzaikVar.zza;
        return new zzail(j2, zzadtVar2.zzc, zza, zzadtVar2.zzf, j3, jArr);
    }

    private final long zzf(int i2) {
        return (this.zzc * i2) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zze(long j2) {
        if (!zzh()) {
            return 0L;
        }
        long j3 = j2 - this.zza;
        if (j3 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        zzdi.zzb(jArr);
        double d = (j3 * 256.0d) / this.zze;
        int zzc = zzeu.zzc(jArr, (long) d, true, true);
        long zzf = zzf(zzc);
        long j4 = jArr[zzc];
        int i2 = zzc + 1;
        long zzf2 = zzf(i2);
        return Math.round((j4 == (zzc == 99 ? 256L : jArr[i2]) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j4) / (r0 - j4)) * (zzf2 - zzf)) + zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        if (!zzh()) {
            zzaeb zzaebVar = new zzaeb(0L, this.zza + this.zzb);
            return new zzady(zzaebVar, zzaebVar);
        }
        long max = Math.max(0L, Math.min(j2, this.zzc));
        double d = (max * 100.0d) / this.zzc;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i2 = (int) d;
                long[] jArr = this.zzg;
                zzdi.zzb(jArr);
                double d3 = jArr[i2];
                d2 = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d3) * (d - i2)) + d3;
            }
        }
        long j3 = this.zze;
        zzaeb zzaebVar2 = new zzaeb(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j3), j3 - 1)));
        return new zzady(zzaebVar2, zzaebVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return this.zzg != null;
    }
}
