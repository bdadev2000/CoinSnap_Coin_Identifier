package com.mbridge.msdk.playercommon.exoplayer2.util;

import androidx.core.view.MotionEventCompat;

/* loaded from: classes3.dex */
public final class ParsableBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    public byte[] data;

    public ParsableBitArray() {
    }

    private void assertValidOffset() {
        boolean z8;
        int i9;
        int i10 = this.byteOffset;
        if (i10 >= 0 && (i10 < (i9 = this.byteLimit) || (i10 == i9 && this.bitOffset == 0))) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
    }

    public final int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public final void byteAlign() {
        if (this.bitOffset == 0) {
            return;
        }
        this.bitOffset = 0;
        this.byteOffset++;
        assertValidOffset();
    }

    public final int getBytePosition() {
        boolean z8;
        if (this.bitOffset == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        return this.byteOffset;
    }

    public final int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public final void putInt(int i9, int i10) {
        if (i10 < 32) {
            i9 &= (1 << i10) - 1;
        }
        int min = Math.min(8 - this.bitOffset, i10);
        int i11 = this.bitOffset;
        int i12 = (8 - i11) - min;
        int i13 = (MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i11) | ((1 << i12) - 1);
        byte[] bArr = this.data;
        int i14 = this.byteOffset;
        byte b = (byte) (i13 & bArr[i14]);
        bArr[i14] = b;
        int i15 = i10 - min;
        bArr[i14] = (byte) (b | ((i9 >>> i15) << i12));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.data[i16] = (byte) (i9 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.data;
        byte b8 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b8;
        bArr2[i16] = (byte) (((i9 & ((1 << i15) - 1)) << i17) | b8);
        skipBits(i10);
        assertValidOffset();
    }

    public final boolean readBit() {
        boolean z8;
        if ((this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        skipBit();
        return z8;
    }

    public final int readBits(int i9) {
        int i10;
        if (i9 == 0) {
            return 0;
        }
        this.bitOffset += i9;
        int i11 = 0;
        while (true) {
            i10 = this.bitOffset;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.bitOffset = i12;
            byte[] bArr = this.data;
            int i13 = this.byteOffset;
            this.byteOffset = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.data;
        int i14 = this.byteOffset;
        int i15 = ((-1) >>> (32 - i9)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i14 + 1;
        }
        assertValidOffset();
        return i15;
    }

    public final void readBytes(byte[] bArr, int i9, int i10) {
        boolean z8;
        if (this.bitOffset == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        System.arraycopy(this.data, this.byteOffset, bArr, i9, i10);
        this.byteOffset += i10;
        assertValidOffset();
    }

    public final void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public final void setPosition(int i9) {
        int i10 = i9 / 8;
        this.byteOffset = i10;
        this.bitOffset = i9 - (i10 * 8);
        assertValidOffset();
    }

    public final void skipBit() {
        int i9 = this.bitOffset + 1;
        this.bitOffset = i9;
        if (i9 == 8) {
            this.bitOffset = 0;
            this.byteOffset++;
        }
        assertValidOffset();
    }

    public final void skipBits(int i9) {
        int i10 = i9 / 8;
        int i11 = this.byteOffset + i10;
        this.byteOffset = i11;
        int i12 = (i9 - (i10 * 8)) + this.bitOffset;
        this.bitOffset = i12;
        if (i12 > 7) {
            this.byteOffset = i11 + 1;
            this.bitOffset = i12 - 8;
        }
        assertValidOffset();
    }

    public final void skipBytes(int i9) {
        boolean z8;
        if (this.bitOffset == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.byteOffset += i9;
        assertValidOffset();
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public final void reset(ParsableByteArray parsableByteArray) {
        reset(parsableByteArray.data, parsableByteArray.limit());
        setPosition(parsableByteArray.getPosition() * 8);
    }

    public ParsableBitArray(byte[] bArr, int i9) {
        this.data = bArr;
        this.byteLimit = i9;
    }

    public final void reset(byte[] bArr, int i9) {
        this.data = bArr;
        this.byteOffset = 0;
        this.bitOffset = 0;
        this.byteLimit = i9;
    }

    public final void readBits(byte[] bArr, int i9, int i10) {
        int i11 = (i10 >> 3) + i9;
        while (i9 < i11) {
            byte[] bArr2 = this.data;
            int i12 = this.byteOffset;
            int i13 = i12 + 1;
            this.byteOffset = i13;
            byte b = bArr2[i12];
            int i14 = this.bitOffset;
            byte b8 = (byte) (b << i14);
            bArr[i9] = b8;
            bArr[i9] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b8);
            i9++;
        }
        int i15 = i10 & 7;
        if (i15 == 0) {
            return;
        }
        byte b9 = (byte) (bArr[i11] & (255 >> i15));
        bArr[i11] = b9;
        int i16 = this.bitOffset;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.data;
            int i17 = this.byteOffset;
            this.byteOffset = i17 + 1;
            bArr[i11] = (byte) (b9 | ((bArr3[i17] & 255) << i16));
            this.bitOffset = i16 - 8;
        }
        int i18 = this.bitOffset + i15;
        this.bitOffset = i18;
        byte[] bArr4 = this.data;
        int i19 = this.byteOffset;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i11]);
        if (i18 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i19 + 1;
        }
        assertValidOffset();
    }
}
