package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.CryptoInfo;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleMetadataQueue;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocation;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes4.dex */
public final class SampleQueue implements TrackOutput {
    public static final int ADVANCE_FAILED = -1;
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final Allocator allocator;
    private Format downstreamFormat;
    private final SampleMetadataQueue.SampleExtrasHolder extrasHolder;
    private AllocationNode firstAllocationNode;
    private Format lastUnadjustedFormat;
    private final SampleMetadataQueue metadataQueue;
    private boolean pendingFormatAdjustment;
    private boolean pendingSplice;
    private AllocationNode readAllocationNode;
    private long sampleOffsetUs;
    private final ParsableByteArray scratch;
    private long totalBytesWritten;
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private AllocationNode writeAllocationNode;

    /* loaded from: classes4.dex */
    public static final class AllocationNode {
        public Allocation allocation;
        public final long endPosition;
        public AllocationNode next;
        public final long startPosition;
        public boolean wasInitialized;

        public AllocationNode(long j3, int i10) {
            this.startPosition = j3;
            this.endPosition = j3 + i10;
        }

        public final AllocationNode clear() {
            this.allocation = null;
            AllocationNode allocationNode = this.next;
            this.next = null;
            return allocationNode;
        }

        public final void initialize(Allocation allocation, AllocationNode allocationNode) {
            this.allocation = allocation;
            this.next = allocationNode;
            this.wasInitialized = true;
        }

        public final int translateOffset(long j3) {
            return ((int) (j3 - this.startPosition)) + this.allocation.offset;
        }
    }

    /* loaded from: classes4.dex */
    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    public SampleQueue(Allocator allocator) {
        this.allocator = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.allocationLength = individualAllocationLength;
        this.metadataQueue = new SampleMetadataQueue();
        this.extrasHolder = new SampleMetadataQueue.SampleExtrasHolder();
        this.scratch = new ParsableByteArray(32);
        AllocationNode allocationNode = new AllocationNode(0L, individualAllocationLength);
        this.firstAllocationNode = allocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
    }

    private void advanceReadTo(long j3) {
        while (true) {
            AllocationNode allocationNode = this.readAllocationNode;
            if (j3 >= allocationNode.endPosition) {
                this.readAllocationNode = allocationNode.next;
            } else {
                return;
            }
        }
    }

    private void clearAllocationNodes(AllocationNode allocationNode) {
        if (!allocationNode.wasInitialized) {
            return;
        }
        AllocationNode allocationNode2 = this.writeAllocationNode;
        int i10 = (((int) (allocationNode2.startPosition - allocationNode.startPosition)) / this.allocationLength) + (allocationNode2.wasInitialized ? 1 : 0);
        Allocation[] allocationArr = new Allocation[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            allocationArr[i11] = allocationNode.allocation;
            allocationNode = allocationNode.clear();
        }
        this.allocator.release(allocationArr);
    }

    private void discardDownstreamTo(long j3) {
        AllocationNode allocationNode;
        if (j3 == -1) {
            return;
        }
        while (true) {
            allocationNode = this.firstAllocationNode;
            if (j3 < allocationNode.endPosition) {
                break;
            }
            this.allocator.release(allocationNode.allocation);
            this.firstAllocationNode = this.firstAllocationNode.clear();
        }
        if (this.readAllocationNode.startPosition < allocationNode.startPosition) {
            this.readAllocationNode = allocationNode;
        }
    }

    private static Format getAdjustedSampleFormat(Format format, long j3) {
        if (format == null) {
            return null;
        }
        if (j3 != 0) {
            long j10 = format.subsampleOffsetUs;
            if (j10 != Long.MAX_VALUE) {
                return format.copyWithSubsampleOffsetUs(j10 + j3);
            }
            return format;
        }
        return format;
    }

    private void postAppend(int i10) {
        long j3 = this.totalBytesWritten + i10;
        this.totalBytesWritten = j3;
        AllocationNode allocationNode = this.writeAllocationNode;
        if (j3 == allocationNode.endPosition) {
            this.writeAllocationNode = allocationNode.next;
        }
    }

    private int preAppend(int i10) {
        AllocationNode allocationNode = this.writeAllocationNode;
        if (!allocationNode.wasInitialized) {
            allocationNode.initialize(this.allocator.allocate(), new AllocationNode(this.writeAllocationNode.endPosition, this.allocationLength));
        }
        return Math.min(i10, (int) (this.writeAllocationNode.endPosition - this.totalBytesWritten));
    }

    private void readData(long j3, ByteBuffer byteBuffer, int i10) {
        advanceReadTo(j3);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (this.readAllocationNode.endPosition - j3));
            AllocationNode allocationNode = this.readAllocationNode;
            byteBuffer.put(allocationNode.allocation.data, allocationNode.translateOffset(j3), min);
            i10 -= min;
            j3 += min;
            AllocationNode allocationNode2 = this.readAllocationNode;
            if (j3 == allocationNode2.endPosition) {
                this.readAllocationNode = allocationNode2.next;
            }
        }
    }

    private void readEncryptionData(DecoderInputBuffer decoderInputBuffer, SampleMetadataQueue.SampleExtrasHolder sampleExtrasHolder) {
        boolean z10;
        long j3 = sampleExtrasHolder.offset;
        int i10 = 1;
        this.scratch.reset(1);
        readData(j3, this.scratch.data, 1);
        long j10 = j3 + 1;
        byte b3 = this.scratch.data[0];
        if ((b3 & ByteCompanionObject.MIN_VALUE) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = b3 & Byte.MAX_VALUE;
        CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
        if (cryptoInfo.iv == null) {
            cryptoInfo.iv = new byte[16];
        }
        readData(j10, cryptoInfo.iv, i11);
        long j11 = j10 + i11;
        if (z10) {
            this.scratch.reset(2);
            readData(j11, this.scratch.data, 2);
            j11 += 2;
            i10 = this.scratch.readUnsignedShort();
        }
        int i12 = i10;
        CryptoInfo cryptoInfo2 = decoderInputBuffer.cryptoInfo;
        int[] iArr = cryptoInfo2.numBytesOfClearData;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cryptoInfo2.numBytesOfEncryptedData;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i13 = i12 * 6;
            this.scratch.reset(i13);
            readData(j11, this.scratch.data, i13);
            j11 += i13;
            this.scratch.setPosition(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = this.scratch.readUnsignedShort();
                iArr4[i14] = this.scratch.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = sampleExtrasHolder.size - ((int) (j11 - sampleExtrasHolder.offset));
        }
        TrackOutput.CryptoData cryptoData = sampleExtrasHolder.cryptoData;
        CryptoInfo cryptoInfo3 = decoderInputBuffer.cryptoInfo;
        cryptoInfo3.set(i12, iArr2, iArr4, cryptoData.encryptionKey, cryptoInfo3.iv, cryptoData.cryptoMode, cryptoData.encryptedBlocks, cryptoData.clearBlocks);
        long j12 = sampleExtrasHolder.offset;
        int i15 = (int) (j11 - j12);
        sampleExtrasHolder.offset = j12 + i15;
        sampleExtrasHolder.size -= i15;
    }

    public final int advanceTo(long j3, boolean z10, boolean z11) {
        return this.metadataQueue.advanceTo(j3, z10, z11);
    }

    public final int advanceToEnd() {
        return this.metadataQueue.advanceToEnd();
    }

    public final void discardTo(long j3, boolean z10, boolean z11) {
        discardDownstreamTo(this.metadataQueue.discardTo(j3, z10, z11));
    }

    public final void discardToEnd() {
        discardDownstreamTo(this.metadataQueue.discardToEnd());
    }

    public final void discardToRead() {
        discardDownstreamTo(this.metadataQueue.discardToRead());
    }

    public final void discardUpstreamSamples(int i10) {
        long discardUpstreamSamples = this.metadataQueue.discardUpstreamSamples(i10);
        this.totalBytesWritten = discardUpstreamSamples;
        if (discardUpstreamSamples != 0) {
            AllocationNode allocationNode = this.firstAllocationNode;
            if (discardUpstreamSamples != allocationNode.startPosition) {
                while (this.totalBytesWritten > allocationNode.endPosition) {
                    allocationNode = allocationNode.next;
                }
                AllocationNode allocationNode2 = allocationNode.next;
                clearAllocationNodes(allocationNode2);
                AllocationNode allocationNode3 = new AllocationNode(allocationNode.endPosition, this.allocationLength);
                allocationNode.next = allocationNode3;
                if (this.totalBytesWritten == allocationNode.endPosition) {
                    allocationNode = allocationNode3;
                }
                this.writeAllocationNode = allocationNode;
                if (this.readAllocationNode == allocationNode2) {
                    this.readAllocationNode = allocationNode3;
                    return;
                }
                return;
            }
        }
        clearAllocationNodes(this.firstAllocationNode);
        AllocationNode allocationNode4 = new AllocationNode(this.totalBytesWritten, this.allocationLength);
        this.firstAllocationNode = allocationNode4;
        this.readAllocationNode = allocationNode4;
        this.writeAllocationNode = allocationNode4;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public final void format(Format format) {
        Format adjustedSampleFormat = getAdjustedSampleFormat(format, this.sampleOffsetUs);
        boolean format2 = this.metadataQueue.format(adjustedSampleFormat);
        this.lastUnadjustedFormat = format;
        this.pendingFormatAdjustment = false;
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener != null && format2) {
            upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedSampleFormat);
        }
    }

    public final int getFirstIndex() {
        return this.metadataQueue.getFirstIndex();
    }

    public final long getFirstTimestampUs() {
        return this.metadataQueue.getFirstTimestampUs();
    }

    public final long getLargestQueuedTimestampUs() {
        return this.metadataQueue.getLargestQueuedTimestampUs();
    }

    public final int getReadIndex() {
        return this.metadataQueue.getReadIndex();
    }

    public final Format getUpstreamFormat() {
        return this.metadataQueue.getUpstreamFormat();
    }

    public final int getWriteIndex() {
        return this.metadataQueue.getWriteIndex();
    }

    public final boolean hasNextSample() {
        return this.metadataQueue.hasNextSample();
    }

    public final int peekSourceId() {
        return this.metadataQueue.peekSourceId();
    }

    public final int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z10, boolean z11, long j3) {
        int read = this.metadataQueue.read(formatHolder, decoderInputBuffer, z10, z11, this.downstreamFormat, this.extrasHolder);
        if (read != -5) {
            if (read != -4) {
                if (read == -3) {
                    return -3;
                }
                throw new IllegalStateException();
            }
            if (!decoderInputBuffer.isEndOfStream()) {
                if (decoderInputBuffer.timeUs < j3) {
                    decoderInputBuffer.addFlag(Integer.MIN_VALUE);
                }
                if (decoderInputBuffer.isEncrypted()) {
                    readEncryptionData(decoderInputBuffer, this.extrasHolder);
                }
                decoderInputBuffer.ensureSpaceForWrite(this.extrasHolder.size);
                SampleMetadataQueue.SampleExtrasHolder sampleExtrasHolder = this.extrasHolder;
                readData(sampleExtrasHolder.offset, decoderInputBuffer.data, sampleExtrasHolder.size);
            }
            return -4;
        }
        this.downstreamFormat = formatHolder.format;
        return -5;
    }

    public final void reset() {
        reset(false);
    }

    public final void rewind() {
        this.metadataQueue.rewind();
        this.readAllocationNode = this.firstAllocationNode;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public final int sampleData(ExtractorInput extractorInput, int i10, boolean z10) throws IOException, InterruptedException {
        int preAppend = preAppend(i10);
        AllocationNode allocationNode = this.writeAllocationNode;
        int read = extractorInput.read(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), preAppend);
        if (read != -1) {
            postAppend(read);
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public final void sampleMetadata(long j3, int i10, int i11, int i12, TrackOutput.CryptoData cryptoData) {
        if (this.pendingFormatAdjustment) {
            format(this.lastUnadjustedFormat);
        }
        if (this.pendingSplice) {
            if ((i10 & 1) != 0 && this.metadataQueue.attemptSplice(j3)) {
                this.pendingSplice = false;
            } else {
                return;
            }
        }
        this.metadataQueue.commitSample(j3 + this.sampleOffsetUs, i10, (this.totalBytesWritten - i11) - i12, i11, cryptoData);
    }

    public final boolean setReadPosition(int i10) {
        return this.metadataQueue.setReadPosition(i10);
    }

    public final void setSampleOffsetUs(long j3) {
        if (this.sampleOffsetUs != j3) {
            this.sampleOffsetUs = j3;
            this.pendingFormatAdjustment = true;
        }
    }

    public final void setUpstreamFormatChangeListener(UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    public final void sourceId(int i10) {
        this.metadataQueue.sourceId(i10);
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    public final void reset(boolean z10) {
        this.metadataQueue.reset(z10);
        clearAllocationNodes(this.firstAllocationNode);
        AllocationNode allocationNode = new AllocationNode(0L, this.allocationLength);
        this.firstAllocationNode = allocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
        this.totalBytesWritten = 0L;
        this.allocator.trim();
    }

    private void readData(long j3, byte[] bArr, int i10) {
        advanceReadTo(j3);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (this.readAllocationNode.endPosition - j3));
            AllocationNode allocationNode = this.readAllocationNode;
            System.arraycopy(allocationNode.allocation.data, allocationNode.translateOffset(j3), bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            AllocationNode allocationNode2 = this.readAllocationNode;
            if (j3 == allocationNode2.endPosition) {
                this.readAllocationNode = allocationNode2.next;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i10) {
        while (i10 > 0) {
            int preAppend = preAppend(i10);
            AllocationNode allocationNode = this.writeAllocationNode;
            parsableByteArray.readBytes(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), preAppend);
            i10 -= preAppend;
            postAppend(preAppend);
        }
    }
}
