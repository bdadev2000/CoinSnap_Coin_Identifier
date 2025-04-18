package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.q;
import okio.Buffer;
import okio.ByteString;
import okio.DeflaterSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public final class MessageDeflater implements Closeable {

    @NotNull
    private final Buffer deflatedBytes;

    @NotNull
    private final Deflater deflater;

    @NotNull
    private final DeflaterSink deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z2) {
        this.noContextTakeover = z2;
        Buffer buffer = new Buffer();
        this.deflatedBytes = buffer;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((Sink) buffer, deflater);
    }

    private final boolean endsWith(Buffer buffer, ByteString byteString) {
        return buffer.rangeEquals(buffer.size() - byteString.size(), byteString);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(@NotNull Buffer buffer) throws IOException {
        ByteString byteString;
        a.s(buffer, "buffer");
        if (this.deflatedBytes.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.size());
        this.deflaterSink.flush();
        Buffer buffer2 = this.deflatedBytes;
        byteString = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
        if (endsWith(buffer2, byteString)) {
            long size = this.deflatedBytes.size() - 4;
            Buffer.UnsafeCursor readAndWriteUnsafe$default = Buffer.readAndWriteUnsafe$default(this.deflatedBytes, null, 1, null);
            try {
                readAndWriteUnsafe$default.resizeBuffer(size);
                q.b(readAndWriteUnsafe$default, null);
            } finally {
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        Buffer buffer3 = this.deflatedBytes;
        buffer.write(buffer3, buffer3.size());
    }
}
