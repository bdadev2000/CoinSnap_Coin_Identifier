package com.mbridge.msdk.thrid.okio;

import Q7.n0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class Timeout {
    public static final Timeout NONE = new Timeout() { // from class: com.mbridge.msdk.thrid.okio.Timeout.1
        @Override // com.mbridge.msdk.thrid.okio.Timeout
        public Timeout deadlineNanoTime(long j7) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.Timeout
        public void throwIfReached() throws IOException {
        }

        @Override // com.mbridge.msdk.thrid.okio.Timeout
        public Timeout timeout(long j7, TimeUnit timeUnit) {
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

    public final Timeout deadline(long j7, TimeUnit timeUnit) {
        if (j7 > 0) {
            if (timeUnit != null) {
                return deadlineNanoTime(timeUnit.toNanos(j7) + System.nanoTime());
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException(n0.g(j7, "duration <= 0: "));
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

    public Timeout timeout(long j7, TimeUnit timeUnit) {
        if (j7 >= 0) {
            if (timeUnit != null) {
                this.timeoutNanos = timeUnit.toNanos(j7);
                return this;
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException(n0.g(j7, "timeout < 0: "));
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j7 = 0;
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
                long j9 = timeoutNanos / 1000000;
                obj.wait(j9, (int) (timeoutNanos - (1000000 * j9)));
                j7 = System.nanoTime() - nanoTime;
            }
            if (j7 < timeoutNanos) {
            } else {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public Timeout deadlineNanoTime(long j7) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j7;
        return this;
    }
}
