package org.objectweb.asm;

import okhttp3.internal.http2.Settings;

/* loaded from: classes4.dex */
public class ByteVector {
    byte[] data;
    int length;

    public ByteVector() {
        this.data = new byte[64];
    }

    private void enlarge(int i2) {
        byte[] bArr = this.data;
        int length = bArr.length * 2;
        int i3 = this.length;
        int i4 = i2 + i3;
        if (length <= i4) {
            length = i4;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        this.data = bArr2;
    }

    public final ByteVector encodeUtf8(String str, int i2, int i3) {
        int length = str.length();
        int i4 = i2;
        int i5 = i4;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            i5 = (charAt < 1 || charAt > 127) ? charAt <= 2047 ? i5 + 2 : i5 + 3 : i5 + 1;
            i4++;
        }
        if (i5 > i3) {
            throw new IllegalArgumentException("UTF8 string too large");
        }
        int i6 = this.length;
        int i7 = i6 - i2;
        int i8 = i7 - 2;
        if (i8 >= 0) {
            byte[] bArr = this.data;
            bArr[i8] = (byte) (i5 >>> 8);
            bArr[i7 - 1] = (byte) i5;
        }
        if ((i6 + i5) - i2 > this.data.length) {
            enlarge(i5 - i2);
        }
        int i9 = this.length;
        while (i2 < length) {
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 1 && charAt2 <= 127) {
                this.data[i9] = (byte) charAt2;
                i9++;
            } else if (charAt2 <= 2047) {
                byte[] bArr2 = this.data;
                int i10 = i9 + 1;
                bArr2[i9] = (byte) (((charAt2 >> 6) & 31) | Opcodes.CHECKCAST);
                i9 += 2;
                bArr2[i10] = (byte) ((charAt2 & '?') | 128);
            } else {
                byte[] bArr3 = this.data;
                bArr3[i9] = (byte) (((charAt2 >> '\f') & 15) | 224);
                int i11 = i9 + 2;
                bArr3[i9 + 1] = (byte) (((charAt2 >> 6) & 63) | 128);
                i9 += 3;
                bArr3[i11] = (byte) ((charAt2 & '?') | 128);
            }
            i2++;
        }
        this.length = i9;
        return this;
    }

    public final ByteVector put11(int i2, int i3) {
        int i4 = this.length;
        if (i4 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        bArr[i4] = (byte) i2;
        bArr[i4 + 1] = (byte) i3;
        this.length = i4 + 2;
        return this;
    }

    public final ByteVector put112(int i2, int i3, int i4) {
        int i5 = this.length;
        if (i5 + 4 > this.data.length) {
            enlarge(4);
        }
        byte[] bArr = this.data;
        bArr[i5] = (byte) i2;
        bArr[i5 + 1] = (byte) i3;
        bArr[i5 + 2] = (byte) (i4 >>> 8);
        bArr[i5 + 3] = (byte) i4;
        this.length = i5 + 4;
        return this;
    }

    public final ByteVector put12(int i2, int i3) {
        int i4 = this.length;
        if (i4 + 3 > this.data.length) {
            enlarge(3);
        }
        byte[] bArr = this.data;
        bArr[i4] = (byte) i2;
        bArr[i4 + 1] = (byte) (i3 >>> 8);
        bArr[i4 + 2] = (byte) i3;
        this.length = i4 + 3;
        return this;
    }

    public final ByteVector put122(int i2, int i3, int i4) {
        int i5 = this.length;
        if (i5 + 5 > this.data.length) {
            enlarge(5);
        }
        byte[] bArr = this.data;
        bArr[i5] = (byte) i2;
        bArr[i5 + 1] = (byte) (i3 >>> 8);
        bArr[i5 + 2] = (byte) i3;
        bArr[i5 + 3] = (byte) (i4 >>> 8);
        bArr[i5 + 4] = (byte) i4;
        this.length = i5 + 5;
        return this;
    }

    public ByteVector putByte(int i2) {
        int i3 = this.length;
        int i4 = i3 + 1;
        if (i4 > this.data.length) {
            enlarge(1);
        }
        this.data[i3] = (byte) i2;
        this.length = i4;
        return this;
    }

    public ByteVector putByteArray(byte[] bArr, int i2, int i3) {
        if (this.length + i3 > this.data.length) {
            enlarge(i3);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i2, this.data, this.length, i3);
        }
        this.length += i3;
        return this;
    }

    public ByteVector putInt(int i2) {
        int i3 = this.length;
        if (i3 + 4 > this.data.length) {
            enlarge(4);
        }
        byte[] bArr = this.data;
        bArr[i3] = (byte) (i2 >>> 24);
        bArr[i3 + 1] = (byte) (i2 >>> 16);
        bArr[i3 + 2] = (byte) (i2 >>> 8);
        bArr[i3 + 3] = (byte) i2;
        this.length = i3 + 4;
        return this;
    }

    public ByteVector putLong(long j2) {
        int i2 = this.length;
        if (i2 + 8 > this.data.length) {
            enlarge(8);
        }
        byte[] bArr = this.data;
        int i3 = (int) (j2 >>> 32);
        bArr[i2] = (byte) (i3 >>> 24);
        bArr[i2 + 1] = (byte) (i3 >>> 16);
        bArr[i2 + 2] = (byte) (i3 >>> 8);
        bArr[i2 + 3] = (byte) i3;
        int i4 = (int) j2;
        bArr[i2 + 4] = (byte) (i4 >>> 24);
        bArr[i2 + 5] = (byte) (i4 >>> 16);
        bArr[i2 + 6] = (byte) (i4 >>> 8);
        bArr[i2 + 7] = (byte) i4;
        this.length = i2 + 8;
        return this;
    }

    public ByteVector putShort(int i2) {
        int i3 = this.length;
        if (i3 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        bArr[i3] = (byte) (i2 >>> 8);
        bArr[i3 + 1] = (byte) i2;
        this.length = i3 + 2;
        return this;
    }

    public ByteVector putUTF8(String str) {
        int length = str.length();
        if (length > 65535) {
            throw new IllegalArgumentException("UTF8 string too large");
        }
        int i2 = this.length;
        if (i2 + 2 + length > this.data.length) {
            enlarge(length + 2);
        }
        byte[] bArr = this.data;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (length >>> 8);
        int i4 = i2 + 2;
        bArr[i3] = (byte) length;
        int i5 = 0;
        while (i5 < length) {
            char charAt = str.charAt(i5);
            if (charAt < 1 || charAt > 127) {
                this.length = i4;
                return encodeUtf8(str, i5, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
            bArr[i4] = (byte) charAt;
            i5++;
            i4++;
        }
        this.length = i4;
        return this;
    }

    public ByteVector(int i2) {
        this.data = new byte[i2];
    }

    public ByteVector(byte[] bArr) {
        this.data = bArr;
        this.length = bArr.length;
    }
}
