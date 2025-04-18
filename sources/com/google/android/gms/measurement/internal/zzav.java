package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzav {
    private static volatile Handler zza;
    private final zzjc zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzav(zzjc zzjcVar) {
        Preconditions.checkNotNull(zzjcVar);
        this.zzb = zzjcVar;
        this.zzc = new zzay(this, zzjcVar);
    }

    private final Handler zzd() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzav.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.measurement.zzdh(this.zzb.zza().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    public abstract void zzb();

    public final boolean zzc() {
        return this.zzd != 0;
    }

    public final void zza() {
        this.zzd = 0L;
        zzd().removeCallbacks(this.zzc);
    }

    public final void zza(long j3) {
        zza();
        if (j3 >= 0) {
            this.zzd = this.zzb.zzb().currentTimeMillis();
            if (zzd().postDelayed(this.zzc, j3)) {
                return;
            }
            this.zzb.zzj().zzg().zza("Failed to schedule delayed post. time", Long.valueOf(j3));
        }
    }
}
