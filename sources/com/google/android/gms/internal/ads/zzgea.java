package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class zzgea extends zzgdz {
    private final ua.b zza;

    public zzgea(ua.b bVar) {
        bVar.getClass();
        this.zza = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy, ua.b
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgcy, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.zza.cancel(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzgcy, java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgcy, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzgcy, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgcy, java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zza.get(j3, timeUnit);
    }
}
