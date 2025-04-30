package com.mbridge.msdk.playercommon.exoplayer2.util;

import Q7.n0;
import com.mbridge.msdk.foundation.entity.o;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class ParsableByteArray {
    public byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
    }

    public final int bytesLeft() {
        return this.limit - this.position;
    }

    public final int capacity() {
        byte[] bArr = this.data;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int limit() {
        return this.limit;
    }

    public final char peekChar() {
        byte[] bArr = this.data;
        int i9 = this.position;
        return (char) ((bArr[i9 + 1] & 255) | ((bArr[i9] & 255) << 8));
    }

    public final int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public final void readBytes(ParsableBitArray parsableBitArray, int i9) {
        readBytes(parsableBitArray.data, 0, i9);
        parsableBitArray.setPosition(0);
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final int readInt() {
        byte[] bArr = this.data;
        int i9 = this.position;
        int i10 = i9 + 1;
        this.position = i10;
        int i11 = (bArr[i9] & 255) << 24;
        int i12 = i9 + 2;
        this.position = i12;
        int i13 = ((bArr[i10] & 255) << 16) | i11;
        int i14 = i9 + 3;
        this.position = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.position = i9 + 4;
        return (bArr[i14] & 255) | i15;
    }

    public final int readInt24() {
        byte[] bArr = this.data;
        int i9 = this.position;
        int i10 = i9 + 1;
        this.position = i10;
        int i11 = ((bArr[i9] & 255) << 24) >> 8;
        int i12 = i9 + 2;
        this.position = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        this.position = i9 + 3;
        return (bArr[i12] & 255) | i13;
    }

    public final String readLine() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i9 = this.position;
        while (i9 < this.limit && !Util.isLinebreak(this.data[i9])) {
            i9++;
        }
        int i10 = this.position;
        if (i9 - i10 >= 3) {
            byte[] bArr = this.data;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.position = i10 + 3;
            }
        }
        byte[] bArr2 = this.data;
        int i11 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr2, i11, i9 - i11);
        this.position = i9;
        int i12 = this.limit;
        if (i9 == i12) {
            return fromUtf8Bytes;
        }
        byte[] bArr3 = this.data;
        if (bArr3[i9] == 13) {
            int i13 = i9 + 1;
            this.position = i13;
            if (i13 == i12) {
                return fromUtf8Bytes;
            }
        }
        int i14 = this.position;
        if (bArr3[i14] == 10) {
            this.position = i14 + 1;
        }
        return fromUtf8Bytes;
    }

    public final int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i9 = this.position;
        int i10 = i9 + 1;
        this.position = i10;
        int i11 = bArr[i9] & 255;
        int i12 = i9 + 2;
        this.position = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i9 + 3;
        this.position = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.position = i9 + 4;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public final int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i9 = this.position;
        int i10 = i9 + 1;
        this.position = i10;
        int i11 = bArr[i9] & 255;
        int i12 = i9 + 2;
        this.position = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        this.position = i9 + 3;
        return ((bArr[i12] & 255) << 16) | i13;
    }

    public final long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i9 = this.position;
        this.position = i9 + 1;
        this.position = i9 + 2;
        this.position = i9 + 3;
        long j7 = (bArr[i9] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.position = i9 + 4;
        long j9 = j7 | ((bArr[r8] & 255) << 24);
        this.position = i9 + 5;
        long j10 = j9 | ((bArr[r7] & 255) << 32);
        this.position = i9 + 6;
        long j11 = j10 | ((bArr[r8] & 255) << 40);
        this.position = i9 + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 48);
        this.position = i9 + 8;
        return ((bArr[r8] & 255) << 56) | j12;
    }

    public final short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i9 = this.position;
        int i10 = i9 + 1;
        this.position = i10;
        int i11 = bArr[i9] & 255;
        this.position = i9 + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public final long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i9 = this.position;
        this.position = i9 + 1;
        this.position = i9 + 2;
        this.position = i9 + 3;
        long j7 = (bArr[i9] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.position = i9 + 4;
        return ((bArr[r4] & 255) << 24) | j7;
    }

    public final int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i9 = this.position;
        int i10 = i9 + 1;
        this.position = i10;
        int i11 = bArr[i9] & 255;
        int i12 = i9 + 2;
        this.position = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        this.position = i9 + 3;
        return ((bArr[i12] & 255) << 16) | i13;
    }

    public final int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        throw new IllegalStateException(o.h(readLittleEndianInt, "Top bit not zero: "));
    }

    public final int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i9 = this.position;
        int i10 = i9 + 1;
        this.position = i10;
        int i11 = bArr[i9] & 255;
        this.position = i9 + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final long readLong() {
        byte[] bArr = this.data;
        int i9 = this.position;
        this.position = i9 + 1;
        this.position = i9 + 2;
        this.position = i9 + 3;
        long j7 = ((bArr[i9] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.position = i9 + 4;
        long j9 = j7 | ((bArr[r4] & 255) << 32);
        this.position = i9 + 5;
        long j10 = j9 | ((bArr[r7] & 255) << 24);
        this.position = i9 + 6;
        long j11 = j10 | ((bArr[r4] & 255) << 16);
        this.position = i9 + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 8);
        this.position = i9 + 8;
        return (bArr[r4] & 255) | j12;
    }

    public final String readNullTerminatedString(int i9) {
        if (i9 == 0) {
            return "";
        }
        int i10 = this.position;
        int i11 = (i10 + i9) - 1;
        String fromUtf8Bytes = Util.fromUtf8Bytes(this.data, i10, (i11 >= this.limit || this.data[i11] != 0) ? i9 : i9 - 1);
        this.position += i9;
        return fromUtf8Bytes;
    }

    public final short readShort() {
        byte[] bArr = this.data;
        int i9 = this.position;
        int i10 = i9 + 1;
        this.position = i10;
        int i11 = (bArr[i9] & 255) << 8;
        this.position = i9 + 2;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public final String readString(int i9) {
        return readString(i9, Charset.forName("UTF-8"));
    }

    public final int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public final int readUnsignedByte() {
        byte[] bArr = this.data;
        int i9 = this.position;
        this.position = i9 + 1;
        return bArr[i9] & 255;
    }

    public final int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i9 = this.position;
        int i10 = i9 + 1;
        this.position = i10;
        int i11 = (bArr[i9] & 255) << 8;
        this.position = i9 + 2;
        int i12 = (bArr[i10] & 255) | i11;
        this.position = i9 + 4;
        return i12;
    }

    public final long readUnsignedInt() {
        byte[] bArr = this.data;
        int i9 = this.position;
        this.position = i9 + 1;
        this.position = i9 + 2;
        this.position = i9 + 3;
        long j7 = ((bArr[i9] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.position = i9 + 4;
        return (bArr[r4] & 255) | j7;
    }

    public final int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i9 = this.position;
        int i10 = i9 + 1;
        this.position = i10;
        int i11 = (bArr[i9] & 255) << 16;
        int i12 = i9 + 2;
        this.position = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        this.position = i9 + 3;
        return (bArr[i12] & 255) | i13;
    }

    public final int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new IllegalStateException(o.h(readInt, "Top bit not zero: "));
    }

    public final long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        throw new IllegalStateException(n0.g(readLong, "Top bit not zero: "));
    }

    public final int readUnsignedShort() {
        byte[] bArr = this.data;
        int i9 = this.position;
        int i10 = i9 + 1;
        this.position = i10;
        int i11 = (bArr[i9] & 255) << 8;
        this.position = i9 + 2;
        return (bArr[i10] & 255) | i11;
    }

    public final long readUtf8EncodedLong() {
        int i9;
        int i10;
        long j7 = this.data[this.position];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j7) != 0) {
                i11--;
            } else if (i11 < 6) {
                j7 &= r6 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 != 0) {
            for (i9 = 1; i9 < i10; i9++) {
                if ((this.data[this.position + i9] & 192) == 128) {
                    j7 = (j7 << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException(n0.g(j7, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.position += i10;
            return j7;
        }
        throw new NumberFormatException(n0.g(j7, "Invalid UTF-8 sequence first byte: "));
    }

    public final void reset(int i9) {
        reset(capacity() < i9 ? new byte[i9] : this.data, i9);
    }

    public final void setLimit(int i9) {
        boolean z8;
        if (i9 >= 0 && i9 <= this.data.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        this.limit = i9;
    }

    public final void setPosition(int i9) {
        boolean z8;
        if (i9 >= 0 && i9 <= this.limit) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        this.position = i9;
    }

    public final void skipBytes(int i9) {
        setPosition(this.position + i9);
    }

    public ParsableByteArray(int i9) {
        this.data = new byte[i9];
        this.limit = i9;
    }

    public final String readString(int i9, Charset charset) {
        String str = new String(this.data, this.position, i9, charset);
        this.position += i9;
        return str;
    }

    public final void reset(byte[] bArr, int i9) {
        this.data = bArr;
        this.limit = i9;
        this.position = 0;
    }

    public final void readBytes(byte[] bArr, int i9, int i10) {
        System.arraycopy(this.data, this.position, bArr, i9, i10);
        this.position += i10;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public final void readBytes(ByteBuffer byteBuffer, int i9) {
        byteBuffer.put(this.data, this.position, i9);
        this.position += i9;
    }

    public final void reset() {
        this.position = 0;
        this.limit = 0;
    }

    public final String readNullTerminatedString() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i9 = this.position;
        while (i9 < this.limit && this.data[i9] != 0) {
            i9++;
        }
        byte[] bArr = this.data;
        int i10 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr, i10, i9 - i10);
        this.position = i9;
        if (i9 < this.limit) {
            this.position = i9 + 1;
        }
        return fromUtf8Bytes;
    }

    public ParsableByteArray(byte[] bArr, int i9) {
        this.data = bArr;
        this.limit = i9;
    }
}
