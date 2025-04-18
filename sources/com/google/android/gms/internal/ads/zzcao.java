package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class zzcao implements ua.b {
    private final zzgfa zza = zzgfa.zze();

    private static final boolean zza(boolean z10) {
        if (!z10) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z10;
    }

    @Override // ua.b
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.zza.cancel(z10);
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

    public final boolean zzd(Throwable th2) {
        boolean zzd = this.zza.zzd(th2);
        zza(zzd);
        return zzd;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j3, timeUnit);
    }
}
