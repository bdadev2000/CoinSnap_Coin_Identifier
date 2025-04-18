package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: classes4.dex */
public final class DeflaterSink implements Sink {
    private boolean closed;
    private final Deflater deflater;
    private final BufferedSink sink;

    public DeflaterSink(Sink sink, Deflater deflater) {
        this(Okio.buffer(sink), deflater);
    }

    private void deflate(boolean z10) throws IOException {
        Segment writableSegment;
        int deflate;
        Buffer buffer = this.sink.buffer();
        while (true) {
            writableSegment = buffer.writableSegment(1);
            if (z10) {
                Deflater deflater = this.deflater;
                byte[] bArr = writableSegment.data;
                int i10 = writableSegment.limit;
                deflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = writableSegment.data;
                int i11 = writableSegment.limit;
                deflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (deflate > 0) {
                writableSegment.limit += deflate;
                buffer.size += deflate;
                this.sink.emitCompleteSegments();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (writableSegment.pos == writableSegment.limit) {
            buffer.head = writableSegment.pop();
            SegmentPool.recycle(writableSegment);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            finishDeflate();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.closed = true;
        if (th != null) {
            Util.sneakyRethrow(th);
        }
    }

    public void finishDeflate() throws IOException {
        this.deflater.finish();
        deflate(false);
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        deflate(true);
        this.sink.flush();
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.sink + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public void write(Buffer buffer, long j3) throws IOException {
        Util.checkOffsetAndCount(buffer.size, 0L, j3);
        while (j3 > 0) {
            Segment segment = buffer.head;
            int min = (int) Math.min(j3, segment.limit - segment.pos);
            this.deflater.setInput(segment.data, segment.pos, min);
            deflate(false);
            long j10 = min;
            buffer.size -= j10;
            int i10 = segment.pos + min;
            segment.pos = i10;
            if (i10 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            j3 -= j10;
        }
    }

    public DeflaterSink(BufferedSink bufferedSink, Deflater deflater) {
        if (bufferedSink == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater != null) {
            this.sink = bufferedSink;
            this.deflater = deflater;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }
}
