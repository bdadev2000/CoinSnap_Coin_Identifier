package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes3.dex */
public abstract class zzgdc extends AbstractExecutorService implements zzges {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzgfh.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (ua.b) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzges
    public final ua.b zza(Runnable runnable) {
        return (ua.b) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzges
    public final ua.b zzb(Callable callable) {
        return (ua.b) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzgfh(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (ua.b) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (ua.b) super.submit(callable);
    }
}
