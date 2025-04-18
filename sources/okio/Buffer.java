package okio;

import android.support.v4.media.d;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.api.Api;
import com.google.common.primitives.UnsignedBytes;
import e0.q;
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
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.connection.RealConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    @Nullable
    public Segment head;
    private long size;

    /* loaded from: classes.dex */
    public static final class UnsafeCursor implements Closeable {

        @Nullable
        public Buffer buffer;

        @Nullable
        public byte[] data;
        public boolean readWrite;

        @Nullable
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException(d.i("minByteCount <= 0: ", i2).toString());
            }
            if (i2 > 8192) {
                throw new IllegalArgumentException(d.i("minByteCount > Segment.SIZE: ", i2).toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            Segment writableSegment$okio = buffer.writableSegment$okio(i2);
            int i3 = 8192 - writableSegment$okio.limit;
            writableSegment$okio.limit = 8192;
            long j2 = i3;
            buffer.setSize$okio(size + j2);
            setSegment$okio(writableSegment$okio);
            this.offset = size;
            this.data = writableSegment$okio.data;
            this.start = 8192 - i3;
            this.end = 8192;
            return j2;
        }

        @Nullable
        public final Segment getSegment$okio() {
            return this.segment;
        }

        public final int next() {
            long j2 = this.offset;
            Buffer buffer = this.buffer;
            p0.a.p(buffer);
            if (j2 == buffer.size()) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j3 = this.offset;
            return seek(j3 == -1 ? 0L : j3 + (this.end - this.start));
        }

        public final long resizeBuffer(long j2) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            if (j2 <= size) {
                if (j2 < 0) {
                    throw new IllegalArgumentException(d.m("newSize < 0: ", j2).toString());
                }
                long j3 = size - j2;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    Segment segment = buffer.head;
                    p0.a.p(segment);
                    Segment segment2 = segment.prev;
                    p0.a.p(segment2);
                    int i2 = segment2.limit;
                    long j4 = i2 - segment2.pos;
                    if (j4 > j3) {
                        segment2.limit = i2 - ((int) j3);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j3 -= j4;
                }
                setSegment$okio(null);
                this.offset = j2;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j2 > size) {
                long j5 = j2 - size;
                boolean z2 = true;
                while (j5 > 0) {
                    Segment writableSegment$okio = buffer.writableSegment$okio(1);
                    int min = (int) Math.min(j5, 8192 - writableSegment$okio.limit);
                    writableSegment$okio.limit += min;
                    j5 -= min;
                    if (z2) {
                        setSegment$okio(writableSegment$okio);
                        this.offset = size;
                        this.data = writableSegment$okio.data;
                        int i3 = writableSegment$okio.limit;
                        this.start = i3 - min;
                        this.end = i3;
                        z2 = false;
                    }
                }
            }
            buffer.setSize$okio(j2);
            return size;
        }

        public final int seek(long j2) {
            Segment segment;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j2 < -1 || j2 > buffer.size()) {
                StringBuilder r2 = androidx.compose.foundation.text.input.a.r("offset=", j2, " > size=");
                r2.append(buffer.size());
                throw new ArrayIndexOutOfBoundsException(r2.toString());
            }
            if (j2 == -1 || j2 == buffer.size()) {
                setSegment$okio(null);
                this.offset = j2;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment2 = buffer.head;
            long j3 = 0;
            if (getSegment$okio() != null) {
                long j4 = this.offset;
                int i2 = this.start;
                p0.a.p(getSegment$okio());
                long j5 = j4 - (i2 - r9.pos);
                if (j5 > j2) {
                    segment = segment2;
                    segment2 = getSegment$okio();
                    size = j5;
                } else {
                    segment = getSegment$okio();
                    j3 = j5;
                }
            } else {
                segment = segment2;
            }
            if (size - j2 > j2 - j3) {
                while (true) {
                    p0.a.p(segment);
                    int i3 = segment.limit;
                    int i4 = segment.pos;
                    if (j2 < (i3 - i4) + j3) {
                        break;
                    }
                    j3 += i3 - i4;
                    segment = segment.next;
                }
            } else {
                while (size > j2) {
                    p0.a.p(segment2);
                    segment2 = segment2.prev;
                    p0.a.p(segment2);
                    size -= segment2.limit - segment2.pos;
                }
                j3 = size;
                segment = segment2;
            }
            if (this.readWrite) {
                p0.a.p(segment);
                if (segment.shared) {
                    Segment unsharedCopy = segment.unsharedCopy();
                    if (buffer.head == segment) {
                        buffer.head = unsharedCopy;
                    }
                    segment = segment.push(unsharedCopy);
                    Segment segment3 = segment.prev;
                    p0.a.p(segment3);
                    segment3.pop();
                }
            }
            setSegment$okio(segment);
            this.offset = j2;
            p0.a.p(segment);
            this.data = segment.data;
            int i5 = segment.pos + ((int) (j2 - j3));
            this.start = i5;
            int i6 = segment.limit;
            this.end = i6;
            return i6 - i5;
        }

        public final void setSegment$okio(@Nullable Segment segment) {
            this.segment = segment;
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j2, long j3, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            j3 = buffer.size - j4;
        }
        return buffer.copyTo(outputStream, j4, j3);
    }

    private final ByteString digest(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i2 = segment.pos;
            messageDigest.update(bArr, i2, segment.limit - i2);
            Segment segment2 = segment.next;
            p0.a.p(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i3 = segment2.pos;
                messageDigest.update(bArr2, i3, segment2.limit - i3);
                segment2 = segment2.next;
                p0.a.p(segment2);
            }
        }
        byte[] digest = messageDigest.digest();
        p0.a.r(digest, "digest(...)");
        return new ByteString(digest);
    }

    private final ByteString hmac(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i2 = segment.pos;
                mac.update(bArr, i2, segment.limit - i2);
                Segment segment2 = segment.next;
                p0.a.p(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i3 = segment2.pos;
                    mac.update(bArr2, i3, segment2.limit - i3);
                    segment2 = segment2.next;
                    p0.a.p(segment2);
                }
            }
            byte[] doFinal = mac.doFinal();
            p0.a.r(doFinal, "doFinal(...)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            j2 = buffer.size;
        }
        return buffer.writeTo(outputStream, j2);
    }

    @d0.a
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m765deprecated_getByte(long j2) {
        return getByte(j2);
    }

    @d0.a
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final long m766deprecated_size() {
        return this.size;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer buffer() {
        return this;
    }

    public final void clear() {
        skip(size());
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        p0.a.p(segment);
        Segment segment2 = segment.prev;
        p0.a.p(segment2);
        if (segment2.limit < 8192 && segment2.owner) {
            size -= r3 - segment2.pos;
        }
        return size;
    }

    @NotNull
    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
            p0.a.p(segment);
            Segment sharedCopy = segment.sharedCopy();
            buffer.head = sharedCopy;
            sharedCopy.prev = sharedCopy;
            sharedCopy.next = sharedCopy;
            for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
                Segment segment3 = sharedCopy.prev;
                p0.a.p(segment3);
                p0.a.p(segment2);
                segment3.push(segment2.sharedCopy());
            }
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream) throws IOException {
        p0.a.s(outputStream, "out");
        return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            if (size() == buffer.size()) {
                if (size() == 0) {
                    return true;
                }
                Segment segment = this.head;
                p0.a.p(segment);
                Segment segment2 = buffer.head;
                p0.a.p(segment2);
                int i2 = segment.pos;
                int i3 = segment2.pos;
                long j2 = 0;
                while (j2 < size()) {
                    long min = Math.min(segment.limit - i2, segment2.limit - i3);
                    long j3 = 0;
                    while (j3 < min) {
                        int i4 = i2 + 1;
                        int i5 = i3 + 1;
                        if (segment.data[i2] == segment2.data[i3]) {
                            j3++;
                            i2 = i4;
                            i3 = i5;
                        }
                    }
                    if (i2 == segment.limit) {
                        segment = segment.next;
                        p0.a.p(segment);
                        i2 = segment.pos;
                    }
                    if (i3 == segment2.limit) {
                        segment2 = segment2.next;
                        p0.a.p(segment2);
                        i3 = segment2.pos;
                    }
                    j2 += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this;
    }

    public final byte getByte(long j2) {
        SegmentedByteString.checkOffsetAndCount(size(), j2, 1L);
        Segment segment = this.head;
        if (segment == null) {
            p0.a.p(null);
            throw null;
        }
        if (size() - j2 < j2) {
            long size = size();
            while (size > j2) {
                segment = segment.prev;
                p0.a.p(segment);
                size -= segment.limit - segment.pos;
            }
            return segment.data[(int) ((segment.pos + j2) - size)];
        }
        long j3 = 0;
        while (true) {
            int i2 = segment.limit;
            int i3 = segment.pos;
            long j4 = (i2 - i3) + j3;
            if (j4 > j2) {
                return segment.data[(int) ((i3 + j2) - j3)];
            }
            segment = segment.next;
            p0.a.p(segment);
            j3 = j4;
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = segment.limit;
            for (int i4 = segment.pos; i4 < i3; i4++) {
                i2 = (i2 * 31) + segment.data[i4];
            }
            segment = segment.next;
            p0.a.p(segment);
        } while (segment != this.head);
        return i2;
    }

    @NotNull
    public final ByteString hmacSha1(@NotNull ByteString byteString) {
        p0.a.s(byteString, SDKConstants.PARAM_KEY);
        return hmac("HmacSHA1", byteString);
    }

    @NotNull
    public final ByteString hmacSha256(@NotNull ByteString byteString) {
        p0.a.s(byteString, SDKConstants.PARAM_KEY);
        return hmac("HmacSHA256", byteString);
    }

    @NotNull
    public final ByteString hmacSha512(@NotNull ByteString byteString) {
        p0.a.s(byteString, SDKConstants.PARAM_KEY);
        return hmac("HmacSHA512", byteString);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b2) {
        return indexOf(b2, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString byteString) {
        p0.a.s(byteString, "targetBytes");
        return indexOfElement(byteString, 0L);
    }

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer$inputStream$1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & UnsignedBytes.MAX_VALUE;
                }
                return -1;
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] bArr, int i2, int i3) {
                p0.a.s(bArr, "sink");
                return Buffer.this.read(bArr, i2, i3);
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @NotNull
    public final ByteString md5() {
        return digest("MD5");
    }

    @Override // okio.BufferedSink
    @NotNull
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer$outputStream$1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i2) {
                Buffer.this.writeByte(i2);
            }

            @Override // java.io.OutputStream
            public void write(@NotNull byte[] bArr, int i2, int i3) {
                p0.a.s(bArr, "data");
                Buffer.this.write(bArr, i2, i3);
            }
        };
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j2, @NotNull ByteString byteString) {
        p0.a.s(byteString, "bytes");
        return rangeEquals(j2, byteString, 0, byteString.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer byteBuffer) throws IOException {
        p0.a.s(byteBuffer, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, min);
        int i2 = segment.pos + min;
        segment.pos = i2;
        this.size -= min;
        if (i2 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    @Override // okio.BufferedSource
    public long readAll(@NotNull Sink sink) throws IOException {
        p0.a.s(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @NotNull
    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        p0.a.p(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        int i4 = i2 + 1;
        byte b2 = segment.data[i2];
        setSize$okio(size() - 1);
        if (i4 == i3) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return b2;
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString() {
        return readByteString(size());
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z2 = false;
        long j2 = 0;
        long j3 = -7;
        boolean z3 = false;
        do {
            Segment segment = this.head;
            p0.a.p(segment);
            byte[] bArr = segment.data;
            int i3 = segment.pos;
            int i4 = segment.limit;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    int i5 = 48 - b2;
                    if (j2 < okio.internal.Buffer.OVERFLOW_ZONE || (j2 == okio.internal.Buffer.OVERFLOW_ZONE && i5 < j3)) {
                        Buffer writeByte = new Buffer().writeDecimalLong(j2).writeByte((int) b2);
                        if (!z2) {
                            writeByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + writeByte.readUtf8());
                    }
                    j2 = (j2 * 10) + i5;
                } else {
                    if (b2 != 45 || i2 != 0) {
                        z3 = true;
                        break;
                    }
                    j3--;
                    z2 = true;
                }
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i3;
            }
            if (z3) {
                break;
            }
        } while (this.head != null);
        setSize$okio(size() - i2);
        if (i2 >= (z2 ? 2 : 1)) {
            return z2 ? j2 : -j2;
        }
        if (size() == 0) {
            throw new EOFException();
        }
        StringBuilder B = androidx.compose.foundation.text.input.a.B(z2 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        B.append(SegmentedByteString.toHexString(getByte(0L)));
        throw new NumberFormatException(B.toString());
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream inputStream) throws IOException {
        p0.a.s(inputStream, "input");
        readFrom(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull Buffer buffer, long j2) throws EOFException {
        p0.a.s(buffer, "sink");
        if (size() >= j2) {
            buffer.write(this, j2);
        } else {
            buffer.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[EDGE_INSN: B:40:0x00a1->B:37:0x00a1 BREAK  A[LOOP:0: B:4:0x000d->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lab
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.Segment r6 = r14.head
            p0.a.p(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L8d
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L71
            r11 = 70
            if (r10 > r11) goto L71
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L71:
            if (r0 == 0) goto L75
            r1 = 1
            goto L8d
        L75:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = okio.SegmentedByteString.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            if (r8 != r9) goto L99
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto L9b
        L99:
            r6.pos = r8
        L9b:
            if (r1 != 0) goto La1
            okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        La1:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lab:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        p0.a.p(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 4) {
            return ((readByte() & UnsignedBytes.MAX_VALUE) << 24) | ((readByte() & UnsignedBytes.MAX_VALUE) << 16) | ((readByte() & UnsignedBytes.MAX_VALUE) << 8) | (readByte() & UnsignedBytes.MAX_VALUE);
        }
        byte[] bArr = segment.data;
        int i4 = i2 + 3;
        int i5 = ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 8);
        int i6 = i2 + 4;
        int i7 = (bArr[i4] & UnsignedBytes.MAX_VALUE) | i5;
        setSize$okio(size() - 4);
        if (i6 == i3) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i6;
        }
        return i7;
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        Segment segment = this.head;
        p0.a.p(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = segment.data;
        int i4 = i2 + 7;
        long j2 = ((bArr[i2] & 255) << 56) | ((bArr[i2 + 1] & 255) << 48) | ((bArr[i2 + 2] & 255) << 40) | ((bArr[i2 + 3] & 255) << 32) | ((bArr[i2 + 4] & 255) << 24) | ((bArr[i2 + 5] & 255) << 16) | ((bArr[i2 + 6] & 255) << 8);
        int i5 = i2 + 8;
        long j3 = j2 | (bArr[i4] & 255);
        setSize$okio(size() - 8);
        if (i5 == i3) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i5;
        }
        return j3;
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        p0.a.p(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 2) {
            return (short) (((readByte() & UnsignedBytes.MAX_VALUE) << 8) | (readByte() & UnsignedBytes.MAX_VALUE));
        }
        byte[] bArr = segment.data;
        int i4 = i2 + 1;
        int i5 = (bArr[i2] & UnsignedBytes.MAX_VALUE) << 8;
        int i6 = i2 + 2;
        int i7 = (bArr[i4] & UnsignedBytes.MAX_VALUE) | i5;
        setSize$okio(size() - 2);
        if (i6 == i3) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i6;
        }
        return (short) i7;
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) {
        p0.a.s(charset, "charset");
        return readString(this.size, charset);
    }

    @NotNull
    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8() {
        return readString(this.size, z0.a.f31458a);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i2;
        int i3;
        int i4;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b2 = getByte(0L);
        if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
            i2 = b2 & Byte.MAX_VALUE;
            i4 = 0;
            i3 = 1;
        } else if ((b2 & 224) == 192) {
            i2 = b2 & 31;
            i3 = 2;
            i4 = 128;
        } else if ((b2 & 240) == 224) {
            i2 = b2 & 15;
            i3 = 3;
            i4 = Opcodes.ACC_STRICT;
        } else {
            if ((b2 & 248) != 240) {
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i2 = b2 & 7;
            i3 = 4;
            i4 = 65536;
        }
        long j2 = i3;
        if (size() < j2) {
            StringBuilder t2 = d.t("size < ", i3, ": ");
            t2.append(size());
            t2.append(" (to read code point prefixed 0x");
            t2.append(SegmentedByteString.toHexString(b2));
            t2.append(')');
            throw new EOFException(t2.toString());
        }
        for (int i5 = 1; i5 < i3; i5++) {
            long j3 = i5;
            byte b3 = getByte(j3);
            if ((b3 & 192) != 128) {
                skip(j3);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i2 = (i2 << 6) | (b3 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j2);
        return i2 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i2 || i2 >= 57344) && i2 >= i4) ? i2 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, indexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public boolean request(long j2) {
        return this.size >= j2;
    }

    @Override // okio.BufferedSource
    public void require(long j2) throws EOFException {
        if (this.size < j2) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(@NotNull Options options) {
        p0.a.s(options, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        int selectPrefix$default = okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public final void setSize$okio(long j2) {
        this.size = j2;
    }

    @NotNull
    public final ByteString sha1() {
        return digest("SHA-1");
    }

    @NotNull
    public final ByteString sha256() {
        return digest("SHA-256");
    }

    @NotNull
    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long j2) throws EOFException {
        while (j2 > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, segment.limit - segment.pos);
            long j3 = min;
            setSize$okio(size() - j3);
            j2 -= j3;
            int i2 = segment.pos + min;
            segment.pos = i2;
            if (i2 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @NotNull
    public String toString() {
        return snapshot().toString();
    }

    @NotNull
    public final Segment writableSegment$okio(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = this.head;
        if (segment != null) {
            p0.a.p(segment);
            Segment segment2 = segment.prev;
            p0.a.p(segment2);
            return (segment2.limit + i2 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment take = SegmentPool.take();
        this.head = take;
        take.prev = take;
        take.next = take;
        return take;
    }

    @Override // okio.BufferedSink
    public long writeAll(@NotNull Source source) throws IOException {
        p0.a.s(source, "source");
        long j2 = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read == -1) {
                return j2;
            }
            j2 += read;
        }
    }

    @NotNull
    public final Buffer writeTo(@NotNull OutputStream outputStream) throws IOException {
        p0.a.s(outputStream, "out");
        return writeTo$default(this, outputStream, 0L, 2, null);
    }

    @NotNull
    public Buffer clone() {
        return copy();
    }

    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream, long j2) throws IOException {
        p0.a.s(outputStream, "out");
        return copyTo$default(this, outputStream, j2, 0L, 4, (Object) null);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b2, long j2) {
        return indexOf(b2, j2, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString byteString, long j2) {
        int i2;
        int i3;
        p0.a.s(byteString, "targetBytes");
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(d.m("fromIndex < 0: ", j2).toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - j2 < j2) {
            j3 = size();
            while (j3 > j2) {
                segment = segment.prev;
                p0.a.p(segment);
                j3 -= segment.limit - segment.pos;
            }
            if (byteString.size() == 2) {
                byte b2 = byteString.getByte(0);
                byte b3 = byteString.getByte(1);
                while (j3 < size()) {
                    byte[] bArr = segment.data;
                    i2 = (int) ((segment.pos + j2) - j3);
                    int i4 = segment.limit;
                    while (i2 < i4) {
                        byte b4 = bArr[i2];
                        if (b4 != b2 && b4 != b3) {
                            i2++;
                        }
                        i3 = segment.pos;
                    }
                    j3 += segment.limit - segment.pos;
                    segment = segment.next;
                    p0.a.p(segment);
                    j2 = j3;
                }
                return -1L;
            }
            byte[] internalArray$okio = byteString.internalArray$okio();
            while (j3 < size()) {
                byte[] bArr2 = segment.data;
                i2 = (int) ((segment.pos + j2) - j3);
                int i5 = segment.limit;
                while (i2 < i5) {
                    byte b5 = bArr2[i2];
                    for (byte b6 : internalArray$okio) {
                        if (b5 == b6) {
                            i3 = segment.pos;
                        }
                    }
                    i2++;
                }
                j3 += segment.limit - segment.pos;
                segment = segment.next;
                p0.a.p(segment);
                j2 = j3;
            }
            return -1L;
        }
        while (true) {
            long j4 = (segment.limit - segment.pos) + j3;
            if (j4 > j2) {
                break;
            }
            segment = segment.next;
            p0.a.p(segment);
            j3 = j4;
        }
        if (byteString.size() == 2) {
            byte b7 = byteString.getByte(0);
            byte b8 = byteString.getByte(1);
            while (j3 < size()) {
                byte[] bArr3 = segment.data;
                i2 = (int) ((segment.pos + j2) - j3);
                int i6 = segment.limit;
                while (i2 < i6) {
                    byte b9 = bArr3[i2];
                    if (b9 != b7 && b9 != b8) {
                        i2++;
                    }
                    i3 = segment.pos;
                }
                j3 += segment.limit - segment.pos;
                segment = segment.next;
                p0.a.p(segment);
                j2 = j3;
            }
            return -1L;
        }
        byte[] internalArray$okio2 = byteString.internalArray$okio();
        while (j3 < size()) {
            byte[] bArr4 = segment.data;
            i2 = (int) ((segment.pos + j2) - j3);
            int i7 = segment.limit;
            while (i2 < i7) {
                byte b10 = bArr4[i2];
                for (byte b11 : internalArray$okio2) {
                    if (b10 == b11) {
                        i3 = segment.pos;
                    }
                }
                i2++;
            }
            j3 += segment.limit - segment.pos;
            segment = segment.next;
            p0.a.p(segment);
            j2 = j3;
        }
        return -1L;
        return (i2 - i3) + j3;
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j2, @NotNull ByteString byteString, int i2, int i3) {
        p0.a.s(byteString, "bytes");
        if (j2 < 0 || i2 < 0 || i3 < 0 || size() - j2 < i3 || byteString.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (getByte(i4 + j2) != byteString.getByte(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final UnsafeCursor readAndWriteUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        p0.a.s(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long j2) throws EOFException {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(d.m("byteCount: ", j2).toString());
        }
        if (size() >= j2) {
            byte[] bArr = new byte[(int) j2];
            readFully(bArr);
            return bArr;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long j2) throws EOFException {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(d.m("byteCount: ", j2).toString());
        }
        if (size() < j2) {
            throw new EOFException();
        }
        if (j2 >= 4096) {
            ByteString snapshot = snapshot((int) j2);
            skip(j2);
            return snapshot;
        }
        return new ByteString(readByteArray(j2));
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream inputStream, long j2) throws IOException {
        p0.a.s(inputStream, "input");
        if (j2 >= 0) {
            readFrom(inputStream, j2, false);
            return this;
        }
        throw new IllegalArgumentException(d.m("byteCount < 0: ", j2).toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(long j2, @NotNull Charset charset) throws EOFException {
        p0.a.s(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(d.m("byteCount: ", j2).toString());
        }
        if (this.size < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        Segment segment = this.head;
        p0.a.p(segment);
        int i2 = segment.pos;
        if (i2 + j2 > segment.limit) {
            return new String(readByteArray(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(segment.data, i2, i3, charset);
        int i4 = segment.pos + i3;
        segment.pos = i4;
        this.size -= j2;
        if (i4 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @NotNull
    public final UnsafeCursor readUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        p0.a.s(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long j2) throws EOFException {
        return readString(j2, z0.a.f31458a);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long j2) throws EOFException {
        if (j2 >= 0) {
            long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
            long indexOf = indexOf((byte) 10, 0L, j3);
            if (indexOf != -1) {
                return okio.internal.Buffer.readUtf8Line(this, indexOf);
            }
            if (j3 < size() && getByte(j3 - 1) == 13 && getByte(j3) == 10) {
                return okio.internal.Buffer.readUtf8Line(this, j3);
            }
            Buffer buffer = new Buffer();
            copyTo(buffer, 0L, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j2) + " content=" + buffer.readByteString().hex() + (char) 8230);
        }
        throw new IllegalArgumentException(d.m("limit < 0: ", j2).toString());
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeByte(int i2) {
        Segment writableSegment$okio = writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        writableSegment$okio.limit = i3 + 1;
        bArr[i3] = (byte) i2;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeDecimalLong(long j2) {
        boolean z2;
        if (j2 == 0) {
            return writeByte(48);
        }
        int i2 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 >= 100000000) {
            i2 = j2 < 1000000000000L ? j2 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            i2 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i2 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i2 = 2;
        }
        if (z2) {
            i2++;
        }
        Segment writableSegment$okio = writableSegment$okio(i2);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit + i2;
        while (j2 != 0) {
            long j3 = 10;
            i3--;
            bArr[i3] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z2) {
            bArr[i3 - 1] = 45;
        }
        writableSegment$okio.limit += i2;
        setSize$okio(size() + i2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeHexadecimalUnsignedLong(long j2) {
        if (j2 == 0) {
            return writeByte(48);
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        Segment writableSegment$okio = writableSegment$okio(i2);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (15 & j2)];
            j2 >>>= 4;
        }
        writableSegment$okio.limit += i2;
        setSize$okio(size() + i2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeInt(int i2) {
        Segment writableSegment$okio = writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 3] = (byte) (i2 & 255);
        writableSegment$okio.limit = i3 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeIntLe(int i2) {
        return writeInt(SegmentedByteString.reverseBytes(i2));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLong(long j2) {
        Segment writableSegment$okio = writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        bArr[i2] = (byte) ((j2 >>> 56) & 255);
        bArr[i2 + 1] = (byte) ((j2 >>> 48) & 255);
        bArr[i2 + 2] = (byte) ((j2 >>> 40) & 255);
        bArr[i2 + 3] = (byte) ((j2 >>> 32) & 255);
        bArr[i2 + 4] = (byte) ((j2 >>> 24) & 255);
        bArr[i2 + 5] = (byte) ((j2 >>> 16) & 255);
        bArr[i2 + 6] = (byte) ((j2 >>> 8) & 255);
        bArr[i2 + 7] = (byte) (j2 & 255);
        writableSegment$okio.limit = i2 + 8;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLongLe(long j2) {
        return writeLong(SegmentedByteString.reverseBytes(j2));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShort(int i2) {
        Segment writableSegment$okio = writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 1] = (byte) (i2 & 255);
        writableSegment$okio.limit = i3 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShortLe(int i2) {
        return writeShort((int) SegmentedByteString.reverseBytes((short) i2));
    }

    @NotNull
    public final Buffer writeTo(@NotNull OutputStream outputStream, long j2) throws IOException {
        p0.a.s(outputStream, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, 0L, j2);
        Segment segment = this.head;
        while (j2 > 0) {
            p0.a.p(segment);
            int min = (int) Math.min(j2, segment.limit - segment.pos);
            outputStream.write(segment.data, segment.pos, min);
            int i2 = segment.pos + min;
            segment.pos = i2;
            long j3 = min;
            this.size -= j3;
            j2 -= j3;
            if (i2 == segment.limit) {
                Segment pop = segment.pop();
                this.head = pop;
                SegmentPool.recycle(segment);
                segment = pop;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8CodePoint(int i2) {
        if (i2 < 128) {
            writeByte(i2);
        } else if (i2 < 2048) {
            Segment writableSegment$okio = writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i3 = writableSegment$okio.limit;
            bArr[i3] = (byte) ((i2 >> 6) | Opcodes.CHECKCAST);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            writableSegment$okio.limit = i3 + 2;
            setSize$okio(size() + 2);
        } else if (55296 <= i2 && i2 < 57344) {
            writeByte(63);
        } else if (i2 < 65536) {
            Segment writableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i4 = writableSegment$okio2.limit;
            bArr2[i4] = (byte) ((i2 >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
            writableSegment$okio2.limit = i4 + 3;
            setSize$okio(size() + 3);
        } else if (i2 <= 1114111) {
            Segment writableSegment$okio3 = writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i5 = writableSegment$okio3.limit;
            bArr3[i5] = (byte) ((i2 >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
            writableSegment$okio3.limit = i5 + 4;
            setSize$okio(size() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i2));
        }
        return this;
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j2, long j3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return buffer.copyTo(buffer2, j2, j3);
    }

    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream, long j2, long j3) throws IOException {
        p0.a.s(outputStream, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, j2, j3);
        if (j3 == 0) {
            return this;
        }
        Segment segment = this.head;
        while (true) {
            p0.a.p(segment);
            int i2 = segment.limit;
            int i3 = segment.pos;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            segment = segment.next;
        }
        while (j3 > 0) {
            p0.a.p(segment);
            int min = (int) Math.min(segment.limit - r9, j3);
            outputStream.write(segment.data, (int) (segment.pos + j2), min);
            j3 -= min;
            segment = segment.next;
            j2 = 0;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString byteString) throws IOException {
        p0.a.s(byteString, "bytes");
        return indexOf(byteString, 0L);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String str, @NotNull Charset charset) {
        p0.a.s(str, "string");
        p0.a.s(charset, "charset");
        return writeString(str, 0, str.length(), charset);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String str) {
        p0.a.s(str, "string");
        return writeUtf8(str, 0, str.length());
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return buffer.copyTo(buffer2, j2);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b2, long j2, long j3) {
        Segment segment;
        int i2;
        long j4 = 0;
        if (0 > j2 || j2 > j3) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        if (j3 > size()) {
            j3 = size();
        }
        if (j2 == j3 || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - j2 < j2) {
            j4 = size();
            while (j4 > j2) {
                segment = segment.prev;
                p0.a.p(segment);
                j4 -= segment.limit - segment.pos;
            }
            while (j4 < j3) {
                byte[] bArr = segment.data;
                int min = (int) Math.min(segment.limit, (segment.pos + j3) - j4);
                i2 = (int) ((segment.pos + j2) - j4);
                while (i2 < min) {
                    if (bArr[i2] != b2) {
                        i2++;
                    }
                }
                j4 += segment.limit - segment.pos;
                segment = segment.next;
                p0.a.p(segment);
                j2 = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (segment.limit - segment.pos) + j4;
            if (j5 > j2) {
                break;
            }
            segment = segment.next;
            p0.a.p(segment);
            j4 = j5;
        }
        while (j4 < j3) {
            byte[] bArr2 = segment.data;
            int min2 = (int) Math.min(segment.limit, (segment.pos + j3) - j4);
            i2 = (int) ((segment.pos + j2) - j4);
            while (i2 < min2) {
                if (bArr2[i2] != b2) {
                    i2++;
                }
            }
            j4 += segment.limit - segment.pos;
            segment = segment.next;
            p0.a.p(segment);
            j2 = j4;
        }
        return -1L;
        return (i2 - segment.pos) + j4;
    }

    @Override // okio.BufferedSource
    @Nullable
    public <T> T select(@NotNull TypedOptions<T> typedOptions) {
        p0.a.s(typedOptions, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        int select = select(typedOptions.getOptions$okio());
        if (select == -1) {
            return null;
        }
        return typedOptions.get(select);
    }

    @NotNull
    public final ByteString snapshot(int i2) {
        if (i2 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(size(), 0L, i2);
        Segment segment = this.head;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            p0.a.p(segment);
            int i6 = segment.limit;
            int i7 = segment.pos;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i5];
        int[] iArr = new int[i5 * 2];
        Segment segment2 = this.head;
        int i8 = 0;
        while (i3 < i2) {
            p0.a.p(segment2);
            bArr[i8] = segment2.data;
            i3 += segment2.limit - segment2.pos;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = segment2.pos;
            segment2.shared = true;
            i8++;
            segment2 = segment2.next;
        }
        return new C1279SegmentedByteString(bArr, iArr);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String str, int i2, int i3) {
        char charAt;
        p0.a.s(str, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(d.i("beginIndex < 0: ", i2).toString());
        }
        if (i3 >= i2) {
            if (i3 > str.length()) {
                StringBuilder t2 = d.t("endIndex > string.length: ", i3, " > ");
                t2.append(str.length());
                throw new IllegalArgumentException(t2.toString().toString());
            }
            while (i2 < i3) {
                char charAt2 = str.charAt(i2);
                if (charAt2 < 128) {
                    Segment writableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = writableSegment$okio.data;
                    int i4 = writableSegment$okio.limit - i2;
                    int min = Math.min(i3, 8192 - i4);
                    int i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) charAt2;
                    while (true) {
                        i2 = i5;
                        if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                            break;
                        }
                        i5 = i2 + 1;
                        bArr[i2 + i4] = (byte) charAt;
                    }
                    int i6 = writableSegment$okio.limit;
                    int i7 = (i4 + i2) - i6;
                    writableSegment$okio.limit = i6 + i7;
                    setSize$okio(size() + i7);
                } else {
                    if (charAt2 < 2048) {
                        Segment writableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = writableSegment$okio2.data;
                        int i8 = writableSegment$okio2.limit;
                        bArr2[i8] = (byte) ((charAt2 >> 6) | Opcodes.CHECKCAST);
                        bArr2[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                        writableSegment$okio2.limit = i8 + 2;
                        setSize$okio(size() + 2);
                    } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                        int i9 = i2 + 1;
                        char charAt3 = i9 < i3 ? str.charAt(i9) : (char) 0;
                        if (charAt2 <= 56319 && 56320 <= charAt3 && charAt3 < 57344) {
                            int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            Segment writableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = writableSegment$okio3.data;
                            int i11 = writableSegment$okio3.limit;
                            bArr3[i11] = (byte) ((i10 >> 18) | 240);
                            bArr3[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr3[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr3[i11 + 3] = (byte) ((i10 & 63) | 128);
                            writableSegment$okio3.limit = i11 + 4;
                            setSize$okio(size() + 4);
                            i2 += 2;
                        } else {
                            writeByte(63);
                            i2 = i9;
                        }
                    } else {
                        Segment writableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i12 = writableSegment$okio4.limit;
                        bArr4[i12] = (byte) ((charAt2 >> '\f') | 224);
                        bArr4[i12 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr4[i12 + 2] = (byte) ((charAt2 & '?') | 128);
                        writableSegment$okio4.limit = i12 + 3;
                        setSize$okio(size() + 3);
                    }
                    i2++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(d.k("endIndex < beginIndex: ", i3, " < ", i2).toString());
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] bArr) throws EOFException {
        p0.a.s(bArr, "sink");
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = read(bArr, i2, bArr.length - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String str, int i2, int i3, @NotNull Charset charset) {
        p0.a.s(str, "string");
        p0.a.s(charset, "charset");
        if (i2 < 0) {
            throw new IllegalArgumentException(d.i("beginIndex < 0: ", i2).toString());
        }
        if (i3 >= i2) {
            if (i3 <= str.length()) {
                if (p0.a.g(charset, z0.a.f31458a)) {
                    return writeUtf8(str, i2, i3);
                }
                String substring = str.substring(i2, i3);
                p0.a.r(substring, "substring(...)");
                byte[] bytes = substring.getBytes(charset);
                p0.a.r(bytes, "getBytes(...)");
                return write(bytes, 0, bytes.length);
            }
            StringBuilder t2 = d.t("endIndex > string.length: ", i3, " > ");
            t2.append(str.length());
            throw new IllegalArgumentException(t2.toString().toString());
        }
        throw new IllegalArgumentException(d.k("endIndex < beginIndex: ", i3, " < ", i2).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer byteBuffer) throws IOException {
        p0.a.s(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i2, 8192 - writableSegment$okio.limit);
            byteBuffer.get(writableSegment$okio.data, writableSegment$okio.limit, min);
            i2 -= min;
            writableSegment$okio.limit += min;
        }
        this.size += remaining;
        return remaining;
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] bArr) {
        p0.a.s(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] bArr, int i2, int i3) {
        p0.a.s(bArr, "sink");
        SegmentedByteString.checkOffsetAndCount(bArr.length, i2, i3);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i3, segment.limit - segment.pos);
        byte[] bArr2 = segment.data;
        int i4 = segment.pos;
        q.Q(bArr2, i2, bArr, i4, i4 + min);
        segment.pos += min;
        setSize$okio(size() - min);
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    private final void readFrom(InputStream inputStream, long j2, boolean z2) throws IOException {
        while (true) {
            if (j2 <= 0 && !z2) {
                return;
            }
            Segment writableSegment$okio = writableSegment$okio(1);
            int read = inputStream.read(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j2, 8192 - writableSegment$okio.limit));
            if (read == -1) {
                if (writableSegment$okio.pos == writableSegment$okio.limit) {
                    this.head = writableSegment$okio.pop();
                    SegmentPool.recycle(writableSegment$okio);
                }
                if (!z2) {
                    throw new EOFException();
                }
                return;
            }
            writableSegment$okio.limit += read;
            long j3 = read;
            this.size += j3;
            j2 -= j3;
        }
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer buffer, long j2) {
        p0.a.s(buffer, "out");
        return copyTo(buffer, j2, this.size - j2);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString) {
        p0.a.s(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer buffer, long j2, long j3) {
        p0.a.s(buffer, "out");
        SegmentedByteString.checkOffsetAndCount(size(), j2, j3);
        if (j3 != 0) {
            buffer.setSize$okio(buffer.size() + j3);
            Segment segment = this.head;
            while (true) {
                p0.a.p(segment);
                int i2 = segment.limit;
                int i3 = segment.pos;
                if (j2 < i2 - i3) {
                    break;
                }
                j2 -= i2 - i3;
                segment = segment.next;
            }
            while (j3 > 0) {
                p0.a.p(segment);
                Segment sharedCopy = segment.sharedCopy();
                int i4 = sharedCopy.pos + ((int) j2);
                sharedCopy.pos = i4;
                sharedCopy.limit = Math.min(i4 + ((int) j3), sharedCopy.limit);
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    buffer.head = sharedCopy;
                } else {
                    p0.a.p(segment2);
                    Segment segment3 = segment2.prev;
                    p0.a.p(segment3);
                    segment3.push(sharedCopy);
                }
                j3 -= sharedCopy.limit - sharedCopy.pos;
                segment = segment.next;
                j2 = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString, int i2, int i3) {
        p0.a.s(byteString, "byteString");
        byteString.write$okio(this, i2, i3);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] bArr) {
        p0.a.s(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] bArr, int i2, int i3) {
        p0.a.s(bArr, "source");
        long j2 = i3;
        SegmentedByteString.checkOffsetAndCount(bArr.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i4 - i2, 8192 - writableSegment$okio.limit);
            int i5 = i2 + min;
            q.Q(bArr, writableSegment$okio.limit, writableSegment$okio.data, i2, i5);
            writableSegment$okio.limit += min;
            i2 = i5;
        }
        setSize$okio(size() + j2);
        return this;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer buffer, long j2) {
        p0.a.s(buffer, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(d.m("byteCount < 0: ", j2).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j2 > size()) {
            j2 = size();
        }
        buffer.write(this, j2);
        return j2;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull Source source, long j2) throws IOException {
        p0.a.s(source, "source");
        while (j2 > 0) {
            long read = source.read(this, j2);
            if (read == -1) {
                throw new EOFException();
            }
            j2 -= read;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString byteString, long j2) throws IOException {
        int i2;
        long j3 = j2;
        p0.a.s(byteString, "bytes");
        if (byteString.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j4 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(d.m("fromIndex < 0: ", j3).toString());
        }
        Segment segment = this.head;
        if (segment != null) {
            if (size() - j3 < j3) {
                j4 = size();
                while (j4 > j3) {
                    segment = segment.prev;
                    p0.a.p(segment);
                    j4 -= segment.limit - segment.pos;
                }
                byte[] internalArray$okio = byteString.internalArray$okio();
                byte b2 = internalArray$okio[0];
                int size = byteString.size();
                long size2 = (size() - size) + 1;
                while (j4 < size2) {
                    byte[] bArr = segment.data;
                    long j5 = size2;
                    int min = (int) Math.min(segment.limit, (segment.pos + size2) - j4);
                    i2 = (int) ((segment.pos + j3) - j4);
                    while (i2 < min) {
                        if (bArr[i2] == b2 && okio.internal.Buffer.rangeEquals(segment, i2 + 1, internalArray$okio, 1, size)) {
                            return (i2 - segment.pos) + j4;
                        }
                        i2++;
                    }
                    j4 += segment.limit - segment.pos;
                    segment = segment.next;
                    p0.a.p(segment);
                    j3 = j4;
                    size2 = j5;
                }
            } else {
                while (true) {
                    long j6 = (segment.limit - segment.pos) + j4;
                    if (j6 > j3) {
                        break;
                    }
                    segment = segment.next;
                    p0.a.p(segment);
                    j4 = j6;
                }
                byte[] internalArray$okio2 = byteString.internalArray$okio();
                byte b3 = internalArray$okio2[0];
                int size3 = byteString.size();
                long size4 = (size() - size3) + 1;
                while (j4 < size4) {
                    byte[] bArr2 = segment.data;
                    int min2 = (int) Math.min(segment.limit, (segment.pos + size4) - j4);
                    i2 = (int) ((segment.pos + j3) - j4);
                    while (i2 < min2) {
                        if (bArr2[i2] == b3 && okio.internal.Buffer.rangeEquals(segment, i2 + 1, internalArray$okio2, 1, size3)) {
                            return (i2 - segment.pos) + j4;
                        }
                        i2++;
                    }
                    j4 += segment.limit - segment.pos;
                    segment = segment.next;
                    p0.a.p(segment);
                    j3 = j4;
                }
            }
        }
        return -1L;
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer buffer, long j2) {
        Segment segment;
        p0.a.s(buffer, "source");
        if (buffer != this) {
            SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j2);
            while (j2 > 0) {
                Segment segment2 = buffer.head;
                p0.a.p(segment2);
                int i2 = segment2.limit;
                p0.a.p(buffer.head);
                if (j2 < i2 - r1.pos) {
                    Segment segment3 = this.head;
                    if (segment3 != null) {
                        p0.a.p(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j2) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = buffer.head;
                            p0.a.p(segment4);
                            segment4.writeTo(segment, (int) j2);
                            buffer.setSize$okio(buffer.size() - j2);
                            setSize$okio(size() + j2);
                            return;
                        }
                    }
                    Segment segment5 = buffer.head;
                    p0.a.p(segment5);
                    buffer.head = segment5.split((int) j2);
                }
                Segment segment6 = buffer.head;
                p0.a.p(segment6);
                long j3 = segment6.limit - segment6.pos;
                buffer.head = segment6.pop();
                Segment segment7 = this.head;
                if (segment7 == null) {
                    this.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    p0.a.p(segment7);
                    Segment segment8 = segment7.prev;
                    p0.a.p(segment8);
                    segment8.push(segment6).compact();
                }
                buffer.setSize$okio(buffer.size() - j3);
                setSize$okio(size() + j3);
                j2 -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }
}
