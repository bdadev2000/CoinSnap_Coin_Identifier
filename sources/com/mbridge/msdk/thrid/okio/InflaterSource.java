package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes4.dex */
public final class InflaterSource implements Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final Inflater inflater;
    private final BufferedSource source;

    public InflaterSource(Source source, Inflater inflater) {
        this(Okio.buffer(source), inflater);
    }

    private void releaseInflatedBytes() throws IOException {
        int i10 = this.bufferBytesHeldByInflater;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public long read(Buffer buffer, long j3) throws IOException {
        boolean refill;
        if (j3 >= 0) {
            if (!this.closed) {
                if (j3 == 0) {
                    return 0L;
                }
                do {
                    refill = refill();
                    try {
                        Segment writableSegment = buffer.writableSegment(1);
                        int inflate = this.inflater.inflate(writableSegment.data, writableSegment.limit, (int) Math.min(j3, 8192 - writableSegment.limit));
                        if (inflate > 0) {
                            writableSegment.limit += inflate;
                            long j10 = inflate;
                            buffer.size += j10;
                            return j10;
                        }
                        if (!this.inflater.finished() && !this.inflater.needsDictionary()) {
                        }
                        releaseInflatedBytes();
                        if (writableSegment.pos == writableSegment.limit) {
                            buffer.head = writableSegment.pop();
                            SegmentPool.recycle(writableSegment);
                            return -1L;
                        }
                        return -1L;
                    } catch (DataFormatException e2) {
                        throw new IOException(e2);
                    }
                } while (!refill);
                throw new EOFException("source exhausted prematurely");
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(a.k("byteCount < 0: ", j3));
    }

    public final boolean refill() throws IOException {
        if (!this.inflater.needsInput()) {
            return false;
        }
        releaseInflatedBytes();
        if (this.inflater.getRemaining() == 0) {
            if (this.source.exhausted()) {
                return true;
            }
            Segment segment = this.source.buffer().head;
            int i10 = segment.limit;
            int i11 = segment.pos;
            int i12 = i10 - i11;
            this.bufferBytesHeldByInflater = i12;
            this.inflater.setInput(segment.data, i11, i12);
            return false;
        }
        throw new IllegalStateException("?");
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }

    public InflaterSource(BufferedSource bufferedSource, Inflater inflater) {
        if (bufferedSource == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater != null) {
            this.source = bufferedSource;
            this.inflater = inflater;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }
}
