package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzgei extends zzgek {
    public static zzgeg zza(Iterable iterable) {
        return new zzgeg(false, zzfzo.zzk(iterable), null);
    }

    public static zzgeg zzb(Iterable iterable) {
        return new zzgeg(true, zzfzo.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgeg zzc(ua.b... bVarArr) {
        return new zzgeg(true, zzfzo.zzm(bVarArr), null);
    }

    public static ua.b zzd(Iterable iterable) {
        return new zzgdq(zzfzo.zzk(iterable), true);
    }

    public static ua.b zze(ua.b bVar, Class cls, zzfwh zzfwhVar, Executor executor) {
        zzgcw zzgcwVar = new zzgcw(bVar, cls, zzfwhVar);
        bVar.addListener(zzgcwVar, zzgey.zzc(executor, zzgcwVar));
        return zzgcwVar;
    }

    public static ua.b zzf(ua.b bVar, Class cls, zzgdp zzgdpVar, Executor executor) {
        zzgcv zzgcvVar = new zzgcv(bVar, cls, zzgdpVar);
        bVar.addListener(zzgcvVar, zzgey.zzc(executor, zzgcvVar));
        return zzgcvVar;
    }

    public static ua.b zzg(Throwable th2) {
        th2.getClass();
        return new zzgel(th2);
    }

    public static ua.b zzh(Object obj) {
        if (obj == null) {
            return zzgem.zza;
        }
        return new zzgem(obj);
    }

    public static ua.b zzi() {
        return zzgem.zza;
    }

    public static ua.b zzj(Callable callable, Executor executor) {
        zzgfh zzgfhVar = new zzgfh(callable);
        executor.execute(zzgfhVar);
        return zzgfhVar;
    }

    public static ua.b zzk(zzgdo zzgdoVar, Executor executor) {
        zzgfh zzgfhVar = new zzgfh(zzgdoVar);
        executor.execute(zzgfhVar);
        return zzgfhVar;
    }

    @SafeVarargs
    public static ua.b zzl(ua.b... bVarArr) {
        return new zzgdq(zzfzo.zzm(bVarArr), false);
    }

    public static ua.b zzm(ua.b bVar, zzfwh zzfwhVar, Executor executor) {
        zzgde zzgdeVar = new zzgde(bVar, zzfwhVar);
        bVar.addListener(zzgdeVar, zzgey.zzc(executor, zzgdeVar));
        return zzgdeVar;
    }

    public static ua.b zzn(ua.b bVar, zzgdp zzgdpVar, Executor executor) {
        int i10 = zzgdf.zzc;
        executor.getClass();
        zzgdd zzgddVar = new zzgdd(bVar, zzgdpVar);
        bVar.addListener(zzgddVar, zzgey.zzc(executor, zzgddVar));
        return zzgddVar;
    }

    public static ua.b zzo(ua.b bVar, long j3, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (bVar.isDone()) {
            return bVar;
        }
        return zzgfe.zzf(bVar, j3, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgfj.zza(future);
        }
        throw new IllegalStateException(zzfxf.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgfj.zza(future);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof Error) {
                throw new zzgdx((Error) cause);
            }
            throw new zzgfi(cause);
        }
    }

    public static void zzr(ua.b bVar, zzgee zzgeeVar, Executor executor) {
        zzgeeVar.getClass();
        bVar.addListener(new zzgef(bVar, zzgeeVar), executor);
    }
}
