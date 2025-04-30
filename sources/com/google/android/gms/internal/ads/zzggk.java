package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzggk {
    public static zzgge zza(ExecutorService executorService) {
        zzgge zzgggVar;
        if (executorService instanceof zzgge) {
            return (zzgge) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzgggVar = new zzggj((ScheduledExecutorService) executorService);
        } else {
            zzgggVar = new zzggg(executorService);
        }
        return zzgggVar;
    }

    public static Executor zzb() {
        return zzgfh.INSTANCE;
    }

    public static Executor zzc(Executor executor, zzgeh zzgehVar) {
        executor.getClass();
        if (executor == zzgfh.INSTANCE) {
            return executor;
        }
        return new zzggf(executor, zzgehVar);
    }
}
