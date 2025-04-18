package j4;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e implements ExecutorService {

    /* renamed from: c, reason: collision with root package name */
    public static final long f19756c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d, reason: collision with root package name */
    public static volatile int f19757d;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f19758b;

    public e(ThreadPoolExecutor threadPoolExecutor) {
        this.f19758b = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j3, TimeUnit timeUnit) {
        return this.f19758b.awaitTermination(j3, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f19758b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f19758b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f19758b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f19758b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f19758b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f19758b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f19758b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.f19758b.submit(runnable);
    }

    public final String toString() {
        return this.f19758b.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j3, TimeUnit timeUnit) {
        return this.f19758b.invokeAll(collection, j3, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j3, TimeUnit timeUnit) {
        return this.f19758b.invokeAny(collection, j3, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f19758b.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f19758b.submit(callable);
    }
}
