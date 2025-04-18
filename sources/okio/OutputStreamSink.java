package okio;

import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class OutputStreamSink implements Sink {

    @NotNull
    private final OutputStream out;

    @NotNull
    private final Timeout timeout;

    public OutputStreamSink(@NotNull OutputStream outputStream, @NotNull Timeout timeout) {
        p0.a.s(outputStream, "out");
        p0.a.s(timeout, "timeout");
        this.out = outputStream;
        this.timeout = timeout;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    @Override // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.timeout;
    }

    @NotNull
    public String toString() {
        return "sink(" + this.out + ')';
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer buffer, long j2) {
        p0.a.s(buffer, "source");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j2);
        while (j2 > 0) {
            this.timeout.throwIfReached();
            Segment segment = buffer.head;
            p0.a.p(segment);
            int min = (int) Math.min(j2, segment.limit - segment.pos);
            this.out.write(segment.data, segment.pos, min);
            segment.pos += min;
            long j3 = min;
            j2 -= j3;
            buffer.setSize$okio(buffer.size() - j3);
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }
}
