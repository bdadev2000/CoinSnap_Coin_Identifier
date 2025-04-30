package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes2.dex */
public abstract class zzgem extends AbstractExecutorService implements zzgge {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzggt.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (f4.c) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgge
    public final f4.c zza(Runnable runnable) {
        return (f4.c) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgge
    public final f4.c zzb(Callable callable) {
        return (f4.c) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzggt(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (f4.c) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (f4.c) super.submit(callable);
    }
}
