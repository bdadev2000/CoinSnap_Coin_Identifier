package okio;

import android.support.v4.media.d;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class InflaterSource implements Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;

    @NotNull
    private final Inflater inflater;

    @NotNull
    private final BufferedSource source;

    public InflaterSource(@NotNull BufferedSource bufferedSource, @NotNull Inflater inflater) {
        p0.a.s(bufferedSource, "source");
        p0.a.s(inflater, "inflater");
        this.source = bufferedSource;
        this.inflater = inflater;
    }

    private final void releaseBytesAfterInflate() {
        int i2 = this.bufferBytesHeldByInflater;
        if (i2 == 0) {
            return;
        }
        int remaining = i2 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // okio.Source
    public long read(@NotNull Buffer buffer, long j2) throws IOException {
        p0.a.s(buffer, "sink");
        do {
            long readOrInflate = readOrInflate(buffer, j2);
            if (readOrInflate > 0) {
                return readOrInflate;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    public final long readOrInflate(@NotNull Buffer buffer, long j2) throws IOException {
        p0.a.s(buffer, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(d.m("byteCount < 0: ", j2).toString());
        }
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        try {
            Segment writableSegment$okio = buffer.writableSegment$okio(1);
            int min = (int) Math.min(j2, 8192 - writableSegment$okio.limit);
            refill();
            int inflate = this.inflater.inflate(writableSegment$okio.data, writableSegment$okio.limit, min);
            releaseBytesAfterInflate();
            if (inflate > 0) {
                writableSegment$okio.limit += inflate;
                long j3 = inflate;
                buffer.setSize$okio(buffer.size() + j3);
                return j3;
            }
            if (writableSegment$okio.pos == writableSegment$okio.limit) {
                buffer.head = writableSegment$okio.pop();
                SegmentPool.recycle(writableSegment$okio);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    public final boolean refill() throws IOException {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.exhausted()) {
            return true;
        }
        Segment segment = this.source.getBuffer().head;
        p0.a.p(segment);
        int i2 = segment.limit;
        int i3 = segment.pos;
        int i4 = i2 - i3;
        this.bufferBytesHeldByInflater = i4;
        this.inflater.setInput(segment.data, i3, i4);
        return false;
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.source.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InflaterSource(@NotNull Source source, @NotNull Inflater inflater) {
        this(Okio.buffer(source), inflater);
        p0.a.s(source, "source");
        p0.a.s(inflater, "inflater");
    }
}
