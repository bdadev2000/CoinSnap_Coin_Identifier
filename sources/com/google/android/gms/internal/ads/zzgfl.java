package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class zzgfl extends zzgfk {
    private final f4.c zza;

    public zzgfl(f4.c cVar) {
        cVar.getClass();
        this.zza = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, f4.c
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        return this.zza.cancel(z8);
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zza.get(j7, timeUnit);
    }
}
