package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes3.dex */
final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
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

    public final int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public final boolean readBit() {
        boolean z8;
        if ((((this.data[this.byteOffset] & 255) >> this.bitOffset) & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        skipBits(1);
        return z8;
    }

    public final int readBits(int i9) {
        int i10 = this.byteOffset;
        int min = Math.min(i9, 8 - this.bitOffset);
        int i11 = i10 + 1;
        int i12 = ((this.data[i10] & 255) >> this.bitOffset) & (255 >> (8 - min));
        while (min < i9) {
            i12 |= (this.data[i11] & 255) << min;
            min += 8;
            i11++;
        }
        int i13 = i12 & ((-1) >>> (32 - i9));
        skipBits(i9);
        return i13;
    }

    public final void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public final void setPosition(int i9) {
        int i10 = i9 / 8;
        this.byteOffset = i10;
        this.bitOffset = i9 - (i10 * 8);
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
}
