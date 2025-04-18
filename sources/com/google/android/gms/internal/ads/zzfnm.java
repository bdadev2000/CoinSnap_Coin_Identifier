package com.google.android.gms.internal.ads;

import java.util.Random;

/* loaded from: classes4.dex */
public final class zzfnm {
    private final long zza;
    private final long zzb;
    private long zzd;
    private final Random zze = new Random();
    private long zzc = 0;

    public zzfnm(long j2, double d, long j3, double d2) {
        this.zza = j2;
        this.zzb = j3;
        zzc();
    }

    public final long zza() {
        double d = this.zzd;
        double d2 = 0.2d * d;
        long j2 = (long) (d + d2);
        return ((long) (d - d2)) + ((long) (this.zze.nextDouble() * ((j2 - r0) + 1)));
    }

    public final void zzb() {
        double d = this.zzd;
        this.zzd = Math.min((long) (d + d), this.zzb);
        this.zzc++;
    }

    public final void zzc() {
        this.zzd = this.zza;
        this.zzc = 0L;
    }

    public final boolean zzd() {
        return this.zzc > ((long) ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzt)).intValue()) && this.zzd >= this.zzb;
    }
}
