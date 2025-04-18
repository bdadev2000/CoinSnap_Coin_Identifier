package com.adjust.sdk.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public interface FutureScheduler {
    ScheduledFuture<?> scheduleFuture(Runnable runnable, long j3);

    ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j3, long j10);

    <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j3);

    void teardown();
}
