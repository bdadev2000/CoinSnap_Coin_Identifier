package com.mbridge.msdk.foundation.download.core;

import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class DefaultExecutorSupplier implements ExecutorSupplier {
    private int DEFAULT_MAX_NUM_THREADS;
    private final ThreadPoolExecutor backgroundExecutor;
    private final ThreadPoolExecutor downloadResultExecutor;
    private final DownloadExecutor networkExecutor;

    public DefaultExecutorSupplier() {
        this.DEFAULT_MAX_NUM_THREADS = 10;
        g a6 = h.a().a(c.m().k());
        if (a6 != null) {
            int P8 = a6.P();
            this.DEFAULT_MAX_NUM_THREADS = P8;
            if (P8 <= 0) {
                this.DEFAULT_MAX_NUM_THREADS = 10;
            }
        }
        DownloadExecutor downloadExecutor = new DownloadExecutor(this.DEFAULT_MAX_NUM_THREADS, new PriorityThreadFactory(10), new ThreadPoolExecutor.DiscardPolicy());
        this.networkExecutor = downloadExecutor;
        if (this.DEFAULT_MAX_NUM_THREADS > 0) {
            downloadExecutor.allowCoreThreadTimeOut(true);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new PriorityThreadFactory(10), new ThreadPoolExecutor.DiscardPolicy());
        this.backgroundExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new PriorityThreadFactory(10), new ThreadPoolExecutor.DiscardPolicy());
        this.downloadResultExecutor = threadPoolExecutor2;
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public ExecutorService getBackgroundTasks() {
        return this.backgroundExecutor;
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public ExecutorService getDownloadResultTasks() {
        return this.downloadResultExecutor;
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public DownloadExecutor getDownloadTasks() {
        return this.networkExecutor;
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public ExecutorService getLruCacheThreadTasks() {
        return this.backgroundExecutor;
    }
}
