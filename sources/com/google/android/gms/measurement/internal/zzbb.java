package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzbb {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    public zzbb(String str, String str2, long j3, long j10, long j11, long j12, Long l10, Long l11, Long l12, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j11, 0L, null, null, null, null);
    }

    public final zzbb zza(Long l10, Long l11, Boolean bool) {
        return new zzbb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public zzbb(String str, String str2, long j3, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j3 >= 0);
        Preconditions.checkArgument(j10 >= 0);
        Preconditions.checkArgument(j11 >= 0);
        Preconditions.checkArgument(j13 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j3;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = l10;
        this.zzi = l11;
        this.zzj = l12;
        this.zzk = bool;
    }

    public final zzbb zza(long j3, long j10) {
        return new zzbb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j3, Long.valueOf(j10), this.zzi, this.zzj, this.zzk);
    }

    public final zzbb zza(long j3) {
        return new zzbb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j3, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
