package com.google.android.gms.internal.ads;

import java.util.Random;

/* loaded from: classes3.dex */
public final class zzflx {
    private final long zza;
    private final long zzb;
    private long zzd;
    private final Random zze = new Random();
    private long zzc = 0;

    public zzflx(long j3, double d10, long j10, double d11) {
        this.zza = j3;
        this.zzb = j10;
        zzc();
    }

    public final long zza() {
        double d10 = this.zzd;
        double d11 = 0.2d * d10;
        long j3 = (long) (d10 + d11);
        return ((long) (d10 - d11)) + ((long) (this.zze.nextDouble() * ((j3 - r0) + 1)));
    }

    public final void zzb() {
        double d10 = this.zzd;
        this.zzd = Math.min((long) (d10 + d10), this.zzb);
        this.zzc++;
    }

    public final void zzc() {
        this.zzd = this.zza;
        this.zzc = 0L;
    }

    public final boolean zzd() {
        if (this.zzc > ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzw)).intValue() && this.zzd >= this.zzb) {
            return true;
        }
        return false;
    }
}
