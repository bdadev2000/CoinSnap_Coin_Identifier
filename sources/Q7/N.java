package Q7;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes3.dex */
public final class N extends M implements C {

    /* renamed from: d, reason: collision with root package name */
    public final Executor f2538d;

    public N(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f2538d = executor;
        Method method2 = V7.c.f3510a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = V7.c.f3510a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f2538d;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof N) && ((N) obj).f2538d == this.f2538d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2538d);
    }

    @Override // Q7.AbstractC0251t
    public final void j(w7.k kVar, Runnable runnable) {
        try {
            this.f2538d.execute(runnable);
        } catch (RejectedExecutionException e4) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e4);
            AbstractC0255x.c(kVar, cancellationException);
            F.b.j(kVar, runnable);
        }
    }

    @Override // Q7.AbstractC0251t
    public final String toString() {
        return this.f2538d.toString();
    }
}
