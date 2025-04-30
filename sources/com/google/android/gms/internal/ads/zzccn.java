package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class zzccn implements f4.c {
    private final zzggm zza = zzggm.zze();

    private static final boolean zza(boolean z8) {
        if (!z8) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z8;
    }

    @Override // f4.c
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        return this.zza.cancel(z8);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    public final boolean zzc(@Nullable Object obj) {
        boolean zzc = this.zza.zzc(obj);
        zza(zzc);
        return zzc;
    }

    public final boolean zzd(Throwable th) {
        boolean zzd = this.zza.zzd(th);
        zza(zzd);
        return zzd;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j7, timeUnit);
    }
}
