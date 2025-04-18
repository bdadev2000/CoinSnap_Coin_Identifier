package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgex extends zzgeu implements ScheduledExecutorService {
    final ScheduledExecutorService zza;

    public zzgex(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgfh zze = zzgfh.zze(runnable, null);
        return new zzgev(zze, scheduledExecutorService.schedule(zze, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        zzgew zzgewVar = new zzgew(runnable);
        return new zzgev(zzgewVar, this.zza.scheduleAtFixedRate(zzgewVar, j3, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        zzgew zzgewVar = new zzgew(runnable);
        return new zzgev(zzgewVar, this.zza.scheduleWithFixedDelay(zzgewVar, j3, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        zzgfh zzgfhVar = new zzgfh(callable);
        return new zzgev(zzgfhVar, this.zza.schedule(zzgfhVar, j3, timeUnit));
    }
}
