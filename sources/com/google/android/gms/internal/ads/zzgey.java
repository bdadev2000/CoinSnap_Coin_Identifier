package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzgey {
    public static zzges zza(ExecutorService executorService) {
        zzges zzgeuVar;
        if (executorService instanceof zzges) {
            return (zzges) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzgeuVar = new zzgex((ScheduledExecutorService) executorService);
        } else {
            zzgeuVar = new zzgeu(executorService);
        }
        return zzgeuVar;
    }

    public static Executor zzb() {
        return zzgdw.INSTANCE;
    }

    public static Executor zzc(Executor executor, zzgcy zzgcyVar) {
        executor.getClass();
        return executor == zzgdw.INSTANCE ? executor : new zzget(executor, zzgcyVar);
    }
}
