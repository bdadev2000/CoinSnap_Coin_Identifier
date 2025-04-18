package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzfta implements zzfsz {
    private zzfta() {
        throw null;
    }

    public /* synthetic */ zzfta(zzftb zzftbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfsz
    public final ExecutorService zza(int i10) {
        return zzc(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzfsz
    public final ExecutorService zzb(ThreadFactory threadFactory, int i10) {
        return zzc(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzfsz
    public final ExecutorService zzc(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
