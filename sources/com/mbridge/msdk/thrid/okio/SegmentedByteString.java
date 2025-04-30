package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SegmentedByteString extends ByteString {
    final transient int[] directory;
    final transient byte[][] segments;

    public SegmentedByteString(Buffer buffer, int i9) {
        super(null);
        Util.checkOffsetAndCount(buffer.size, 0L, i9);
        Segment segment = buffer.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            int i13 = segment.limit;
            int i14 = segment.pos;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.segments = new byte[i12];
        this.directory = new int[i12 * 2];
        Segment segment2 = buffer.head;
        int i15 = 0;
        while (i10 < i9) {
            byte[][] bArr = this.segments;
            bArr[i15] = segment2.data;
            int i16 = segment2.limit;
            int i17 = segment2.pos;
            int i18 = (i16 - i17) + i10;
            if (i18 > i9) {
                i10 = i9;
            } else {
                i10 = i18;
            }
            int[] iArr = this.directory;
            iArr[i15] = i10;
            iArr[bArr.length + i15] = i17;
            segment2.shared = true;
            i15++;
            segment2 = segment2.next;
        }
    }

    private int segment(int i9) {
        int binarySearch = Arrays.binarySearch(this.directory, 0, this.segments.length, i9 + 1);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        return binarySearch;
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
    public byte getByte(int i9) {
        int i10;
        Util.checkOffsetAndCount(this.directory[this.segments.length - 1], i9, 1L);
        int segment = segment(i9);
        if (segment == 0) {
            i10 = 0;
        } else {
            i10 = this.directory[segment - 1];
        }
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        return bArr[segment][(i9 - i10) + iArr[bArr.length + segment]];
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public int hashCode() {
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int length = this.segments.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            byte[] bArr = this.segments[i10];
            int[] iArr = this.directory;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.hashCode = i11;
        return i11;
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
    public int indexOf(byte[] bArr, int i9) {
        return toByteString().indexOf(bArr, i9);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public byte[] internalArray() {
        return toByteArray();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public int lastIndexOf(byte[] bArr, int i9) {
        return toByteString().lastIndexOf(bArr, i9);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString md5() {
        return toByteString().md5();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public boolean rangeEquals(int i9, ByteString byteString, int i10, int i11) {
        if (i9 < 0 || i9 > size() - i11) {
            return false;
        }
        int segment = segment(i9);
        while (i11 > 0) {
            int i12 = segment == 0 ? 0 : this.directory[segment - 1];
            int min = Math.min(i11, ((this.directory[segment] - i12) + i12) - i9);
            int[] iArr = this.directory;
            byte[][] bArr = this.segments;
            if (!byteString.rangeEquals(i10, bArr[segment], (i9 - i12) + iArr[bArr.length + segment], min)) {
                return false;
            }
            i9 += min;
            i10 += min;
            i11 -= min;
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
    public ByteString substring(int i9) {
        return toByteString().substring(i9);
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
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int[] iArr2 = this.directory;
            int i11 = iArr2[length + i9];
            int i12 = iArr2[i9];
            System.arraycopy(this.segments[i9], i11, bArr2, i10, i12 - i10);
            i9++;
            i10 = i12;
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
            int i9 = 0;
            int i10 = 0;
            while (i9 < length) {
                int[] iArr = this.directory;
                int i11 = iArr[length + i9];
                int i12 = iArr[i9];
                outputStream.write(this.segments[i9], i11, i12 - i10);
                i9++;
                i10 = i12;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString substring(int i9, int i10) {
        return toByteString().substring(i9, i10);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public void write(Buffer buffer) {
        int length = this.segments.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int[] iArr = this.directory;
            int i11 = iArr[length + i9];
            int i12 = iArr[i9];
            Segment segment = new Segment(this.segments[i9], i11, (i11 + i12) - i10, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                segment2.prev.push(segment);
            }
            i9++;
            i10 = i12;
        }
        buffer.size += i10;
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public boolean rangeEquals(int i9, byte[] bArr, int i10, int i11) {
        if (i9 < 0 || i9 > size() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int segment = segment(i9);
        while (i11 > 0) {
            int i12 = segment == 0 ? 0 : this.directory[segment - 1];
            int min = Math.min(i11, ((this.directory[segment] - i12) + i12) - i9);
            int[] iArr = this.directory;
            byte[][] bArr2 = this.segments;
            if (!Util.arrayRangeEquals(bArr2[segment], (i9 - i12) + iArr[bArr2.length + segment], bArr, i10, min)) {
                return false;
            }
            i9 += min;
            i10 += min;
            i11 -= min;
            segment++;
        }
        return true;
    }
}
