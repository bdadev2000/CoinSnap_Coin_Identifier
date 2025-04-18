package okio.internal;

import android.support.v4.media.d;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.common.primitives.UnsignedBytes;
import e0.q;
import java.io.EOFException;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ByteString;
import okio.C1279SegmentedByteString;
import okio.Options;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio._JvmPlatformKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import p0.a;
import q0.p;

/* renamed from: okio.internal.-Buffer */
/* loaded from: classes3.dex */
public final class Buffer {

    @NotNull
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        a.s(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        a.p(segment);
        Segment segment2 = segment.prev;
        a.p(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r2 - segment2.pos);
    }

    @NotNull
    public static final okio.Buffer commonCopy(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        okio.Buffer buffer2 = new okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        a.p(segment);
        Segment sharedCopy = segment.sharedCopy();
        buffer2.head = sharedCopy;
        sharedCopy.prev = sharedCopy;
        sharedCopy.next = sharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = sharedCopy.prev;
            a.p(segment3);
            a.p(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    @NotNull
    public static final okio.Buffer commonCopyTo(@NotNull okio.Buffer buffer, @NotNull okio.Buffer buffer2, long j2, long j3) {
        a.s(buffer, "<this>");
        a.s(buffer2, "out");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j2, j3);
        if (j3 == 0) {
            return buffer;
        }
        buffer2.setSize$okio(buffer2.size() + j3);
        Segment segment = buffer.head;
        while (true) {
            a.p(segment);
            int i2 = segment.limit;
            int i3 = segment.pos;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            segment = segment.next;
        }
        while (j3 > 0) {
            a.p(segment);
            Segment sharedCopy = segment.sharedCopy();
            int i4 = sharedCopy.pos + ((int) j2);
            sharedCopy.pos = i4;
            sharedCopy.limit = Math.min(i4 + ((int) j3), sharedCopy.limit);
            Segment segment2 = buffer2.head;
            if (segment2 == null) {
                sharedCopy.prev = sharedCopy;
                sharedCopy.next = sharedCopy;
                buffer2.head = sharedCopy;
            } else {
                a.p(segment2);
                Segment segment3 = segment2.prev;
                a.p(segment3);
                segment3.push(sharedCopy);
            }
            j3 -= sharedCopy.limit - sharedCopy.pos;
            segment = segment.next;
            j2 = 0;
        }
        return buffer;
    }

    public static final boolean commonEquals(@NotNull okio.Buffer buffer, @Nullable Object obj) {
        a.s(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof okio.Buffer)) {
            return false;
        }
        okio.Buffer buffer2 = (okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        a.p(segment);
        Segment segment2 = buffer2.head;
        a.p(segment2);
        int i2 = segment.pos;
        int i3 = segment2.pos;
        long j2 = 0;
        while (j2 < buffer.size()) {
            long min = Math.min(segment.limit - i2, segment2.limit - i3);
            long j3 = 0;
            while (j3 < min) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (segment.data[i2] != segment2.data[i3]) {
                    return false;
                }
                j3++;
                i2 = i4;
                i3 = i5;
            }
            if (i2 == segment.limit) {
                segment = segment.next;
                a.p(segment);
                i2 = segment.pos;
            }
            if (i3 == segment2.limit) {
                segment2 = segment2.next;
                a.p(segment2);
                i3 = segment2.pos;
            }
            j2 += min;
        }
        return true;
    }

    public static final long commonExpandBuffer(@NotNull Buffer.UnsafeCursor unsafeCursor, int i2) {
        a.s(unsafeCursor, "<this>");
        if (i2 <= 0) {
            throw new IllegalArgumentException(d.i("minByteCount <= 0: ", i2).toString());
        }
        if (i2 > 8192) {
            throw new IllegalArgumentException(d.i("minByteCount > Segment.SIZE: ", i2).toString());
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        Segment writableSegment$okio = buffer.writableSegment$okio(i2);
        int i3 = 8192 - writableSegment$okio.limit;
        writableSegment$okio.limit = 8192;
        long j2 = i3;
        buffer.setSize$okio(size + j2);
        unsafeCursor.setSegment$okio(writableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = writableSegment$okio.data;
        unsafeCursor.start = 8192 - i3;
        unsafeCursor.end = 8192;
        return j2;
    }

    public static final byte commonGet(@NotNull okio.Buffer buffer, long j2) {
        a.s(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j2, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            a.p(null);
            throw null;
        }
        if (buffer.size() - j2 < j2) {
            long size = buffer.size();
            while (size > j2) {
                segment = segment.prev;
                a.p(segment);
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
            a.p(segment);
            j3 = j4;
        }
    }

    public static final int commonHashCode(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        Segment segment = buffer.head;
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
            a.p(segment);
        } while (segment != buffer.head);
        return i2;
    }

    public static final long commonIndexOf(@NotNull okio.Buffer buffer, byte b2, long j2, long j3) {
        Segment segment;
        int i2;
        a.s(buffer, "<this>");
        long j4 = 0;
        if (0 > j2 || j2 > j3) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        if (j3 > buffer.size()) {
            j3 = buffer.size();
        }
        if (j2 == j3 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j2 < j2) {
            j4 = buffer.size();
            while (j4 > j2) {
                segment = segment.prev;
                a.p(segment);
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
                a.p(segment);
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
            a.p(segment);
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
            a.p(segment);
            j2 = j4;
        }
        return -1L;
        return (i2 - segment.pos) + j4;
    }

    public static final long commonIndexOfElement(@NotNull okio.Buffer buffer, @NotNull ByteString byteString, long j2) {
        int i2;
        int i3;
        a.s(buffer, "<this>");
        a.s(byteString, "targetBytes");
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(d.m("fromIndex < 0: ", j2).toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j2 < j2) {
            j3 = buffer.size();
            while (j3 > j2) {
                segment = segment.prev;
                a.p(segment);
                j3 -= segment.limit - segment.pos;
            }
            if (byteString.size() == 2) {
                byte b2 = byteString.getByte(0);
                byte b3 = byteString.getByte(1);
                while (j3 < buffer.size()) {
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
                    a.p(segment);
                    j2 = j3;
                }
            } else {
                byte[] internalArray$okio = byteString.internalArray$okio();
                while (j3 < buffer.size()) {
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
                    a.p(segment);
                    j2 = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = (segment.limit - segment.pos) + j3;
            if (j4 > j2) {
                break;
            }
            segment = segment.next;
            a.p(segment);
            j3 = j4;
        }
        if (byteString.size() == 2) {
            byte b7 = byteString.getByte(0);
            byte b8 = byteString.getByte(1);
            while (j3 < buffer.size()) {
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
                a.p(segment);
                j2 = j3;
            }
        } else {
            byte[] internalArray$okio2 = byteString.internalArray$okio();
            while (j3 < buffer.size()) {
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
                a.p(segment);
                j2 = j3;
            }
        }
        return -1L;
        return (i2 - i3) + j3;
    }

    public static final int commonNext(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        a.s(unsafeCursor, "<this>");
        long j2 = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        a.p(buffer);
        if (j2 == buffer.size()) {
            throw new IllegalStateException("no more bytes".toString());
        }
        long j3 = unsafeCursor.offset;
        return unsafeCursor.seek(j3 == -1 ? 0L : j3 + (unsafeCursor.end - unsafeCursor.start));
    }

    public static final boolean commonRangeEquals(@NotNull okio.Buffer buffer, long j2, @NotNull ByteString byteString, int i2, int i3) {
        a.s(buffer, "<this>");
        a.s(byteString, "bytes");
        if (j2 < 0 || i2 < 0 || i3 < 0 || buffer.size() - j2 < i3 || byteString.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (buffer.getByte(i4 + j2) != byteString.getByte(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull okio.Buffer buffer, @NotNull byte[] bArr) {
        a.s(buffer, "<this>");
        a.s(bArr, "sink");
        return buffer.read(bArr, 0, bArr.length);
    }

    public static final long commonReadAll(@NotNull okio.Buffer buffer, @NotNull Sink sink) {
        a.s(buffer, "<this>");
        a.s(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    @NotNull
    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(@NotNull okio.Buffer buffer, @NotNull Buffer.UnsafeCursor unsafeCursor) {
        a.s(buffer, "<this>");
        a.s(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor resolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (resolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        resolveDefaultParameter.buffer = buffer;
        resolveDefaultParameter.readWrite = true;
        return resolveDefaultParameter;
    }

    public static final byte commonReadByte(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        a.p(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        int i4 = i2 + 1;
        byte b2 = segment.data[i2];
        buffer.setSize$okio(buffer.size() - 1);
        if (i4 == i3) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return b2;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    public static final long commonReadDecimalLong(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z2 = false;
        long j2 = 0;
        long j3 = -7;
        boolean z3 = false;
        do {
            Segment segment = buffer.head;
            a.p(segment);
            byte[] bArr = segment.data;
            int i3 = segment.pos;
            int i4 = segment.limit;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    int i5 = 48 - b2;
                    if (j2 < OVERFLOW_ZONE || (j2 == OVERFLOW_ZONE && i5 < j3)) {
                        okio.Buffer writeByte = new okio.Buffer().writeDecimalLong(j2).writeByte((int) b2);
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
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i3;
            }
            if (z3) {
                break;
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - i2);
        if (i2 >= (z2 ? 2 : 1)) {
            return z2 ? j2 : -j2;
        }
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        StringBuilder B = androidx.compose.foundation.text.input.a.B(z2 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        B.append(SegmentedByteString.toHexString(buffer.getByte(0L)));
        throw new NumberFormatException(B.toString());
    }

    public static final void commonReadFully(@NotNull okio.Buffer buffer, @NotNull byte[] bArr) {
        a.s(buffer, "<this>");
        a.s(bArr, "sink");
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = buffer.read(bArr, i2, bArr.length - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x0012->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.Buffer r14) {
        /*
            java.lang.String r0 = "<this>"
            p0.a.s(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb0
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            okio.Segment r6 = r14.head
            p0.a.p(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L92
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L41
        L2c:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-87)
            goto L41
        L37:
            r11 = 65
            if (r10 < r11) goto L76
            r11 = 70
            if (r10 > r11) goto L76
            int r11 = r10 + (-55)
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L51:
            okio.Buffer r14 = new okio.Buffer
            r14.<init>()
            okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number too large: "
            r1.<init>(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L76:
            if (r0 == 0) goto L7a
            r1 = 1
            goto L92
        L7a:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.<init>(r1)
            java.lang.String r1 = okio.SegmentedByteString.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L92:
            if (r8 != r9) goto L9e
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto La0
        L9e:
            r6.pos = r8
        La0:
            if (r1 != 0) goto La6
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L12
        La6:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb0:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.Buffer.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final int commonReadInt(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        a.p(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 4) {
            return (buffer.readByte() & UnsignedBytes.MAX_VALUE) | ((buffer.readByte() & UnsignedBytes.MAX_VALUE) << 24) | ((buffer.readByte() & UnsignedBytes.MAX_VALUE) << 16) | ((buffer.readByte() & UnsignedBytes.MAX_VALUE) << 8);
        }
        byte[] bArr = segment.data;
        int i4 = i2 + 3;
        int i5 = ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 8);
        int i6 = i2 + 4;
        int i7 = (bArr[i4] & UnsignedBytes.MAX_VALUE) | i5;
        buffer.setSize$okio(buffer.size() - 4);
        if (i6 == i3) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i6;
        }
        return i7;
    }

    public static final long commonReadLong(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        a.p(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 8) {
            return ((buffer.readInt() & 4294967295L) << 32) | (4294967295L & buffer.readInt());
        }
        byte[] bArr = segment.data;
        int i4 = i2 + 7;
        long j2 = ((bArr[i2] & 255) << 56) | ((bArr[i2 + 1] & 255) << 48) | ((bArr[i2 + 2] & 255) << 40) | ((bArr[i2 + 3] & 255) << 32) | ((bArr[i2 + 4] & 255) << 24) | ((bArr[i2 + 5] & 255) << 16) | ((bArr[i2 + 6] & 255) << 8);
        int i5 = i2 + 8;
        long j3 = j2 | (bArr[i4] & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i5 == i3) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i5;
        }
        return j3;
    }

    public static final short commonReadShort(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        a.p(segment);
        int i2 = segment.pos;
        int i3 = segment.limit;
        if (i3 - i2 < 2) {
            return (short) ((buffer.readByte() & UnsignedBytes.MAX_VALUE) | ((buffer.readByte() & UnsignedBytes.MAX_VALUE) << 8));
        }
        byte[] bArr = segment.data;
        int i4 = i2 + 1;
        int i5 = (bArr[i2] & UnsignedBytes.MAX_VALUE) << 8;
        int i6 = i2 + 2;
        int i7 = (bArr[i4] & UnsignedBytes.MAX_VALUE) | i5;
        buffer.setSize$okio(buffer.size() - 2);
        if (i6 == i3) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i6;
        }
        return (short) i7;
    }

    @NotNull
    public static final Buffer.UnsafeCursor commonReadUnsafe(@NotNull okio.Buffer buffer, @NotNull Buffer.UnsafeCursor unsafeCursor) {
        a.s(buffer, "<this>");
        a.s(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor resolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (resolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        resolveDefaultParameter.buffer = buffer;
        resolveDefaultParameter.readWrite = false;
        return resolveDefaultParameter;
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull okio.Buffer buffer, long j2) {
        a.s(buffer, "<this>");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(d.m("byteCount: ", j2).toString());
        }
        if (buffer.size() < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        Segment segment = buffer.head;
        a.p(segment);
        int i2 = segment.pos;
        if (i2 + j2 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j2), 0, 0, 3, null);
        }
        int i3 = (int) j2;
        String commonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i2, i2 + i3);
        segment.pos += i3;
        buffer.setSize$okio(buffer.size() - j2);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return commonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(@NotNull okio.Buffer buffer) {
        int i2;
        int i3;
        int i4;
        a.s(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b2 = buffer.getByte(0L);
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
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i2 = b2 & 7;
            i3 = 4;
            i4 = 65536;
        }
        long j2 = i3;
        if (buffer.size() < j2) {
            StringBuilder t2 = d.t("size < ", i3, ": ");
            t2.append(buffer.size());
            t2.append(" (to read code point prefixed 0x");
            t2.append(SegmentedByteString.toHexString(b2));
            t2.append(')');
            throw new EOFException(t2.toString());
        }
        for (int i5 = 1; i5 < i3; i5++) {
            long j3 = i5;
            byte b3 = buffer.getByte(j3);
            if ((b3 & 192) != 128) {
                buffer.skip(j3);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i2 = (i2 << 6) | (b3 & Utf8.REPLACEMENT_BYTE);
        }
        buffer.skip(j2);
        return i2 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i2 || i2 >= 57344) && i2 >= i4) ? i2 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        long indexOf = buffer.indexOf((byte) 10);
        if (indexOf != -1) {
            return readUtf8Line(buffer, indexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull okio.Buffer buffer, long j2) {
        a.s(buffer, "<this>");
        if (j2 < 0) {
            throw new IllegalArgumentException(d.m("limit < 0: ", j2).toString());
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        long indexOf = buffer.indexOf((byte) 10, 0L, j3);
        if (indexOf != -1) {
            return readUtf8Line(buffer, indexOf);
        }
        if (j3 < buffer.size() && buffer.getByte(j3 - 1) == 13 && buffer.getByte(j3) == 10) {
            return readUtf8Line(buffer, j3);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j2) + " content=" + buffer2.readByteString().hex() + (char) 8230);
    }

    public static final long commonResizeBuffer(@NotNull Buffer.UnsafeCursor unsafeCursor, long j2) {
        a.s(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
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
                a.p(segment);
                Segment segment2 = segment.prev;
                a.p(segment2);
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
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j2;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j2 > size) {
            long j5 = j2 - size;
            boolean z2 = true;
            while (j5 > 0) {
                Segment writableSegment$okio = buffer.writableSegment$okio(1);
                int min = (int) Math.min(j5, 8192 - writableSegment$okio.limit);
                writableSegment$okio.limit += min;
                j5 -= min;
                if (z2) {
                    unsafeCursor.setSegment$okio(writableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = writableSegment$okio.data;
                    int i3 = writableSegment$okio.limit;
                    unsafeCursor.start = i3 - min;
                    unsafeCursor.end = i3;
                    z2 = false;
                }
            }
        }
        buffer.setSize$okio(j2);
        return size;
    }

    public static final int commonSeek(@NotNull Buffer.UnsafeCursor unsafeCursor, long j2) {
        Segment segment;
        a.s(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (j2 < -1 || j2 > buffer.size()) {
            StringBuilder r2 = androidx.compose.foundation.text.input.a.r("offset=", j2, " > size=");
            r2.append(buffer.size());
            throw new ArrayIndexOutOfBoundsException(r2.toString());
        }
        if (j2 == -1 || j2 == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j2;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment2 = buffer.head;
        long j3 = 0;
        if (unsafeCursor.getSegment$okio() != null) {
            long j4 = unsafeCursor.offset;
            int i2 = unsafeCursor.start;
            a.p(unsafeCursor.getSegment$okio());
            long j5 = j4 - (i2 - r9.pos);
            if (j5 > j2) {
                segment = segment2;
                segment2 = unsafeCursor.getSegment$okio();
                size = j5;
            } else {
                segment = unsafeCursor.getSegment$okio();
                j3 = j5;
            }
        } else {
            segment = segment2;
        }
        if (size - j2 > j2 - j3) {
            while (true) {
                a.p(segment);
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
                a.p(segment2);
                segment2 = segment2.prev;
                a.p(segment2);
                size -= segment2.limit - segment2.pos;
            }
            j3 = size;
            segment = segment2;
        }
        if (unsafeCursor.readWrite) {
            a.p(segment);
            if (segment.shared) {
                Segment unsharedCopy = segment.unsharedCopy();
                if (buffer.head == segment) {
                    buffer.head = unsharedCopy;
                }
                segment = segment.push(unsharedCopy);
                Segment segment3 = segment.prev;
                a.p(segment3);
                segment3.pop();
            }
        }
        unsafeCursor.setSegment$okio(segment);
        unsafeCursor.offset = j2;
        a.p(segment);
        unsafeCursor.data = segment.data;
        int i5 = segment.pos + ((int) (j2 - j3));
        unsafeCursor.start = i5;
        int i6 = segment.limit;
        unsafeCursor.end = i6;
        return i6 - i5;
    }

    public static final int commonSelect(@NotNull okio.Buffer buffer, @NotNull Options options) {
        a.s(buffer, "<this>");
        a.s(options, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        int selectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public static final void commonSkip(@NotNull okio.Buffer buffer, long j2) {
        a.s(buffer, "<this>");
        while (j2 > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, segment.limit - segment.pos);
            long j3 = min;
            buffer.setSize$okio(buffer.size() - j3);
            j2 -= j3;
            int i2 = segment.pos + min;
            segment.pos = i2;
            if (i2 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull okio.Buffer buffer) {
        a.s(buffer, "<this>");
        if (buffer.size() <= 2147483647L) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull okio.Buffer buffer, int i2) {
        a.s(buffer, "<this>");
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = buffer.head;
        if (segment != null) {
            a.p(segment);
            Segment segment2 = segment.prev;
            a.p(segment2);
            return (segment2.limit + i2 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment take = SegmentPool.take();
        buffer.head = take;
        take.prev = take;
        take.next = take;
        return take;
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull ByteString byteString, int i2, int i3) {
        a.s(buffer, "<this>");
        a.s(byteString, "byteString");
        byteString.write$okio(buffer, i2, i3);
        return buffer;
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, ByteString byteString, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = byteString.size();
        }
        a.s(buffer, "<this>");
        a.s(byteString, "byteString");
        byteString.write$okio(buffer, i2, i3);
        return buffer;
    }

    public static final long commonWriteAll(@NotNull okio.Buffer buffer, @NotNull Source source) {
        a.s(buffer, "<this>");
        a.s(source, "source");
        long j2 = 0;
        while (true) {
            long read = source.read(buffer, 8192L);
            if (read == -1) {
                return j2;
            }
            j2 += read;
        }
    }

    @NotNull
    public static final okio.Buffer commonWriteByte(@NotNull okio.Buffer buffer, int i2) {
        a.s(buffer, "<this>");
        Segment writableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        writableSegment$okio.limit = i3 + 1;
        bArr[i3] = (byte) i2;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteDecimalLong(@NotNull okio.Buffer buffer, long j2) {
        boolean z2;
        a.s(buffer, "<this>");
        if (j2 == 0) {
            return buffer.writeByte(48);
        }
        int i2 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return buffer.writeUtf8("-9223372036854775808");
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
        Segment writableSegment$okio = buffer.writableSegment$okio(i2);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit + i2;
        while (j2 != 0) {
            long j3 = 10;
            i3--;
            bArr[i3] = getHEX_DIGIT_BYTES()[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z2) {
            bArr[i3 - 1] = 45;
        }
        writableSegment$okio.limit += i2;
        buffer.setSize$okio(buffer.size() + i2);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(@NotNull okio.Buffer buffer, long j2) {
        a.s(buffer, "<this>");
        if (j2 == 0) {
            return buffer.writeByte(48);
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
        Segment writableSegment$okio = buffer.writableSegment$okio(i2);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = getHEX_DIGIT_BYTES()[(int) (15 & j2)];
            j2 >>>= 4;
        }
        writableSegment$okio.limit += i2;
        buffer.setSize$okio(buffer.size() + i2);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteInt(@NotNull okio.Buffer buffer, int i2) {
        a.s(buffer, "<this>");
        Segment writableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 3] = (byte) (i2 & 255);
        writableSegment$okio.limit = i3 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteLong(@NotNull okio.Buffer buffer, long j2) {
        a.s(buffer, "<this>");
        Segment writableSegment$okio = buffer.writableSegment$okio(8);
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
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteShort(@NotNull okio.Buffer buffer, int i2) {
        a.s(buffer, "<this>");
        Segment writableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 1] = (byte) (i2 & 255);
        writableSegment$okio.limit = i3 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteUtf8(@NotNull okio.Buffer buffer, @NotNull String str, int i2, int i3) {
        char charAt;
        a.s(buffer, "<this>");
        a.s(str, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(d.i("beginIndex < 0: ", i2).toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(d.k("endIndex < beginIndex: ", i3, " < ", i2).toString());
        }
        if (i3 > str.length()) {
            StringBuilder t2 = d.t("endIndex > string.length: ", i3, " > ");
            t2.append(str.length());
            throw new IllegalArgumentException(t2.toString().toString());
        }
        while (i2 < i3) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < 128) {
                Segment writableSegment$okio = buffer.writableSegment$okio(1);
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
                buffer.setSize$okio(buffer.size() + i7);
            } else {
                if (charAt2 < 2048) {
                    Segment writableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = writableSegment$okio2.data;
                    int i8 = writableSegment$okio2.limit;
                    bArr2[i8] = (byte) ((charAt2 >> 6) | Opcodes.CHECKCAST);
                    bArr2[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio2.limit = i8 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    Segment writableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = writableSegment$okio3.data;
                    int i9 = writableSegment$okio3.limit;
                    bArr3[i9] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio3.limit = i9 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i10 = i2 + 1;
                    char charAt3 = i10 < i3 ? str.charAt(i10) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        buffer.writeByte(63);
                        i2 = i10;
                    } else {
                        int i11 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        Segment writableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i12 = writableSegment$okio4.limit;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        writableSegment$okio4.limit = i12 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteUtf8CodePoint(@NotNull okio.Buffer buffer, int i2) {
        a.s(buffer, "<this>");
        if (i2 < 128) {
            buffer.writeByte(i2);
        } else if (i2 < 2048) {
            Segment writableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i3 = writableSegment$okio.limit;
            bArr[i3] = (byte) ((i2 >> 6) | Opcodes.CHECKCAST);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            writableSegment$okio.limit = i3 + 2;
            buffer.setSize$okio(buffer.size() + 2);
        } else if (55296 <= i2 && i2 < 57344) {
            buffer.writeByte(63);
        } else if (i2 < 65536) {
            Segment writableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i4 = writableSegment$okio2.limit;
            bArr2[i4] = (byte) ((i2 >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
            writableSegment$okio2.limit = i4 + 3;
            buffer.setSize$okio(buffer.size() + 3);
        } else {
            if (i2 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i2));
            }
            Segment writableSegment$okio3 = buffer.writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i5 = writableSegment$okio3.limit;
            bArr3[i5] = (byte) ((i2 >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
            writableSegment$okio3.limit = i5 + 4;
            buffer.setSize$okio(buffer.size() + 4);
        }
        return buffer;
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i2, @NotNull byte[] bArr, int i3, int i4) {
        a.s(segment, "segment");
        a.s(bArr, "bytes");
        int i5 = segment.limit;
        byte[] bArr2 = segment.data;
        while (i3 < i4) {
            if (i2 == i5) {
                segment = segment.next;
                a.p(segment);
                byte[] bArr3 = segment.data;
                bArr2 = bArr3;
                i2 = segment.pos;
                i5 = segment.limit;
            }
            if (bArr2[i2] != bArr[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull okio.Buffer buffer, long j2) {
        a.s(buffer, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (buffer.getByte(j3) == 13) {
                String readUtf8 = buffer.readUtf8(j3);
                buffer.skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = buffer.readUtf8(j2);
        buffer.skip(1L);
        return readUtf82;
    }

    public static final <T> T seek(@NotNull okio.Buffer buffer, long j2, @NotNull p pVar) {
        a.s(buffer, "<this>");
        a.s(pVar, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return (T) pVar.invoke(null, -1L);
        }
        if (buffer.size() - j2 < j2) {
            long size = buffer.size();
            while (size > j2) {
                segment = segment.prev;
                a.p(segment);
                size -= segment.limit - segment.pos;
            }
            return (T) pVar.invoke(segment, Long.valueOf(size));
        }
        long j3 = 0;
        while (true) {
            long j4 = (segment.limit - segment.pos) + j3;
            if (j4 > j2) {
                return (T) pVar.invoke(segment, Long.valueOf(j3));
            }
            segment = segment.next;
            a.p(segment);
            j3 = j4;
        }
    }

    public static final int selectPrefix(@NotNull okio.Buffer buffer, @NotNull Options options, boolean z2) {
        int i2;
        int i3;
        Segment segment;
        int i4;
        int i5;
        a.s(buffer, "<this>");
        a.s(options, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        Segment segment2 = buffer.head;
        if (segment2 == null) {
            return z2 ? -2 : -1;
        }
        byte[] bArr = segment2.data;
        int i6 = segment2.pos;
        int i7 = segment2.limit;
        int[] trie$okio = options.getTrie$okio();
        Segment segment3 = segment2;
        int i8 = -1;
        int i9 = 0;
        loop0: while (true) {
            int i10 = i9 + 1;
            int i11 = trie$okio[i9];
            int i12 = i9 + 2;
            int i13 = trie$okio[i10];
            if (i13 != -1) {
                i8 = i13;
            }
            if (segment3 == null) {
                break;
            }
            if (i11 >= 0) {
                i2 = i6 + 1;
                int i14 = bArr[i6] & UnsignedBytes.MAX_VALUE;
                int i15 = i12 + i11;
                while (i12 != i15) {
                    if (i14 == trie$okio[i12]) {
                        i3 = trie$okio[i12 + i11];
                        if (i2 == i7) {
                            segment3 = segment3.next;
                            a.p(segment3);
                            i2 = segment3.pos;
                            bArr = segment3.data;
                            i7 = segment3.limit;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                    } else {
                        i12++;
                    }
                }
                return i8;
            }
            int i16 = (i11 * (-1)) + i12;
            while (true) {
                int i17 = i6 + 1;
                int i18 = i12 + 1;
                if ((bArr[i6] & UnsignedBytes.MAX_VALUE) != trie$okio[i12]) {
                    return i8;
                }
                boolean z3 = i18 == i16;
                if (i17 == i7) {
                    a.p(segment3);
                    Segment segment4 = segment3.next;
                    a.p(segment4);
                    i5 = segment4.pos;
                    byte[] bArr2 = segment4.data;
                    i4 = segment4.limit;
                    if (segment4 != segment2) {
                        segment = segment4;
                        bArr = bArr2;
                    } else {
                        if (!z3) {
                            break loop0;
                        }
                        bArr = bArr2;
                        segment = null;
                    }
                } else {
                    segment = segment3;
                    i4 = i7;
                    i5 = i17;
                }
                if (z3) {
                    i3 = trie$okio[i18];
                    i2 = i5;
                    i7 = i4;
                    segment3 = segment;
                    break;
                }
                i6 = i5;
                i7 = i4;
                segment3 = segment;
                i12 = i18;
            }
            if (i3 >= 0) {
                return i3;
            }
            i9 = -i3;
            i6 = i2;
        }
        if (z2) {
            return -2;
        }
        return i8;
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, Options options, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return selectPrefix(buffer, options, z2);
    }

    public static final int commonRead(@NotNull okio.Buffer buffer, @NotNull byte[] bArr, int i2, int i3) {
        a.s(buffer, "<this>");
        a.s(bArr, "sink");
        SegmentedByteString.checkOffsetAndCount(bArr.length, i2, i3);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i3, segment.limit - segment.pos);
        byte[] bArr2 = segment.data;
        int i4 = segment.pos;
        q.Q(bArr2, i2, bArr, i4, i4 + min);
        segment.pos += min;
        buffer.setSize$okio(buffer.size() - min);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.Buffer buffer, long j2) {
        a.s(buffer, "<this>");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(d.m("byteCount: ", j2).toString());
        }
        if (buffer.size() >= j2) {
            byte[] bArr = new byte[(int) j2];
            buffer.readFully(bArr);
            return bArr;
        }
        throw new EOFException();
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.Buffer buffer, long j2) {
        a.s(buffer, "<this>");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(d.m("byteCount: ", j2).toString());
        }
        if (buffer.size() < j2) {
            throw new EOFException();
        }
        if (j2 >= 4096) {
            ByteString snapshot = buffer.snapshot((int) j2);
            buffer.skip(j2);
            return snapshot;
        }
        return new ByteString(buffer.readByteArray(j2));
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull byte[] bArr) {
        a.s(buffer, "<this>");
        a.s(bArr, "source");
        return buffer.write(bArr, 0, bArr.length);
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull byte[] bArr, int i2, int i3) {
        a.s(buffer, "<this>");
        a.s(bArr, "source");
        long j2 = i3;
        SegmentedByteString.checkOffsetAndCount(bArr.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            Segment writableSegment$okio = buffer.writableSegment$okio(1);
            int min = Math.min(i4 - i2, 8192 - writableSegment$okio.limit);
            int i5 = i2 + min;
            q.Q(bArr, writableSegment$okio.limit, writableSegment$okio.data, i2, i5);
            writableSegment$okio.limit += min;
            i2 = i5;
        }
        buffer.setSize$okio(buffer.size() + j2);
        return buffer;
    }

    public static final void commonReadFully(@NotNull okio.Buffer buffer, @NotNull okio.Buffer buffer2, long j2) {
        a.s(buffer, "<this>");
        a.s(buffer2, "sink");
        if (buffer.size() >= j2) {
            buffer2.write(buffer, j2);
        } else {
            buffer2.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull okio.Buffer buffer, int i2) {
        a.s(buffer, "<this>");
        if (i2 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i2);
        Segment segment = buffer.head;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            a.p(segment);
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
        Segment segment2 = buffer.head;
        int i8 = 0;
        while (i3 < i2) {
            a.p(segment2);
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

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull Source source, long j2) {
        a.s(buffer, "<this>");
        a.s(source, "source");
        while (j2 > 0) {
            long read = source.read(buffer, j2);
            if (read == -1) {
                throw new EOFException();
            }
            j2 -= read;
        }
        return buffer;
    }

    public static final long commonRead(@NotNull okio.Buffer buffer, @NotNull okio.Buffer buffer2, long j2) {
        a.s(buffer, "<this>");
        a.s(buffer2, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(d.m("byteCount < 0: ", j2).toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j2 > buffer.size()) {
            j2 = buffer.size();
        }
        buffer2.write(buffer, j2);
        return j2;
    }

    public static final void commonWrite(@NotNull okio.Buffer buffer, @NotNull okio.Buffer buffer2, long j2) {
        Segment segment;
        a.s(buffer, "<this>");
        a.s(buffer2, "source");
        if (buffer2 != buffer) {
            SegmentedByteString.checkOffsetAndCount(buffer2.size(), 0L, j2);
            while (j2 > 0) {
                Segment segment2 = buffer2.head;
                a.p(segment2);
                int i2 = segment2.limit;
                a.p(buffer2.head);
                if (j2 < i2 - r1.pos) {
                    Segment segment3 = buffer.head;
                    if (segment3 != null) {
                        a.p(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j2) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = buffer2.head;
                            a.p(segment4);
                            segment4.writeTo(segment, (int) j2);
                            buffer2.setSize$okio(buffer2.size() - j2);
                            buffer.setSize$okio(buffer.size() + j2);
                            return;
                        }
                    }
                    Segment segment5 = buffer2.head;
                    a.p(segment5);
                    buffer2.head = segment5.split((int) j2);
                }
                Segment segment6 = buffer2.head;
                a.p(segment6);
                long j3 = segment6.limit - segment6.pos;
                buffer2.head = segment6.pop();
                Segment segment7 = buffer.head;
                if (segment7 == null) {
                    buffer.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    a.p(segment7);
                    Segment segment8 = segment7.prev;
                    a.p(segment8);
                    segment8.push(segment6).compact();
                }
                buffer2.setSize$okio(buffer2.size() - j3);
                buffer.setSize$okio(buffer.size() + j3);
                j2 -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public static final long commonIndexOf(@NotNull okio.Buffer buffer, @NotNull ByteString byteString, long j2) {
        long j3;
        int i2;
        long j4 = j2;
        a.s(buffer, "<this>");
        a.s(byteString, "bytes");
        if (byteString.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j5 = 0;
        if (j4 >= 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                return -1L;
            }
            if (buffer.size() - j4 < j4) {
                j3 = buffer.size();
                while (j3 > j4) {
                    segment = segment.prev;
                    a.p(segment);
                    j3 -= segment.limit - segment.pos;
                }
                byte[] internalArray$okio = byteString.internalArray$okio();
                byte b2 = internalArray$okio[0];
                int size = byteString.size();
                long size2 = (buffer.size() - size) + 1;
                while (j3 < size2) {
                    byte[] bArr = segment.data;
                    int min = (int) Math.min(segment.limit, (segment.pos + size2) - j3);
                    i2 = (int) ((segment.pos + j4) - j3);
                    while (i2 < min) {
                        if (bArr[i2] != b2 || !rangeEquals(segment, i2 + 1, internalArray$okio, 1, size)) {
                            i2++;
                        }
                    }
                    j3 += segment.limit - segment.pos;
                    segment = segment.next;
                    a.p(segment);
                    j4 = j3;
                }
                return -1L;
            }
            while (true) {
                long j6 = (segment.limit - segment.pos) + j5;
                if (j6 > j4) {
                    break;
                }
                segment = segment.next;
                a.p(segment);
                j5 = j6;
            }
            byte[] internalArray$okio2 = byteString.internalArray$okio();
            byte b3 = internalArray$okio2[0];
            int size3 = byteString.size();
            long size4 = (buffer.size() - size3) + 1;
            j3 = j5;
            while (j3 < size4) {
                byte[] bArr2 = segment.data;
                long j7 = size4;
                int min2 = (int) Math.min(segment.limit, (segment.pos + size4) - j3);
                i2 = (int) ((segment.pos + j4) - j3);
                while (i2 < min2) {
                    if (bArr2[i2] == b3 && rangeEquals(segment, i2 + 1, internalArray$okio2, 1, size3)) {
                    }
                    i2++;
                }
                j3 += segment.limit - segment.pos;
                segment = segment.next;
                a.p(segment);
                size4 = j7;
                j4 = j3;
            }
            return -1L;
            return (i2 - segment.pos) + j3;
        }
        throw new IllegalArgumentException(d.m("fromIndex < 0: ", j4).toString());
    }
}
