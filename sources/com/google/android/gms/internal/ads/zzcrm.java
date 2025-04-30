package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcrm implements zzbbg {
    private final ScheduledExecutorService zza;
    private final Clock zzb;

    @Nullable
    private ScheduledFuture zzc;
    private long zzd = -1;
    private long zze = -1;
    private Runnable zzf = null;
    private boolean zzg = false;

    public zzcrm(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zza = scheduledExecutorService;
        this.zzb = clock;
        com.google.android.gms.ads.internal.zzu.zzb().zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbbg
    public final void zza(boolean z8) {
        if (z8) {
            zzc();
        } else {
            zzb();
        }
    }

    public final synchronized void zzb() {
        try {
            if (!this.zzg) {
                ScheduledFuture scheduledFuture = this.zzc;
                if (scheduledFuture != null && !scheduledFuture.isDone()) {
                    this.zzc.cancel(true);
                    this.zze = this.zzd - this.zzb.elapsedRealtime();
                } else {
                    this.zze = -1L;
                }
                this.zzg = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.zzg) {
                if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                    this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
                }
                this.zzg = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(int i9, Runnable runnable) {
        this.zzf = runnable;
        long j7 = i9;
        this.zzd = this.zzb.elapsedRealtime() + j7;
        this.zzc = this.zza.schedule(runnable, j7, TimeUnit.MILLISECONDS);
    }
}
