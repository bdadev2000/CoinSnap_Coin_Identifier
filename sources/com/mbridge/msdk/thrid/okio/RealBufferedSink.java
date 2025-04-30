package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RealBufferedSink implements BufferedSink {
    public final Buffer buffer = new Buffer();
    boolean closed;
    public final Sink sink;

    public RealBufferedSink(Sink sink) {
        if (sink != null) {
            this.sink = sink;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            Buffer buffer = this.buffer;
            long j7 = buffer.size;
            if (j7 > 0) {
                this.sink.write(buffer, j7);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.closed = true;
        if (th != null) {
            Util.sneakyRethrow(th);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink emit() throws IOException {
        if (!this.closed) {
            long size = this.buffer.size();
            if (size > 0) {
                this.sink.write(this.buffer, size);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink emitCompleteSegments() throws IOException {
        if (!this.closed) {
            long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                this.sink.write(this.buffer, completeSegmentByteCount);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink, com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (!this.closed) {
            Buffer buffer = this.buffer;
            long j7 = buffer.size;
            if (j7 > 0) {
                this.sink.write(buffer, j7);
            }
            this.sink.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: com.mbridge.msdk.thrid.okio.RealBufferedSink.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                RealBufferedSink.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.flush();
                }
            }

            public String toString() {
                return RealBufferedSink.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i9) throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.buffer.writeByte((int) ((byte) i9));
                    RealBufferedSink.this.emitCompleteSegments();
                    return;
                }
                throw new IOException("closed");
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i9, int i10) throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.buffer.write(bArr, i9, i10);
                    RealBufferedSink.this.emitCompleteSegments();
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return "buffer(" + this.sink + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public void write(Buffer buffer, long j7) throws IOException {
        if (!this.closed) {
            this.buffer.write(buffer, j7);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        if (source != null) {
            long j7 = 0;
            while (true) {
                long read = source.read(this.buffer, 8192L);
                if (read != -1) {
                    j7 += read;
                    emitCompleteSegments();
                } else {
                    return j7;
                }
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeByte(int i9) throws IOException {
        if (!this.closed) {
            this.buffer.writeByte(i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeDecimalLong(long j7) throws IOException {
        if (!this.closed) {
            this.buffer.writeDecimalLong(j7);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeHexadecimalUnsignedLong(long j7) throws IOException {
        if (!this.closed) {
            this.buffer.writeHexadecimalUnsignedLong(j7);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeInt(int i9) throws IOException {
        if (!this.closed) {
            this.buffer.writeInt(i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeIntLe(int i9) throws IOException {
        if (!this.closed) {
            this.buffer.writeIntLe(i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeLong(long j7) throws IOException {
        if (!this.closed) {
            this.buffer.writeLong(j7);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeLongLe(long j7) throws IOException {
        if (!this.closed) {
            this.buffer.writeLongLe(j7);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeShort(int i9) throws IOException {
        if (!this.closed) {
            this.buffer.writeShort(i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeShortLe(int i9) throws IOException {
        if (!this.closed) {
            this.buffer.writeShortLe(i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeString(String str, Charset charset) throws IOException {
        if (!this.closed) {
            this.buffer.writeString(str, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeUtf8(String str) throws IOException {
        if (!this.closed) {
            this.buffer.writeUtf8(str);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeUtf8CodePoint(int i9) throws IOException {
        if (!this.closed) {
            this.buffer.writeUtf8CodePoint(i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink write(ByteString byteString) throws IOException {
        if (!this.closed) {
            this.buffer.write(byteString);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeString(String str, int i9, int i10, Charset charset) throws IOException {
        if (!this.closed) {
            this.buffer.writeString(str, i9, i10, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink writeUtf8(String str, int i9, int i10) throws IOException {
        if (!this.closed) {
            this.buffer.writeUtf8(str, i9, i10);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink write(byte[] bArr) throws IOException {
        if (!this.closed) {
            this.buffer.write(bArr);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink write(byte[] bArr, int i9, int i10) throws IOException {
        if (!this.closed) {
            this.buffer.write(bArr, i9, i10);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.closed) {
            int write = this.buffer.write(byteBuffer);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink write(Source source, long j7) throws IOException {
        while (j7 > 0) {
            long read = source.read(this.buffer, j7);
            if (read != -1) {
                j7 -= read;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
