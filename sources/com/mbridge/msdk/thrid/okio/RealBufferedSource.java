package com.mbridge.msdk.thrid.okio;

import Q7.n0;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import y.AbstractC2933a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RealBufferedSource implements BufferedSource {
    public final Buffer buffer = new Buffer();
    boolean closed;
    public final Source source;

    public RealBufferedSource(Source source) {
        if (source != null) {
            this.source = source;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource, com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer buffer() {
        return this.buffer;
    }

    @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.buffer.clear();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean exhausted() throws IOException {
        if (!this.closed) {
            if (this.buffer.exhausted() && this.source.read(this.buffer, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b) throws IOException {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOfElement(ByteString byteString) throws IOException {
        return indexOfElement(byteString, 0L);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: com.mbridge.msdk.thrid.okio.RealBufferedSource.1
            @Override // java.io.InputStream
            public int available() throws IOException {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (!realBufferedSource.closed) {
                    return (int) Math.min(realBufferedSource.buffer.size, 2147483647L);
                }
                throw new IOException("closed");
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                RealBufferedSource.this.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (!realBufferedSource.closed) {
                    Buffer buffer = realBufferedSource.buffer;
                    if (buffer.size == 0 && realBufferedSource.source.read(buffer, 8192L) == -1) {
                        return -1;
                    }
                    return RealBufferedSource.this.buffer.readByte() & 255;
                }
                throw new IOException("closed");
            }

            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i9, int i10) throws IOException {
                if (!RealBufferedSource.this.closed) {
                    Util.checkOffsetAndCount(bArr.length, i9, i10);
                    RealBufferedSource realBufferedSource = RealBufferedSource.this;
                    Buffer buffer = realBufferedSource.buffer;
                    if (buffer.size == 0 && realBufferedSource.source.read(buffer, 8192L) == -1) {
                        return -1;
                    }
                    return RealBufferedSource.this.buffer.read(bArr, i9, i10);
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean rangeEquals(long j7, ByteString byteString) throws IOException {
        return rangeEquals(j7, byteString, 0, byteString.size());
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public long read(Buffer buffer, long j7) throws IOException {
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j7 >= 0) {
            if (!this.closed) {
                Buffer buffer2 = this.buffer;
                if (buffer2.size == 0 && this.source.read(buffer2, 8192L) == -1) {
                    return -1L;
                }
                return this.buffer.read(buffer, Math.min(j7, this.buffer.size));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(n0.g(j7, "byteCount < 0: "));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        if (sink != null) {
            long j7 = 0;
            while (this.source.read(this.buffer, 8192L) != -1) {
                long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
                if (completeSegmentByteCount > 0) {
                    j7 += completeSegmentByteCount;
                    sink.write(this.buffer, completeSegmentByteCount);
                }
            }
            if (this.buffer.size() > 0) {
                long size = j7 + this.buffer.size();
                Buffer buffer = this.buffer;
                sink.write(buffer, buffer.size());
                return size;
            }
            return j7;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte readByte() throws IOException {
        require(1L);
        return this.buffer.readByte();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte[] readByteArray() throws IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteArray();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public ByteString readByteString() throws IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteString();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readDecimalLong() throws IOException {
        byte b;
        require(1L);
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            if (!request(i10)) {
                break;
            }
            b = this.buffer.getByte(i9);
            if ((b < 48 || b > 57) && !(i9 == 0 && b == 45)) {
                break;
            }
            i9 = i10;
        }
        if (i9 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(b)));
        }
        return this.buffer.readDecimalLong();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void readFully(byte[] bArr) throws IOException {
        try {
            require(bArr.length);
            this.buffer.readFully(bArr);
        } catch (EOFException e4) {
            int i9 = 0;
            while (true) {
                Buffer buffer = this.buffer;
                long j7 = buffer.size;
                if (j7 > 0) {
                    int read = buffer.read(bArr, i9, (int) j7);
                    if (read == -1) {
                        throw new AssertionError();
                    }
                    i9 += read;
                } else {
                    throw e4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r2)));
     */
    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 1
            r5.require(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L48
            com.mbridge.msdk.thrid.okio.Buffer r2 = r5.buffer
            long r3 = (long) r0
            byte r2 = r2.getByte(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L48
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L48:
            com.mbridge.msdk.thrid.okio.Buffer r0 = r5.buffer
            long r0 = r0.readHexadecimalUnsignedLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.RealBufferedSource.readHexadecimalUnsignedLong():long");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readInt() throws IOException {
        require(4L);
        return this.buffer.readInt();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readIntLe() throws IOException {
        require(4L);
        return this.buffer.readIntLe();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readLong() throws IOException {
        require(8L);
        return this.buffer.readLong();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readLongLe() throws IOException {
        require(8L);
        return this.buffer.readLongLe();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public short readShort() throws IOException {
        require(2L);
        return this.buffer.readShort();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public short readShortLe() throws IOException {
        require(2L);
        return this.buffer.readShortLe();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readString(Charset charset) throws IOException {
        if (charset != null) {
            this.buffer.writeAll(this.source);
            return this.buffer.readString(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8() throws IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readUtf8();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readUtf8CodePoint() throws IOException {
        require(1L);
        byte b = this.buffer.getByte(0L);
        if ((b & 224) == 192) {
            require(2L);
        } else if ((b & 240) == 224) {
            require(3L);
        } else if ((b & 248) == 240) {
            require(4L);
        }
        return this.buffer.readUtf8CodePoint();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws IOException {
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            long j7 = this.buffer.size;
            if (j7 != 0) {
                return readUtf8(j7);
            }
            return null;
        }
        return this.buffer.readUtf8Line(indexOf);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8LineStrict() throws IOException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean request(long j7) throws IOException {
        Buffer buffer;
        if (j7 >= 0) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            do {
                buffer = this.buffer;
                if (buffer.size >= j7) {
                    return true;
                }
            } while (this.source.read(buffer, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(n0.g(j7, "byteCount < 0: "));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void require(long j7) throws IOException {
        if (request(j7)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int select(Options options) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int selectPrefix = this.buffer.selectPrefix(options, true);
            if (selectPrefix == -1) {
                return -1;
            }
            if (selectPrefix != -2) {
                this.buffer.skip(options.byteStrings[selectPrefix].size());
                return selectPrefix;
            }
        } while (this.source.read(this.buffer, 8192L) != -1);
        return -1;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void skip(long j7) throws IOException {
        if (!this.closed) {
            while (j7 > 0) {
                Buffer buffer = this.buffer;
                if (buffer.size == 0 && this.source.read(buffer, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j7, this.buffer.size());
                this.buffer.skip(min);
                j7 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }

    public String toString() {
        return "buffer(" + this.source + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b, long j7) throws IOException {
        return indexOf(b, j7, Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j7) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOfElement = this.buffer.indexOfElement(byteString, j7);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            Buffer buffer = this.buffer;
            long j9 = buffer.size;
            if (this.source.read(buffer, 8192L) == -1) {
                return -1L;
            }
            j7 = Math.max(j7, j9);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean rangeEquals(long j7, ByteString byteString, int i9, int i10) throws IOException {
        if (!this.closed) {
            if (j7 < 0 || i9 < 0 || i10 < 0 || byteString.size() - i9 < i10) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                long j9 = i11 + j7;
                if (!request(1 + j9) || this.buffer.getByte(j9) != byteString.getByte(i9 + i11)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8LineStrict(long j7) throws IOException {
        if (j7 >= 0) {
            long j9 = j7 == Long.MAX_VALUE ? Long.MAX_VALUE : j7 + 1;
            long indexOf = indexOf((byte) 10, 0L, j9);
            if (indexOf != -1) {
                return this.buffer.readUtf8Line(indexOf);
            }
            if (j9 < Long.MAX_VALUE && request(j9) && this.buffer.getByte(j9 - 1) == 13 && request(1 + j9) && this.buffer.getByte(j9) == 10) {
                return this.buffer.readUtf8Line(j9);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = this.buffer;
            buffer2.copyTo(buffer, 0L, Math.min(32L, buffer2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.buffer.size(), j7) + " content=" + buffer.readByteString().hex() + (char) 8230);
        }
        throw new IllegalArgumentException(n0.g(j7, "limit < 0: "));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b, long j7, long j9) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j7 < 0 || j9 < j7) {
            StringBuilder a6 = AbstractC2933a.a("fromIndex=", j7, " toIndex=");
            a6.append(j9);
            throw new IllegalArgumentException(a6.toString());
        }
        while (j7 < j9) {
            long indexOf = this.buffer.indexOf(b, j7, j9);
            if (indexOf == -1) {
                Buffer buffer = this.buffer;
                long j10 = buffer.size;
                if (j10 >= j9 || this.source.read(buffer, 8192L) == -1) {
                    break;
                }
                j7 = Math.max(j7, j10);
            } else {
                return indexOf;
            }
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte[] readByteArray(long j7) throws IOException {
        require(j7);
        return this.buffer.readByteArray(j7);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public ByteString readByteString(long j7) throws IOException {
        require(j7);
        return this.buffer.readByteString(j7);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8(long j7) throws IOException {
        require(j7);
        return this.buffer.readUtf8(j7);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readString(long j7, Charset charset) throws IOException {
        require(j7);
        if (charset != null) {
            return this.buffer.readString(j7, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void readFully(Buffer buffer, long j7) throws IOException {
        try {
            require(j7);
            this.buffer.readFully(buffer, j7);
        } catch (EOFException e4) {
            buffer.writeAll(this.buffer);
            throw e4;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        long j7 = i10;
        Util.checkOffsetAndCount(bArr.length, i9, j7);
        Buffer buffer = this.buffer;
        if (buffer.size == 0 && this.source.read(buffer, 8192L) == -1) {
            return -1;
        }
        return this.buffer.read(bArr, i9, (int) Math.min(j7, this.buffer.size));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0L);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(ByteString byteString, long j7) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOf = this.buffer.indexOf(byteString, j7);
            if (indexOf != -1) {
                return indexOf;
            }
            Buffer buffer = this.buffer;
            long j9 = buffer.size;
            if (this.source.read(buffer, 8192L) == -1) {
                return -1L;
            }
            j7 = Math.max(j7, (j9 - byteString.size()) + 1);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        Buffer buffer = this.buffer;
        if (buffer.size == 0 && this.source.read(buffer, 8192L) == -1) {
            return -1;
        }
        return this.buffer.read(byteBuffer);
    }
}
