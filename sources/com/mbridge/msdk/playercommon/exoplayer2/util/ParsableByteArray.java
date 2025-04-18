package com.mbridge.msdk.playercommon.exoplayer2.util;

import eb.j;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes4.dex */
public final class ParsableByteArray {
    public byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
    }

    public ParsableByteArray(int i10) {
        this.data = new byte[i10];
        this.limit = i10;
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
        int i10 = this.position;
        return (char) ((bArr[i10 + 1] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 8));
    }

    public final int peekUnsignedByte() {
        return this.data[this.position] & UByte.MAX_VALUE;
    }

    public final void readBytes(ParsableBitArray parsableBitArray, int i10) {
        readBytes(parsableBitArray.data, 0, i10);
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
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i11] & UByte.MAX_VALUE) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & UByte.MAX_VALUE) << 8);
        this.position = i14 + 1;
        return (bArr[i14] & UByte.MAX_VALUE) | i15;
    }

    public final int readInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (((bArr[i10] & UByte.MAX_VALUE) << 24) >> 8) | ((bArr[i11] & UByte.MAX_VALUE) << 8);
        this.position = i12 + 1;
        return (bArr[i12] & UByte.MAX_VALUE) | i13;
    }

    public final String readLine() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i10 = this.position;
        while (i10 < this.limit && !Util.isLinebreak(this.data[i10])) {
            i10++;
        }
        int i11 = this.position;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.data;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.position = i11 + 3;
            }
        }
        byte[] bArr2 = this.data;
        int i12 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr2, i12, i10 - i12);
        this.position = i10;
        int i13 = this.limit;
        if (i10 == i13) {
            return fromUtf8Bytes;
        }
        byte[] bArr3 = this.data;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.position = i14;
            if (i14 == i13) {
                return fromUtf8Bytes;
            }
        }
        int i15 = this.position;
        if (bArr3[i15] == 10) {
            this.position = i15 + 1;
        }
        return fromUtf8Bytes;
    }

    public final int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i11] & UByte.MAX_VALUE) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & UByte.MAX_VALUE) << 16);
        this.position = i14 + 1;
        return ((bArr[i14] & UByte.MAX_VALUE) << 24) | i15;
    }

    public final int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i11] & UByte.MAX_VALUE) << 8);
        this.position = i12 + 1;
        return ((bArr[i12] & UByte.MAX_VALUE) << 16) | i13;
    }

    public final long readLittleEndianLong() {
        byte[] bArr = this.data;
        long j3 = bArr[r1] & 255;
        int i10 = this.position + 1 + 1 + 1;
        long j10 = j3 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        long j11 = j10 | ((bArr[i10] & 255) << 24);
        long j12 = j11 | ((bArr[r3] & 255) << 32);
        long j13 = j12 | ((bArr[r4] & 255) << 40);
        long j14 = j13 | ((bArr[r3] & 255) << 48);
        this.position = i10 + 1 + 1 + 1 + 1 + 1;
        return j14 | ((bArr[r4] & 255) << 56);
    }

    public final short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        this.position = i11 + 1;
        return (short) (((bArr[i11] & UByte.MAX_VALUE) << 8) | i12);
    }

    public final long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        long j3 = bArr[r1] & 255;
        int i10 = this.position + 1 + 1 + 1;
        long j10 = j3 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.position = i10 + 1;
        return j10 | ((bArr[i10] & 255) << 24);
    }

    public final int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i11] & UByte.MAX_VALUE) << 8);
        this.position = i12 + 1;
        return ((bArr[i12] & UByte.MAX_VALUE) << 16) | i13;
    }

    public final int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        throw new IllegalStateException(j.i("Top bit not zero: ", readLittleEndianInt));
    }

    public final int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        this.position = i11 + 1;
        return ((bArr[i11] & UByte.MAX_VALUE) << 8) | i12;
    }

    public final long readLong() {
        byte[] bArr = this.data;
        long j3 = (bArr[r1] & 255) << 56;
        int i10 = this.position + 1 + 1 + 1;
        long j10 = j3 | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j11 = j10 | ((bArr[i10] & 255) << 32);
        long j12 = j11 | ((bArr[r3] & 255) << 24);
        long j13 = j12 | ((bArr[r4] & 255) << 16);
        long j14 = j13 | ((bArr[r3] & 255) << 8);
        this.position = i10 + 1 + 1 + 1 + 1 + 1;
        return j14 | (bArr[r4] & 255);
    }

    public final String readNullTerminatedString(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.position;
        int i12 = (i11 + i10) - 1;
        String fromUtf8Bytes = Util.fromUtf8Bytes(this.data, i11, (i12 >= this.limit || this.data[i12] != 0) ? i10 : i10 - 1);
        this.position += i10;
        return fromUtf8Bytes;
    }

    public final short readShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) << 8;
        this.position = i11 + 1;
        return (short) ((bArr[i11] & UByte.MAX_VALUE) | i12);
    }

    public final String readString(int i10) {
        return readString(i10, Charset.forName("UTF-8"));
    }

    public final int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public final int readUnsignedByte() {
        byte[] bArr = this.data;
        int i10 = this.position;
        this.position = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    public final int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = (bArr[i11] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 8);
        this.position = i11 + 1 + 2;
        return i12;
    }

    public final long readUnsignedInt() {
        byte[] bArr = this.data;
        long j3 = (bArr[r1] & 255) << 24;
        int i10 = this.position + 1 + 1 + 1;
        long j10 = j3 | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.position = i10 + 1;
        return j10 | (bArr[i10] & 255);
    }

    public final int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & UByte.MAX_VALUE) << 16) | ((bArr[i11] & UByte.MAX_VALUE) << 8);
        this.position = i12 + 1;
        return (bArr[i12] & UByte.MAX_VALUE) | i13;
    }

    public final int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new IllegalStateException(j.i("Top bit not zero: ", readInt));
    }

    public final long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        throw new IllegalStateException(a.k("Top bit not zero: ", readLong));
    }

    public final int readUnsignedShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) << 8;
        this.position = i11 + 1;
        return (bArr[i11] & UByte.MAX_VALUE) | i12;
    }

    public final long readUtf8EncodedLong() {
        int i10;
        int i11;
        long j3 = this.data[this.position];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j3) != 0) {
                i12--;
            } else if (i12 < 6) {
                j3 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            for (i10 = 1; i10 < i11; i10++) {
                if ((this.data[this.position + i10] & 192) == 128) {
                    j3 = (j3 << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException(a.k("Invalid UTF-8 sequence continuation byte: ", j3));
                }
            }
            this.position += i11;
            return j3;
        }
        throw new NumberFormatException(a.k("Invalid UTF-8 sequence first byte: ", j3));
    }

    public final void reset(int i10) {
        reset(capacity() < i10 ? new byte[i10] : this.data, i10);
    }

    public final void setLimit(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.data.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        this.limit = i10;
    }

    public final void setPosition(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.limit) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        this.position = i10;
    }

    public final void skipBytes(int i10) {
        setPosition(this.position + i10);
    }

    public final String readString(int i10, Charset charset) {
        String str = new String(this.data, this.position, i10, charset);
        this.position += i10;
        return str;
    }

    public final void reset(byte[] bArr, int i10) {
        this.data = bArr;
        this.limit = i10;
        this.position = 0;
    }

    public final void readBytes(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.data, this.position, bArr, i10, i11);
        this.position += i11;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public final void readBytes(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put(this.data, this.position, i10);
        this.position += i10;
    }

    public final String readNullTerminatedString() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i10 = this.position;
        while (i10 < this.limit && this.data[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.data;
        int i11 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr, i11, i10 - i11);
        this.position = i10;
        if (i10 < this.limit) {
            this.position = i10 + 1;
        }
        return fromUtf8Bytes;
    }

    public final void reset() {
        this.position = 0;
        this.limit = 0;
    }

    public ParsableByteArray(byte[] bArr, int i10) {
        this.data = bArr;
        this.limit = i10;
    }
}
