package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzack {
    public static final zzack zza = new zzack(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzack(int i2, long j2, long j3) {
        this.zzb = i2;
        this.zzc = j2;
        this.zzd = j3;
    }

    public static zzack zzd(long j2, long j3) {
        return new zzack(-1, j2, j3);
    }

    public static zzack zze(long j2) {
        return new zzack(0, -9223372036854775807L, j2);
    }

    public static zzack zzf(long j2, long j3) {
        return new zzack(-2, j2, j3);
    }
}
