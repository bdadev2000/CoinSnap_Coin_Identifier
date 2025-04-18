package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableNalUnitBitArray;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class H264Reader implements ElementaryStreamReader {
    private static final int NAL_UNIT_TYPE_PPS = 8;
    private static final int NAL_UNIT_TYPE_SEI = 6;
    private static final int NAL_UNIT_TYPE_SPS = 7;
    private final boolean allowNonIdrKeyframes;
    private final boolean detectAccessUnits;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(7, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(8, 128);
    private final NalUnitTargetBuffer sei = new NalUnitTargetBuffer(6, 128);
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    /* loaded from: classes4.dex */
    public static final class SampleReader {
        private static final int DEFAULT_BUFFER_SIZE = 128;
        private static final int NAL_UNIT_TYPE_AUD = 9;
        private static final int NAL_UNIT_TYPE_IDR = 5;
        private static final int NAL_UNIT_TYPE_NON_IDR = 1;
        private static final int NAL_UNIT_TYPE_PARTITION_A = 2;
        private final boolean allowNonIdrKeyframes;
        private final ParsableNalUnitBitArray bitArray;
        private byte[] buffer;
        private int bufferLength;
        private final boolean detectAccessUnits;
        private boolean isFilling;
        private long nalUnitStartPosition;
        private long nalUnitTimeUs;
        private int nalUnitType;
        private final TrackOutput output;
        private SliceHeaderData previousSliceHeader;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private SliceHeaderData sliceHeader;
        private final SparseArray<NalUnitUtil.SpsData> sps = new SparseArray<>();
        private final SparseArray<NalUnitUtil.PpsData> pps = new SparseArray<>();

        /* loaded from: classes4.dex */
        public static final class SliceHeaderData {
            private static final int SLICE_TYPE_ALL_I = 7;
            private static final int SLICE_TYPE_I = 2;
            private boolean bottomFieldFlag;
            private boolean bottomFieldFlagPresent;
            private int deltaPicOrderCnt0;
            private int deltaPicOrderCnt1;
            private int deltaPicOrderCntBottom;
            private boolean fieldPicFlag;
            private int frameNum;
            private boolean hasSliceType;
            private boolean idrPicFlag;
            private int idrPicId;
            private boolean isComplete;
            private int nalRefIdc;
            private int picOrderCntLsb;
            private int picParameterSetId;
            private int sliceType;
            private NalUnitUtil.SpsData spsData;

            private SliceHeaderData() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean isFirstVclNalUnitOfPicture(SliceHeaderData sliceHeaderData) {
                boolean z10;
                boolean z11;
                if (this.isComplete) {
                    if (!sliceHeaderData.isComplete || this.frameNum != sliceHeaderData.frameNum || this.picParameterSetId != sliceHeaderData.picParameterSetId || this.fieldPicFlag != sliceHeaderData.fieldPicFlag) {
                        return true;
                    }
                    if (this.bottomFieldFlagPresent && sliceHeaderData.bottomFieldFlagPresent && this.bottomFieldFlag != sliceHeaderData.bottomFieldFlag) {
                        return true;
                    }
                    int i10 = this.nalRefIdc;
                    int i11 = sliceHeaderData.nalRefIdc;
                    if (i10 != i11 && (i10 == 0 || i11 == 0)) {
                        return true;
                    }
                    int i12 = this.spsData.picOrderCountType;
                    if (i12 == 0 && sliceHeaderData.spsData.picOrderCountType == 0 && (this.picOrderCntLsb != sliceHeaderData.picOrderCntLsb || this.deltaPicOrderCntBottom != sliceHeaderData.deltaPicOrderCntBottom)) {
                        return true;
                    }
                    if ((i12 == 1 && sliceHeaderData.spsData.picOrderCountType == 1 && (this.deltaPicOrderCnt0 != sliceHeaderData.deltaPicOrderCnt0 || this.deltaPicOrderCnt1 != sliceHeaderData.deltaPicOrderCnt1)) || (z10 = this.idrPicFlag) != (z11 = sliceHeaderData.idrPicFlag)) {
                        return true;
                    }
                    if (z10 && z11 && this.idrPicId != sliceHeaderData.idrPicId) {
                        return true;
                    }
                }
                return false;
            }

            public final void clear() {
                this.hasSliceType = false;
                this.isComplete = false;
            }

            public final boolean isISlice() {
                int i10;
                return this.hasSliceType && ((i10 = this.sliceType) == 7 || i10 == 2);
            }

            public final void setAll(NalUnitUtil.SpsData spsData, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.spsData = spsData;
                this.nalRefIdc = i10;
                this.sliceType = i11;
                this.frameNum = i12;
                this.picParameterSetId = i13;
                this.fieldPicFlag = z10;
                this.bottomFieldFlagPresent = z11;
                this.bottomFieldFlag = z12;
                this.idrPicFlag = z13;
                this.idrPicId = i14;
                this.picOrderCntLsb = i15;
                this.deltaPicOrderCntBottom = i16;
                this.deltaPicOrderCnt0 = i17;
                this.deltaPicOrderCnt1 = i18;
                this.isComplete = true;
                this.hasSliceType = true;
            }

            public final void setSliceType(int i10) {
                this.sliceType = i10;
                this.hasSliceType = true;
            }
        }

        public SampleReader(TrackOutput trackOutput, boolean z10, boolean z11) {
            this.output = trackOutput;
            this.allowNonIdrKeyframes = z10;
            this.detectAccessUnits = z11;
            this.previousSliceHeader = new SliceHeaderData();
            this.sliceHeader = new SliceHeaderData();
            byte[] bArr = new byte[128];
            this.buffer = bArr;
            this.bitArray = new ParsableNalUnitBitArray(bArr, 0, 0);
            reset();
        }

        private void outputSample(int i10) {
            boolean z10 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z10 ? 1 : 0, (int) (this.nalUnitStartPosition - this.samplePosition), i10, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void appendToNalUnit(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.H264Reader.SampleReader.appendToNalUnit(byte[], int, int):void");
        }

        public final void endNalUnit(long j3, int i10) {
            boolean z10 = false;
            if (this.nalUnitType == 9 || (this.detectAccessUnits && this.sliceHeader.isFirstVclNalUnitOfPicture(this.previousSliceHeader))) {
                if (this.readingSample) {
                    outputSample(i10 + ((int) (j3 - this.nalUnitStartPosition)));
                }
                this.samplePosition = this.nalUnitStartPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.sampleIsKeyframe = false;
                this.readingSample = true;
            }
            boolean z11 = this.sampleIsKeyframe;
            int i11 = this.nalUnitType;
            if (i11 == 5 || (this.allowNonIdrKeyframes && i11 == 1 && this.sliceHeader.isISlice())) {
                z10 = true;
            }
            this.sampleIsKeyframe = z11 | z10;
        }

        public final boolean needsSpsPps() {
            return this.detectAccessUnits;
        }

        public final void putPps(NalUnitUtil.PpsData ppsData) {
            this.pps.append(ppsData.picParameterSetId, ppsData);
        }

        public final void putSps(NalUnitUtil.SpsData spsData) {
            this.sps.append(spsData.seqParameterSetId, spsData);
        }

        public final void reset() {
            this.isFilling = false;
            this.readingSample = false;
            this.sliceHeader.clear();
        }

        public final void startNalUnit(long j3, int i10, long j10) {
            this.nalUnitType = i10;
            this.nalUnitTimeUs = j10;
            this.nalUnitStartPosition = j3;
            if (!this.allowNonIdrKeyframes || i10 != 1) {
                if (this.detectAccessUnits) {
                    if (i10 != 5 && i10 != 1 && i10 != 2) {
                        return;
                    }
                } else {
                    return;
                }
            }
            SliceHeaderData sliceHeaderData = this.previousSliceHeader;
            this.previousSliceHeader = this.sliceHeader;
            this.sliceHeader = sliceHeaderData;
            sliceHeaderData.clear();
            this.bufferLength = 0;
            this.isFilling = true;
        }
    }

    public H264Reader(SeiReader seiReader, boolean z10, boolean z11) {
        this.seiReader = seiReader;
        this.allowNonIdrKeyframes = z10;
        this.detectAccessUnits = z11;
    }

    private void endNalUnit(long j3, int i10, int i11, long j10) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.endNalUnit(i11);
            this.pps.endNalUnit(i11);
            if (!this.hasOutputFormat) {
                if (this.sps.isCompleted() && this.pps.isCompleted()) {
                    ArrayList arrayList = new ArrayList();
                    NalUnitTargetBuffer nalUnitTargetBuffer = this.sps;
                    arrayList.add(Arrays.copyOf(nalUnitTargetBuffer.nalData, nalUnitTargetBuffer.nalLength));
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.pps;
                    arrayList.add(Arrays.copyOf(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    NalUnitTargetBuffer nalUnitTargetBuffer3 = this.sps;
                    NalUnitUtil.SpsData parseSpsNalUnit = NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer3.nalData, 3, nalUnitTargetBuffer3.nalLength);
                    NalUnitTargetBuffer nalUnitTargetBuffer4 = this.pps;
                    NalUnitUtil.PpsData parsePpsNalUnit = NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer4.nalData, 3, nalUnitTargetBuffer4.nalLength);
                    this.output.format(Format.createVideoSampleFormat(this.formatId, MimeTypes.VIDEO_H264, null, -1, -1, parseSpsNalUnit.width, parseSpsNalUnit.height, -1.0f, arrayList, -1, parseSpsNalUnit.pixelWidthAspectRatio, null));
                    this.hasOutputFormat = true;
                    this.sampleReader.putSps(parseSpsNalUnit);
                    this.sampleReader.putPps(parsePpsNalUnit);
                    this.sps.reset();
                    this.pps.reset();
                }
            } else if (this.sps.isCompleted()) {
                NalUnitTargetBuffer nalUnitTargetBuffer5 = this.sps;
                this.sampleReader.putSps(NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer5.nalData, 3, nalUnitTargetBuffer5.nalLength));
                this.sps.reset();
            } else if (this.pps.isCompleted()) {
                NalUnitTargetBuffer nalUnitTargetBuffer6 = this.pps;
                this.sampleReader.putPps(NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer6.nalData, 3, nalUnitTargetBuffer6.nalLength));
                this.pps.reset();
            }
        }
        if (this.sei.endNalUnit(i11)) {
            NalUnitTargetBuffer nalUnitTargetBuffer7 = this.sei;
            this.seiWrapper.reset(this.sei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer7.nalData, nalUnitTargetBuffer7.nalLength));
            this.seiWrapper.setPosition(4);
            this.seiReader.consume(j10, this.seiWrapper);
        }
        this.sampleReader.endNalUnit(j3, i10);
    }

    private void nalUnitData(byte[] bArr, int i10, int i11) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.appendToNalUnit(bArr, i10, i11);
            this.pps.appendToNalUnit(bArr, i10, i11);
        }
        this.sei.appendToNalUnit(bArr, i10, i11);
        this.sampleReader.appendToNalUnit(bArr, i10, i11);
    }

    private void startNalUnit(long j3, int i10, long j10) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.startNalUnit(i10);
            this.pps.startNalUnit(i10);
        }
        this.sei.startNalUnit(i10);
        this.sampleReader.startNalUnit(j3, i10, j10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) {
        int i10;
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] bArr = parsableByteArray.data;
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int findNalUnit = NalUnitUtil.findNalUnit(bArr, position, limit, this.prefixFlags);
            if (findNalUnit == limit) {
                nalUnitData(bArr, position, limit);
                return;
            }
            int nalUnitType = NalUnitUtil.getNalUnitType(bArr, findNalUnit);
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
            startNalUnit(j3, nalUnitType, this.pesTimeUs);
            position = findNalUnit + 3;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = track;
        this.sampleReader = new SampleReader(track, this.allowNonIdrKeyframes, this.detectAccessUnits);
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
        this.sps.reset();
        this.pps.reset();
        this.sei.reset();
        this.sampleReader.reset();
        this.totalBytesWritten = 0L;
    }
}
