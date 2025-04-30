package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AsyncTimeout extends Timeout {
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @Nullable
    static AsyncTimeout head;
    private boolean inQueue;

    @Nullable
    private AsyncTimeout next;
    private long timeoutAt;

    /* loaded from: classes3.dex */
    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0017, code lost:
        
            r1.timedOut();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.mbridge.msdk.thrid.okio.AsyncTimeout> r0 = com.mbridge.msdk.thrid.okio.AsyncTimeout.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                com.mbridge.msdk.thrid.okio.AsyncTimeout r1 = com.mbridge.msdk.thrid.okio.AsyncTimeout.awaitTimeout()     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                goto L0
            Lb:
                r1 = move-exception
                goto L1b
            Ld:
                com.mbridge.msdk.thrid.okio.AsyncTimeout r2 = com.mbridge.msdk.thrid.okio.AsyncTimeout.head     // Catch: java.lang.Throwable -> Lb
                if (r1 != r2) goto L16
                r1 = 0
                com.mbridge.msdk.thrid.okio.AsyncTimeout.head = r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return
            L16:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                r1.timedOut()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.AsyncTimeout.Watchdog.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static AsyncTimeout awaitTimeout() throws InterruptedException {
        AsyncTimeout asyncTimeout = head.next;
        if (asyncTimeout == null) {
            long nanoTime = System.nanoTime();
            AsyncTimeout.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || System.nanoTime() - nanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        long remainingNanos = asyncTimeout.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j7 = remainingNanos / 1000000;
            AsyncTimeout.class.wait(j7, (int) (remainingNanos - (1000000 * j7)));
            return null;
        }
        head.next = asyncTimeout.next;
        asyncTimeout.next = null;
        return asyncTimeout;
    }

    private static synchronized boolean cancelScheduledTimeout(AsyncTimeout asyncTimeout) {
        synchronized (AsyncTimeout.class) {
            AsyncTimeout asyncTimeout2 = head;
            while (asyncTimeout2 != null) {
                AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
                if (asyncTimeout3 == asyncTimeout) {
                    asyncTimeout2.next = asyncTimeout.next;
                    asyncTimeout.next = null;
                    return false;
                }
                asyncTimeout2 = asyncTimeout3;
            }
            return true;
        }
    }

    private long remainingNanos(long j7) {
        return this.timeoutAt - j7;
    }

    private static synchronized void scheduleTimeout(AsyncTimeout asyncTimeout, long j7, boolean z8) {
        synchronized (AsyncTimeout.class) {
            try {
                if (head == null) {
                    head = new AsyncTimeout();
                    new Watchdog().start();
                }
                long nanoTime = System.nanoTime();
                if (j7 != 0 && z8) {
                    asyncTimeout.timeoutAt = Math.min(j7, asyncTimeout.deadlineNanoTime() - nanoTime) + nanoTime;
                } else if (j7 != 0) {
                    asyncTimeout.timeoutAt = j7 + nanoTime;
                } else if (z8) {
                    asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
                } else {
                    throw new AssertionError();
                }
                long remainingNanos = asyncTimeout.remainingNanos(nanoTime);
                AsyncTimeout asyncTimeout2 = head;
                while (true) {
                    AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
                    if (asyncTimeout3 == null || remainingNanos < asyncTimeout3.remainingNanos(nanoTime)) {
                        break;
                    } else {
                        asyncTimeout2 = asyncTimeout2.next;
                    }
                }
                asyncTimeout.next = asyncTimeout2.next;
                asyncTimeout2.next = asyncTimeout;
                if (asyncTimeout2 == head) {
                    AsyncTimeout.class.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos == 0 && !hasDeadline) {
                return;
            }
            this.inQueue = true;
            scheduleTimeout(this, timeoutNanos, hasDeadline);
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    public IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Sink sink(final Sink sink) {
        return new Sink() { // from class: com.mbridge.msdk.thrid.okio.AsyncTimeout.1
            @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout.this.enter();
                try {
                    try {
                        sink.close();
                        AsyncTimeout.this.exit(true);
                    } catch (IOException e4) {
                        throw AsyncTimeout.this.exit(e4);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
            public void flush() throws IOException {
                AsyncTimeout.this.enter();
                try {
                    try {
                        sink.flush();
                        AsyncTimeout.this.exit(true);
                    } catch (IOException e4) {
                        throw AsyncTimeout.this.exit(e4);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // com.mbridge.msdk.thrid.okio.Sink
            public Timeout timeout() {
                return AsyncTimeout.this;
            }

            public String toString() {
                return "AsyncTimeout.sink(" + sink + ")";
            }

            @Override // com.mbridge.msdk.thrid.okio.Sink
            public void write(Buffer buffer, long j7) throws IOException {
                Util.checkOffsetAndCount(buffer.size, 0L, j7);
                while (true) {
                    long j9 = 0;
                    if (j7 > 0) {
                        Segment segment = buffer.head;
                        while (true) {
                            if (j9 >= 65536) {
                                break;
                            }
                            j9 += segment.limit - segment.pos;
                            if (j9 >= j7) {
                                j9 = j7;
                                break;
                            }
                            segment = segment.next;
                        }
                        AsyncTimeout.this.enter();
                        try {
                            try {
                                sink.write(buffer, j9);
                                j7 -= j9;
                                AsyncTimeout.this.exit(true);
                            } catch (IOException e4) {
                                throw AsyncTimeout.this.exit(e4);
                            }
                        } catch (Throwable th) {
                            AsyncTimeout.this.exit(false);
                            throw th;
                        }
                    } else {
                        return;
                    }
                }
            }
        };
    }

    public final Source source(final Source source) {
        return new Source() { // from class: com.mbridge.msdk.thrid.okio.AsyncTimeout.2
            @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    try {
                        source.close();
                        AsyncTimeout.this.exit(true);
                    } catch (IOException e4) {
                        throw AsyncTimeout.this.exit(e4);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // com.mbridge.msdk.thrid.okio.Source
            public long read(Buffer buffer, long j7) throws IOException {
                AsyncTimeout.this.enter();
                try {
                    try {
                        long read = source.read(buffer, j7);
                        AsyncTimeout.this.exit(true);
                        return read;
                    } catch (IOException e4) {
                        throw AsyncTimeout.this.exit(e4);
                    }
                } catch (Throwable th) {
                    AsyncTimeout.this.exit(false);
                    throw th;
                }
            }

            @Override // com.mbridge.msdk.thrid.okio.Source
            public Timeout timeout() {
                return AsyncTimeout.this;
            }

            public String toString() {
                return "AsyncTimeout.source(" + source + ")";
            }
        };
    }

    public void timedOut() {
    }

    public final void exit(boolean z8) throws IOException {
        if (exit() && z8) {
            throw newTimeoutException(null);
        }
    }

    public final IOException exit(IOException iOException) throws IOException {
        return !exit() ? iOException : newTimeoutException(iOException);
    }
}
