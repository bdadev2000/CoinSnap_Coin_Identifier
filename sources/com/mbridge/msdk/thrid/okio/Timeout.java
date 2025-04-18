package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes4.dex */
public class Timeout {
    public static final Timeout NONE = new Timeout() { // from class: com.mbridge.msdk.thrid.okio.Timeout.1
        @Override // com.mbridge.msdk.thrid.okio.Timeout
        public Timeout deadlineNanoTime(long j3) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.Timeout
        public void throwIfReached() throws IOException {
        }

        @Override // com.mbridge.msdk.thrid.okio.Timeout
        public Timeout timeout(long j3, TimeUnit timeUnit) {
            return this;
        }
    };
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final Timeout deadline(long j3, TimeUnit timeUnit) {
        if (j3 > 0) {
            if (timeUnit != null) {
                return deadlineNanoTime(timeUnit.toNanos(j3) + System.nanoTime());
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException(a.k("duration <= 0: ", j3));
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public void throwIfReached() throws IOException {
        if (!Thread.interrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    public Timeout timeout(long j3, TimeUnit timeUnit) {
        if (j3 >= 0) {
            if (timeUnit != null) {
                this.timeoutNanos = timeUnit.toNanos(j3);
                return this;
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException(a.k("timeout < 0: ", j3));
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j3 = 0;
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
            if (timeoutNanos > 0) {
                long j10 = timeoutNanos / 1000000;
                obj.wait(j10, (int) (timeoutNanos - (1000000 * j10)));
                j3 = System.nanoTime() - nanoTime;
            }
            if (j3 < timeoutNanos) {
            } else {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public Timeout deadlineNanoTime(long j3) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j3;
        return this;
    }
}
