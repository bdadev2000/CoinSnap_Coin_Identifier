package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;

    @NotNull
    private final Condition condition;

    @NotNull
    private final ReentrantLock lock;
    private long maxByteCount;
    private long waitByteCount;

    public Throttler(long j2) {
        this.allocatedUntil = j2;
        this.waitByteCount = 8192L;
        this.maxByteCount = 262144L;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        p0.a.r(newCondition, "newCondition(...)");
        this.condition = newCondition;
    }

    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j3 = throttler.waitByteCount;
        }
        long j5 = j3;
        if ((i2 & 4) != 0) {
            j4 = throttler.maxByteCount;
        }
        throttler.bytesPerSecond(j2, j5, j4);
    }

    private final long bytesToNanos(long j2) {
        return (j2 * 1000000000) / this.bytesPerSecond;
    }

    private final long nanosToBytes(long j2) {
        return (j2 * this.bytesPerSecond) / 1000000000;
    }

    public final long byteCountOrWaitNanos$okio(long j2, long j3) {
        if (this.bytesPerSecond == 0) {
            return j3;
        }
        long max = Math.max(this.allocatedUntil - j2, 0L);
        long nanosToBytes = this.maxByteCount - nanosToBytes(max);
        if (nanosToBytes >= j3) {
            this.allocatedUntil = j2 + max + bytesToNanos(j3);
            return j3;
        }
        long j4 = this.waitByteCount;
        if (nanosToBytes >= j4) {
            this.allocatedUntil = j2 + bytesToNanos(this.maxByteCount);
            return nanosToBytes;
        }
        long min = Math.min(j4, j3);
        long bytesToNanos = max + bytesToNanos(min - this.maxByteCount);
        if (bytesToNanos != 0) {
            return -bytesToNanos;
        }
        this.allocatedUntil = j2 + bytesToNanos(this.maxByteCount);
        return min;
    }

    public final void bytesPerSecond(long j2) {
        bytesPerSecond$default(this, j2, 0L, 0L, 6, null);
    }

    @NotNull
    public final Condition getCondition() {
        return this.condition;
    }

    @NotNull
    public final ReentrantLock getLock() {
        return this.lock;
    }

    @NotNull
    public final Sink sink(@NotNull final Sink sink) {
        p0.a.s(sink, "sink");
        return new ForwardingSink(sink) { // from class: okio.Throttler$sink$1
            @Override // okio.ForwardingSink, okio.Sink
            public void write(@NotNull Buffer buffer, long j2) throws IOException {
                p0.a.s(buffer, "source");
                while (j2 > 0) {
                    try {
                        long take$okio = this.take$okio(j2);
                        super.write(buffer, take$okio);
                        j2 -= take$okio;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }

    @NotNull
    public final Source source(@NotNull final Source source) {
        p0.a.s(source, "source");
        return new ForwardingSource(source) { // from class: okio.Throttler$source$1
            @Override // okio.ForwardingSource, okio.Source
            public long read(@NotNull Buffer buffer, long j2) {
                p0.a.s(buffer, "sink");
                try {
                    return super.read(buffer, this.take$okio(j2));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        };
    }

    public final long take$okio(long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                long byteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), j2);
                if (byteCountOrWaitNanos$okio >= 0) {
                    return byteCountOrWaitNanos$okio;
                }
                this.condition.awaitNanos(-byteCountOrWaitNanos$okio);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void bytesPerSecond(long j2, long j3) {
        bytesPerSecond$default(this, j2, j3, 0L, 4, null);
    }

    public final void bytesPerSecond(long j2, long j3, long j4) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (j2 < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (j3 <= 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (j4 >= j3) {
                this.bytesPerSecond = j2;
                this.waitByteCount = j3;
                this.maxByteCount = j4;
                this.condition.signalAll();
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public Throttler() {
        this(System.nanoTime());
    }
}
