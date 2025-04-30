package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzat {
    private static volatile Handler zza;
    private final zzil zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzat(zzil zzilVar) {
        Preconditions.checkNotNull(zzilVar);
        this.zzb = zzilVar;
        this.zzc = new zzaw(this, zzilVar);
    }

    private final Handler zzd() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzat.class) {
            try {
                if (zza == null) {
                    zza = new com.google.android.gms.internal.measurement.zzcz(this.zzb.zza().getMainLooper());
                }
                handler = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public abstract void zzb();

    public final boolean zzc() {
        if (this.zzd != 0) {
            return true;
        }
        return false;
    }

    public final void zza() {
        this.zzd = 0L;
        zzd().removeCallbacks(this.zzc);
    }

    public final void zza(long j7) {
        zza();
        if (j7 >= 0) {
            this.zzd = this.zzb.zzb().currentTimeMillis();
            if (zzd().postDelayed(this.zzc, j7)) {
                return;
            }
            this.zzb.zzj().zzg().zza("Failed to schedule delayed post. time", Long.valueOf(j7));
        }
    }
}
