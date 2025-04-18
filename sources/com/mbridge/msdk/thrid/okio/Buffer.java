package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import eb.j;
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
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlin.text.Typography;

/* loaded from: classes4.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    private static final byte[] DIGITS = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    static final int REPLACEMENT_CHARACTER = 65533;

    @Nullable
    Segment head;
    long size;

    /* loaded from: classes4.dex */
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

        public final long expandBuffer(int i10) {
            if (i10 > 0) {
                if (i10 <= 8192) {
                    Buffer buffer = this.buffer;
                    if (buffer != null) {
                        if (this.readWrite) {
                            long j3 = buffer.size;
                            Segment writableSegment = buffer.writableSegment(i10);
                            int i11 = 8192 - writableSegment.limit;
                            writableSegment.limit = 8192;
                            long j10 = i11;
                            this.buffer.size = j3 + j10;
                            this.segment = writableSegment;
                            this.offset = j3;
                            this.data = writableSegment.data;
                            this.start = 8192 - i11;
                            this.end = 8192;
                            return j10;
                        }
                        throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                    }
                    throw new IllegalStateException("not attached to a buffer");
                }
                throw new IllegalArgumentException(j.i("minByteCount > Segment.SIZE: ", i10));
            }
            throw new IllegalArgumentException(j.i("minByteCount <= 0: ", i10));
        }

        public final int next() {
            long j3 = this.offset;
            if (j3 != this.buffer.size) {
                if (j3 == -1) {
                    return seek(0L);
                }
                return seek(j3 + (this.end - this.start));
            }
            throw new IllegalStateException();
        }

        public final long resizeBuffer(long j3) {
            Buffer buffer = this.buffer;
            if (buffer != null) {
                if (this.readWrite) {
                    long j10 = buffer.size;
                    if (j3 <= j10) {
                        if (j3 >= 0) {
                            long j11 = j10 - j3;
                            while (true) {
                                if (j11 <= 0) {
                                    break;
                                }
                                Buffer buffer2 = this.buffer;
                                Segment segment = buffer2.head.prev;
                                int i10 = segment.limit;
                                long j12 = i10 - segment.pos;
                                if (j12 <= j11) {
                                    buffer2.head = segment.pop();
                                    SegmentPool.recycle(segment);
                                    j11 -= j12;
                                } else {
                                    segment.limit = (int) (i10 - j11);
                                    break;
                                }
                            }
                            this.segment = null;
                            this.offset = j3;
                            this.data = null;
                            this.start = -1;
                            this.end = -1;
                        } else {
                            throw new IllegalArgumentException(a.k("newSize < 0: ", j3));
                        }
                    } else if (j3 > j10) {
                        long j13 = j3 - j10;
                        boolean z10 = true;
                        while (j13 > 0) {
                            Segment writableSegment = this.buffer.writableSegment(1);
                            int min = (int) Math.min(j13, 8192 - writableSegment.limit);
                            int i11 = writableSegment.limit + min;
                            writableSegment.limit = i11;
                            j13 -= min;
                            if (z10) {
                                this.segment = writableSegment;
                                this.offset = j10;
                                this.data = writableSegment.data;
                                this.start = i11 - min;
                                this.end = i11;
                                z10 = false;
                            }
                        }
                    }
                    this.buffer.size = j3;
                    return j10;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final int seek(long j3) {
            if (j3 >= -1) {
                Buffer buffer = this.buffer;
                long j10 = buffer.size;
                if (j3 <= j10) {
                    if (j3 != -1 && j3 != j10) {
                        Segment segment = buffer.head;
                        Segment segment2 = this.segment;
                        long j11 = 0;
                        if (segment2 != null) {
                            long j12 = this.offset - (this.start - segment2.pos);
                            if (j12 > j3) {
                                j10 = j12;
                                segment2 = segment;
                                segment = segment2;
                            } else {
                                j11 = j12;
                            }
                        } else {
                            segment2 = segment;
                        }
                        if (j10 - j3 > j3 - j11) {
                            while (true) {
                                int i10 = segment2.limit;
                                int i11 = segment2.pos;
                                if (j3 < (i10 - i11) + j11) {
                                    break;
                                }
                                j11 += i10 - i11;
                                segment2 = segment2.next;
                            }
                        } else {
                            while (j10 > j3) {
                                segment = segment.prev;
                                j10 -= segment.limit - segment.pos;
                            }
                            segment2 = segment;
                            j11 = j10;
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
                        this.offset = j3;
                        this.data = segment2.data;
                        int i12 = segment2.pos + ((int) (j3 - j11));
                        this.start = i12;
                        int i13 = segment2.limit;
                        this.end = i13;
                        return i13 - i12;
                    }
                    this.segment = null;
                    this.offset = j3;
                    this.data = null;
                    this.start = -1;
                    this.end = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j3), Long.valueOf(this.buffer.size)));
        }
    }

    private ByteString digest(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i10 = segment.pos;
                messageDigest.update(bArr, i10, segment.limit - i10);
                Segment segment2 = this.head;
                while (true) {
                    segment2 = segment2.next;
                    if (segment2 == this.head) {
                        break;
                    }
                    byte[] bArr2 = segment2.data;
                    int i11 = segment2.pos;
                    messageDigest.update(bArr2, i11, segment2.limit - i11);
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
                int i10 = segment.pos;
                mac.update(bArr, i10, segment.limit - i10);
                Segment segment2 = this.head;
                while (true) {
                    segment2 = segment2.next;
                    if (segment2 == this.head) {
                        break;
                    }
                    byte[] bArr2 = segment2.data;
                    int i11 = segment2.pos;
                    mac.update(bArr2, i11, segment2.limit - i11);
                }
            }
            return ByteString.of(mac.doFinal());
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
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
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long j3 = this.size;
        if (j3 == 0) {
            return 0L;
        }
        Segment segment = this.head.prev;
        if (segment.limit < 8192 && segment.owner) {
            return j3 - (r3 - segment.pos);
        }
        return j3;
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
        long j3 = this.size;
        if (j3 != buffer.size) {
            return false;
        }
        long j10 = 0;
        if (j3 == 0) {
            return true;
        }
        Segment segment = this.head;
        Segment segment2 = buffer.head;
        int i10 = segment.pos;
        int i11 = segment2.pos;
        while (j10 < this.size) {
            long min = Math.min(segment.limit - i10, segment2.limit - i11);
            int i12 = 0;
            while (i12 < min) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (segment.data[i10] != segment2.data[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == segment.limit) {
                segment = segment.next;
                i10 = segment.pos;
            }
            if (i11 == segment2.limit) {
                segment2 = segment2.next;
                i11 = segment2.pos;
            }
            j10 += min;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink, com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
    public void flush() {
    }

    public final byte getByte(long j3) {
        int i10;
        Util.checkOffsetAndCount(this.size, j3, 1L);
        long j10 = this.size;
        if (j10 - j3 > j3) {
            Segment segment = this.head;
            while (true) {
                int i11 = segment.limit;
                int i12 = segment.pos;
                long j11 = i11 - i12;
                if (j3 < j11) {
                    return segment.data[i12 + ((int) j3)];
                }
                j3 -= j11;
                segment = segment.next;
            }
        } else {
            long j12 = j3 - j10;
            Segment segment2 = this.head;
            do {
                segment2 = segment2.prev;
                int i13 = segment2.limit;
                i10 = segment2.pos;
                j12 += i13 - i10;
            } while (j12 < 0);
            return segment2.data[i10 + ((int) j12)];
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = segment.limit;
            for (int i12 = segment.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + segment.data[i12];
            }
            segment = segment.next;
        } while (segment != this.head);
        return i10;
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
    public long indexOf(byte b3) {
        return indexOf(b3, 0L, Long.MAX_VALUE);
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
                    return buffer.readByte() & UByte.MAX_VALUE;
                }
                return -1;
            }

            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) {
                return Buffer.this.read(bArr, i10, i11);
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
            public void write(int i10) {
                Buffer.this.writeByte((int) ((byte) i10));
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                Buffer.this.write(bArr, i10, i11);
            }
        };
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean rangeEquals(long j3, ByteString byteString) {
        return rangeEquals(j3, byteString, 0, byteString.size());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        long j3 = this.size;
        if (j3 > 0) {
            sink.write(this, j3);
        }
        return j3;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe(new UnsafeCursor());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte readByte() {
        long j3 = this.size;
        if (j3 != 0) {
            Segment segment = this.head;
            int i10 = segment.pos;
            int i11 = segment.limit;
            int i12 = i10 + 1;
            byte b3 = segment.data[i10];
            this.size = j3 - 1;
            if (i12 == i11) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i12;
            }
            return b3;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte[] readByteArray() {
        try {
            return readByteArray(this.size);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
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
    public void readFully(Buffer buffer, long j3) throws EOFException {
        long j10 = this.size;
        if (j10 >= j3) {
            buffer.write(this, j3);
        } else {
            buffer.write(this, j10);
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[EDGE_INSN: B:41:0x009f->B:38:0x009f BREAK  A[LOOP:0: B:4:0x000b->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
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
            if (r0 == 0) goto La6
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            com.mbridge.msdk.thrid.okio.Segment r6 = r14.head
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L13:
            if (r8 >= r9) goto L8b
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L6f
            r11 = 70
            if (r10 > r11) goto L6f
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
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
        L6f:
            if (r0 == 0) goto L73
            r1 = 1
            goto L8b
        L73:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8b:
            if (r8 != r9) goto L97
            com.mbridge.msdk.thrid.okio.Segment r7 = r6.pop()
            r14.head = r7
            com.mbridge.msdk.thrid.okio.SegmentPool.recycle(r6)
            goto L99
        L97:
            r6.pos = r8
        L99:
            if (r1 != 0) goto L9f
            com.mbridge.msdk.thrid.okio.Segment r6 = r14.head
            if (r6 != 0) goto Lb
        L9f:
            long r1 = r14.size
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.size = r1
            return r4
        La6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readInt() {
        long j3 = this.size;
        if (j3 >= 4) {
            Segment segment = this.head;
            int i10 = segment.pos;
            int i11 = segment.limit;
            if (i11 - i10 < 4) {
                return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
            }
            byte[] bArr = segment.data;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i12] & UByte.MAX_VALUE) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & UByte.MAX_VALUE) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & UByte.MAX_VALUE);
            this.size = j3 - 4;
            if (i17 == i11) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i17;
            }
            return i18;
        }
        throw new IllegalStateException("size < 4: " + this.size);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readIntLe() {
        return Util.reverseBytesInt(readInt());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readLong() {
        long j3 = this.size;
        if (j3 >= 8) {
            Segment segment = this.head;
            int i10 = segment.pos;
            int i11 = segment.limit;
            if (i11 - i10 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = segment.data;
            long j10 = (bArr[i10] & 255) << 56;
            long j11 = ((bArr[r11] & 255) << 48) | j10;
            long j12 = j11 | ((bArr[r6] & 255) << 40);
            long j13 = j12 | ((bArr[r11] & 255) << 32) | ((bArr[r6] & 255) << 24);
            long j14 = j13 | ((bArr[r9] & 255) << 16);
            long j15 = j14 | ((bArr[r6] & 255) << 8);
            int i12 = i10 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
            long j16 = j15 | (bArr[r9] & 255);
            this.size = j3 - 8;
            if (i12 == i11) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i12;
            }
            return j16;
        }
        throw new IllegalStateException("size < 8: " + this.size);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readLongLe() {
        return Util.reverseBytesLong(readLong());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public short readShort() {
        long j3 = this.size;
        if (j3 >= 2) {
            Segment segment = this.head;
            int i10 = segment.pos;
            int i11 = segment.limit;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
            }
            byte[] bArr = segment.data;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & UByte.MAX_VALUE) << 8) | (bArr[i12] & UByte.MAX_VALUE);
            this.size = j3 - 2;
            if (i13 == i11) {
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
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe(new UnsafeCursor());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8() {
        try {
            return readString(this.size, Util.UTF_8);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (this.size != 0) {
            byte b3 = getByte(0L);
            if ((b3 & ByteCompanionObject.MIN_VALUE) == 0) {
                i10 = b3 & Byte.MAX_VALUE;
                i12 = 0;
                i11 = 1;
            } else if ((b3 & 224) == 192) {
                i10 = b3 & Ascii.US;
                i11 = 2;
                i12 = 128;
            } else if ((b3 & 240) == 224) {
                i10 = b3 & Ascii.SI;
                i11 = 3;
                i12 = 2048;
            } else if ((b3 & 248) == 240) {
                i10 = b3 & 7;
                i11 = 4;
                i12 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
            } else {
                skip(1L);
                return REPLACEMENT_CHARACTER;
            }
            long j3 = i11;
            if (this.size >= j3) {
                for (int i13 = 1; i13 < i11; i13++) {
                    long j10 = i13;
                    byte b10 = getByte(j10);
                    if ((b10 & 192) == 128) {
                        i10 = (i10 << 6) | (b10 & 63);
                    } else {
                        skip(j10);
                        return REPLACEMENT_CHARACTER;
                    }
                }
                skip(j3);
                if (i10 > 1114111) {
                    return REPLACEMENT_CHARACTER;
                }
                if ((i10 >= 55296 && i10 <= 57343) || i10 < i12) {
                    return REPLACEMENT_CHARACTER;
                }
                return i10;
            }
            StringBuilder m10 = a4.j.m("size < ", i11, ": ");
            m10.append(this.size);
            m10.append(" (to read code point prefixed 0x");
            m10.append(Integer.toHexString(b3));
            m10.append(")");
            throw new EOFException(m10.toString());
        }
        throw new EOFException();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            long j3 = this.size;
            if (j3 != 0) {
                return readUtf8(j3);
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
    public boolean request(long j3) {
        return this.size >= j3;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void require(long j3) throws EOFException {
        if (this.size < j3) {
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
            Method dump skipped, instructions count: 161
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
    public void skip(long j3) throws EOFException {
        while (j3 > 0) {
            if (this.head != null) {
                int min = (int) Math.min(j3, r0.limit - r0.pos);
                long j10 = min;
                this.size -= j10;
                j3 -= j10;
                Segment segment = this.head;
                int i10 = segment.pos + min;
                segment.pos = i10;
                if (i10 == segment.limit) {
                    this.head = segment.pop();
                    SegmentPool.recycle(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final ByteString snapshot() {
        long j3 = this.size;
        if (j3 <= 2147483647L) {
            return snapshot((int) j3);
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

    public Segment writableSegment(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            Segment segment = this.head;
            if (segment == null) {
                Segment take = SegmentPool.take();
                this.head = take;
                take.prev = take;
                take.next = take;
                return take;
            }
            Segment segment2 = segment.prev;
            if (segment2.limit + i10 > 8192 || !segment2.owner) {
                return segment2.push(SegmentPool.take());
            }
            return segment2;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        if (source != null) {
            long j3 = 0;
            while (true) {
                long read = source.read(this, 8192L);
                if (read != -1) {
                    j3 += read;
                } else {
                    return j3;
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
    public Buffer m7clone() {
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

    public final Buffer copyTo(OutputStream outputStream, long j3, long j10) throws IOException {
        if (outputStream != null) {
            Util.checkOffsetAndCount(this.size, j3, j10);
            if (j10 == 0) {
                return this;
            }
            Segment segment = this.head;
            while (true) {
                int i10 = segment.limit;
                int i11 = segment.pos;
                if (j3 < i10 - i11) {
                    break;
                }
                j3 -= i10 - i11;
                segment = segment.next;
            }
            while (j10 > 0) {
                int min = (int) Math.min(segment.limit - r9, j10);
                outputStream.write(segment.data, (int) (segment.pos + j3), min);
                j10 -= min;
                segment = segment.next;
                j3 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b3, long j3) {
        return indexOf(b3, j3, Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j3) {
        int i10;
        int i11;
        long j10 = 0;
        if (j3 >= 0) {
            Segment segment = this.head;
            if (segment == null) {
                return -1L;
            }
            long j11 = this.size;
            if (j11 - j3 < j3) {
                while (j11 > j3) {
                    segment = segment.prev;
                    j11 -= segment.limit - segment.pos;
                }
            } else {
                while (true) {
                    long j12 = (segment.limit - segment.pos) + j10;
                    if (j12 >= j3) {
                        break;
                    }
                    segment = segment.next;
                    j10 = j12;
                }
                j11 = j10;
            }
            if (byteString.size() == 2) {
                byte b3 = byteString.getByte(0);
                byte b10 = byteString.getByte(1);
                while (j11 < this.size) {
                    byte[] bArr = segment.data;
                    i10 = (int) ((segment.pos + j3) - j11);
                    int i12 = segment.limit;
                    while (i10 < i12) {
                        byte b11 = bArr[i10];
                        if (b11 == b3 || b11 == b10) {
                            i11 = segment.pos;
                            return (i10 - i11) + j11;
                        }
                        i10++;
                    }
                    j11 += segment.limit - segment.pos;
                    segment = segment.next;
                    j3 = j11;
                }
                return -1L;
            }
            byte[] internalArray = byteString.internalArray();
            while (j11 < this.size) {
                byte[] bArr2 = segment.data;
                i10 = (int) ((segment.pos + j3) - j11);
                int i13 = segment.limit;
                while (i10 < i13) {
                    byte b12 = bArr2[i10];
                    for (byte b13 : internalArray) {
                        if (b12 == b13) {
                            i11 = segment.pos;
                            return (i10 - i11) + j11;
                        }
                    }
                    i10++;
                }
                j11 += segment.limit - segment.pos;
                segment = segment.next;
                j3 = j11;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean rangeEquals(long j3, ByteString byteString, int i10, int i11) {
        if (j3 < 0 || i10 < 0 || i11 < 0 || this.size - j3 < i11 || byteString.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (getByte(i12 + j3) != byteString.getByte(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int read(byte[] bArr, int i10, int i11) {
        Util.checkOffsetAndCount(bArr.length, i10, i11);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i11, segment.limit - segment.pos);
        System.arraycopy(segment.data, segment.pos, bArr, i10, min);
        int i12 = segment.pos + min;
        segment.pos = i12;
        this.size -= min;
        if (i12 == segment.limit) {
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
    public ByteString readByteString(long j3) throws EOFException {
        return new ByteString(readByteArray(j3));
    }

    public final Buffer readFrom(InputStream inputStream, long j3) throws IOException {
        if (j3 >= 0) {
            readFrom(inputStream, j3, false);
            return this;
        }
        throw new IllegalArgumentException(a.k("byteCount < 0: ", j3));
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
    public String readUtf8LineStrict(long j3) throws EOFException {
        if (j3 >= 0) {
            long j10 = j3 != Long.MAX_VALUE ? j3 + 1 : Long.MAX_VALUE;
            long indexOf = indexOf((byte) 10, 0L, j10);
            if (indexOf != -1) {
                return readUtf8Line(indexOf);
            }
            if (j10 < size() && getByte(j10 - 1) == 13 && getByte(j10) == 10) {
                return readUtf8Line(j10);
            }
            Buffer buffer = new Buffer();
            copyTo(buffer, 0L, Math.min(32L, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j3) + " content=" + buffer.readByteString().hex() + Typography.ellipsis);
        }
        throw new IllegalArgumentException(a.k("limit < 0: ", j3));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeByte(int i10) {
        Segment writableSegment = writableSegment(1);
        byte[] bArr = writableSegment.data;
        int i11 = writableSegment.limit;
        writableSegment.limit = i11 + 1;
        bArr[i11] = (byte) i10;
        this.size++;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeDecimalLong(long j3) {
        boolean z10;
        if (j3 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j3 < 0) {
            j3 = -j3;
            if (j3 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j3 >= 100000000) {
            i10 = j3 < 1000000000000L ? j3 < 10000000000L ? j3 < C.NANOS_PER_SECOND ? 9 : 10 : j3 < 100000000000L ? 11 : 12 : j3 < 1000000000000000L ? j3 < 10000000000000L ? 13 : j3 < 100000000000000L ? 14 : 15 : j3 < 100000000000000000L ? j3 < 10000000000000000L ? 16 : 17 : j3 < 1000000000000000000L ? 18 : 19;
        } else if (j3 >= 10000) {
            i10 = j3 < 1000000 ? j3 < 100000 ? 5 : 6 : j3 < 10000000 ? 7 : 8;
        } else if (j3 >= 100) {
            i10 = j3 < 1000 ? 3 : 4;
        } else if (j3 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        Segment writableSegment = writableSegment(i10);
        byte[] bArr = writableSegment.data;
        int i11 = writableSegment.limit + i10;
        while (j3 != 0) {
            i11--;
            bArr[i11] = DIGITS[(int) (j3 % 10)];
            j3 /= 10;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        writableSegment.limit += i10;
        this.size += i10;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long j3) {
        if (j3 == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j3)) / 4) + 1;
        Segment writableSegment = writableSegment(numberOfTrailingZeros);
        byte[] bArr = writableSegment.data;
        int i10 = writableSegment.limit;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = DIGITS[(int) (15 & j3)];
            j3 >>>= 4;
        }
        writableSegment.limit += numberOfTrailingZeros;
        this.size += numberOfTrailingZeros;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeInt(int i10) {
        Segment writableSegment = writableSegment(4);
        byte[] bArr = writableSegment.data;
        int i11 = writableSegment.limit;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        writableSegment.limit = i14 + 1;
        this.size += 4;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeIntLe(int i10) {
        return writeInt(Util.reverseBytesInt(i10));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeLong(long j3) {
        Segment writableSegment = writableSegment(8);
        byte[] bArr = writableSegment.data;
        int i10 = writableSegment.limit;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j3 >>> 56) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j3 >>> 48) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j3 >>> 40) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j3 >>> 32) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((j3 >>> 24) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((j3 >>> 16) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((j3 >>> 8) & 255);
        bArr[i17] = (byte) (j3 & 255);
        writableSegment.limit = i17 + 1;
        this.size += 8;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeLongLe(long j3) {
        return writeLong(Util.reverseBytesLong(j3));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeShort(int i10) {
        Segment writableSegment = writableSegment(2);
        byte[] bArr = writableSegment.data;
        int i11 = writableSegment.limit;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        writableSegment.limit = i12 + 1;
        this.size += 2;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeShortLe(int i10) {
        return writeShort((int) Util.reverseBytesShort((short) i10));
    }

    public final Buffer writeTo(OutputStream outputStream, long j3) throws IOException {
        if (outputStream != null) {
            Util.checkOffsetAndCount(this.size, 0L, j3);
            Segment segment = this.head;
            while (j3 > 0) {
                int min = (int) Math.min(j3, segment.limit - segment.pos);
                outputStream.write(segment.data, segment.pos, min);
                int i10 = segment.pos + min;
                segment.pos = i10;
                long j10 = min;
                this.size -= j10;
                j3 -= j10;
                if (i10 == segment.limit) {
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
    public Buffer writeUtf8CodePoint(int i10) {
        if (i10 < 128) {
            writeByte(i10);
        } else if (i10 < 2048) {
            writeByte((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            writeByte((i10 & 63) | 128);
        } else if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                writeByte(63);
            } else {
                writeByte((i10 >> 12) | 224);
                writeByte(((i10 >> 6) & 63) | 128);
                writeByte((i10 & 63) | 128);
            }
        } else if (i10 <= 1114111) {
            writeByte((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            writeByte(((i10 >> 12) & 63) | 128);
            writeByte(((i10 >> 6) & 63) | 128);
            writeByte((i10 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b3, long j3, long j10) {
        Segment segment;
        long j11 = 0;
        if (j3 >= 0 && j10 >= j3) {
            long j12 = this.size;
            long j13 = j10 > j12 ? j12 : j10;
            if (j3 == j13 || (segment = this.head) == null) {
                return -1L;
            }
            if (j12 - j3 < j3) {
                while (j12 > j3) {
                    segment = segment.prev;
                    j12 -= segment.limit - segment.pos;
                }
            } else {
                while (true) {
                    long j14 = (segment.limit - segment.pos) + j11;
                    if (j14 >= j3) {
                        break;
                    }
                    segment = segment.next;
                    j11 = j14;
                }
                j12 = j11;
            }
            long j15 = j3;
            while (j12 < j13) {
                byte[] bArr = segment.data;
                int min = (int) Math.min(segment.limit, (segment.pos + j13) - j12);
                for (int i10 = (int) ((segment.pos + j15) - j12); i10 < min; i10++) {
                    if (bArr[i10] == b3) {
                        return (i10 - segment.pos) + j12;
                    }
                }
                j12 += segment.limit - segment.pos;
                segment = segment.next;
                j15 = j12;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.size), Long.valueOf(j3), Long.valueOf(j10)));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte[] readByteArray(long j3) throws EOFException {
        Util.checkOffsetAndCount(this.size, 0L, j3);
        if (j3 <= 2147483647L) {
            byte[] bArr = new byte[(int) j3];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(a.k("byteCount > Integer.MAX_VALUE: ", j3));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readString(long j3, Charset charset) throws EOFException {
        Util.checkOffsetAndCount(this.size, 0L, j3);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j3 > 2147483647L) {
            throw new IllegalArgumentException(a.k("byteCount > Integer.MAX_VALUE: ", j3));
        }
        if (j3 == 0) {
            return "";
        }
        Segment segment = this.head;
        int i10 = segment.pos;
        if (i10 + j3 > segment.limit) {
            return new String(readByteArray(j3), charset);
        }
        String str = new String(segment.data, i10, (int) j3, charset);
        int i11 = (int) (segment.pos + j3);
        segment.pos = i11;
        this.size -= j3;
        if (i11 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8(long j3) throws EOFException {
        return readString(j3, Util.UTF_8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeString(String str, Charset charset) {
        return writeString(str, 0, str.length(), charset);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeUtf8(String str) {
        return writeUtf8(str, 0, str.length());
    }

    public String readUtf8Line(long j3) throws EOFException {
        if (j3 > 0) {
            long j10 = j3 - 1;
            if (getByte(j10) == 13) {
                String readUtf8 = readUtf8(j10);
                skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = readUtf8(j3);
        skip(1L);
        return readUtf82;
    }

    public final ByteString snapshot(int i10) {
        if (i10 == 0) {
            return ByteString.EMPTY;
        }
        return new SegmentedByteString(this, i10);
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
    public Buffer writeString(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError(j.i("beginIndex < 0: ", i10));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder m10 = a4.j.m("endIndex > string.length: ", i11, " > ");
                m10.append(str.length());
                throw new IllegalArgumentException(m10.toString());
            }
            if (charset != null) {
                if (charset.equals(Util.UTF_8)) {
                    return writeUtf8(str, i10, i11);
                }
                byte[] bytes = str.substring(i10, i11).getBytes(charset);
                return write(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(a4.j.e("endIndex < beginIndex: ", i11, " < ", i10));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeUtf8(String str, int i10, int i11) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(j.i("beginIndex < 0: ", i10));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder m10 = a4.j.m("endIndex > string.length: ", i11, " > ");
                m10.append(str.length());
                throw new IllegalArgumentException(m10.toString());
            }
            while (i10 < i11) {
                char charAt2 = str.charAt(i10);
                if (charAt2 < 128) {
                    Segment writableSegment = writableSegment(1);
                    byte[] bArr = writableSegment.data;
                    int i12 = writableSegment.limit - i10;
                    int min = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) charAt;
                    }
                    int i14 = writableSegment.limit;
                    int i15 = (i12 + i10) - i14;
                    writableSegment.limit = i14 + i15;
                    this.size += i15;
                } else {
                    if (charAt2 < 2048) {
                        writeByte((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        writeByte((charAt2 & '?') | 128);
                    } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char charAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (charAt2 <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                            int i17 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            writeByte((i17 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            writeByte(((i17 >> 12) & 63) | 128);
                            writeByte(((i17 >> 6) & 63) | 128);
                            writeByte((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            writeByte(63);
                            i10 = i16;
                        }
                    } else {
                        writeByte((charAt2 >> '\f') | 224);
                        writeByte(((charAt2 >> 6) & 63) | 128);
                        writeByte((charAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(a4.j.e("endIndex < beginIndex: ", i11, " < ", i10));
    }

    private boolean rangeEquals(Segment segment, int i10, ByteString byteString, int i11, int i12) {
        int i13 = segment.limit;
        byte[] bArr = segment.data;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.next;
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i10 = segment.pos;
                i13 = segment.limit;
            }
            if (bArr[i10] != byteString.getByte(i11)) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
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
    public Buffer write(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j3 = i11;
            Util.checkOffsetAndCount(bArr.length, i10, j3);
            int i12 = i11 + i10;
            while (i10 < i12) {
                Segment writableSegment = writableSegment(1);
                int min = Math.min(i12 - i10, 8192 - writableSegment.limit);
                System.arraycopy(bArr, i10, writableSegment.data, writableSegment.limit, min);
                i10 += min;
                writableSegment.limit += min;
            }
            this.size += j3;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void readFrom(InputStream inputStream, long j3, boolean z10) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j3 <= 0 && !z10) {
                return;
            }
            Segment writableSegment = writableSegment(1);
            int read = inputStream.read(writableSegment.data, writableSegment.limit, (int) Math.min(j3, 8192 - writableSegment.limit));
            if (read == -1) {
                if (!z10) {
                    throw new EOFException();
                }
                return;
            } else {
                writableSegment.limit += read;
                long j10 = read;
                this.size += j10;
                j3 -= j10;
            }
        }
    }

    public final Buffer copyTo(Buffer buffer, long j3, long j10) {
        if (buffer != null) {
            Util.checkOffsetAndCount(this.size, j3, j10);
            if (j10 == 0) {
                return this;
            }
            buffer.size += j10;
            Segment segment = this.head;
            while (true) {
                int i10 = segment.limit;
                int i11 = segment.pos;
                if (j3 < i10 - i11) {
                    break;
                }
                j3 -= i10 - i11;
                segment = segment.next;
            }
            while (j10 > 0) {
                Segment sharedCopy = segment.sharedCopy();
                int i12 = (int) (sharedCopy.pos + j3);
                sharedCopy.pos = i12;
                sharedCopy.limit = Math.min(i12 + ((int) j10), sharedCopy.limit);
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    buffer.head = sharedCopy;
                } else {
                    segment2.prev.push(sharedCopy);
                }
                j10 -= sharedCopy.limit - sharedCopy.pos;
                segment = segment.next;
                j3 = 0;
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
        int i10 = segment.pos + min;
        segment.pos = i10;
        this.size -= min;
        if (i10 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                Segment writableSegment = writableSegment(1);
                int min = Math.min(i10, 8192 - writableSegment.limit);
                byteBuffer.get(writableSegment.data, writableSegment.limit, min);
                i10 -= min;
                writableSegment.limit += min;
            }
            this.size += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0L);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(ByteString byteString, long j3) throws IOException {
        byte[] bArr;
        if (byteString.size() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j10 = 0;
        if (j3 >= 0) {
            Segment segment = this.head;
            long j11 = -1;
            if (segment == null) {
                return -1L;
            }
            long j12 = this.size;
            if (j12 - j3 < j3) {
                while (j12 > j3) {
                    segment = segment.prev;
                    j12 -= segment.limit - segment.pos;
                }
            } else {
                while (true) {
                    long j13 = (segment.limit - segment.pos) + j10;
                    if (j13 >= j3) {
                        break;
                    }
                    segment = segment.next;
                    j10 = j13;
                }
                j12 = j10;
            }
            byte b3 = byteString.getByte(0);
            int size = byteString.size();
            long j14 = 1 + (this.size - size);
            long j15 = j3;
            Segment segment2 = segment;
            long j16 = j12;
            while (j16 < j14) {
                byte[] bArr2 = segment2.data;
                int min = (int) Math.min(segment2.limit, (segment2.pos + j14) - j16);
                int i10 = (int) ((segment2.pos + j15) - j16);
                while (i10 < min) {
                    if (bArr2[i10] == b3) {
                        bArr = bArr2;
                        if (rangeEquals(segment2, i10 + 1, byteString, 1, size)) {
                            return (i10 - segment2.pos) + j16;
                        }
                    } else {
                        bArr = bArr2;
                    }
                    i10++;
                    bArr2 = bArr;
                }
                j16 += segment2.limit - segment2.pos;
                segment2 = segment2.next;
                j15 = j16;
                j11 = -1;
            }
            return j11;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public long read(Buffer buffer, long j3) {
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j3 >= 0) {
            long j10 = this.size;
            if (j10 == 0) {
                return -1L;
            }
            if (j3 > j10) {
                j3 = j10;
            }
            buffer.write(this, j3);
            return j3;
        }
        throw new IllegalArgumentException(a.k("byteCount < 0: ", j3));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink write(Source source, long j3) throws IOException {
        while (j3 > 0) {
            long read = source.read(this, j3);
            if (read == -1) {
                throw new EOFException();
            }
            j3 -= read;
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public void write(Buffer buffer, long j3) {
        if (buffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (buffer != this) {
            Util.checkOffsetAndCount(buffer.size, 0L, j3);
            while (j3 > 0) {
                Segment segment = buffer.head;
                if (j3 < segment.limit - segment.pos) {
                    Segment segment2 = this.head;
                    Segment segment3 = segment2 != null ? segment2.prev : null;
                    if (segment3 != null && segment3.owner) {
                        if ((segment3.limit + j3) - (segment3.shared ? 0 : segment3.pos) <= 8192) {
                            segment.writeTo(segment3, (int) j3);
                            buffer.size -= j3;
                            this.size += j3;
                            return;
                        }
                    }
                    buffer.head = segment.split((int) j3);
                }
                Segment segment4 = buffer.head;
                long j10 = segment4.limit - segment4.pos;
                buffer.head = segment4.pop();
                Segment segment5 = this.head;
                if (segment5 == null) {
                    this.head = segment4;
                    segment4.prev = segment4;
                    segment4.next = segment4;
                } else {
                    segment5.prev.push(segment4).compact();
                }
                buffer.size -= j10;
                this.size += j10;
                j3 -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }
}
