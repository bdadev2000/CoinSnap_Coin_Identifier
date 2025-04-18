package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class SingleThreadFutureScheduler implements FutureScheduler {
    private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    /* loaded from: classes.dex */
    public class a implements RejectedExecutionHandler {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* loaded from: classes.dex */
    public class b<V> implements Callable<V> {
        public final /* synthetic */ Callable a;

        public b(Callable callable) {
            this.a = callable;
        }

        @Override // java.util.concurrent.Callable
        public final V call() {
            try {
                return (V) this.a.call();
            } catch (Throwable th2) {
                AdjustFactory.getLogger().error("Callable error [%s] of type [%s]", th2.getMessage(), th2.getClass().getCanonicalName());
                return null;
            }
        }
    }

    public SingleThreadFutureScheduler(String str, boolean z10) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryWrapper(str), new a(str));
        this.scheduledThreadPoolExecutor = scheduledThreadPoolExecutor;
        if (z10) {
            return;
        }
        scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
        this.scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public ScheduledFuture<?> scheduleFuture(Runnable runnable, long j3) {
        return this.scheduledThreadPoolExecutor.schedule(new RunnableWrapper(runnable), j3, TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j3, long j10) {
        return this.scheduledThreadPoolExecutor.scheduleWithFixedDelay(new RunnableWrapper(runnable), j3, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j3) {
        return this.scheduledThreadPoolExecutor.schedule(new b(callable), j3, TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public void teardown() {
        this.scheduledThreadPoolExecutor.shutdownNow();
    }
}
