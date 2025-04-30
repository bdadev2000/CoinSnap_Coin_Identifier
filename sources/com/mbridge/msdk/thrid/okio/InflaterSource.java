package com.mbridge.msdk.thrid.okio;

import Q7.n0;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class InflaterSource implements Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final Inflater inflater;
    private final BufferedSource source;

    public InflaterSource(Source source, Inflater inflater) {
        this(Okio.buffer(source), inflater);
    }

    private void releaseInflatedBytes() throws IOException {
        int i9 = this.bufferBytesHeldByInflater;
        if (i9 == 0) {
            return;
        }
        int remaining = i9 - this.inflater.getRemaining();
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
    public long read(Buffer buffer, long j7) throws IOException {
        boolean refill;
        if (j7 >= 0) {
            if (!this.closed) {
                if (j7 == 0) {
                    return 0L;
                }
                do {
                    refill = refill();
                    try {
                        Segment writableSegment = buffer.writableSegment(1);
                        int inflate = this.inflater.inflate(writableSegment.data, writableSegment.limit, (int) Math.min(j7, 8192 - writableSegment.limit));
                        if (inflate > 0) {
                            writableSegment.limit += inflate;
                            long j9 = inflate;
                            buffer.size += j9;
                            return j9;
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
                    } catch (DataFormatException e4) {
                        throw new IOException(e4);
                    }
                } while (!refill);
                throw new EOFException("source exhausted prematurely");
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(n0.g(j7, "byteCount < 0: "));
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
            int i9 = segment.limit;
            int i10 = segment.pos;
            int i11 = i9 - i10;
            this.bufferBytesHeldByInflater = i11;
            this.inflater.setInput(segment.data, i10, i11);
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
