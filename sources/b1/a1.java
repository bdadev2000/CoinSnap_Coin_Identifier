package b1;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a1 extends z0 implements k0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f22286c;

    public a1(Executor executor) {
        Method method;
        this.f22286c = executor;
        Method method2 = g1.d.f30599a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = g1.d.f30599a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // b1.k0
    public final q0 E(long j2, Runnable runnable, h0.l lVar) {
        Executor executor = this.f22286c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                kotlin.jvm.internal.e.h(lVar, kotlin.jvm.internal.e.a("The task was rejected", e));
            }
        }
        return scheduledFuture != null ? new p0(scheduledFuture) : g0.f22320k.E(j2, runnable, lVar);
    }

    @Override // b1.k0
    public final void G(long j2, l lVar) {
        Executor executor = this.f22286c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new android.support.v4.media.h(this, lVar, 1), j2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                kotlin.jvm.internal.e.h(lVar.f22340f, kotlin.jvm.internal.e.a("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            lVar.z(new i(scheduledFuture, 0));
        } else {
            g0.f22320k.G(j2, lVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f22286c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a1) && ((a1) obj).f22286c == this.f22286c;
    }

    @Override // b1.z
    public final void h0(h0.l lVar, Runnable runnable) {
        try {
            this.f22286c.execute(runnable);
        } catch (RejectedExecutionException e) {
            kotlin.jvm.internal.e.h(lVar, kotlin.jvm.internal.e.a("The task was rejected", e));
            o0.f22356b.h0(lVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f22286c);
    }

    @Override // b1.z
    public final String toString() {
        return this.f22286c.toString();
    }
}
