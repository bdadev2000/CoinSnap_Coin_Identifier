package com.google.android.gms.internal.ads;

import eb.j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgem implements ua.b {
    static final ua.b zza = new zzgem(null);
    private static final zzger zzb = new zzger(zzgem.class);
    private final Object zzc;

    public zzgem(Object obj) {
        this.zzc = obj;
    }

    @Override // ua.b
    public final void addListener(Runnable runnable, Executor executor) {
        zzfwq.zzc(runnable, "Runnable was null.");
        zzfwq.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", j.l("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
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
        Object obj = this.zzc;
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(obj) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.zzc;
    }
}
