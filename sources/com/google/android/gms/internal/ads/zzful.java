package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzful implements zzfuj {
    private zzful() {
        throw null;
    }

    public /* synthetic */ zzful(zzfuk zzfukVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final ExecutorService zza(int i2) {
        return zzc(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final ExecutorService zzb(ThreadFactory threadFactory, int i2) {
        return zzc(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final ExecutorService zzc(int i2, ThreadFactory threadFactory, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
