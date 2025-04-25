package okio;

import java.io.IOException;

/* loaded from: classes9.dex */
final class PeekSource implements Source {
    private final Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private Segment expectedSegment;
    private long pos;
    private final BufferedSource upstream;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PeekSource(BufferedSource bufferedSource) {
        this.upstream = bufferedSource;
        Buffer buffer = bufferedSource.buffer();
        this.buffer = buffer;
        Segment segment = buffer.head;
        this.expectedSegment = segment;
        this.expectedPos = segment != null ? segment.pos : -1;
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        Segment segment = this.expectedSegment;
        if (segment != null && (segment != this.buffer.head || this.expectedPos != this.buffer.head.pos)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.upstream.request(this.pos + 1)) {
            return -1L;
        }
        if (this.expectedSegment == null && this.buffer.head != null) {
            this.expectedSegment = this.buffer.head;
            this.expectedPos = this.buffer.head.pos;
        }
        long min = Math.min(j, this.buffer.size - this.pos);
        this.buffer.copyTo(buffer, this.pos, min);
        this.pos += min;
        return min;
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.upstream.timeout();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
    }
}
