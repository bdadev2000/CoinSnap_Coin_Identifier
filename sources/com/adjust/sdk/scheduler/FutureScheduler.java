package com.adjust.sdk.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public interface FutureScheduler {
    ScheduledFuture<?> scheduleFuture(Runnable runnable, long j7);

    ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j7, long j9);

    <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j7);

    void teardown();
}
