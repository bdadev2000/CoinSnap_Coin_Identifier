package com.facebook.ads.redexgen.uinode;

import androidx.core.view.MotionEventCompat;
import kotlin.UByte;

/* renamed from: com.facebook.ads.redexgen.X.Hy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0650Hy {
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public C0650Hy() {
    }

    public C0650Hy(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C0650Hy(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A02 = i10;
    }

    private void A00() {
        int i10;
        int i11 = this.A03;
        AbstractC0626Ha.A04(i11 >= 0 && (i11 < (i10 = this.A02) || (i11 == i10 && this.A01 == 0)));
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        AbstractC0626Ha.A04(this.A01 == 0);
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        int i12 = 0;
        this.A01 += i10;
        while (true) {
            i11 = this.A01;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.A01 = i13;
            byte[] bArr = this.A00;
            int returnValue = this.A03;
            this.A03 = returnValue + 1;
            i12 |= (bArr[returnValue] & UByte.MAX_VALUE) << i13;
        }
        byte[] bArr2 = this.A00;
        int i14 = this.A03;
        int returnValue2 = bArr2[i14] & UByte.MAX_VALUE;
        int i15 = i12 | (returnValue2 >> (8 - i11));
        int returnValue3 = 32 - i10;
        int i16 = i15 & ((-1) >>> returnValue3);
        if (i11 == 8) {
            this.A01 = 0;
            this.A03 = i14 + 1;
        }
        A00();
        return i16;
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
        int i10 = this.A01 + 1;
        this.A01 = i10;
        if (i10 == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
    }

    public final void A07(int i10) {
        int i11 = i10 / 8;
        this.A03 = i11;
        this.A01 = i10 - (i11 * 8);
        A00();
    }

    public final void A08(int i10) {
        int numBytes = i10 / 8;
        int i11 = this.A03 + numBytes;
        this.A03 = i11;
        int i12 = this.A01 + (i10 - (numBytes * 8));
        this.A01 = i12;
        if (i12 > 7) {
            this.A03 = i11 + 1;
            this.A01 = i12 - 8;
        }
        A00();
    }

    public final void A09(int i10) {
        AbstractC0626Ha.A04(this.A01 == 0);
        this.A03 += i10;
        A00();
    }

    public final void A0A(int firstByteInputBits, int i10) {
        if (i10 < 32) {
            firstByteInputBits &= (1 << i10) - 1;
        }
        int min = Math.min(8 - this.A01, i10);
        int remainingBitsToRead = this.A01;
        int firstByteRightPaddingSize = (8 - remainingBitsToRead) - min;
        int firstByteReadSize = MotionEventCompat.ACTION_POINTER_INDEX_MASK >> remainingBitsToRead;
        int firstByteReadSize2 = firstByteReadSize | ((1 << firstByteRightPaddingSize) - 1);
        byte[] bArr = this.A00;
        int firstByteBitmask = this.A03;
        byte b3 = (byte) (bArr[firstByteBitmask] & firstByteReadSize2);
        bArr[firstByteBitmask] = b3;
        int firstByteReadSize3 = b3 | ((firstByteInputBits >>> (i10 - min)) << firstByteRightPaddingSize);
        bArr[firstByteBitmask] = (byte) firstByteReadSize3;
        int firstByteRightPaddingSize2 = i10 - min;
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
        byte b10 = (byte) (firstByteReadSize5 & ((1 << lastByteRightPaddingSize) - 1));
        bArr2[firstByteBitmask2] = b10;
        int firstByteReadSize6 = b10 | ((firstByteInputBits & ((1 << firstByteRightPaddingSize2) - 1)) << lastByteRightPaddingSize);
        bArr2[firstByteBitmask2] = (byte) firstByteReadSize6;
        A08(i10);
        A00();
    }

    public final void A0B(byte[] bArr) {
        A0C(bArr, bArr.length);
    }

    public final void A0C(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i10;
    }

    public final void A0D(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.A00;
            int to = this.A03;
            int i13 = to + 1;
            this.A03 = i13;
            int to2 = bArr2[to];
            int i14 = this.A01;
            bArr[i10] = (byte) (to2 << i14);
            int i15 = bArr[i10];
            int to3 = bArr2[i13];
            bArr[i10] = (byte) (((255 & to3) >> (8 - i14)) | i15);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        int bitsLeft = bArr[i12];
        int to4 = 255 >> i16;
        bArr[i12] = (byte) (bitsLeft & to4);
        int i17 = this.A01;
        int to5 = i17 + i16;
        if (to5 > 8) {
            int i18 = bArr[i12];
            byte[] bArr3 = this.A00;
            int bitsLeft2 = this.A03;
            int to6 = bitsLeft2 + 1;
            this.A03 = to6;
            int to7 = bArr3[bitsLeft2];
            bArr[i12] = (byte) (i18 | ((to7 & 255) << i17));
            this.A01 = i17 - 8;
        }
        int i19 = this.A01 + i16;
        this.A01 = i19;
        byte[] bArr4 = this.A00;
        int lastDataByteTrailingBits = this.A03;
        int to8 = bArr4[lastDataByteTrailingBits];
        int i20 = 255 & to8;
        int to9 = 8 - i19;
        int i21 = i20 >> to9;
        int bitsLeft3 = bArr[i12];
        int to10 = 8 - i16;
        bArr[i12] = (byte) (bitsLeft3 | ((byte) (i21 << to10)));
        if (i19 == 8) {
            this.A01 = 0;
            int to11 = lastDataByteTrailingBits + 1;
            this.A03 = to11;
        }
        A00();
    }

    public final void A0E(byte[] bArr, int i10, int i11) {
        AbstractC0626Ha.A04(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i10, i11);
        this.A03 += i11;
        A00();
    }

    public final boolean A0F() {
        boolean returnValue = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A06();
        return returnValue;
    }
}
