package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes3.dex */
public final class ParsableNalUnitBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    private byte[] data;

    public ParsableNalUnitBitArray(byte[] bArr, int i9, int i10) {
        reset(bArr, i9, i10);
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

    private int readExpGolombCodeNum() {
        int i9 = 0;
        int i10 = 0;
        while (!readBit()) {
            i10++;
        }
        int i11 = (1 << i10) - 1;
        if (i10 > 0) {
            i9 = readBits(i10);
        }
        return i11 + i9;
    }

    private boolean shouldSkipByte(int i9) {
        if (2 <= i9 && i9 < this.byteLimit) {
            byte[] bArr = this.data;
            if (bArr[i9] == 3 && bArr[i9 - 2] == 0 && bArr[i9 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean canReadBits(int i9) {
        int i10 = this.byteOffset;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        int i13 = (this.bitOffset + i9) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.byteLimit) {
                break;
            }
            if (shouldSkipByte(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.byteLimit;
        if (i12 < i14) {
            return true;
        }
        if (i12 == i14 && i13 == 0) {
            return true;
        }
        return false;
    }

    public final boolean canReadExpGolombCodedNum() {
        boolean z8;
        int i9 = this.byteOffset;
        int i10 = this.bitOffset;
        int i11 = 0;
        while (this.byteOffset < this.byteLimit && !readBit()) {
            i11++;
        }
        if (this.byteOffset == this.byteLimit) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.byteOffset = i9;
        this.bitOffset = i10;
        if (z8 || !canReadBits((i11 * 2) + 1)) {
            return false;
        }
        return true;
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
        int i11;
        this.bitOffset += i9;
        int i12 = 0;
        while (true) {
            i10 = this.bitOffset;
            i11 = 2;
            if (i10 <= 8) {
                break;
            }
            int i13 = i10 - 8;
            this.bitOffset = i13;
            byte[] bArr = this.data;
            int i14 = this.byteOffset;
            i12 |= (bArr[i14] & 255) << i13;
            if (!shouldSkipByte(i14 + 1)) {
                i11 = 1;
            }
            this.byteOffset = i14 + i11;
        }
        byte[] bArr2 = this.data;
        int i15 = this.byteOffset;
        int i16 = ((-1) >>> (32 - i9)) & (i12 | ((bArr2[i15] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.bitOffset = 0;
            if (!shouldSkipByte(i15 + 1)) {
                i11 = 1;
            }
            this.byteOffset = i15 + i11;
        }
        assertValidOffset();
        return i16;
    }

    public final int readSignedExpGolombCodedInt() {
        int i9;
        int readExpGolombCodeNum = readExpGolombCodeNum();
        if (readExpGolombCodeNum % 2 == 0) {
            i9 = -1;
        } else {
            i9 = 1;
        }
        return ((readExpGolombCodeNum + 1) / 2) * i9;
    }

    public final int readUnsignedExpGolombCodedInt() {
        return readExpGolombCodeNum();
    }

    public final void reset(byte[] bArr, int i9, int i10) {
        this.data = bArr;
        this.byteOffset = i9;
        this.byteLimit = i10;
        this.bitOffset = 0;
        assertValidOffset();
    }

    public final void skipBit() {
        int i9 = 1;
        int i10 = this.bitOffset + 1;
        this.bitOffset = i10;
        if (i10 == 8) {
            this.bitOffset = 0;
            int i11 = this.byteOffset;
            if (shouldSkipByte(i11 + 1)) {
                i9 = 2;
            }
            this.byteOffset = i11 + i9;
        }
        assertValidOffset();
    }

    public final void skipBits(int i9) {
        int i10 = this.byteOffset;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        this.byteOffset = i12;
        int i13 = (i9 - (i11 * 8)) + this.bitOffset;
        this.bitOffset = i13;
        if (i13 > 7) {
            this.byteOffset = i12 + 1;
            this.bitOffset = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 <= this.byteOffset) {
                if (shouldSkipByte(i10)) {
                    this.byteOffset++;
                    i10 += 2;
                }
            } else {
                assertValidOffset();
                return;
            }
        }
    }
}
