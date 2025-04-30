package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class NalUnitTargetBuffer {
    private boolean isCompleted;
    private boolean isFilling;
    public byte[] nalData;
    public int nalLength;
    private final int targetType;

    public NalUnitTargetBuffer(int i9, int i10) {
        this.targetType = i9;
        byte[] bArr = new byte[i10 + 3];
        this.nalData = bArr;
        bArr[2] = 1;
    }

    public final void appendToNalUnit(byte[] bArr, int i9, int i10) {
        if (!this.isFilling) {
            return;
        }
        int i11 = i10 - i9;
        byte[] bArr2 = this.nalData;
        int length = bArr2.length;
        int i12 = this.nalLength;
        if (length < i12 + i11) {
            this.nalData = Arrays.copyOf(bArr2, (i12 + i11) * 2);
        }
        System.arraycopy(bArr, i9, this.nalData, this.nalLength, i11);
        this.nalLength += i11;
    }

    public final boolean endNalUnit(int i9) {
        if (!this.isFilling) {
            return false;
        }
        this.nalLength -= i9;
        this.isFilling = false;
        this.isCompleted = true;
        return true;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final void reset() {
        this.isFilling = false;
        this.isCompleted = false;
    }

    public final void startNalUnit(int i9) {
        boolean z8 = true;
        Assertions.checkState(!this.isFilling);
        if (i9 != this.targetType) {
            z8 = false;
        }
        this.isFilling = z8;
        if (z8) {
            this.nalLength = 3;
            this.isCompleted = false;
        }
    }
}
