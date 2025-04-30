package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzfut implements zzfur {
    private zzfut() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfur
    public final ExecutorService zza(int i9) {
        return zzc(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzfur
    public final ExecutorService zzb(ThreadFactory threadFactory, int i9) {
        return zzc(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzfur
    public final ExecutorService zzc(int i9, ThreadFactory threadFactory, int i10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i9, i9, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public /* synthetic */ zzfut(zzfus zzfusVar) {
    }
}
