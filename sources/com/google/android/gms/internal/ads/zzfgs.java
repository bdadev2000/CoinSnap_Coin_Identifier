package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzfgs {
    private final Clock zza;
    private final Object zzb = new Object();
    private volatile int zzd = 1;
    private volatile long zzc = 0;

    public zzfgs(Clock clock) {
        this.zza = clock;
    }

    private final void zze() {
        long currentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzb) {
            try {
                if (this.zzd == 3) {
                    if (this.zzc + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgg)).longValue() <= currentTimeMillis) {
                        this.zzd = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzf(int i9, int i10) {
        zze();
        Object obj = this.zzb;
        long currentTimeMillis = this.zza.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.zzd != i9) {
                    return;
                }
                this.zzd = i10;
                if (this.zzd == 3) {
                    this.zzc = currentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        zzf(2, 3);
    }

    public final void zzb(boolean z8) {
        if (z8) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z8;
        synchronized (this.zzb) {
            zze();
            if (this.zzd == 3) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public final boolean zzd() {
        boolean z8;
        synchronized (this.zzb) {
            zze();
            if (this.zzd == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }
}
