package com.meta.analytics.dsp.uinode;

import androidx.core.view.MotionEventCompat;

/* renamed from: com.facebook.ads.redexgen.X.Hy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1216Hy {
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public C1216Hy() {
    }

    public C1216Hy(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C1216Hy(byte[] bArr, int i9) {
        this.A00 = bArr;
        this.A02 = i9;
    }

    private void A00() {
        int i9;
        int i10 = this.A03;
        AbstractC1192Ha.A04(i10 >= 0 && (i10 < (i9 = this.A02) || (i10 == i9 && this.A01 == 0)));
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        AbstractC1192Ha.A04(this.A01 == 0);
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int i9) {
        int i10;
        if (i9 == 0) {
            return 0;
        }
        int i11 = 0;
        this.A01 += i9;
        while (true) {
            i10 = this.A01;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.A01 = i12;
            byte[] bArr = this.A00;
            int returnValue = this.A03;
            this.A03 = returnValue + 1;
            i11 |= (bArr[returnValue] & 255) << i12;
        }
        byte[] bArr2 = this.A00;
        int i13 = this.A03;
        int returnValue2 = bArr2[i13] & 255;
        int i14 = i11 | (returnValue2 >> (8 - i10));
        int returnValue3 = 32 - i9;
        int i15 = i14 & ((-1) >>> returnValue3);
        if (i10 == 8) {
            this.A01 = 0;
            this.A03 = i13 + 1;
        }
        A00();
        return i15;
    }

    public final void A05() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    public final void A06() {
        int i9 = this.A01 + 1;
        this.A01 = i9;
        if (i9 == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
    }

    public final void A07(int i9) {
        int i10 = i9 / 8;
        this.A03 = i10;
        this.A01 = i9 - (i10 * 8);
        A00();
    }

    public final void A08(int i9) {
        int numBytes = i9 / 8;
        int i10 = this.A03 + numBytes;
        this.A03 = i10;
        int i11 = this.A01 + (i9 - (numBytes * 8));
        this.A01 = i11;
        if (i11 > 7) {
            this.A03 = i10 + 1;
            this.A01 = i11 - 8;
        }
        A00();
    }

    public final void A09(int i9) {
        AbstractC1192Ha.A04(this.A01 == 0);
        this.A03 += i9;
        A00();
    }

    public final void A0A(int firstByteInputBits, int i9) {
        if (i9 < 32) {
            firstByteInputBits &= (1 << i9) - 1;
        }
        int min = Math.min(8 - this.A01, i9);
        int remainingBitsToRead = this.A01;
        int firstByteRightPaddingSize = (8 - remainingBitsToRead) - min;
        int firstByteReadSize = MotionEventCompat.ACTION_POINTER_INDEX_MASK >> remainingBitsToRead;
        int firstByteReadSize2 = firstByteReadSize | ((1 << firstByteRightPaddingSize) - 1);
        byte[] bArr = this.A00;
        int firstByteBitmask = this.A03;
        byte b = (byte) (bArr[firstByteBitmask] & firstByteReadSize2);
        bArr[firstByteBitmask] = b;
        int firstByteReadSize3 = b | ((firstByteInputBits >>> (i9 - min)) << firstByteRightPaddingSize);
        bArr[firstByteBitmask] = (byte) firstByteReadSize3;
        int firstByteRightPaddingSize2 = i9 - min;
        int firstByteBitmask2 = firstByteBitmask + 1;
        while (firstByteRightPaddingSize2 > 8) {
            int firstByteReadSize4 = firstByteBitmask2 + 1;
            this.A00[firstByteBitmask2] = (byte) (firstByteInputBits >>> (firstByteRightPaddingSize2 - 8));
            firstByteRightPaddingSize2 -= 8;
            firstByteBitmask2 = firstByteReadSize4;
        }
        int lastByteRightPaddingSize = 8 - firstByteRightPaddingSize2;
        byte[] bArr2 = this.A00;
        int firstByteReadSize5 = bArr2[firstByteBitmask2];
        byte b8 = (byte) (firstByteReadSize5 & ((1 << lastByteRightPaddingSize) - 1));
        bArr2[firstByteBitmask2] = b8;
        int firstByteReadSize6 = b8 | ((firstByteInputBits & ((1 << firstByteRightPaddingSize2) - 1)) << lastByteRightPaddingSize);
        bArr2[firstByteBitmask2] = (byte) firstByteReadSize6;
        A08(i9);
        A00();
    }

    public final void A0B(byte[] bArr) {
        A0C(bArr, bArr.length);
    }

    public final void A0C(byte[] bArr, int i9) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i9;
    }

    public final void A0D(byte[] bArr, int i9, int i10) {
        int i11 = (i10 >> 3) + i9;
        while (i9 < i11) {
            byte[] bArr2 = this.A00;
            int to = this.A03;
            int i12 = to + 1;
            this.A03 = i12;
            int to2 = bArr2[to];
            int i13 = this.A01;
            bArr[i9] = (byte) (to2 << i13);
            int i14 = bArr[i9];
            int to3 = bArr2[i12];
            bArr[i9] = (byte) (((255 & to3) >> (8 - i13)) | i14);
            i9++;
        }
        int i15 = i10 & 7;
        if (i15 == 0) {
            return;
        }
        int bitsLeft = bArr[i11];
        int to4 = 255 >> i15;
        bArr[i11] = (byte) (bitsLeft & to4);
        int i16 = this.A01;
        int to5 = i16 + i15;
        if (to5 > 8) {
            int i17 = bArr[i11];
            byte[] bArr3 = this.A00;
            int bitsLeft2 = this.A03;
            int to6 = bitsLeft2 + 1;
            this.A03 = to6;
            int to7 = bArr3[bitsLeft2];
            bArr[i11] = (byte) (i17 | ((to7 & 255) << i16));
            this.A01 = i16 - 8;
        }
        int i18 = this.A01 + i15;
        this.A01 = i18;
        byte[] bArr4 = this.A00;
        int lastDataByteTrailingBits = this.A03;
        int to8 = bArr4[lastDataByteTrailingBits];
        int i19 = 255 & to8;
        int to9 = 8 - i18;
        int i20 = i19 >> to9;
        int bitsLeft3 = bArr[i11];
        int to10 = 8 - i15;
        bArr[i11] = (byte) (bitsLeft3 | ((byte) (i20 << to10)));
        if (i18 == 8) {
            this.A01 = 0;
            int to11 = lastDataByteTrailingBits + 1;
            this.A03 = to11;
        }
        A00();
    }

    public final void A0E(byte[] bArr, int i9, int i10) {
        AbstractC1192Ha.A04(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i9, i10);
        this.A03 += i10;
        A00();
    }

    public final boolean A0F() {
        boolean returnValue = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A06();
        return returnValue;
    }
}
