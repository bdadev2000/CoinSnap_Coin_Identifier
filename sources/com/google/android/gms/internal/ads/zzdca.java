package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzdca extends zzdez {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private long zzd;
    private long zze;
    private boolean zzf;

    @Nullable
    private ScheduledFuture zzg;

    public zzdca(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
    }

    private final synchronized void zze(long j7) {
        try {
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzg.cancel(true);
            }
            this.zzd = this.zzc.elapsedRealtime() + j7;
            this.zzg = this.zzb.schedule(new zzdbz(this, null), j7, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        this.zzf = false;
        zze(0L);
    }

    public final synchronized void zzb() {
        try {
            if (!this.zzf) {
                ScheduledFuture scheduledFuture = this.zzg;
                if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                    this.zzg.cancel(true);
                    this.zze = this.zzd - this.zzc.elapsedRealtime();
                } else {
                    this.zze = -1L;
                }
                this.zzf = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        try {
            if (this.zzf) {
                if (this.zze > 0 && this.zzg.isCancelled()) {
                    zze(this.zze);
                }
                this.zzf = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(int i9) {
        if (i9 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i9);
            if (this.zzf) {
                long j7 = this.zze;
                if (j7 <= 0 || millis >= j7) {
                    millis = j7;
                }
                this.zze = millis;
                return;
            }
            long elapsedRealtime = this.zzc.elapsedRealtime();
            long j9 = this.zzd;
            if (elapsedRealtime > j9 || j9 - this.zzc.elapsedRealtime() > millis) {
                zze(millis);
            }
        }
    }
}
