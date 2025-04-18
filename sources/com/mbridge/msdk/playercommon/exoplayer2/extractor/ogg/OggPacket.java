package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class OggPacket {
    private boolean populated;
    private int segmentCount;
    private final OggPageHeader pageHeader = new OggPageHeader();
    private final ParsableByteArray packetArray = new ParsableByteArray(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int currentSegmentIndex = -1;

    private int calculatePacketSize(int i10) {
        int i11;
        int i12 = 0;
        this.segmentCount = 0;
        do {
            int i13 = this.segmentCount;
            int i14 = i10 + i13;
            OggPageHeader oggPageHeader = this.pageHeader;
            if (i14 >= oggPageHeader.pageSegmentCount) {
                break;
            }
            int[] iArr = oggPageHeader.laces;
            this.segmentCount = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final OggPageHeader getPageHeader() {
        return this.pageHeader;
    }

    public final ParsableByteArray getPayload() {
        return this.packetArray;
    }

    public final boolean populate(ExtractorInput extractorInput) throws IOException, InterruptedException {
        boolean z10;
        boolean z11;
        int i10;
        if (extractorInput != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        if (this.populated) {
            this.populated = false;
            this.packetArray.reset();
        }
        while (!this.populated) {
            if (this.currentSegmentIndex < 0) {
                if (!this.pageHeader.populate(extractorInput, true)) {
                    return false;
                }
                OggPageHeader oggPageHeader = this.pageHeader;
                int i11 = oggPageHeader.headerSize;
                if ((oggPageHeader.type & 1) == 1 && this.packetArray.limit() == 0) {
                    i11 += calculatePacketSize(0);
                    i10 = this.segmentCount + 0;
                } else {
                    i10 = 0;
                }
                extractorInput.skipFully(i11);
                this.currentSegmentIndex = i10;
            }
            int calculatePacketSize = calculatePacketSize(this.currentSegmentIndex);
            int i12 = this.currentSegmentIndex + this.segmentCount;
            if (calculatePacketSize > 0) {
                if (this.packetArray.capacity() < this.packetArray.limit() + calculatePacketSize) {
                    ParsableByteArray parsableByteArray = this.packetArray;
                    parsableByteArray.data = Arrays.copyOf(parsableByteArray.data, parsableByteArray.limit() + calculatePacketSize);
                }
                ParsableByteArray parsableByteArray2 = this.packetArray;
                extractorInput.readFully(parsableByteArray2.data, parsableByteArray2.limit(), calculatePacketSize);
                ParsableByteArray parsableByteArray3 = this.packetArray;
                parsableByteArray3.setLimit(parsableByteArray3.limit() + calculatePacketSize);
                if (this.pageHeader.laces[i12 - 1] != 255) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.populated = z11;
            }
            if (i12 == this.pageHeader.pageSegmentCount) {
                i12 = -1;
            }
            this.currentSegmentIndex = i12;
        }
        return true;
    }

    public final void reset() {
        this.pageHeader.reset();
        this.packetArray.reset();
        this.currentSegmentIndex = -1;
        this.populated = false;
    }

    public final void trimPayload() {
        ParsableByteArray parsableByteArray = this.packetArray;
        byte[] bArr = parsableByteArray.data;
        if (bArr.length == 65025) {
            return;
        }
        parsableByteArray.data = Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, parsableByteArray.limit()));
    }
}
