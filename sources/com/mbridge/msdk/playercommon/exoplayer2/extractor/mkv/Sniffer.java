package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: classes3.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final ParsableByteArray scratch = new ParsableByteArray(8);

    private long readUint(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i9 = 0;
        extractorInput.peekFully(this.scratch.data, 0, 1);
        int i10 = this.scratch.data[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        extractorInput.peekFully(this.scratch.data, 1, i12);
        while (i9 < i12) {
            i9++;
            i13 = (this.scratch.data[i9] & 255) + (i13 << 8);
        }
        this.peekLength = i12 + 1 + this.peekLength;
        return i13;
    }

    public final boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        long length = extractorInput.getLength();
        long j7 = 1024;
        if (length != -1 && length <= 1024) {
            j7 = length;
        }
        int i9 = (int) j7;
        extractorInput.peekFully(this.scratch.data, 0, 4);
        long readUnsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (readUnsignedInt != 440786851) {
            int i10 = this.peekLength + 1;
            this.peekLength = i10;
            if (i10 == i9) {
                return false;
            }
            extractorInput.peekFully(this.scratch.data, 0, 1);
            readUnsignedInt = ((readUnsignedInt << 8) & (-256)) | (this.scratch.data[0] & 255);
        }
        long readUint = readUint(extractorInput);
        long j9 = this.peekLength;
        if (readUint == Long.MIN_VALUE) {
            return false;
        }
        if (length == -1 || j9 + readUint < length) {
            while (true) {
                int i11 = this.peekLength;
                long j10 = j9 + readUint;
                if (i11 < j10) {
                    if (readUint(extractorInput) == Long.MIN_VALUE) {
                        return false;
                    }
                    long readUint2 = readUint(extractorInput);
                    if (readUint2 < 0 || readUint2 > 2147483647L) {
                        break;
                    }
                    if (readUint2 != 0) {
                        int i12 = (int) readUint2;
                        extractorInput.advancePeekPosition(i12);
                        this.peekLength += i12;
                    }
                } else {
                    if (i11 != j10) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
