package eb;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class e implements ScheduledExecutorService {

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f17273b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f17274c;

    public e(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f17273b = executorService;
        this.f17274c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j3, TimeUnit timeUnit) {
        return this.f17273b.awaitTermination(j3, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f17273b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f17273b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f17273b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f17273b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f17273b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        return new g(new n7.h(this, runnable, j3, timeUnit, 2));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        return new g(new b(this, runnable, j3, j10, timeUnit, 1));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        return new g(new b(this, runnable, j3, j10, timeUnit, 0));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f17273b.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j3, TimeUnit timeUnit) {
        return this.f17273b.invokeAll(collection, j3, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j3, TimeUnit timeUnit) {
        return this.f17273b.invokeAny(collection, j3, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        return new g(new n7.h(this, callable, j3, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f17273b.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.f17273b.submit(runnable);
    }
}
