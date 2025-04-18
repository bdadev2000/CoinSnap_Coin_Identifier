package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzcze extends zzdcc {
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

    public zzcze(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
    }

    private final synchronized void zzf(long j3) {
        ScheduledFuture scheduledFuture = this.zzi;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzi.cancel(false);
        }
        this.zzd = this.zzc.elapsedRealtime() + j3;
        this.zzi = this.zzb.schedule(new zzczb(this, null), j3, TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzg(long j3) {
        ScheduledFuture scheduledFuture = this.zzj;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzj.cancel(false);
        }
        this.zze = this.zzc.elapsedRealtime() + j3;
        this.zzj = this.zzb.schedule(new zzczc(this, null), j3, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        this.zzh = false;
        zzf(0L);
    }

    public final synchronized void zzb() {
        if (!this.zzh) {
            ScheduledFuture scheduledFuture = this.zzi;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.zzi.cancel(false);
                this.zzf = this.zzd - this.zzc.elapsedRealtime();
            } else {
                this.zzf = -1L;
            }
            ScheduledFuture scheduledFuture2 = this.zzj;
            if (scheduledFuture2 != null && !scheduledFuture2.isCancelled()) {
                this.zzj.cancel(false);
                this.zzg = this.zze - this.zzc.elapsedRealtime();
            } else {
                this.zzg = -1L;
            }
            this.zzh = true;
        }
    }

    public final synchronized void zzc() {
        if (this.zzh) {
            if (this.zzf > 0 && this.zzi.isCancelled()) {
                zzf(this.zzf);
            }
            if (this.zzg > 0 && this.zzj.isCancelled()) {
                zzg(this.zzg);
            }
            this.zzh = false;
        }
    }

    public final synchronized void zzd(int i10) {
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.zzh) {
                long j3 = this.zzf;
                if (j3 <= 0 || millis >= j3) {
                    millis = j3;
                }
                this.zzf = millis;
                return;
            }
            long elapsedRealtime = this.zzc.elapsedRealtime();
            long j10 = this.zzd;
            if (elapsedRealtime > j10 || j10 - elapsedRealtime > millis) {
                zzf(millis);
            }
        }
    }

    public final synchronized void zze(int i10) {
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.zzh) {
                long j3 = this.zzg;
                if (j3 <= 0 || millis >= j3) {
                    millis = j3;
                }
                this.zzg = millis;
                return;
            }
            long elapsedRealtime = this.zzc.elapsedRealtime();
            long j10 = this.zze;
            if (elapsedRealtime > j10 || j10 - elapsedRealtime > millis) {
                zzg(millis);
            }
        }
    }
}
