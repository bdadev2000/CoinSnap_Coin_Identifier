package com.vungle.ads.internal.executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class f implements a {
    public static final e Companion = new e(null);
    private static final int IO_KEEP_ALIVE_TIME_SECONDS = 5;
    private static final int JOBS_KEEP_ALIVE_TIME_SECONDS = 1;
    private static final int SINGLE_CORE_POOL_SIZE = 1;
    private static final int VUNGLE_KEEP_ALIVE_TIME_SECONDS = 10;
    private l API_EXECUTOR;
    private l BACKGROUND_EXECUTOR;
    private l DOWNLOADER_EXECUTOR;
    private l IO_EXECUTOR;
    private l JOB_EXECUTOR;
    private l LOGGER_EXECUTOR;
    private final int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
    private l OFFLOAD_EXECUTOR;
    private l UA_EXECUTOR;

    public f() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.JOB_EXECUTOR = new l(1, 1, 1L, timeUnit, new LinkedBlockingQueue(), new d("vng_jr"));
        this.IO_EXECUTOR = new l(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new d("vng_io"));
        this.API_EXECUTOR = new l(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new d("vng_api"));
        this.LOGGER_EXECUTOR = new l(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new d("vng_logger"));
        this.BACKGROUND_EXECUTOR = new l(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new d("vng_background"));
        this.UA_EXECUTOR = new l(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new d("vng_ua"));
        this.DOWNLOADER_EXECUTOR = new l(4, 4, 1L, timeUnit, new PriorityBlockingQueue(), new d("vng_down"));
        this.OFFLOAD_EXECUTOR = new l(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new d("vng_ol"));
    }

    @Override // com.vungle.ads.internal.executor.a
    public l getApiExecutor() {
        return this.API_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public l getBackgroundExecutor() {
        return this.BACKGROUND_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public l getDownloaderExecutor() {
        return this.DOWNLOADER_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public l getIoExecutor() {
        return this.IO_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public l getJobExecutor() {
        return this.JOB_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public l getLoggerExecutor() {
        return this.LOGGER_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public l getOffloadExecutor() {
        return this.OFFLOAD_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.a
    public l getUaExecutor() {
        return this.UA_EXECUTOR;
    }
}
