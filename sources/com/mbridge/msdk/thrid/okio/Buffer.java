package com.mbridge.msdk.thrid.okio;

import Q7.n0;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import y.AbstractC2933a;

/* loaded from: classes3.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    private static final byte[] DIGITS = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    static final int REPLACEMENT_CHARACTER = 65533;

    @Nullable
    Segment head;
    long size;

    /* loaded from: classes3.dex */
    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer != null) {
                this.buffer = null;
                this.segment = null;
                this.offset = -1L;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final long expandBuffer(int i9) {
            if (i9 > 0) {
                if (i9 <= 8192) {
                    Buffer buffer = this.buffer;
                    if (buffer != null) {
                        if (this.readWrite) {
                            long j7 = buffer.size;
                            Segment writableSegment = buffer.writableSegment(i9);
                            int i10 = 8192 - writableSegment.limit;
                            writableSegment.limit = FragmentTransaction.TRANSIT_EXIT_MASK;
                            long j9 = i10;
                            this.buffer.size = j7 + j9;
                            this.segment = writableSegment;
                            this.offset = j7;
                            this.data = writableSegment.data;
                            this.start = 8192 - i10;
                            this.end = FragmentTransaction.TRANSIT_EXIT_MASK;
                            return j9;
                        }
                        throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                    }
                    throw new IllegalStateException("not attached to a buffer");
                }
                throw new IllegalArgumentException(o.h(i9, "minByteCount > Segment.SIZE: "));
            }
            throw new IllegalArgumentException(o.h(i9, "minByteCount <= 0: "));
        }

        public final int next() {
            long j7 = this.offset;
            if (j7 != this.buffer.size) {
                if (j7 == -1) {
                    return seek(0L);
                }
                return seek(j7 + (this.end - this.start));
            }
            throw new IllegalStateException();
        }

        public final long resizeBuffer(long j7) {
            Buffer buffer = this.buffer;
            if (buffer != null) {
                if (this.readWrite) {
                    long j9 = buffer.size;
                    if (j7 <= j9) {
                        if (j7 >= 0) {
                            long j10 = j9 - j7;
                            while (true) {
                                if (j10 <= 0) {
                                    break;
                                }
                                Buffer buffer2 = this.buffer;
                                Segment segment = buffer2.head.prev;
                                int i9 = segment.limit;
                                long j11 = i9 - segment.pos;
                                if (j11 <= j10) {
                                    buffer2.head = segment.pop();
                                    SegmentPool.recycle(segment);
                                    j10 -= j11;
                                } else {
                                    segment.limit = (int) (i9 - j10);
                                    break;
                                }
                            }
                            this.segment = null;
                            this.offset = j7;
                            this.data = null;
                            this.start = -1;
                            this.end = -1;
                        } else {
                            throw new IllegalArgumentException(n0.g(j7, "newSize < 0: "));
                        }
                    } else if (j7 > j9) {
                        long j12 = j7 - j9;
                        boolean z8 = true;
                        while (j12 > 0) {
                            Segment writableSegment = this.buffer.writableSegment(1);
                            int min = (int) Math.min(j12, 8192 - writableSegment.limit);
                            int i10 = writableSegment.limit + min;
                            writableSegment.limit = i10;
                            j12 -= min;
                            if (z8) {
                                this.segment = writableSegment;
                                this.offset = j9;
                                this.data = writableSegment.data;
                                this.start = i10 - min;
                                this.end = i10;
                                z8 = false;
                            }
                        }
                    }
                    this.buffer.size = j7;
                    return j9;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final int seek(long j7) {
            if (j7 >= -1) {
                Buffer buffer = this.buffer;
                long j9 = buffer.size;
                if (j7 <= j9) {
                    if (j7 != -1 && j7 != j9) {
                        Segment segment = buffer.head;
                        Segment segment2 = this.segment;
                        long j10 = 0;
                        if (segment2 != null) {
                            long j11 = this.offset - (this.start - segment2.pos);
                            if (j11 > j7) {
                                j9 = j11;
                                segment2 = segment;
                                segment = segment2;
                            } else {
                                j10 = j11;
                            }
                        } else {
                            segment2 = segment;
                        }
                        if (j9 - j7 > j7 - j10) {
                            while (true) {
                                int i9 = segment2.limit;
                                int i10 = segment2.pos;
                                if (j7 < (i9 - i10) + j10) {
                                    break;
                                }
                                j10 += i9 - i10;
                                segment2 = segment2.next;
                            }
                        } else {
                            while (j9 > j7) {
                                segment = segment.prev;
                                j9 -= segment.limit - segment.pos;
                            }
                            segment2 = segment;
                            j10 = j9;
                        }
                        if (this.readWrite && segment2.shared) {
                            Segment unsharedCopy = segment2.unsharedCopy();
                            Buffer buffer2 = this.buffer;
                            if (buffer2.head == segment2) {
                                buffer2.head = unsharedCopy;
                            }
                            segment2 = segment2.push(unsharedCopy);
                            segment2.prev.pop();
                        }
                        this.segment = segment2;
                        this.offset = j7;
                        this.data = segment2.data;
                        int i11 = segment2.pos + ((int) (j7 - j10));
                        this.start = i11;
                        int i12 = segment2.limit;
                        this.end = i12;
                        return i12 - i11;
                    }
                    this.segment = null;
                    this.offset = j7;
                    this.data = null;
                    this.start = -1;
                    this.end = -1;
                    return -1;
                }
            }
            long j12 = this.buffer.size;
            StringBuilder a6 = AbstractC2933a.a("offset=", j7, " > size=");
            a6.append(j12);
            throw new ArrayIndexOutOfBoundsException(a6.toString());
        }
    }

    private ByteString digest(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i9 = segment.pos;
                messageDigest.update(bArr, i9, segment.limit - i9);
                Segment segment2 = this.head;
                while (true) {
                    segment2 = segment2.next;
                    if (segment2 == this.head) {
                        break;
                    }
                    byte[] bArr2 = segment2.data;
                    int i10 = segment2.pos;
                    messageDigest.update(bArr2, i10, segment2.limit - i10);
                }
            }
            return ByteString.of(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    private ByteString hmac(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i9 = segment.pos;
                mac.update(bArr, i9, segment.limit - i9);
                Segment segment2 = this.head;
                while (true) {
                    segment2 = segment2.next;
                    if (segment2 == this.head) {
                        break;
                    }
                    byte[] bArr2 = segment2.data;
                    int i10 = segment2.pos;
                    mac.update(bArr2, i10, segment2.limit - i10);
                }
            }
            return ByteString.of(mac.doFinal());
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource, com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer buffer() {
        return this;
    }

    public final void clear() {
        try {
            skip(this.size);
        } catch (EOFException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long j7 = this.size;
        if (j7 == 0) {
            return 0L;
        }
        Segment segment = this.head.prev;
        if (segment.limit < 8192 && segment.owner) {
            return j7 - (r3 - segment.pos);
        }
        return j7;
    }

    public final Buffer copyTo(OutputStream outputStream) throws IOException {
        return copyTo(outputStream, 0L, this.size);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink emit() {
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        long j7 = this.size;
        if (j7 != buffer.size) {
            return false;
        }
        long j9 = 0;
        if (j7 == 0) {
            return true;
        }
        Segment segment = this.head;
        Segment segment2 = buffer.head;
        int i9 = segment.pos;
        int i10 = segment2.pos;
        while (j9 < this.size) {
            long min = Math.min(segment.limit - i9, segment2.limit - i10);
            int i11 = 0;
            while (i11 < min) {
                int i12 = i9 + 1;
                int i13 = i10 + 1;
                if (segment.data[i9] != segment2.data[i10]) {
                    return false;
                }
                i11++;
                i9 = i12;
                i10 = i13;
            }
            if (i9 == segment.limit) {
                segment = segment.next;
                i9 = segment.pos;
            }
            if (i10 == segment2.limit) {
                segment2 = segment2.next;
                i10 = segment2.pos;
            }
            j9 += min;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean exhausted() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink, com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
    public void flush() {
    }

    public final byte getByte(long j7) {
        int i9;
        Util.checkOffsetAndCount(this.size, j7, 1L);
        long j9 = this.size;
        if (j9 - j7 > j7) {
            Segment segment = this.head;
            while (true) {
                int i10 = segment.limit;
                int i11 = segment.pos;
                long j10 = i10 - i11;
                if (j7 < j10) {
                    return segment.data[i11 + ((int) j7)];
                }
                j7 -= j10;
                segment = segment.next;
            }
        } else {
            long j11 = j7 - j9;
            Segment segment2 = this.head;
            do {
                segment2 = segment2.prev;
                int i12 = segment2.limit;
                i9 = segment2.pos;
                j11 += i12 - i9;
            } while (j11 < 0);
            return segment2.data[i9 + ((int) j11)];
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i9 = 1;
        do {
            int i10 = segment.limit;
            for (int i11 = segment.pos; i11 < i10; i11++) {
                i9 = (i9 * 31) + segment.data[i11];
            }
            segment = segment.next;
        } while (segment != this.head);
        return i9;
    }

    public final ByteString hmacSha1(ByteString byteString) {
        return hmac("HmacSHA1", byteString);
    }

    public final ByteString hmacSha256(ByteString byteString) {
        return hmac("HmacSHA256", byteString);
    }

    public final ByteString hmacSha512(ByteString byteString) {
        return hmac("HmacSHA512", byteString);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOfElement(ByteString byteString) {
        return indexOfElement(byteString, 0L);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: com.mbridge.msdk.thrid.okio.Buffer.2
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                Buffer buffer = Buffer.this;
                if (buffer.size > 0) {
                    return buffer.readByte() & 255;
                }
                return -1;
            }

            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i9, int i10) {
                return Buffer.this.read(bArr, i9, i10);
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final ByteString md5() {
        return digest(SameMD5.TAG);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: com.mbridge.msdk.thrid.okio.Buffer.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i9) {
                Buffer.this.writeByte((int) ((byte) i9));
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i9, int i10) {
                Buffer.this.write(bArr, i9, i10);
            }
        };
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean rangeEquals(long j7, ByteString byteString) {
        return rangeEquals(j7, byteString, 0, byteString.size());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        long j7 = this.size;
        if (j7 > 0) {
            sink.write(this, j7);
        }
        return j7;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe(new UnsafeCursor());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte readByte() {
        long j7 = this.size;
        if (j7 != 0) {
            Segment segment = this.head;
            int i9 = segment.pos;
            int i10 = segment.limit;
            int i11 = i9 + 1;
            byte b = segment.data[i9];
            this.size = j7 - 1;
            if (i11 == i10) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i11;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte[] readByteArray() {
        try {
            return readByteArray(this.size);
        } catch (EOFException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public ByteString readByteString() {
        return new ByteString(readByteArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6 A[EDGE_INSN: B:46:0x00a6->B:40:0x00a6 BREAK  A[LOOP:0: B:4:0x000f->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() {
        /*
            r15 = this;
            long r0 = r15.size
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        Lf:
            com.mbridge.msdk.thrid.okio.Segment r7 = r15.head
            byte[] r8 = r7.data
            int r9 = r7.pos
            int r10 = r7.limit
        L17:
            if (r9 >= r10) goto L92
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L66
            r12 = 57
            if (r11 > r12) goto L66
            int r12 = 48 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L3c
            if (r13 != 0) goto L36
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L36
            goto L3c
        L36:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L71
        L3c:
            com.mbridge.msdk.thrid.okio.Buffer r0 = new com.mbridge.msdk.thrid.okio.Buffer
            r0.<init>()
            com.mbridge.msdk.thrid.okio.Buffer r0 = r0.writeDecimalLong(r3)
            com.mbridge.msdk.thrid.okio.Buffer r0 = r0.writeByte(r11)
            if (r1 != 0) goto L4e
            r0.readByte()
        L4e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L66:
            r12 = 45
            r13 = 1
            if (r11 != r12) goto L76
            if (r0 != 0) goto L76
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L71:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L17
        L76:
            if (r0 == 0) goto L7a
            r2 = r13
            goto L92
        L7a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L92:
            if (r9 != r10) goto L9e
            com.mbridge.msdk.thrid.okio.Segment r8 = r7.pop()
            r15.head = r8
            com.mbridge.msdk.thrid.okio.SegmentPool.recycle(r7)
            goto La0
        L9e:
            r7.pos = r9
        La0:
            if (r2 != 0) goto La6
            com.mbridge.msdk.thrid.okio.Segment r7 = r15.head
            if (r7 != 0) goto Lf
        La6:
            long r5 = r15.size
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.size = r5
            if (r1 == 0) goto Laf
            goto Lb0
        Laf:
            long r3 = -r3
        Lb0:
            return r3
        Lb1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.Buffer.readDecimalLong():long");
    }

    public final Buffer readFrom(InputStream inputStream) throws IOException {
        readFrom(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void readFully(Buffer buffer, long j7) throws EOFException {
        long j9 = this.size;
        if (j9 >= j7) {
            buffer.write(this, j7);
        } else {
            buffer.write(this, j9);
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c A[EDGE_INSN: B:40:0x009c->B:37:0x009c BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() {
        /*
            r14 = this;
            long r0 = r14.size
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La3
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            com.mbridge.msdk.thrid.okio.Segment r6 = r14.head
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L13:
            if (r8 >= r9) goto L88
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L37
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-87)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L6c
            r11 = 70
            if (r10 > r11) goto L6c
            int r11 = r10 + (-55)
        L37:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L47
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L47:
            com.mbridge.msdk.thrid.okio.Buffer r0 = new com.mbridge.msdk.thrid.okio.Buffer
            r0.<init>()
            com.mbridge.msdk.thrid.okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            com.mbridge.msdk.thrid.okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6c:
            if (r0 == 0) goto L70
            r1 = 1
            goto L88
        L70:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L88:
            if (r8 != r9) goto L94
            com.mbridge.msdk.thrid.okio.Segment r7 = r6.pop()
            r14.head = r7
            com.mbridge.msdk.thrid.okio.SegmentPool.recycle(r6)
            goto L96
        L94:
            r6.pos = r8
        L96:
            if (r1 != 0) goto L9c
            com.mbridge.msdk.thrid.okio.Segment r6 = r14.head
            if (r6 != 0) goto Lb
        L9c:
            long r1 = r14.size
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.size = r1
            return r4
        La3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readInt() {
        long j7 = this.size;
        if (j7 >= 4) {
            Segment segment = this.head;
            int i9 = segment.pos;
            int i10 = segment.limit;
            if (i10 - i9 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = segment.data;
            int i11 = i9 + 3;
            int i12 = ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 2] & 255) << 8);
            int i13 = i9 + 4;
            int i14 = (bArr[i11] & 255) | i12;
            this.size = j7 - 4;
            if (i13 == i10) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i13;
            }
            return i14;
        }
        throw new IllegalStateException("size < 4: " + this.size);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readIntLe() {
        return Util.reverseBytesInt(readInt());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readLong() {
        long j7 = this.size;
        if (j7 >= 8) {
            Segment segment = this.head;
            int i9 = segment.pos;
            int i10 = segment.limit;
            if (i10 - i9 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = segment.data;
            int i11 = i9 + 7;
            long j9 = ((bArr[i9 + 1] & 255) << 48) | ((bArr[i9] & 255) << 56) | ((bArr[i9 + 2] & 255) << 40) | ((bArr[i9 + 3] & 255) << 32) | ((bArr[i9 + 4] & 255) << 24) | ((bArr[i9 + 5] & 255) << 16) | ((bArr[i9 + 6] & 255) << 8);
            int i12 = i9 + 8;
            long j10 = j9 | (bArr[i11] & 255);
            this.size = j7 - 8;
            if (i12 == i10) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i12;
            }
            return j10;
        }
        throw new IllegalStateException("size < 8: " + this.size);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readLongLe() {
        return Util.reverseBytesLong(readLong());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public short readShort() {
        long j7 = this.size;
        if (j7 >= 2) {
            Segment segment = this.head;
            int i9 = segment.pos;
            int i10 = segment.limit;
            if (i10 - i9 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = segment.data;
            int i11 = i9 + 1;
            int i12 = (bArr[i9] & 255) << 8;
            int i13 = i9 + 2;
            int i14 = (bArr[i11] & 255) | i12;
            this.size = j7 - 2;
            if (i13 == i10) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i13;
            }
            return (short) i14;
        }
        throw new IllegalStateException("size < 2: " + this.size);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public short readShortLe() {
        return Util.reverseBytesShort(readShort());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readString(Charset charset) {
        try {
            return readString(this.size, charset);
        } catch (EOFException e4) {
            throw new AssertionError(e4);
        }
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe(new UnsafeCursor());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8() {
        try {
            return readString(this.size, Util.UTF_8);
        } catch (EOFException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i9;
        int i10;
        int i11;
        if (this.size != 0) {
            byte b = getByte(0L);
            if ((b & 128) == 0) {
                i9 = b & Ascii.DEL;
                i11 = 0;
                i10 = 1;
            } else if ((b & 224) == 192) {
                i9 = b & Ascii.US;
                i10 = 2;
                i11 = 128;
            } else if ((b & 240) == 224) {
                i9 = b & Ascii.SI;
                i10 = 3;
                i11 = 2048;
            } else if ((b & 248) == 240) {
                i9 = b & 7;
                i10 = 4;
                i11 = 65536;
            } else {
                skip(1L);
                return REPLACEMENT_CHARACTER;
            }
            long j7 = i10;
            if (this.size >= j7) {
                for (int i12 = 1; i12 < i10; i12++) {
                    long j9 = i12;
                    byte b8 = getByte(j9);
                    if ((b8 & 192) == 128) {
                        i9 = (i9 << 6) | (b8 & 63);
                    } else {
                        skip(j9);
                        return REPLACEMENT_CHARACTER;
                    }
                }
                skip(j7);
                if (i9 > 1114111) {
                    return REPLACEMENT_CHARACTER;
                }
                if ((i9 >= 55296 && i9 <= 57343) || i9 < i11) {
                    return REPLACEMENT_CHARACTER;
                }
                return i9;
            }
            StringBuilder p2 = n0.p(i10, "size < ", ": ");
            p2.append(this.size);
            p2.append(" (to read code point prefixed 0x");
            p2.append(Integer.toHexString(b));
            p2.append(")");
            throw new EOFException(p2.toString());
        }
        throw new EOFException();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            long j7 = this.size;
            if (j7 != 0) {
                return readUtf8(j7);
            }
            return null;
        }
        return readUtf8Line(indexOf);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean request(long j7) {
        if (this.size >= j7) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void require(long j7) throws EOFException {
        if (this.size >= j7) {
        } else {
            throw new EOFException();
        }
    }

    public List<Integer> segmentSizes() {
        if (this.head == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Segment segment = this.head;
        arrayList.add(Integer.valueOf(segment.limit - segment.pos));
        Segment segment2 = this.head;
        while (true) {
            segment2 = segment2.next;
            if (segment2 != this.head) {
                arrayList.add(Integer.valueOf(segment2.limit - segment2.pos));
            } else {
                return arrayList;
            }
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int select(Options options) {
        int selectPrefix = selectPrefix(options, false);
        if (selectPrefix == -1) {
            return -1;
        }
        try {
            skip(options.byteStrings[selectPrefix].size());
            return selectPrefix;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        if (r19 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int selectPrefix(com.mbridge.msdk.thrid.okio.Options r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.Buffer.selectPrefix(com.mbridge.msdk.thrid.okio.Options, boolean):int");
    }

    public final ByteString sha1() {
        return digest("SHA-1");
    }

    public final ByteString sha256() {
        return digest(Constants.SHA256);
    }

    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void skip(long j7) throws EOFException {
        while (j7 > 0) {
            if (this.head != null) {
                int min = (int) Math.min(j7, r0.limit - r0.pos);
                long j9 = min;
                this.size -= j9;
                j7 -= j9;
                Segment segment = this.head;
                int i9 = segment.pos + min;
                segment.pos = i9;
                if (i9 == segment.limit) {
                    this.head = segment.pop();
                    SegmentPool.recycle(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final ByteString snapshot() {
        long j7 = this.size;
        if (j7 <= 2147483647L) {
            return snapshot((int) j7);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.size);
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    public Segment writableSegment(int i9) {
        if (i9 >= 1 && i9 <= 8192) {
            Segment segment = this.head;
            if (segment == null) {
                Segment take = SegmentPool.take();
                this.head = take;
                take.prev = take;
                take.next = take;
                return take;
            }
            Segment segment2 = segment.prev;
            if (segment2.limit + i9 > 8192 || !segment2.owner) {
                return segment2.push(SegmentPool.take());
            }
            return segment2;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        if (source != null) {
            long j7 = 0;
            while (true) {
                long read = source.read(this, 8192L);
                if (read != -1) {
                    j7 += read;
                } else {
                    return j7;
                }
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final Buffer writeTo(OutputStream outputStream) throws IOException {
        return writeTo(outputStream, this.size);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Buffer m4clone() {
        Buffer buffer = new Buffer();
        if (this.size == 0) {
            return buffer;
        }
        Segment sharedCopy = this.head.sharedCopy();
        buffer.head = sharedCopy;
        sharedCopy.prev = sharedCopy;
        sharedCopy.next = sharedCopy;
        Segment segment = this.head;
        while (true) {
            segment = segment.next;
            if (segment != this.head) {
                buffer.head.prev.push(segment.sharedCopy());
            } else {
                buffer.size = this.size;
                return buffer;
            }
        }
    }

    public final Buffer copyTo(OutputStream outputStream, long j7, long j9) throws IOException {
        if (outputStream != null) {
            Util.checkOffsetAndCount(this.size, j7, j9);
            if (j9 == 0) {
                return this;
            }
            Segment segment = this.head;
            while (true) {
                int i9 = segment.limit;
                int i10 = segment.pos;
                if (j7 < i9 - i10) {
                    break;
                }
                j7 -= i9 - i10;
                segment = segment.next;
            }
            while (j9 > 0) {
                int min = (int) Math.min(segment.limit - r9, j9);
                outputStream.write(segment.data, (int) (segment.pos + j7), min);
                j9 -= min;
                segment = segment.next;
                j7 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b, long j7) {
        return indexOf(b, j7, Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j7) {
        int i9;
        int i10;
        long j9 = 0;
        if (j7 >= 0) {
            Segment segment = this.head;
            if (segment == null) {
                return -1L;
            }
            long j10 = this.size;
            if (j10 - j7 < j7) {
                while (j10 > j7) {
                    segment = segment.prev;
                    j10 -= segment.limit - segment.pos;
                }
            } else {
                while (true) {
                    long j11 = (segment.limit - segment.pos) + j9;
                    if (j11 >= j7) {
                        break;
                    }
                    segment = segment.next;
                    j9 = j11;
                }
                j10 = j9;
            }
            if (byteString.size() == 2) {
                byte b = byteString.getByte(0);
                byte b8 = byteString.getByte(1);
                while (j10 < this.size) {
                    byte[] bArr = segment.data;
                    i9 = (int) ((segment.pos + j7) - j10);
                    int i11 = segment.limit;
                    while (i9 < i11) {
                        byte b9 = bArr[i9];
                        if (b9 == b || b9 == b8) {
                            i10 = segment.pos;
                            return (i9 - i10) + j10;
                        }
                        i9++;
                    }
                    j10 += segment.limit - segment.pos;
                    segment = segment.next;
                    j7 = j10;
                }
                return -1L;
            }
            byte[] internalArray = byteString.internalArray();
            while (j10 < this.size) {
                byte[] bArr2 = segment.data;
                i9 = (int) ((segment.pos + j7) - j10);
                int i12 = segment.limit;
                while (i9 < i12) {
                    byte b10 = bArr2[i9];
                    for (byte b11 : internalArray) {
                        if (b10 == b11) {
                            i10 = segment.pos;
                            return (i9 - i10) + j10;
                        }
                    }
                    i9++;
                }
                j10 += segment.limit - segment.pos;
                segment = segment.next;
                j7 = j10;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean rangeEquals(long j7, ByteString byteString, int i9, int i10) {
        if (j7 < 0 || i9 < 0 || i10 < 0 || this.size - j7 < i10 || byteString.size() - i9 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (getByte(i11 + j7) != byteString.getByte(i9 + i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int read(byte[] bArr, int i9, int i10) {
        Util.checkOffsetAndCount(bArr.length, i9, i10);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i10, segment.limit - segment.pos);
        System.arraycopy(segment.data, segment.pos, bArr, i9, min);
        int i11 = segment.pos + min;
        segment.pos = i11;
        this.size -= min;
        if (i11 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public ByteString readByteString(long j7) throws EOFException {
        return new ByteString(readByteArray(j7));
    }

    public final Buffer readFrom(InputStream inputStream, long j7) throws IOException {
        if (j7 >= 0) {
            readFrom(inputStream, j7, false);
            return this;
        }
        throw new IllegalArgumentException(n0.g(j7, "byteCount < 0: "));
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = false;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8LineStrict(long j7) throws EOFException {
        if (j7 >= 0) {
            long j9 = j7 != Long.MAX_VALUE ? j7 + 1 : Long.MAX_VALUE;
            long indexOf = indexOf((byte) 10, 0L, j9);
            if (indexOf != -1) {
                return readUtf8Line(indexOf);
            }
            if (j9 < size() && getByte(j9 - 1) == 13 && getByte(j9) == 10) {
                return readUtf8Line(j9);
            }
            Buffer buffer = new Buffer();
            copyTo(buffer, 0L, Math.min(32L, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j7) + " content=" + buffer.readByteString().hex() + (char) 8230);
        }
        throw new IllegalArgumentException(n0.g(j7, "limit < 0: "));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeByte(int i9) {
        Segment writableSegment = writableSegment(1);
        byte[] bArr = writableSegment.data;
        int i10 = writableSegment.limit;
        writableSegment.limit = i10 + 1;
        bArr[i10] = (byte) i9;
        this.size++;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeDecimalLong(long j7) {
        boolean z8;
        if (j7 == 0) {
            return writeByte(48);
        }
        int i9 = 1;
        if (j7 < 0) {
            j7 = -j7;
            if (j7 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z8 = true;
        } else {
            z8 = false;
        }
        if (j7 >= 100000000) {
            i9 = j7 < 1000000000000L ? j7 < 10000000000L ? j7 < C.NANOS_PER_SECOND ? 9 : 10 : j7 < 100000000000L ? 11 : 12 : j7 < 1000000000000000L ? j7 < 10000000000000L ? 13 : j7 < 100000000000000L ? 14 : 15 : j7 < 100000000000000000L ? j7 < 10000000000000000L ? 16 : 17 : j7 < 1000000000000000000L ? 18 : 19;
        } else if (j7 >= 10000) {
            i9 = j7 < 1000000 ? j7 < 100000 ? 5 : 6 : j7 < 10000000 ? 7 : 8;
        } else if (j7 >= 100) {
            i9 = j7 < 1000 ? 3 : 4;
        } else if (j7 >= 10) {
            i9 = 2;
        }
        if (z8) {
            i9++;
        }
        Segment writableSegment = writableSegment(i9);
        byte[] bArr = writableSegment.data;
        int i10 = writableSegment.limit + i9;
        while (j7 != 0) {
            i10--;
            bArr[i10] = DIGITS[(int) (j7 % 10)];
            j7 /= 10;
        }
        if (z8) {
            bArr[i10 - 1] = 45;
        }
        writableSegment.limit += i9;
        this.size += i9;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long j7) {
        if (j7 == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j7)) / 4) + 1;
        Segment writableSegment = writableSegment(numberOfTrailingZeros);
        byte[] bArr = writableSegment.data;
        int i9 = writableSegment.limit;
        for (int i10 = (i9 + numberOfTrailingZeros) - 1; i10 >= i9; i10--) {
            bArr[i10] = DIGITS[(int) (15 & j7)];
            j7 >>>= 4;
        }
        writableSegment.limit += numberOfTrailingZeros;
        this.size += numberOfTrailingZeros;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeInt(int i9) {
        Segment writableSegment = writableSegment(4);
        byte[] bArr = writableSegment.data;
        int i10 = writableSegment.limit;
        bArr[i10] = (byte) ((i9 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i9 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i9 & 255);
        writableSegment.limit = i10 + 4;
        this.size += 4;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeIntLe(int i9) {
        return writeInt(Util.reverseBytesInt(i9));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeLong(long j7) {
        Segment writableSegment = writableSegment(8);
        byte[] bArr = writableSegment.data;
        int i9 = writableSegment.limit;
        bArr[i9] = (byte) ((j7 >>> 56) & 255);
        bArr[i9 + 1] = (byte) ((j7 >>> 48) & 255);
        bArr[i9 + 2] = (byte) ((j7 >>> 40) & 255);
        bArr[i9 + 3] = (byte) ((j7 >>> 32) & 255);
        bArr[i9 + 4] = (byte) ((j7 >>> 24) & 255);
        bArr[i9 + 5] = (byte) ((j7 >>> 16) & 255);
        bArr[i9 + 6] = (byte) ((j7 >>> 8) & 255);
        bArr[i9 + 7] = (byte) (j7 & 255);
        writableSegment.limit = i9 + 8;
        this.size += 8;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeLongLe(long j7) {
        return writeLong(Util.reverseBytesLong(j7));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeShort(int i9) {
        Segment writableSegment = writableSegment(2);
        byte[] bArr = writableSegment.data;
        int i10 = writableSegment.limit;
        bArr[i10] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i9 & 255);
        writableSegment.limit = i10 + 2;
        this.size += 2;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeShortLe(int i9) {
        return writeShort((int) Util.reverseBytesShort((short) i9));
    }

    public final Buffer writeTo(OutputStream outputStream, long j7) throws IOException {
        if (outputStream != null) {
            Util.checkOffsetAndCount(this.size, 0L, j7);
            Segment segment = this.head;
            while (j7 > 0) {
                int min = (int) Math.min(j7, segment.limit - segment.pos);
                outputStream.write(segment.data, segment.pos, min);
                int i9 = segment.pos + min;
                segment.pos = i9;
                long j9 = min;
                this.size -= j9;
                j7 -= j9;
                if (i9 == segment.limit) {
                    Segment pop = segment.pop();
                    this.head = pop;
                    SegmentPool.recycle(segment);
                    segment = pop;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeUtf8CodePoint(int i9) {
        if (i9 < 128) {
            writeByte(i9);
        } else if (i9 < 2048) {
            writeByte((i9 >> 6) | PsExtractor.AUDIO_STREAM);
            writeByte((i9 & 63) | 128);
        } else if (i9 < 65536) {
            if (i9 >= 55296 && i9 <= 57343) {
                writeByte(63);
            } else {
                writeByte((i9 >> 12) | 224);
                writeByte(((i9 >> 6) & 63) | 128);
                writeByte((i9 & 63) | 128);
            }
        } else if (i9 <= 1114111) {
            writeByte((i9 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            writeByte(((i9 >> 12) & 63) | 128);
            writeByte(((i9 >> 6) & 63) | 128);
            writeByte((i9 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i9));
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b, long j7, long j9) {
        Segment segment;
        long j10 = j7;
        long j11 = j9;
        long j12 = 0;
        if (j10 >= 0 && j11 >= j10) {
            long j13 = this.size;
            if (j11 > j13) {
                j11 = j13;
            }
            if (j10 == j11 || (segment = this.head) == null) {
                return -1L;
            }
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    segment = segment.prev;
                    j13 -= segment.limit - segment.pos;
                }
            } else {
                while (true) {
                    long j14 = (segment.limit - segment.pos) + j12;
                    if (j14 >= j10) {
                        break;
                    }
                    segment = segment.next;
                    j12 = j14;
                }
                j13 = j12;
            }
            while (j13 < j11) {
                byte[] bArr = segment.data;
                int min = (int) Math.min(segment.limit, (segment.pos + j11) - j13);
                for (int i9 = (int) ((segment.pos + j10) - j13); i9 < min; i9++) {
                    if (bArr[i9] == b) {
                        return (i9 - segment.pos) + j13;
                    }
                }
                j13 += segment.limit - segment.pos;
                segment = segment.next;
                j10 = j13;
            }
            return -1L;
        }
        StringBuilder a6 = AbstractC2933a.a("size=", this.size, " fromIndex=");
        a6.append(j10);
        a6.append(" toIndex=");
        a6.append(j11);
        throw new IllegalArgumentException(a6.toString());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte[] readByteArray(long j7) throws EOFException {
        Util.checkOffsetAndCount(this.size, 0L, j7);
        if (j7 <= 2147483647L) {
            byte[] bArr = new byte[(int) j7];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(n0.g(j7, "byteCount > Integer.MAX_VALUE: "));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readString(long j7, Charset charset) throws EOFException {
        Util.checkOffsetAndCount(this.size, 0L, j7);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j7 > 2147483647L) {
            throw new IllegalArgumentException(n0.g(j7, "byteCount > Integer.MAX_VALUE: "));
        }
        if (j7 == 0) {
            return "";
        }
        Segment segment = this.head;
        int i9 = segment.pos;
        if (i9 + j7 > segment.limit) {
            return new String(readByteArray(j7), charset);
        }
        String str = new String(segment.data, i9, (int) j7, charset);
        int i10 = (int) (segment.pos + j7);
        segment.pos = i10;
        this.size -= j7;
        if (i10 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8(long j7) throws EOFException {
        return readString(j7, Util.UTF_8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeString(String str, Charset charset) {
        return writeString(str, 0, str.length(), charset);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeUtf8(String str) {
        return writeUtf8(str, 0, str.length());
    }

    public String readUtf8Line(long j7) throws EOFException {
        if (j7 > 0) {
            long j9 = j7 - 1;
            if (getByte(j9) == 13) {
                String readUtf8 = readUtf8(j9);
                skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = readUtf8(j7);
        skip(1L);
        return readUtf82;
    }

    public final ByteString snapshot(int i9) {
        if (i9 == 0) {
            return ByteString.EMPTY;
        }
        return new SegmentedByteString(this, i9);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer write(ByteString byteString) {
        if (byteString != null) {
            byteString.write(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeString(String str, int i9, int i10, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i9 < 0) {
            throw new IllegalAccessError(o.h(i9, "beginIndex < 0: "));
        }
        if (i10 >= i9) {
            if (i10 > str.length()) {
                StringBuilder p2 = n0.p(i10, "endIndex > string.length: ", " > ");
                p2.append(str.length());
                throw new IllegalArgumentException(p2.toString());
            }
            if (charset != null) {
                if (charset.equals(Util.UTF_8)) {
                    return writeUtf8(str, i9, i10);
                }
                byte[] bytes = str.substring(i9, i10).getBytes(charset);
                return write(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(n0.e(i10, i9, "endIndex < beginIndex: ", " < "));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeUtf8(String str, int i9, int i10) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException(o.h(i9, "beginIndex < 0: "));
        }
        if (i10 >= i9) {
            if (i10 > str.length()) {
                StringBuilder p2 = n0.p(i10, "endIndex > string.length: ", " > ");
                p2.append(str.length());
                throw new IllegalArgumentException(p2.toString());
            }
            while (i9 < i10) {
                char charAt = str.charAt(i9);
                if (charAt < 128) {
                    Segment writableSegment = writableSegment(1);
                    byte[] bArr = writableSegment.data;
                    int i11 = writableSegment.limit - i9;
                    int min = Math.min(i10, 8192 - i11);
                    int i12 = i9 + 1;
                    bArr[i9 + i11] = (byte) charAt;
                    while (i12 < min) {
                        char charAt2 = str.charAt(i12);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i12 + i11] = (byte) charAt2;
                        i12++;
                    }
                    int i13 = writableSegment.limit;
                    int i14 = (i11 + i12) - i13;
                    writableSegment.limit = i13 + i14;
                    this.size += i14;
                    i9 = i12;
                } else {
                    if (charAt < 2048) {
                        writeByte((charAt >> 6) | PsExtractor.AUDIO_STREAM);
                        writeByte((charAt & '?') | 128);
                    } else if (charAt >= 55296 && charAt <= 57343) {
                        int i15 = i9 + 1;
                        char charAt3 = i15 < i10 ? str.charAt(i15) : (char) 0;
                        if (charAt <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                            int i16 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                            writeByte((i16 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            writeByte(((i16 >> 12) & 63) | 128);
                            writeByte(((i16 >> 6) & 63) | 128);
                            writeByte((i16 & 63) | 128);
                            i9 += 2;
                        } else {
                            writeByte(63);
                            i9 = i15;
                        }
                    } else {
                        writeByte((charAt >> '\f') | 224);
                        writeByte(((charAt >> 6) & 63) | 128);
                        writeByte((charAt & '?') | 128);
                    }
                    i9++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(n0.e(i10, i9, "endIndex < beginIndex: ", " < "));
    }

    private boolean rangeEquals(Segment segment, int i9, ByteString byteString, int i10, int i11) {
        int i12 = segment.limit;
        byte[] bArr = segment.data;
        while (i10 < i11) {
            if (i9 == i12) {
                segment = segment.next;
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i9 = segment.pos;
                i12 = segment.limit;
            }
            if (bArr[i9] != byteString.getByte(i10)) {
                return false;
            }
            i9++;
            i10++;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void readFully(byte[] bArr) throws EOFException {
        int i9 = 0;
        while (i9 < bArr.length) {
            int read = read(bArr, i9, bArr.length - i9);
            if (read == -1) {
                throw new EOFException();
            }
            i9 += read;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer write(byte[] bArr, int i9, int i10) {
        if (bArr != null) {
            long j7 = i10;
            Util.checkOffsetAndCount(bArr.length, i9, j7);
            int i11 = i10 + i9;
            while (i9 < i11) {
                Segment writableSegment = writableSegment(1);
                int min = Math.min(i11 - i9, 8192 - writableSegment.limit);
                System.arraycopy(bArr, i9, writableSegment.data, writableSegment.limit, min);
                i9 += min;
                writableSegment.limit += min;
            }
            this.size += j7;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void readFrom(InputStream inputStream, long j7, boolean z8) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j7 <= 0 && !z8) {
                return;
            }
            Segment writableSegment = writableSegment(1);
            int read = inputStream.read(writableSegment.data, writableSegment.limit, (int) Math.min(j7, 8192 - writableSegment.limit));
            if (read == -1) {
                if (!z8) {
                    throw new EOFException();
                }
                return;
            } else {
                writableSegment.limit += read;
                long j9 = read;
                this.size += j9;
                j7 -= j9;
            }
        }
    }

    public final Buffer copyTo(Buffer buffer, long j7, long j9) {
        if (buffer != null) {
            Util.checkOffsetAndCount(this.size, j7, j9);
            if (j9 == 0) {
                return this;
            }
            buffer.size += j9;
            Segment segment = this.head;
            while (true) {
                int i9 = segment.limit;
                int i10 = segment.pos;
                if (j7 < i9 - i10) {
                    break;
                }
                j7 -= i9 - i10;
                segment = segment.next;
            }
            while (j9 > 0) {
                Segment sharedCopy = segment.sharedCopy();
                int i11 = (int) (sharedCopy.pos + j7);
                sharedCopy.pos = i11;
                sharedCopy.limit = Math.min(i11 + ((int) j9), sharedCopy.limit);
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    buffer.head = sharedCopy;
                } else {
                    segment2.prev.push(sharedCopy);
                }
                j9 -= sharedCopy.limit - sharedCopy.pos;
                segment = segment.next;
                j7 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, min);
        int i9 = segment.pos + min;
        segment.pos = i9;
        this.size -= min;
        if (i9 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i9 = remaining;
            while (i9 > 0) {
                Segment writableSegment = writableSegment(1);
                int min = Math.min(i9, 8192 - writableSegment.limit);
                byteBuffer.get(writableSegment.data, writableSegment.limit, min);
                i9 -= min;
                writableSegment.limit += min;
            }
            this.size += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public long read(Buffer buffer, long j7) {
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j7 >= 0) {
            long j9 = this.size;
            if (j9 == 0) {
                return -1L;
            }
            if (j7 > j9) {
                j7 = j9;
            }
            buffer.write(this, j7);
            return j7;
        }
        throw new IllegalArgumentException(n0.g(j7, "byteCount < 0: "));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink write(Source source, long j7) throws IOException {
        while (j7 > 0) {
            long read = source.read(this, j7);
            if (read == -1) {
                throw new EOFException();
            }
            j7 -= read;
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public void write(Buffer buffer, long j7) {
        if (buffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (buffer != this) {
            Util.checkOffsetAndCount(buffer.size, 0L, j7);
            while (j7 > 0) {
                Segment segment = buffer.head;
                if (j7 < segment.limit - segment.pos) {
                    Segment segment2 = this.head;
                    Segment segment3 = segment2 != null ? segment2.prev : null;
                    if (segment3 != null && segment3.owner) {
                        if ((segment3.limit + j7) - (segment3.shared ? 0 : segment3.pos) <= 8192) {
                            segment.writeTo(segment3, (int) j7);
                            buffer.size -= j7;
                            this.size += j7;
                            return;
                        }
                    }
                    buffer.head = segment.split((int) j7);
                }
                Segment segment4 = buffer.head;
                long j9 = segment4.limit - segment4.pos;
                buffer.head = segment4.pop();
                Segment segment5 = this.head;
                if (segment5 == null) {
                    this.head = segment4;
                    segment4.prev = segment4;
                    segment4.next = segment4;
                } else {
                    segment5.prev.push(segment4).compact();
                }
                buffer.size -= j9;
                this.size += j9;
                j7 -= j9;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0L);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(ByteString byteString, long j7) throws IOException {
        byte[] bArr;
        if (byteString.size() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j9 = 0;
        if (j7 >= 0) {
            Segment segment = this.head;
            long j10 = -1;
            if (segment == null) {
                return -1L;
            }
            long j11 = this.size;
            if (j11 - j7 < j7) {
                while (j11 > j7) {
                    segment = segment.prev;
                    j11 -= segment.limit - segment.pos;
                }
            } else {
                while (true) {
                    long j12 = (segment.limit - segment.pos) + j9;
                    if (j12 >= j7) {
                        break;
                    }
                    segment = segment.next;
                    j9 = j12;
                }
                j11 = j9;
            }
            byte b = byteString.getByte(0);
            int size = byteString.size();
            long j13 = 1 + (this.size - size);
            long j14 = j7;
            Segment segment2 = segment;
            long j15 = j11;
            while (j15 < j13) {
                byte[] bArr2 = segment2.data;
                int min = (int) Math.min(segment2.limit, (segment2.pos + j13) - j15);
                int i9 = (int) ((segment2.pos + j14) - j15);
                while (i9 < min) {
                    if (bArr2[i9] == b) {
                        bArr = bArr2;
                        if (rangeEquals(segment2, i9 + 1, byteString, 1, size)) {
                            return (i9 - segment2.pos) + j15;
                        }
                    } else {
                        bArr = bArr2;
                    }
                    i9++;
                    bArr2 = bArr;
                }
                j15 += segment2.limit - segment2.pos;
                segment2 = segment2.next;
                j14 = j15;
                j10 = -1;
            }
            return j10;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }
}
