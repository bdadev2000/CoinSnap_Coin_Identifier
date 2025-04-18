package okio;

import a1.c;
import android.support.v4.media.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class Timeout {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Timeout NONE = new Timeout() { // from class: okio.Timeout$Companion$NONE$1
        @Override // okio.Timeout
        @NotNull
        public Timeout deadlineNanoTime(long j2) {
            return this;
        }

        @Override // okio.Timeout
        public void throwIfReached() {
        }

        @Override // okio.Timeout
        @NotNull
        public Timeout timeout(long j2, @NotNull TimeUnit timeUnit) {
            p0.a.s(timeUnit, "unit");
            return this;
        }
    };

    @Nullable
    private volatile Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final long minTimeout(long j2, long j3) {
            return (j2 != 0 && (j3 == 0 || j2 < j3)) ? j2 : j3;
        }

        @NotNull
        public final Timeout timeout(@NotNull Timeout timeout, long j2, @NotNull c cVar) {
            p0.a.s(timeout, "<this>");
            p0.a.s(cVar, "unit");
            return timeout.timeout(j2, cVar.f68a);
        }

        @NotNull
        /* renamed from: timeout-HG0u8IE, reason: not valid java name */
        public final Timeout m788timeoutHG0u8IE(@NotNull Timeout timeout, long j2) {
            p0.a.s(timeout, "$this$timeout");
            long j3 = j2 >> 1;
            int i2 = a1.a.d;
            if ((((int) j2) & 1) != 0) {
                j3 = j3 > 9223372036854L ? Long.MAX_VALUE : j3 < -9223372036854L ? Long.MIN_VALUE : j3 * 1000000;
            }
            return timeout.timeout(j3, TimeUnit.NANOSECONDS);
        }
    }

    public void awaitSignal(@NotNull Condition condition) throws InterruptedIOException {
        p0.a.s(condition, "condition");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - System.nanoTime());
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - System.nanoTime();
            }
            if (timeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.cancelMark;
            if (condition.awaitNanos(timeoutNanos) <= 0 && this.cancelMark == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void cancel() {
        this.cancelMark = new Object();
    }

    @NotNull
    public Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    @NotNull
    public Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    @NotNull
    public final Timeout deadline(long j2, @NotNull TimeUnit timeUnit) {
        p0.a.s(timeUnit, "unit");
        if (j2 <= 0) {
            throw new IllegalArgumentException(d.m("duration <= 0: ", j2).toString());
        }
        return deadlineNanoTime(timeUnit.toNanos(j2) + System.nanoTime());
    }

    @NotNull
    public Timeout deadlineNanoTime(long j2) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j2;
        return this;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(@NotNull Timeout timeout, @NotNull q0.a aVar) {
        p0.a.s(timeout, "other");
        p0.a.s(aVar, "block");
        long timeoutNanos = timeoutNanos();
        long minTimeout = Companion.minTimeout(timeout.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(minTimeout, timeUnit);
        if (!hasDeadline()) {
            if (timeout.hasDeadline()) {
                deadlineNanoTime(timeout.deadlineNanoTime());
            }
            try {
                T t2 = (T) aVar.invoke();
                timeout(timeoutNanos, timeUnit);
                if (timeout.hasDeadline()) {
                    clearDeadline();
                }
                return t2;
            } catch (Throwable th) {
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout.hasDeadline()) {
                    clearDeadline();
                }
                throw th;
            }
        }
        long deadlineNanoTime = deadlineNanoTime();
        if (timeout.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), timeout.deadlineNanoTime()));
        }
        try {
            T t3 = (T) aVar.invoke();
            timeout(timeoutNanos, timeUnit);
            if (timeout.hasDeadline()) {
                deadlineNanoTime(deadlineNanoTime);
            }
            return t3;
        } catch (Throwable th2) {
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout.hasDeadline()) {
                deadlineNanoTime(deadlineNanoTime);
            }
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @NotNull
    public Timeout timeout(long j2, @NotNull TimeUnit timeUnit) {
        p0.a.s(timeUnit, "unit");
        if (j2 < 0) {
            throw new IllegalArgumentException(d.m("timeout < 0: ", j2).toString());
        }
        this.timeoutNanos = timeUnit.toNanos(j2);
        return this;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public void waitUntilNotified(@NotNull Object obj) throws InterruptedIOException {
        p0.a.s(obj, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj2 = this.cancelMark;
            long j2 = timeoutNanos / 1000000;
            obj.wait(j2, (int) (timeoutNanos - (1000000 * j2)));
            if (System.nanoTime() - nanoTime >= timeoutNanos && this.cancelMark == obj2) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }
}
