package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzggf {
    public static zzgfz zza(ExecutorService executorService) {
        if (executorService instanceof zzgfz) {
            return (zzgfz) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzgge((ScheduledExecutorService) executorService) : new zzggb(executorService);
    }

    public static Executor zzb() {
        return zzgfc.INSTANCE;
    }

    public static Executor zzc(Executor executor, zzgec zzgecVar) {
        executor.getClass();
        return executor == zzgfc.INSTANCE ? executor : new zzgga(executor, zzgecVar);
    }
}
