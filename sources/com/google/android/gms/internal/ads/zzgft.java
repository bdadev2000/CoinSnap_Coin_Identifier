package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzgft extends zzgfv {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzgfs zza(Iterable iterable) {
        return new zzgfs(false, zzgbc.zzk(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgfs zzb(Iterable iterable) {
        int i9 = zzgbc.zzd;
        iterable.getClass();
        return new zzgfs(true, zzgbc.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgfs zzc(f4.c... cVarArr) {
        return new zzgfs(true, zzgbc.zzl(cVarArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f4.c zzd(Iterable iterable) {
        return new zzgfb(zzgbc.zzk(iterable), true);
    }

    public static f4.c zze(f4.c cVar, Class cls, zzfxu zzfxuVar, Executor executor) {
        zzgee zzgeeVar = new zzgee(cVar, cls, zzfxuVar);
        cVar.addListener(zzgeeVar, zzggk.zzc(executor, zzgeeVar));
        return zzgeeVar;
    }

    public static f4.c zzf(f4.c cVar, Class cls, zzgfa zzgfaVar, Executor executor) {
        zzged zzgedVar = new zzged(cVar, cls, zzgfaVar);
        cVar.addListener(zzgedVar, zzggk.zzc(executor, zzgedVar));
        return zzgedVar;
    }

    public static f4.c zzg(Throwable th) {
        th.getClass();
        return new zzgfw(th);
    }

    public static f4.c zzh(Object obj) {
        if (obj == null) {
            return zzgfx.zza;
        }
        return new zzgfx(obj);
    }

    public static f4.c zzi() {
        return zzgfx.zza;
    }

    public static f4.c zzj(Callable callable, Executor executor) {
        zzggt zzggtVar = new zzggt(callable);
        executor.execute(zzggtVar);
        return zzggtVar;
    }

    public static f4.c zzk(zzgez zzgezVar, Executor executor) {
        zzggt zzggtVar = new zzggt(zzgezVar);
        executor.execute(zzggtVar);
        return zzggtVar;
    }

    @SafeVarargs
    public static f4.c zzl(f4.c... cVarArr) {
        return new zzgfb(zzgbc.zzl(cVarArr), false);
    }

    public static f4.c zzm(f4.c cVar, zzfxu zzfxuVar, Executor executor) {
        zzgeo zzgeoVar = new zzgeo(cVar, zzfxuVar);
        cVar.addListener(zzgeoVar, zzggk.zzc(executor, zzgeoVar));
        return zzgeoVar;
    }

    public static f4.c zzn(f4.c cVar, zzgfa zzgfaVar, Executor executor) {
        int i9 = zzgep.zzc;
        executor.getClass();
        zzgen zzgenVar = new zzgen(cVar, zzgfaVar);
        cVar.addListener(zzgenVar, zzggk.zzc(executor, zzgenVar));
        return zzgenVar;
    }

    public static f4.c zzo(f4.c cVar, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (cVar.isDone()) {
            return cVar;
        }
        return zzggq.zzf(cVar, j7, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzggv.zza(future);
        }
        throw new IllegalStateException(zzfyv.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzggv.zza(future);
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof Error) {
                throw new zzgfi((Error) cause);
            }
            throw new zzggu(cause);
        }
    }

    public static void zzr(f4.c cVar, zzgfp zzgfpVar, Executor executor) {
        zzgfpVar.getClass();
        cVar.addListener(new zzgfq(cVar, zzgfpVar), executor);
    }
}
