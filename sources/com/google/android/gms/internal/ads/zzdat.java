package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzdat extends zzddr {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzh;

    @Nullable
    private ScheduledFuture zzi;

    @Nullable
    private ScheduledFuture zzj;

    public zzdat(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
    }

    private final synchronized void zzf(long j2) {
        try {
            ScheduledFuture scheduledFuture = this.zzi;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzi.cancel(false);
            }
            this.zzd = this.zzc.elapsedRealtime() + j2;
            this.zzi = this.zzb.schedule(new zzdaq(this, null), j2, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzg(long j2) {
        try {
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzj.cancel(false);
            }
            this.zze = this.zzc.elapsedRealtime() + j2;
            this.zzj = this.zzb.schedule(new zzdas(this, null), j2, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        this.zzh = false;
        zzf(0L);
    }

    public final synchronized void zzb() {
        try {
            if (this.zzh) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzi;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zzf = -1L;
            } else {
                this.zzi.cancel(false);
                this.zzf = this.zzd - this.zzc.elapsedRealtime();
            }
            ScheduledFuture scheduledFuture2 = this.zzj;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.zzg = -1L;
            } else {
                this.zzj.cancel(false);
                this.zzg = this.zze - this.zzc.elapsedRealtime();
            }
            this.zzh = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        try {
            if (this.zzh) {
                if (this.zzf > 0 && this.zzi.isCancelled()) {
                    zzf(this.zzf);
                }
                if (this.zzg > 0 && this.zzj.isCancelled()) {
                    zzg(this.zzg);
                }
                this.zzh = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(int i2) {
        if (i2 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i2);
            if (this.zzh) {
                long j2 = this.zzf;
                if (j2 <= 0 || millis >= j2) {
                    millis = j2;
                }
                this.zzf = millis;
                return;
            }
            long elapsedRealtime = this.zzc.elapsedRealtime();
            long j3 = this.zzd;
            if (elapsedRealtime > j3 || j3 - elapsedRealtime > millis) {
                zzf(millis);
            }
        }
    }

    public final synchronized void zze(int i2) {
        if (i2 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i2);
            if (this.zzh) {
                long j2 = this.zzg;
                if (j2 <= 0 || millis >= j2) {
                    millis = j2;
                }
                this.zzg = millis;
                return;
            }
            long elapsedRealtime = this.zzc.elapsedRealtime();
            long j3 = this.zze;
            if (elapsedRealtime > j3 || j3 - elapsedRealtime > millis) {
                zzg(millis);
            }
        }
    }
}
