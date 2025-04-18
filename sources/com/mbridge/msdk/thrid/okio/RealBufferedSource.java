package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlin.text.Typography;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
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
    public long indexOf(byte b3) throws IOException {
        return indexOf(b3, 0L, Long.MAX_VALUE);
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
                    return RealBufferedSource.this.buffer.readByte() & UByte.MAX_VALUE;
                }
                throw new IOException("closed");
            }

            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                if (!RealBufferedSource.this.closed) {
                    Util.checkOffsetAndCount(bArr.length, i10, i11);
                    RealBufferedSource realBufferedSource = RealBufferedSource.this;
                    Buffer buffer = realBufferedSource.buffer;
                    if (buffer.size == 0 && realBufferedSource.source.read(buffer, 8192L) == -1) {
                        return -1;
                    }
                    return RealBufferedSource.this.buffer.read(bArr, i10, i11);
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
    public boolean rangeEquals(long j3, ByteString byteString) throws IOException {
        return rangeEquals(j3, byteString, 0, byteString.size());
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public long read(Buffer buffer, long j3) throws IOException {
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j3 >= 0) {
            if (!this.closed) {
                Buffer buffer2 = this.buffer;
                if (buffer2.size == 0 && this.source.read(buffer2, 8192L) == -1) {
                    return -1L;
                }
                return this.buffer.read(buffer, Math.min(j3, this.buffer.size));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(a.k("byteCount < 0: ", j3));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        if (sink != null) {
            long j3 = 0;
            while (this.source.read(this.buffer, 8192L) != -1) {
                long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
                if (completeSegmentByteCount > 0) {
                    j3 += completeSegmentByteCount;
                    sink.write(this.buffer, completeSegmentByteCount);
                }
            }
            if (this.buffer.size() > 0) {
                long size = j3 + this.buffer.size();
                Buffer buffer = this.buffer;
                sink.write(buffer, buffer.size());
                return size;
            }
            return j3;
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
        byte b3;
        require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            b3 = this.buffer.getByte(i10);
            if ((b3 < 48 || b3 > 57) && !(i10 == 0 && b3 == 45)) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(b3)));
        }
        return this.buffer.readDecimalLong();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void readFully(byte[] bArr) throws IOException {
        try {
            require(bArr.length);
            this.buffer.readFully(bArr);
        } catch (EOFException e2) {
            int i10 = 0;
            while (true) {
                Buffer buffer = this.buffer;
                long j3 = buffer.size;
                if (j3 > 0) {
                    int read = buffer.read(bArr, i10, (int) j3);
                    if (read == -1) {
                        throw new AssertionError();
                    }
                    i10 += read;
                } else {
                    throw e2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.require(r0)
            r0 = 0
            r1 = r0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.request(r3)
            if (r3 == 0) goto L4a
            com.mbridge.msdk.thrid.okio.Buffer r3 = r6.buffer
            long r4 = (long) r1
            byte r3 = r3.getByte(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            com.mbridge.msdk.thrid.okio.Buffer r0 = r6.buffer
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
        byte b3 = this.buffer.getByte(0L);
        if ((b3 & 224) == 192) {
            require(2L);
        } else if ((b3 & 240) == 224) {
            require(3L);
        } else if ((b3 & 248) == 240) {
            require(4L);
        }
        return this.buffer.readUtf8CodePoint();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws IOException {
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            long j3 = this.buffer.size;
            if (j3 != 0) {
                return readUtf8(j3);
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
    public boolean request(long j3) throws IOException {
        Buffer buffer;
        if (j3 >= 0) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            do {
                buffer = this.buffer;
                if (buffer.size >= j3) {
                    return true;
                }
            } while (this.source.read(buffer, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(a.k("byteCount < 0: ", j3));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void require(long j3) throws IOException {
        if (!request(j3)) {
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
    public void skip(long j3) throws IOException {
        if (!this.closed) {
            while (j3 > 0) {
                Buffer buffer = this.buffer;
                if (buffer.size == 0 && this.source.read(buffer, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j3, this.buffer.size());
                this.buffer.skip(min);
                j3 -= min;
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
    public long indexOf(byte b3, long j3) throws IOException {
        return indexOf(b3, j3, Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j3) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOfElement = this.buffer.indexOfElement(byteString, j3);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            Buffer buffer = this.buffer;
            long j10 = buffer.size;
            if (this.source.read(buffer, 8192L) == -1) {
                return -1L;
            }
            j3 = Math.max(j3, j10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean rangeEquals(long j3, ByteString byteString, int i10, int i11) throws IOException {
        if (!this.closed) {
            if (j3 < 0 || i10 < 0 || i11 < 0 || byteString.size() - i10 < i11) {
                return false;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                long j10 = i12 + j3;
                if (!request(1 + j10) || this.buffer.getByte(j10) != byteString.getByte(i10 + i12)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8LineStrict(long j3) throws IOException {
        if (j3 >= 0) {
            long j10 = j3 == Long.MAX_VALUE ? Long.MAX_VALUE : j3 + 1;
            long indexOf = indexOf((byte) 10, 0L, j10);
            if (indexOf != -1) {
                return this.buffer.readUtf8Line(indexOf);
            }
            if (j10 < Long.MAX_VALUE && request(j10) && this.buffer.getByte(j10 - 1) == 13 && request(1 + j10) && this.buffer.getByte(j10) == 10) {
                return this.buffer.readUtf8Line(j10);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = this.buffer;
            buffer2.copyTo(buffer, 0L, Math.min(32L, buffer2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.buffer.size(), j3) + " content=" + buffer.readByteString().hex() + Typography.ellipsis);
        }
        throw new IllegalArgumentException(a.k("limit < 0: ", j3));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b3, long j3, long j10) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j3 < 0 || j10 < j3) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j3), Long.valueOf(j10)));
        }
        while (j3 < j10) {
            long indexOf = this.buffer.indexOf(b3, j3, j10);
            if (indexOf == -1) {
                Buffer buffer = this.buffer;
                long j11 = buffer.size;
                if (j11 >= j10 || this.source.read(buffer, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j11);
            } else {
                return indexOf;
            }
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte[] readByteArray(long j3) throws IOException {
        require(j3);
        return this.buffer.readByteArray(j3);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public ByteString readByteString(long j3) throws IOException {
        require(j3);
        return this.buffer.readByteString(j3);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8(long j3) throws IOException {
        require(j3);
        return this.buffer.readUtf8(j3);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readString(long j3, Charset charset) throws IOException {
        require(j3);
        if (charset != null) {
            return this.buffer.readString(j3, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void readFully(Buffer buffer, long j3) throws IOException {
        try {
            require(j3);
            this.buffer.readFully(buffer, j3);
        } catch (EOFException e2) {
            buffer.writeAll(this.buffer);
            throw e2;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0L);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(ByteString byteString, long j3) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOf = this.buffer.indexOf(byteString, j3);
            if (indexOf != -1) {
                return indexOf;
            }
            Buffer buffer = this.buffer;
            long j10 = buffer.size;
            if (this.source.read(buffer, 8192L) == -1) {
                return -1L;
            }
            j3 = Math.max(j3, (j10 - byteString.size()) + 1);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        long j3 = i11;
        Util.checkOffsetAndCount(bArr.length, i10, j3);
        Buffer buffer = this.buffer;
        if (buffer.size == 0 && this.source.read(buffer, 8192L) == -1) {
            return -1;
        }
        return this.buffer.read(bArr, i10, (int) Math.min(j3, this.buffer.size));
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
