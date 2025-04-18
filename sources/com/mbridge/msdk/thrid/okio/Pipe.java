package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes4.dex */
public final class Pipe {
    final long maxBufferSize;
    boolean sinkClosed;
    boolean sourceClosed;
    final Buffer buffer = new Buffer();
    private final Sink sink = new PipeSink();
    private final Source source = new PipeSource();

    /* loaded from: classes4.dex */
    public final class PipeSink implements Sink {
        final Timeout timeout = new Timeout();

        public PipeSink() {
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (Pipe.this.buffer) {
                Pipe pipe = Pipe.this;
                if (pipe.sinkClosed) {
                    return;
                }
                if (pipe.sourceClosed && pipe.buffer.size() > 0) {
                    throw new IOException("source is closed");
                }
                Pipe pipe2 = Pipe.this;
                pipe2.sinkClosed = true;
                pipe2.buffer.notifyAll();
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            synchronized (Pipe.this.buffer) {
                Pipe pipe = Pipe.this;
                if (!pipe.sinkClosed) {
                    if (pipe.sourceClosed && pipe.buffer.size() > 0) {
                        throw new IOException("source is closed");
                    }
                } else {
                    throw new IllegalStateException("closed");
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink
        public void write(Buffer buffer, long j3) throws IOException {
            synchronized (Pipe.this.buffer) {
                if (!Pipe.this.sinkClosed) {
                    while (j3 > 0) {
                        Pipe pipe = Pipe.this;
                        if (!pipe.sourceClosed) {
                            long size = pipe.maxBufferSize - pipe.buffer.size();
                            if (size == 0) {
                                this.timeout.waitUntilNotified(Pipe.this.buffer);
                            } else {
                                long min = Math.min(size, j3);
                                Pipe.this.buffer.write(buffer, min);
                                j3 -= min;
                                Pipe.this.buffer.notifyAll();
                            }
                        } else {
                            throw new IOException("source is closed");
                        }
                    }
                } else {
                    throw new IllegalStateException("closed");
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class PipeSource implements Source {
        final Timeout timeout = new Timeout();

        public PipeSource() {
        }

        @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (Pipe.this.buffer) {
                Pipe pipe = Pipe.this;
                pipe.sourceClosed = true;
                pipe.buffer.notifyAll();
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Source
        public long read(Buffer buffer, long j3) throws IOException {
            synchronized (Pipe.this.buffer) {
                if (!Pipe.this.sourceClosed) {
                    while (Pipe.this.buffer.size() == 0) {
                        Pipe pipe = Pipe.this;
                        if (pipe.sinkClosed) {
                            return -1L;
                        }
                        this.timeout.waitUntilNotified(pipe.buffer);
                    }
                    long read = Pipe.this.buffer.read(buffer, j3);
                    Pipe.this.buffer.notifyAll();
                    return read;
                }
                throw new IllegalStateException("closed");
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    public Pipe(long j3) {
        if (j3 >= 1) {
            this.maxBufferSize = j3;
            return;
        }
        throw new IllegalArgumentException(a.k("maxBufferSize < 1: ", j3));
    }

    public final Sink sink() {
        return this.sink;
    }

    public final Source source() {
        return this.source;
    }
}
