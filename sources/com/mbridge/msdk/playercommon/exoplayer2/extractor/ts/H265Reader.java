package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableNalUnitBitArray;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class H265Reader implements ElementaryStreamReader {
    private static final int BLA_W_LP = 16;
    private static final int CRA_NUT = 21;
    private static final int PPS_NUT = 34;
    private static final int PREFIX_SEI_NUT = 39;
    private static final int RASL_R = 9;
    private static final int SPS_NUT = 33;
    private static final int SUFFIX_SEI_NUT = 40;
    private static final String TAG = "H265Reader";
    private static final int VPS_NUT = 32;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer vps = new NalUnitTargetBuffer(32, 128);
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(33, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(34, 128);
    private final NalUnitTargetBuffer prefixSei = new NalUnitTargetBuffer(39, 128);
    private final NalUnitTargetBuffer suffixSei = new NalUnitTargetBuffer(40, 128);
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    /* loaded from: classes3.dex */
    public static final class SampleReader {
        private static final int FIRST_SLICE_FLAG_OFFSET = 2;
        private boolean isFirstParameterSet;
        private boolean isFirstSlice;
        private boolean lookingForFirstSliceFlag;
        private int nalUnitBytesRead;
        private boolean nalUnitHasKeyframeData;
        private long nalUnitStartPosition;
        private long nalUnitTimeUs;
        private final TrackOutput output;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private boolean writingParameterSets;

        public SampleReader(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        private void outputSample(int i9) {
            boolean z8 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z8 ? 1 : 0, (int) (this.nalUnitStartPosition - this.samplePosition), i9, null);
        }

        public final void endNalUnit(long j7, int i9) {
            if (this.writingParameterSets && this.isFirstSlice) {
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
                this.writingParameterSets = false;
            } else if (this.isFirstParameterSet || this.isFirstSlice) {
                if (this.readingSample) {
                    outputSample(i9 + ((int) (j7 - this.nalUnitStartPosition)));
                }
                this.samplePosition = this.nalUnitStartPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.readingSample = true;
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
            }
        }

        public final void readNalUnitData(byte[] bArr, int i9, int i10) {
            boolean z8;
            if (this.lookingForFirstSliceFlag) {
                int i11 = this.nalUnitBytesRead;
                int i12 = (i9 + 2) - i11;
                if (i12 < i10) {
                    if ((bArr[i12] & 128) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.isFirstSlice = z8;
                    this.lookingForFirstSliceFlag = false;
                    return;
                }
                this.nalUnitBytesRead = (i10 - i9) + i11;
            }
        }

        public final void reset() {
            this.lookingForFirstSliceFlag = false;
            this.isFirstSlice = false;
            this.isFirstParameterSet = false;
            this.readingSample = false;
            this.writingParameterSets = false;
        }

        public final void startNalUnit(long j7, int i9, int i10, long j9) {
            boolean z8;
            boolean z9 = false;
            this.isFirstSlice = false;
            this.isFirstParameterSet = false;
            this.nalUnitTimeUs = j9;
            this.nalUnitBytesRead = 0;
            this.nalUnitStartPosition = j7;
            if (i10 >= 32) {
                if (!this.writingParameterSets && this.readingSample) {
                    outputSample(i9);
                    this.readingSample = false;
                }
                if (i10 <= 34) {
                    this.isFirstParameterSet = !this.writingParameterSets;
                    this.writingParameterSets = true;
                }
            }
            if (i10 >= 16 && i10 <= 21) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.nalUnitHasKeyframeData = z8;
            if (z8 || i10 <= 9) {
                z9 = true;
            }
            this.lookingForFirstSliceFlag = z9;
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.seiReader = seiReader;
    }

    private void endNalUnit(long j7, int i9, int i10, long j9) {
        if (this.hasOutputFormat) {
            this.sampleReader.endNalUnit(j7, i9);
        } else {
            this.vps.endNalUnit(i10);
            this.sps.endNalUnit(i10);
            this.pps.endNalUnit(i10);
            if (this.vps.isCompleted() && this.sps.isCompleted() && this.pps.isCompleted()) {
                this.output.format(parseMediaFormat(this.formatId, this.vps, this.sps, this.pps));
                this.hasOutputFormat = true;
            }
        }
        if (this.prefixSei.endNalUnit(i10)) {
            NalUnitTargetBuffer nalUnitTargetBuffer = this.prefixSei;
            this.seiWrapper.reset(this.prefixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer.nalData, nalUnitTargetBuffer.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j9, this.seiWrapper);
        }
        if (this.suffixSei.endNalUnit(i10)) {
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.suffixSei;
            this.seiWrapper.reset(this.suffixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j9, this.seiWrapper);
        }
    }

    private void nalUnitData(byte[] bArr, int i9, int i10) {
        if (this.hasOutputFormat) {
            this.sampleReader.readNalUnitData(bArr, i9, i10);
        } else {
            this.vps.appendToNalUnit(bArr, i9, i10);
            this.sps.appendToNalUnit(bArr, i9, i10);
            this.pps.appendToNalUnit(bArr, i9, i10);
        }
        this.prefixSei.appendToNalUnit(bArr, i9, i10);
        this.suffixSei.appendToNalUnit(bArr, i9, i10);
    }

    private static Format parseMediaFormat(String str, NalUnitTargetBuffer nalUnitTargetBuffer, NalUnitTargetBuffer nalUnitTargetBuffer2, NalUnitTargetBuffer nalUnitTargetBuffer3) {
        int i9;
        float f9;
        int i10;
        int i11 = nalUnitTargetBuffer.nalLength;
        byte[] bArr = new byte[nalUnitTargetBuffer2.nalLength + i11 + nalUnitTargetBuffer3.nalLength];
        System.arraycopy(nalUnitTargetBuffer.nalData, 0, bArr, 0, i11);
        System.arraycopy(nalUnitTargetBuffer2.nalData, 0, bArr, nalUnitTargetBuffer.nalLength, nalUnitTargetBuffer2.nalLength);
        System.arraycopy(nalUnitTargetBuffer3.nalData, 0, bArr, nalUnitTargetBuffer.nalLength + nalUnitTargetBuffer2.nalLength, nalUnitTargetBuffer3.nalLength);
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(nalUnitTargetBuffer2.nalData, 0, nalUnitTargetBuffer2.nalLength);
        parsableNalUnitBitArray.skipBits(44);
        int readBits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        parsableNalUnitBitArray.skipBits(88);
        parsableNalUnitBitArray.skipBits(8);
        int i12 = 0;
        for (int i13 = 0; i13 < readBits; i13++) {
            if (parsableNalUnitBitArray.readBit()) {
                i12 += 89;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i12 += 8;
            }
        }
        parsableNalUnitBitArray.skipBits(i12);
        if (readBits > 0) {
            parsableNalUnitBitArray.skipBits((8 - readBits) * 2);
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (readUnsignedExpGolombCodedInt == 3) {
            parsableNalUnitBitArray.skipBit();
        }
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int i14 = 1;
            if (readUnsignedExpGolombCodedInt != 1 && readUnsignedExpGolombCodedInt != 2) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            if (readUnsignedExpGolombCodedInt == 1) {
                i14 = 2;
            }
            readUnsignedExpGolombCodedInt2 -= (readUnsignedExpGolombCodedInt4 + readUnsignedExpGolombCodedInt5) * i10;
            readUnsignedExpGolombCodedInt3 -= (readUnsignedExpGolombCodedInt6 + readUnsignedExpGolombCodedInt7) * i14;
        }
        int i15 = readUnsignedExpGolombCodedInt2;
        int i16 = readUnsignedExpGolombCodedInt3;
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            i9 = 0;
        } else {
            i9 = readBits;
        }
        while (i9 <= readBits) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            i9++;
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            skipScalingList(parsableNalUnitBitArray);
        }
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        skipShortTermRefPicSets(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            for (int i17 = 0; i17 < parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(); i17++) {
                parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt8 + 5);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        float f10 = 1.0f;
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            int readBits2 = parsableNalUnitBitArray.readBits(8);
            if (readBits2 == 255) {
                int readBits3 = parsableNalUnitBitArray.readBits(16);
                int readBits4 = parsableNalUnitBitArray.readBits(16);
                if (readBits3 != 0 && readBits4 != 0) {
                    f10 = readBits3 / readBits4;
                }
            } else {
                float[] fArr = NalUnitUtil.ASPECT_RATIO_IDC_VALUES;
                if (readBits2 < fArr.length) {
                    f9 = fArr[readBits2];
                    return Format.createVideoSampleFormat(str, MimeTypes.VIDEO_H265, null, -1, -1, i15, i16, -1.0f, Collections.singletonList(bArr), -1, f9, null);
                }
                o.z(readBits2, "Unexpected aspect_ratio_idc value: ", TAG);
            }
        }
        f9 = f10;
        return Format.createVideoSampleFormat(str, MimeTypes.VIDEO_H265, null, -1, -1, i15, i16, -1.0f, Collections.singletonList(bArr), -1, f9, null);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = 0;
            while (i10 < 6) {
                int i11 = 1;
                if (!parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                } else {
                    int min = Math.min(64, 1 << ((i9 << 1) + 4));
                    if (i9 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i12 = 0; i12 < min; i12++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                }
                if (i9 == 3) {
                    i11 = 3;
                }
                i10 += i11;
            }
        }
    }

    private static void skipShortTermRefPicSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        boolean z8 = false;
        int i9 = 0;
        for (int i10 = 0; i10 < readUnsignedExpGolombCodedInt; i10++) {
            if (i10 != 0) {
                z8 = parsableNalUnitBitArray.readBit();
            }
            if (z8) {
                parsableNalUnitBitArray.skipBit();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i11 = 0; i11 <= i9; i11++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBit();
                    }
                }
            } else {
                int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int i12 = readUnsignedExpGolombCodedInt2 + readUnsignedExpGolombCodedInt3;
                for (int i13 = 0; i13 < readUnsignedExpGolombCodedInt2; i13++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                for (int i14 = 0; i14 < readUnsignedExpGolombCodedInt3; i14++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                i9 = i12;
            }
        }
    }

    private void startNalUnit(long j7, int i9, int i10, long j9) {
        if (this.hasOutputFormat) {
            this.sampleReader.startNalUnit(j7, i9, i10, j9);
        } else {
            this.vps.startNalUnit(i10);
            this.sps.startNalUnit(i10);
            this.pps.startNalUnit(i10);
        }
        this.prefixSei.startNalUnit(i10);
        this.suffixSei.startNalUnit(i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) {
        int i9;
        while (parsableByteArray.bytesLeft() > 0) {
            int position = parsableByteArray.getPosition();
            int limit = parsableByteArray.limit();
            byte[] bArr = parsableByteArray.data;
            this.totalBytesWritten += parsableByteArray.bytesLeft();
            this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
            while (position < limit) {
                int findNalUnit = NalUnitUtil.findNalUnit(bArr, position, limit, this.prefixFlags);
                if (findNalUnit == limit) {
                    nalUnitData(bArr, position, limit);
                    return;
                }
                int h265NalUnitType = NalUnitUtil.getH265NalUnitType(bArr, findNalUnit);
                int i10 = findNalUnit - position;
                if (i10 > 0) {
                    nalUnitData(bArr, position, findNalUnit);
                }
                int i11 = limit - findNalUnit;
                long j7 = this.totalBytesWritten - i11;
                if (i10 < 0) {
                    i9 = -i10;
                } else {
                    i9 = 0;
                }
                endNalUnit(j7, i11, i9, this.pesTimeUs);
                startNalUnit(j7, i11, h265NalUnitType, this.pesTimeUs);
                position = findNalUnit + 3;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = track;
        this.sampleReader = new SampleReader(track);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetStarted(long j7, boolean z8) {
        this.pesTimeUs = j7;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.vps.reset();
        this.sps.reset();
        this.pps.reset();
        this.prefixSei.reset();
        this.suffixSei.reset();
        this.sampleReader.reset();
        this.totalBytesWritten = 0L;
    }
}
