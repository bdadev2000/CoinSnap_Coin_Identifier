package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
final class zzaz {
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

    public zzaz(String str, String str2, long j7, long j9, long j10, long j11, Long l, Long l2, Long l6, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j10, 0L, null, null, null, null);
    }

    public final zzaz zza(Long l, Long l2, Boolean bool) {
        return new zzaz(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public zzaz(String str, String str2, long j7, long j9, long j10, long j11, long j12, Long l, Long l2, Long l6, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j7 >= 0);
        Preconditions.checkArgument(j9 >= 0);
        Preconditions.checkArgument(j10 >= 0);
        Preconditions.checkArgument(j12 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j7;
        this.zzd = j9;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = j12;
        this.zzh = l;
        this.zzi = l2;
        this.zzj = l6;
        this.zzk = bool;
    }

    public final zzaz zza(long j7, long j9) {
        return new zzaz(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j7, Long.valueOf(j9), this.zzi, this.zzj, this.zzk);
    }

    public final zzaz zza(long j7) {
        return new zzaz(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j7, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
