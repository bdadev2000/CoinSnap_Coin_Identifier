package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SegmentedByteString extends ByteString {
    final transient int[] directory;
    final transient byte[][] segments;

    public SegmentedByteString(Buffer buffer, int i10) {
        super(null);
        Util.checkOffsetAndCount(buffer.size, 0L, i10);
        Segment segment = buffer.head;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = segment.limit;
            int i15 = segment.pos;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.segments = new byte[i13];
        this.directory = new int[i13 * 2];
        Segment segment2 = buffer.head;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.segments;
            bArr[i16] = segment2.data;
            int i17 = segment2.limit;
            int i18 = segment2.pos;
            int i19 = (i17 - i18) + i11;
            if (i19 > i10) {
                i11 = i10;
            } else {
                i11 = i19;
            }
            int[] iArr = this.directory;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            segment2.shared = true;
            i16++;
            segment2 = segment2.next;
        }
    }

    private int segment(int i10) {
        int binarySearch = Arrays.binarySearch(this.directory, 0, this.segments.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private Object writeReplace() {
        return toByteString();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public byte getByte(int i10) {
        int i11;
        Util.checkOffsetAndCount(this.directory[this.segments.length - 1], i10, 1L);
        int segment = segment(i10);
        if (segment == 0) {
            i11 = 0;
        } else {
            i11 = this.directory[segment - 1];
        }
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        return bArr[segment][(i10 - i11) + iArr[bArr.length + segment]];
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int length = this.segments.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.segments[i11];
            int[] iArr = this.directory;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.hashCode = i12;
        return i12;
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString hmacSha1(ByteString byteString) {
        return toByteString().hmacSha1(byteString);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString hmacSha256(ByteString byteString) {
        return toByteString().hmacSha256(byteString);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public int indexOf(byte[] bArr, int i10) {
        return toByteString().indexOf(bArr, i10);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public byte[] internalArray() {
        return toByteArray();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public int lastIndexOf(byte[] bArr, int i10) {
        return toByteString().lastIndexOf(bArr, i10);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString md5() {
        return toByteString().md5();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public boolean rangeEquals(int i10, ByteString byteString, int i11, int i12) {
        if (i10 < 0 || i10 > size() - i12) {
            return false;
        }
        int segment = segment(i10);
        while (i12 > 0) {
            int i13 = segment == 0 ? 0 : this.directory[segment - 1];
            int min = Math.min(i12, ((this.directory[segment] - i13) + i13) - i10);
            int[] iArr = this.directory;
            byte[][] bArr = this.segments;
            if (!byteString.rangeEquals(i11, bArr[segment], (i10 - i13) + iArr[bArr.length + segment], min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            segment++;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString sha1() {
        return toByteString().sha1();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString sha256() {
        return toByteString().sha256();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public int size() {
        return this.directory[this.segments.length - 1];
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public String string(Charset charset) {
        return toByteString().string(charset);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString substring(int i10) {
        return toByteString().substring(i10);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public byte[] toByteArray() {
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.directory;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.segments[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public String utf8() {
        return toByteString().utf8();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public void write(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            int length = this.segments.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int[] iArr = this.directory;
                int i12 = iArr[length + i10];
                int i13 = iArr[i10];
                outputStream.write(this.segments[i10], i12, i13 - i11);
                i10++;
                i11 = i13;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString substring(int i10, int i11) {
        return toByteString().substring(i10, i11);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public void write(Buffer buffer) {
        int length = this.segments.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.directory;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            Segment segment = new Segment(this.segments[i10], i12, (i12 + i13) - i11, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                segment2.prev.push(segment);
            }
            i10++;
            i11 = i13;
        }
        buffer.size += i11;
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public boolean rangeEquals(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > size() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int segment = segment(i10);
        while (i12 > 0) {
            int i13 = segment == 0 ? 0 : this.directory[segment - 1];
            int min = Math.min(i12, ((this.directory[segment] - i13) + i13) - i10);
            int[] iArr = this.directory;
            byte[][] bArr2 = this.segments;
            if (!Util.arrayRangeEquals(bArr2[segment], (i10 - i13) + iArr[bArr2.length + segment], bArr, i11, min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            segment++;
        }
        return true;
    }
}
