package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface BufferedSink extends Sink, WritableByteChannel {
    @d0.a
    @NotNull
    Buffer buffer();

    @NotNull
    BufferedSink emit() throws IOException;

    @NotNull
    BufferedSink emitCompleteSegments() throws IOException;

    @Override // okio.Sink, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    Buffer getBuffer();

    @NotNull
    OutputStream outputStream();

    @NotNull
    BufferedSink write(@NotNull ByteString byteString) throws IOException;

    @NotNull
    BufferedSink write(@NotNull ByteString byteString, int i2, int i3) throws IOException;

    @NotNull
    BufferedSink write(@NotNull Source source, long j2) throws IOException;

    @NotNull
    BufferedSink write(@NotNull byte[] bArr) throws IOException;

    @NotNull
    BufferedSink write(@NotNull byte[] bArr, int i2, int i3) throws IOException;

    long writeAll(@NotNull Source source) throws IOException;

    @NotNull
    BufferedSink writeByte(int i2) throws IOException;

    @NotNull
    BufferedSink writeDecimalLong(long j2) throws IOException;

    @NotNull
    BufferedSink writeHexadecimalUnsignedLong(long j2) throws IOException;

    @NotNull
    BufferedSink writeInt(int i2) throws IOException;

    @NotNull
    BufferedSink writeIntLe(int i2) throws IOException;

    @NotNull
    BufferedSink writeLong(long j2) throws IOException;

    @NotNull
    BufferedSink writeLongLe(long j2) throws IOException;

    @NotNull
    BufferedSink writeShort(int i2) throws IOException;

    @NotNull
    BufferedSink writeShortLe(int i2) throws IOException;

    @NotNull
    BufferedSink writeString(@NotNull String str, int i2, int i3, @NotNull Charset charset) throws IOException;

    @NotNull
    BufferedSink writeString(@NotNull String str, @NotNull Charset charset) throws IOException;

    @NotNull
    BufferedSink writeUtf8(@NotNull String str) throws IOException;

    @NotNull
    BufferedSink writeUtf8(@NotNull String str, int i2, int i3) throws IOException;

    @NotNull
    BufferedSink writeUtf8CodePoint(int i2) throws IOException;
}
