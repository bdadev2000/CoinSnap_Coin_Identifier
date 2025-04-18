package okio;

import android.support.v4.media.d;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class GzipSink implements Sink {
    private boolean closed;

    @NotNull
    private final CRC32 crc;

    @NotNull
    private final Deflater deflater;

    @NotNull
    private final DeflaterSink deflaterSink;

    @NotNull
    private final RealBufferedSink sink;

    public GzipSink(@NotNull Sink sink) {
        p0.a.s(sink, "sink");
        RealBufferedSink realBufferedSink = new RealBufferedSink(sink);
        this.sink = realBufferedSink;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((BufferedSink) realBufferedSink, deflater);
        this.crc = new CRC32();
        Buffer buffer = realBufferedSink.bufferField;
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
    }

    private final void updateCrc(Buffer buffer, long j2) {
        Segment segment = buffer.head;
        p0.a.p(segment);
        while (j2 > 0) {
            int min = (int) Math.min(j2, segment.limit - segment.pos);
            this.crc.update(segment.data, segment.pos, min);
            j2 -= min;
            segment = segment.next;
            p0.a.p(segment);
        }
    }

    private final void writeFooter() {
        this.sink.writeIntLe((int) this.crc.getValue());
        this.sink.writeIntLe((int) this.deflater.getBytesRead());
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_deflater, reason: not valid java name */
    public final Deflater m783deprecated_deflater() {
        return this.deflater;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            this.deflaterSink.finishDeflate$okio();
            writeFooter();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @NotNull
    public final Deflater deflater() {
        return this.deflater;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.deflaterSink.flush();
    }

    @Override // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer buffer, long j2) throws IOException {
        p0.a.s(buffer, "source");
        if (j2 < 0) {
            throw new IllegalArgumentException(d.m("byteCount < 0: ", j2).toString());
        }
        if (j2 == 0) {
            return;
        }
        updateCrc(buffer, j2);
        this.deflaterSink.write(buffer, j2);
    }
}
