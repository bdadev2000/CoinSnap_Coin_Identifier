package com.google.android.gms.internal.ads;

import eb.j;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class zzfif implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, j.i("AdWorker(NG) #", this.zza.getAndIncrement()));
    }
}
