package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import kotlin.UByte;

/* loaded from: classes4.dex */
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
        int i10;
        int i11 = this.byteOffset;
        Assertions.checkState(i11 >= 0 && (i11 < (i10 = this.byteLimit) || (i11 == i10 && this.bitOffset == 0)));
    }

    public final int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public final int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public final boolean readBit() {
        boolean z10;
        if ((((this.data[this.byteOffset] & UByte.MAX_VALUE) >> this.bitOffset) & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        skipBits(1);
        return z10;
    }

    public final int readBits(int i10) {
        int i11 = this.byteOffset;
        int min = Math.min(i10, 8 - this.bitOffset);
        int i12 = i11 + 1;
        int i13 = ((this.data[i11] & UByte.MAX_VALUE) >> this.bitOffset) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.data[i12] & UByte.MAX_VALUE) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        skipBits(i10);
        return i14;
    }

    public final void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public final void setPosition(int i10) {
        int i11 = i10 / 8;
        this.byteOffset = i11;
        this.bitOffset = i10 - (i11 * 8);
        assertValidOffset();
    }

    public final void skipBits(int i10) {
        int i11 = i10 / 8;
        int i12 = this.byteOffset + i11;
        this.byteOffset = i12;
        int i13 = (i10 - (i11 * 8)) + this.bitOffset;
        this.bitOffset = i13;
        if (i13 > 7) {
            this.byteOffset = i12 + 1;
            this.bitOffset = i13 - 8;
        }
        assertValidOffset();
    }
}
