package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes4.dex */
final class VarintReader {
    private static final int STATE_BEGIN_READING = 0;
    private static final int STATE_READ_CONTENTS = 1;
    private static final long[] VARINT_LENGTH_MASKS = {128, 64, 32, 16, 8, 4, 2, 1};
    private int length;
    private final byte[] scratch = new byte[8];
    private int state;

    public static long assembleVarint(byte[] bArr, int i10, boolean z10) {
        long j3 = bArr[0] & 255;
        if (z10) {
            j3 &= ~VARINT_LENGTH_MASKS[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }

    public static int parseUnsignedVarintLength(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = VARINT_LENGTH_MASKS;
            if (i11 < jArr.length) {
                if ((jArr[i11] & i10) != 0) {
                    return i11 + 1;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final int getLastLength() {
        return this.length;
    }

    public final long readUnsignedVarint(ExtractorInput extractorInput, boolean z10, boolean z11, int i10) throws IOException, InterruptedException {
        if (this.state == 0) {
            if (!extractorInput.readFully(this.scratch, 0, 1, z10)) {
                return -1L;
            }
            int parseUnsignedVarintLength = parseUnsignedVarintLength(this.scratch[0] & UByte.MAX_VALUE);
            this.length = parseUnsignedVarintLength;
            if (parseUnsignedVarintLength != -1) {
                this.state = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.length;
        if (i11 > i10) {
            this.state = 0;
            return -2L;
        }
        if (i11 != 1) {
            extractorInput.readFully(this.scratch, 1, i11 - 1);
        }
        this.state = 0;
        return assembleVarint(this.scratch, this.length, z11);
    }

    public final void reset() {
        this.state = 0;
        this.length = 0;
    }
}
