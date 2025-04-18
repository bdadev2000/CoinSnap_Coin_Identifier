package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgge extends zzggb implements ScheduledExecutorService, zzgfz {
    final ScheduledExecutorService zza;

    public zzgge(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzggo zze = zzggo.zze(runnable, null);
        return new zzggc(zze, scheduledExecutorService.schedule(zze, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        zzggd zzggdVar = new zzggd(runnable);
        return new zzggc(zzggdVar, this.zza.scheduleAtFixedRate(zzggdVar, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        zzggd zzggdVar = new zzggd(runnable);
        return new zzggc(zzggdVar, this.zza.scheduleWithFixedDelay(zzggdVar, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        zzggo zzggoVar = new zzggo(callable);
        return new zzggc(zzggoVar, this.zza.schedule(zzggoVar, j2, timeUnit));
    }
}
