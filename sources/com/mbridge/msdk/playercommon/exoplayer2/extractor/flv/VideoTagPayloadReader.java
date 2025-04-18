package com.mbridge.msdk.playercommon.exoplayer2.extractor.flv;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.flv.TagPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.video.AvcConfig;
import eb.j;

/* loaded from: classes4.dex */
final class VideoTagPayloadReader extends TagPayloadReader {
    private static final int AVC_PACKET_TYPE_AVC_NALU = 1;
    private static final int AVC_PACKET_TYPE_SEQUENCE_HEADER = 0;
    private static final int VIDEO_CODEC_AVC = 7;
    private static final int VIDEO_FRAME_KEYFRAME = 1;
    private static final int VIDEO_FRAME_VIDEO_INFO = 5;
    private int frameType;
    private boolean hasOutputFormat;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private int nalUnitLengthFieldLength;

    public VideoTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.flv.TagPayloadReader
    public final boolean parseHeader(ParsableByteArray parsableByteArray) throws TagPayloadReader.UnsupportedFormatException {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i10 = (readUnsignedByte >> 4) & 15;
        int i11 = readUnsignedByte & 15;
        if (i11 == 7) {
            this.frameType = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new TagPayloadReader.UnsupportedFormatException(j.i("Video format not supported: ", i11));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.flv.TagPayloadReader
    public final void parsePayload(ParsableByteArray parsableByteArray, long j3) throws ParserException {
        int i10;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        long readInt24 = (parsableByteArray.readInt24() * 1000) + j3;
        if (readUnsignedByte == 0 && !this.hasOutputFormat) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray(new byte[parsableByteArray.bytesLeft()]);
            parsableByteArray.readBytes(parsableByteArray2.data, 0, parsableByteArray.bytesLeft());
            AvcConfig parse = AvcConfig.parse(parsableByteArray2);
            this.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
            this.output.format(Format.createVideoSampleFormat(null, MimeTypes.VIDEO_H264, null, -1, -1, parse.width, parse.height, -1.0f, parse.initializationData, -1, parse.pixelWidthAspectRatio, null));
            this.hasOutputFormat = true;
            return;
        }
        if (readUnsignedByte == 1 && this.hasOutputFormat) {
            byte[] bArr = this.nalLength.data;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i11 = 4 - this.nalUnitLengthFieldLength;
            int i12 = 0;
            while (parsableByteArray.bytesLeft() > 0) {
                parsableByteArray.readBytes(this.nalLength.data, i11, this.nalUnitLengthFieldLength);
                this.nalLength.setPosition(0);
                int readUnsignedIntToInt = this.nalLength.readUnsignedIntToInt();
                this.nalStartCode.setPosition(0);
                this.output.sampleData(this.nalStartCode, 4);
                this.output.sampleData(parsableByteArray, readUnsignedIntToInt);
                i12 = i12 + 4 + readUnsignedIntToInt;
            }
            TrackOutput trackOutput = this.output;
            if (this.frameType == 1) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            trackOutput.sampleMetadata(readInt24, i10, i12, 0, null);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.flv.TagPayloadReader
    public final void seek() {
    }
}
