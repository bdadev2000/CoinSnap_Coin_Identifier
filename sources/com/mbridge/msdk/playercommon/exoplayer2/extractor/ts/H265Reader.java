package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableNalUnitBitArray;
import eb.j;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
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

        private void outputSample(int i10) {
            boolean z10 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z10 ? 1 : 0, (int) (this.nalUnitStartPosition - this.samplePosition), i10, null);
        }

        public final void endNalUnit(long j3, int i10) {
            if (this.writingParameterSets && this.isFirstSlice) {
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
                this.writingParameterSets = false;
            } else if (this.isFirstParameterSet || this.isFirstSlice) {
                if (this.readingSample) {
                    outputSample(i10 + ((int) (j3 - this.nalUnitStartPosition)));
                }
                this.samplePosition = this.nalUnitStartPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.readingSample = true;
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
            }
        }

        public final void readNalUnitData(byte[] bArr, int i10, int i11) {
            boolean z10;
            if (this.lookingForFirstSliceFlag) {
                int i12 = this.nalUnitBytesRead;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    if ((bArr[i13] & ByteCompanionObject.MIN_VALUE) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.isFirstSlice = z10;
                    this.lookingForFirstSliceFlag = false;
                    return;
                }
                this.nalUnitBytesRead = (i11 - i10) + i12;
            }
        }

        public final void reset() {
            this.lookingForFirstSliceFlag = false;
            this.isFirstSlice = false;
            this.isFirstParameterSet = false;
            this.readingSample = false;
            this.writingParameterSets = false;
        }

        public final void startNalUnit(long j3, int i10, int i11, long j10) {
            boolean z10;
            boolean z11 = false;
            this.isFirstSlice = false;
            this.isFirstParameterSet = false;
            this.nalUnitTimeUs = j10;
            this.nalUnitBytesRead = 0;
            this.nalUnitStartPosition = j3;
            if (i11 >= 32) {
                if (!this.writingParameterSets && this.readingSample) {
                    outputSample(i10);
                    this.readingSample = false;
                }
                if (i11 <= 34) {
                    this.isFirstParameterSet = !this.writingParameterSets;
                    this.writingParameterSets = true;
                }
            }
            if (i11 >= 16 && i11 <= 21) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.nalUnitHasKeyframeData = z10;
            if (z10 || i11 <= 9) {
                z11 = true;
            }
            this.lookingForFirstSliceFlag = z11;
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.seiReader = seiReader;
    }

    private void endNalUnit(long j3, int i10, int i11, long j10) {
        if (this.hasOutputFormat) {
            this.sampleReader.endNalUnit(j3, i10);
        } else {
            this.vps.endNalUnit(i11);
            this.sps.endNalUnit(i11);
            this.pps.endNalUnit(i11);
            if (this.vps.isCompleted() && this.sps.isCompleted() && this.pps.isCompleted()) {
                this.output.format(parseMediaFormat(this.formatId, this.vps, this.sps, this.pps));
                this.hasOutputFormat = true;
            }
        }
        if (this.prefixSei.endNalUnit(i11)) {
            NalUnitTargetBuffer nalUnitTargetBuffer = this.prefixSei;
            this.seiWrapper.reset(this.prefixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer.nalData, nalUnitTargetBuffer.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j10, this.seiWrapper);
        }
        if (this.suffixSei.endNalUnit(i11)) {
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.suffixSei;
            this.seiWrapper.reset(this.suffixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j10, this.seiWrapper);
        }
    }

    private void nalUnitData(byte[] bArr, int i10, int i11) {
        if (this.hasOutputFormat) {
            this.sampleReader.readNalUnitData(bArr, i10, i11);
        } else {
            this.vps.appendToNalUnit(bArr, i10, i11);
            this.sps.appendToNalUnit(bArr, i10, i11);
            this.pps.appendToNalUnit(bArr, i10, i11);
        }
        this.prefixSei.appendToNalUnit(bArr, i10, i11);
        this.suffixSei.appendToNalUnit(bArr, i10, i11);
    }

    private static Format parseMediaFormat(String str, NalUnitTargetBuffer nalUnitTargetBuffer, NalUnitTargetBuffer nalUnitTargetBuffer2, NalUnitTargetBuffer nalUnitTargetBuffer3) {
        float f10;
        int i10 = nalUnitTargetBuffer.nalLength;
        byte[] bArr = new byte[nalUnitTargetBuffer2.nalLength + i10 + nalUnitTargetBuffer3.nalLength];
        System.arraycopy(nalUnitTargetBuffer.nalData, 0, bArr, 0, i10);
        System.arraycopy(nalUnitTargetBuffer2.nalData, 0, bArr, nalUnitTargetBuffer.nalLength, nalUnitTargetBuffer2.nalLength);
        System.arraycopy(nalUnitTargetBuffer3.nalData, 0, bArr, nalUnitTargetBuffer.nalLength + nalUnitTargetBuffer2.nalLength, nalUnitTargetBuffer3.nalLength);
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(nalUnitTargetBuffer2.nalData, 0, nalUnitTargetBuffer2.nalLength);
        parsableNalUnitBitArray.skipBits(44);
        int readBits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        parsableNalUnitBitArray.skipBits(88);
        parsableNalUnitBitArray.skipBits(8);
        int i11 = 0;
        for (int i12 = 0; i12 < readBits; i12++) {
            if (parsableNalUnitBitArray.readBit()) {
                i11 += 89;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i11 += 8;
            }
        }
        parsableNalUnitBitArray.skipBits(i11);
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
            readUnsignedExpGolombCodedInt2 -= (readUnsignedExpGolombCodedInt4 + readUnsignedExpGolombCodedInt5) * ((readUnsignedExpGolombCodedInt == 1 || readUnsignedExpGolombCodedInt == 2) ? 2 : 1);
            readUnsignedExpGolombCodedInt3 -= (readUnsignedExpGolombCodedInt6 + readUnsignedExpGolombCodedInt7) * (readUnsignedExpGolombCodedInt == 1 ? 2 : 1);
        }
        int i13 = readUnsignedExpGolombCodedInt2;
        int i14 = readUnsignedExpGolombCodedInt3;
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i15 = parsableNalUnitBitArray.readBit() ? 0 : readBits; i15 <= readBits; i15++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
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
            for (int i16 = 0; i16 < parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(); i16++) {
                parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt8 + 4 + 1);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        float f11 = 1.0f;
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            int readBits2 = parsableNalUnitBitArray.readBits(8);
            if (readBits2 == 255) {
                int readBits3 = parsableNalUnitBitArray.readBits(16);
                int readBits4 = parsableNalUnitBitArray.readBits(16);
                if (readBits3 != 0 && readBits4 != 0) {
                    f11 = readBits3 / readBits4;
                }
            } else {
                float[] fArr = NalUnitUtil.ASPECT_RATIO_IDC_VALUES;
                if (readBits2 < fArr.length) {
                    f10 = fArr[readBits2];
                    return Format.createVideoSampleFormat(str, MimeTypes.VIDEO_H265, null, -1, -1, i13, i14, -1.0f, Collections.singletonList(bArr), -1, f10, null);
                }
                j.v("Unexpected aspect_ratio_idc value: ", readBits2, TAG);
            }
        }
        f10 = f11;
        return Format.createVideoSampleFormat(str, MimeTypes.VIDEO_H265, null, -1, -1, i13, i14, -1.0f, Collections.singletonList(bArr), -1, f10, null);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void skipShortTermRefPicSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < readUnsignedExpGolombCodedInt; i11++) {
            if (i11 != 0) {
                z10 = parsableNalUnitBitArray.readBit();
            }
            if (z10) {
                parsableNalUnitBitArray.skipBit();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBit();
                    }
                }
            } else {
                int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int i13 = readUnsignedExpGolombCodedInt2 + readUnsignedExpGolombCodedInt3;
                for (int i14 = 0; i14 < readUnsignedExpGolombCodedInt2; i14++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                for (int i15 = 0; i15 < readUnsignedExpGolombCodedInt3; i15++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                i10 = i13;
            }
        }
    }

    private void startNalUnit(long j3, int i10, int i11, long j10) {
        if (this.hasOutputFormat) {
            this.sampleReader.startNalUnit(j3, i10, i11, j10);
        } else {
            this.vps.startNalUnit(i11);
            this.sps.startNalUnit(i11);
            this.pps.startNalUnit(i11);
        }
        this.prefixSei.startNalUnit(i11);
        this.suffixSei.startNalUnit(i11);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) {
        int i10;
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
                int i11 = findNalUnit - position;
                if (i11 > 0) {
                    nalUnitData(bArr, position, findNalUnit);
                }
                int i12 = limit - findNalUnit;
                long j3 = this.totalBytesWritten - i12;
                if (i11 < 0) {
                    i10 = -i11;
                } else {
                    i10 = 0;
                }
                endNalUnit(j3, i12, i10, this.pesTimeUs);
                startNalUnit(j3, i12, h265NalUnitType, this.pesTimeUs);
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
    public final void packetStarted(long j3, boolean z10) {
        this.pesTimeUs = j3;
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
