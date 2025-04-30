package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzggj extends zzggg implements ScheduledExecutorService, zzgge {
    final ScheduledExecutorService zza;

    public zzggj(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzggt zze = zzggt.zze(runnable, null);
        return new zzggh(zze, scheduledExecutorService.schedule(zze, j7, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j7, long j9, TimeUnit timeUnit) {
        zzggi zzggiVar = new zzggi(runnable);
        return new zzggh(zzggiVar, this.zza.scheduleAtFixedRate(zzggiVar, j7, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j7, long j9, TimeUnit timeUnit) {
        zzggi zzggiVar = new zzggi(runnable);
        return new zzggh(zzggiVar, this.zza.scheduleWithFixedDelay(zzggiVar, j7, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j7, TimeUnit timeUnit) {
        zzggt zzggtVar = new zzggt(callable);
        return new zzggh(zzggtVar, this.zza.schedule(zzggtVar, j7, timeUnit));
    }
}
