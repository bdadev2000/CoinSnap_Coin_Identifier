package okio;

import android.support.v4.media.d;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

/* loaded from: classes3.dex */
public final class Pipe {

    @NotNull
    private final Buffer buffer = new Buffer();
    private boolean canceled;

    @NotNull
    private final Condition condition;

    @Nullable
    private Sink foldedSink;

    @NotNull
    private final ReentrantLock lock;
    private final long maxBufferSize;

    @NotNull
    private final Sink sink;
    private boolean sinkClosed;

    @NotNull
    private final Source source;
    private boolean sourceClosed;

    public Pipe(long j2) {
        this.maxBufferSize = j2;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        p0.a.r(newCondition, "newCondition(...)");
        this.condition = newCondition;
        if (j2 < 1) {
            throw new IllegalArgumentException(d.m("maxBufferSize < 1: ", j2).toString());
        }
        this.sink = new Sink() { // from class: okio.Pipe$sink$1

            @NotNull
            private final Timeout timeout = new Timeout();

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed$okio()) {
                        lock.unlock();
                        return;
                    }
                    Sink foldedSink$okio = pipe.getFoldedSink$okio();
                    if (foldedSink$okio == null) {
                        if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        pipe.setSinkClosed$okio(true);
                        pipe.getCondition().signalAll();
                        foldedSink$okio = null;
                    }
                    if (foldedSink$okio != null) {
                        Pipe pipe2 = Pipe.this;
                        Timeout timeout = foldedSink$okio.timeout();
                        Timeout timeout2 = pipe2.sink().timeout();
                        long timeoutNanos = timeout.timeoutNanos();
                        long minTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        timeout.timeout(minTimeout, timeUnit);
                        if (!timeout.hasDeadline()) {
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                foldedSink$okio.close();
                                timeout.timeout(timeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                                throw th;
                            }
                        }
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            foldedSink$okio.close();
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                        } catch (Throwable th2) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            throw th2;
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (!(!pipe.getSinkClosed$okio())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    Sink foldedSink$okio = pipe.getFoldedSink$okio();
                    if (foldedSink$okio == null) {
                        if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        foldedSink$okio = null;
                    }
                    if (foldedSink$okio != null) {
                        Pipe pipe2 = Pipe.this;
                        Timeout timeout = foldedSink$okio.timeout();
                        Timeout timeout2 = pipe2.sink().timeout();
                        long timeoutNanos = timeout.timeoutNanos();
                        long minTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        timeout.timeout(minTimeout, timeUnit);
                        if (!timeout.hasDeadline()) {
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                foldedSink$okio.flush();
                                timeout.timeout(timeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                                throw th;
                            }
                        }
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            foldedSink$okio.flush();
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                        } catch (Throwable th2) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            throw th2;
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink
            @NotNull
            public Timeout timeout() {
                return this.timeout;
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
            
                if (r2 == null) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
            
                r0 = r12.this$0;
                r1 = r2.timeout();
                r0 = r0.sink().timeout();
                r3 = r1.timeoutNanos();
                r5 = okio.Timeout.Companion.minTimeout(r0.timeoutNanos(), r1.timeoutNanos());
                r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
                r1.timeout(r5, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
            
                if (r1.hasDeadline() == false) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
            
                r5 = r1.deadlineNanoTime();
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
            
                if (r0.hasDeadline() == false) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
            
                r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
            
                r2.write(r13, r14);
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
            
                r1.timeout(r3, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
            
                if (r0.hasDeadline() == false) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00cf, code lost:
            
                r1.deadlineNanoTime(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:
            
                r13 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
            
                r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
            
                if (r0.hasDeadline() != false) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
            
                r1.deadlineNanoTime(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
            
                throw r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
            
                if (r0.hasDeadline() == false) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
            
                r1.deadlineNanoTime(r0.deadlineNanoTime());
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x00f0, code lost:
            
                r2.write(r13, r14);
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x00f3, code lost:
            
                r1.timeout(r3, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
            
                if (r0.hasDeadline() == false) goto L79;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x00fc, code lost:
            
                r1.clearDeadline();
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x0100, code lost:
            
                r13 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x0101, code lost:
            
                r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x010a, code lost:
            
                if (r0.hasDeadline() != false) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x010c, code lost:
            
                r1.clearDeadline();
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x010f, code lost:
            
                throw r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x0110, code lost:
            
                return;
             */
            @Override // okio.Sink
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void write(@org.jetbrains.annotations.NotNull okio.Buffer r13, long r14) {
                /*
                    Method dump skipped, instructions count: 295
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: okio.Pipe$sink$1.write(okio.Buffer, long):void");
            }
        };
        this.source = new Source() { // from class: okio.Pipe$source$1

            @NotNull
            private final Timeout timeout = new Timeout();

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    pipe.setSourceClosed$okio(true);
                    pipe.getCondition().signalAll();
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Source
            public long read(@NotNull Buffer buffer, long j3) {
                p0.a.s(buffer, "sink");
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (!(!pipe.getSourceClosed$okio())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    while (pipe.getBuffer$okio().size() == 0) {
                        if (pipe.getSinkClosed$okio()) {
                            lock.unlock();
                            return -1L;
                        }
                        this.timeout.awaitSignal(pipe.getCondition());
                        if (pipe.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                    }
                    long read = pipe.getBuffer$okio().read(buffer, j3);
                    pipe.getCondition().signalAll();
                    lock.unlock();
                    return read;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }

            @Override // okio.Source
            @NotNull
            public Timeout timeout() {
                return this.timeout;
            }
        };
    }

    private final void forward(Sink sink, l lVar) {
        Timeout timeout = sink.timeout();
        Timeout timeout2 = sink().timeout();
        long timeoutNanos = timeout.timeoutNanos();
        long minTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(minTimeout, timeUnit);
        if (!timeout.hasDeadline()) {
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                lVar.invoke(sink);
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                    return;
                }
                return;
            } catch (Throwable th) {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                throw th;
            }
        }
        long deadlineNanoTime = timeout.deadlineNanoTime();
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
        }
        try {
            lVar.invoke(sink);
            timeout.timeout(timeoutNanos, timeUnit);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(deadlineNanoTime);
            }
        } catch (Throwable th2) {
            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(deadlineNanoTime);
            }
            throw th2;
        }
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_sink, reason: not valid java name */
    public final Sink m786deprecated_sink() {
        return this.sink;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_source, reason: not valid java name */
    public final Source m787deprecated_source() {
        return this.source;
    }

    public final void cancel() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        p0.a.B0("sinkBuffer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void fold(@org.jetbrains.annotations.NotNull okio.Sink r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            p0.a.s(r9, r0)
        L5:
            java.util.concurrent.locks.ReentrantLock r0 = r8.lock
            r0.lock()
            okio.Sink r1 = r8.foldedSink     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L7a
            boolean r1 = r8.canceled     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L70
            boolean r1 = r8.sinkClosed     // Catch: java.lang.Throwable -> L25
            okio.Buffer r2 = r8.buffer     // Catch: java.lang.Throwable -> L25
            boolean r2 = r2.exhausted()     // Catch: java.lang.Throwable -> L25
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L27
            r8.sourceClosed = r4     // Catch: java.lang.Throwable -> L25
            r8.foldedSink = r9     // Catch: java.lang.Throwable -> L25
            r2 = r3
            r5 = r4
            goto L3b
        L25:
            r9 = move-exception
            goto L86
        L27:
            okio.Buffer r2 = new okio.Buffer     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            okio.Buffer r5 = r8.buffer     // Catch: java.lang.Throwable -> L25
            long r6 = r5.size()     // Catch: java.lang.Throwable -> L25
            r2.write(r5, r6)     // Catch: java.lang.Throwable -> L25
            java.util.concurrent.locks.Condition r5 = r8.condition     // Catch: java.lang.Throwable -> L25
            r5.signalAll()     // Catch: java.lang.Throwable -> L25
            r5 = 0
        L3b:
            r0.unlock()
            if (r5 == 0) goto L46
            if (r1 == 0) goto L45
            r9.close()
        L45:
            return
        L46:
            if (r2 == 0) goto L55
            long r0 = r2.size()     // Catch: java.lang.Throwable -> L53
            r9.write(r2, r0)     // Catch: java.lang.Throwable -> L53
            r9.flush()     // Catch: java.lang.Throwable -> L53
            goto L5
        L53:
            r9 = move-exception
            goto L5b
        L55:
            java.lang.String r9 = "sinkBuffer"
            p0.a.B0(r9)     // Catch: java.lang.Throwable -> L53
            throw r3     // Catch: java.lang.Throwable -> L53
        L5b:
            java.util.concurrent.locks.ReentrantLock r0 = r8.lock
            r0.lock()
            r8.sourceClosed = r4     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.locks.Condition r1 = r8.condition     // Catch: java.lang.Throwable -> L6b
            r1.signalAll()     // Catch: java.lang.Throwable -> L6b
            r0.unlock()
            throw r9
        L6b:
            r9 = move-exception
            r0.unlock()
            throw r9
        L70:
            r8.foldedSink = r9     // Catch: java.lang.Throwable -> L25
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "canceled"
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L7a:
            java.lang.String r9 = "sink already folded"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L25
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L25
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L25
            throw r1     // Catch: java.lang.Throwable -> L25
        L86:
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Pipe.fold(okio.Sink):void");
    }

    @NotNull
    public final Buffer getBuffer$okio() {
        return this.buffer;
    }

    public final boolean getCanceled$okio() {
        return this.canceled;
    }

    @NotNull
    public final Condition getCondition() {
        return this.condition;
    }

    @Nullable
    public final Sink getFoldedSink$okio() {
        return this.foldedSink;
    }

    @NotNull
    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final long getMaxBufferSize$okio() {
        return this.maxBufferSize;
    }

    public final boolean getSinkClosed$okio() {
        return this.sinkClosed;
    }

    public final boolean getSourceClosed$okio() {
        return this.sourceClosed;
    }

    public final void setCanceled$okio(boolean z2) {
        this.canceled = z2;
    }

    public final void setFoldedSink$okio(@Nullable Sink sink) {
        this.foldedSink = sink;
    }

    public final void setSinkClosed$okio(boolean z2) {
        this.sinkClosed = z2;
    }

    public final void setSourceClosed$okio(boolean z2) {
        this.sourceClosed = z2;
    }

    @NotNull
    public final Sink sink() {
        return this.sink;
    }

    @NotNull
    public final Source source() {
        return this.source;
    }
}
