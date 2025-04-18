package okio;

import android.support.v4.media.d;
import java.io.IOException;
import javax.crypto.Cipher;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class CipherSource implements Source {
    private final int blockSize;

    @NotNull
    private final Buffer buffer;

    @NotNull
    private final Cipher cipher;
    private boolean closed;

    /* renamed from: final, reason: not valid java name */
    private boolean f51final;

    @NotNull
    private final BufferedSource source;

    public CipherSource(@NotNull BufferedSource bufferedSource, @NotNull Cipher cipher) {
        p0.a.s(bufferedSource, "source");
        p0.a.s(cipher, "cipher");
        this.source = bufferedSource;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new Buffer();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    private final void doFinal() {
        int outputSize = this.cipher.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        Segment writableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int doFinal = this.cipher.doFinal(writableSegment$okio.data, writableSegment$okio.pos);
        writableSegment$okio.limit += doFinal;
        Buffer buffer = this.buffer;
        buffer.setSize$okio(buffer.size() + doFinal);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            this.buffer.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
        }
    }

    private final void refill() {
        while (this.buffer.size() == 0 && !this.f51final) {
            if (this.source.exhausted()) {
                this.f51final = true;
                doFinal();
                return;
            }
            update();
        }
    }

    private final void update() {
        Segment segment = this.source.getBuffer().head;
        p0.a.p(segment);
        int i2 = segment.limit - segment.pos;
        int outputSize = this.cipher.getOutputSize(i2);
        while (outputSize > 8192) {
            int i3 = this.blockSize;
            if (i2 <= i3) {
                this.f51final = true;
                Buffer buffer = this.buffer;
                byte[] doFinal = this.cipher.doFinal(this.source.readByteArray());
                p0.a.r(doFinal, "doFinal(...)");
                buffer.write(doFinal);
                return;
            }
            i2 -= i3;
            outputSize = this.cipher.getOutputSize(i2);
        }
        Segment writableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int update = this.cipher.update(segment.data, segment.pos, i2, writableSegment$okio.data, writableSegment$okio.pos);
        this.source.skip(i2);
        writableSegment$okio.limit += update;
        Buffer buffer2 = this.buffer;
        buffer2.setSize$okio(buffer2.size() + update);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            this.buffer.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
        this.source.close();
    }

    @NotNull
    public final Cipher getCipher() {
        return this.cipher;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer buffer, long j2) throws IOException {
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
        refill();
        return this.buffer.read(buffer, j2);
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.source.timeout();
    }
}
