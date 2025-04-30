package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgfx implements f4.c {
    static final f4.c zza = new zzgfx(null);
    private static final zzggd zzb = new zzggd(zzgfx.class);
    private final Object zzc;

    public zzgfx(Object obj) {
        this.zzc = obj;
    }

    @Override // f4.c
    public final void addListener(Runnable runnable, Executor executor) {
        zzfyg.zzc(runnable, "Runnable was null.");
        zzfyg.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e4) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", AbstractC2914a.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e4);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return AbstractC2914a.f(super.toString(), "[status=SUCCESS, result=[", String.valueOf(this.zzc), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.zzc;
    }
}
