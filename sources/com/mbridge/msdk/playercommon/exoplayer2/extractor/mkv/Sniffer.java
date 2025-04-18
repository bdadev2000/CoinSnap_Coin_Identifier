package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes4.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final ParsableByteArray scratch = new ParsableByteArray(8);

    private long readUint(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i10 = 0;
        extractorInput.peekFully(this.scratch.data, 0, 1);
        int i11 = this.scratch.data[0] & UByte.MAX_VALUE;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        extractorInput.peekFully(this.scratch.data, 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.scratch.data[i10] & UByte.MAX_VALUE) + (i14 << 8);
        }
        this.peekLength = i13 + 1 + this.peekLength;
        return i14;
    }

    public final boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        long length = extractorInput.getLength();
        long j3 = 1024;
        if (length != -1 && length <= 1024) {
            j3 = length;
        }
        int i10 = (int) j3;
        extractorInput.peekFully(this.scratch.data, 0, 4);
        long readUnsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (readUnsignedInt != 440786851) {
            int i11 = this.peekLength + 1;
            this.peekLength = i11;
            if (i11 == i10) {
                return false;
            }
            extractorInput.peekFully(this.scratch.data, 0, 1);
            readUnsignedInt = ((readUnsignedInt << 8) & (-256)) | (this.scratch.data[0] & UByte.MAX_VALUE);
        }
        long readUint = readUint(extractorInput);
        long j10 = this.peekLength;
        if (readUint == Long.MIN_VALUE) {
            return false;
        }
        if (length == -1 || j10 + readUint < length) {
            while (true) {
                int i12 = this.peekLength;
                long j11 = j10 + readUint;
                if (i12 < j11) {
                    if (readUint(extractorInput) == Long.MIN_VALUE) {
                        return false;
                    }
                    long readUint2 = readUint(extractorInput);
                    if (readUint2 < 0 || readUint2 > 2147483647L) {
                        break;
                    }
                    if (readUint2 != 0) {
                        int i13 = (int) readUint2;
                        extractorInput.advancePeekPosition(i13);
                        this.peekLength += i13;
                    }
                } else {
                    if (i12 != j11) {
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
