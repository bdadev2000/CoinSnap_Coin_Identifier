package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.FlacStreamInfo;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes4.dex */
final class FlacReader extends StreamReader {
    private static final byte AUDIO_PACKET_TYPE = -1;
    private static final int FRAME_HEADER_SAMPLE_NUMBER_OFFSET = 4;
    private static final byte SEEKTABLE_PACKET_TYPE = 3;
    private FlacOggSeeker flacOggSeeker;
    private FlacStreamInfo streamInfo;

    /* loaded from: classes4.dex */
    public class FlacOggSeeker implements SeekMap, OggSeeker {
        private static final int METADATA_LENGTH_OFFSET = 1;
        private static final int SEEK_POINT_SIZE = 18;
        private long firstFrameOffset = -1;
        private long pendingSeekGranule = -1;
        private long[] seekPointGranules;
        private long[] seekPointOffsets;

        public FlacOggSeeker() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
        public SeekMap createSeekMap() {
            return this;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return FlacReader.this.streamInfo.durationUs();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j3) {
            int binarySearchFloor = Util.binarySearchFloor(this.seekPointGranules, FlacReader.this.convertTimeToGranule(j3), true, true);
            long convertGranuleToTime = FlacReader.this.convertGranuleToTime(this.seekPointGranules[binarySearchFloor]);
            SeekPoint seekPoint = new SeekPoint(convertGranuleToTime, this.firstFrameOffset + this.seekPointOffsets[binarySearchFloor]);
            if (convertGranuleToTime < j3) {
                long[] jArr = this.seekPointGranules;
                if (binarySearchFloor != jArr.length - 1) {
                    int i10 = binarySearchFloor + 1;
                    return new SeekMap.SeekPoints(seekPoint, new SeekPoint(FlacReader.this.convertGranuleToTime(jArr[i10]), this.firstFrameOffset + this.seekPointOffsets[i10]));
                }
            }
            return new SeekMap.SeekPoints(seekPoint);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public void parseSeekTable(ParsableByteArray parsableByteArray) {
            parsableByteArray.skipBytes(1);
            int readUnsignedInt24 = parsableByteArray.readUnsignedInt24() / 18;
            this.seekPointGranules = new long[readUnsignedInt24];
            this.seekPointOffsets = new long[readUnsignedInt24];
            for (int i10 = 0; i10 < readUnsignedInt24; i10++) {
                this.seekPointGranules[i10] = parsableByteArray.readLong();
                this.seekPointOffsets[i10] = parsableByteArray.readLong();
                parsableByteArray.skipBytes(2);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
        public long read(ExtractorInput extractorInput) throws IOException, InterruptedException {
            long j3 = this.pendingSeekGranule;
            if (j3 < 0) {
                return -1L;
            }
            long j10 = -(j3 + 2);
            this.pendingSeekGranule = -1L;
            return j10;
        }

        public void setFirstFrameOffset(long j3) {
            this.firstFrameOffset = j3;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
        public long startSeek(long j3) {
            long convertTimeToGranule = FlacReader.this.convertTimeToGranule(j3);
            this.pendingSeekGranule = this.seekPointGranules[Util.binarySearchFloor(this.seekPointGranules, convertTimeToGranule, true, true)];
            return convertTimeToGranule;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    private int getFlacFrameBlockSize(ParsableByteArray parsableByteArray) {
        int i10;
        int i11;
        int readUnsignedShort;
        int i12 = (parsableByteArray.data[2] & 255) >> 4;
        switch (i12) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                i10 = 576;
                i11 = i12 - 2;
                return i10 << i11;
            case 6:
            case 7:
                parsableByteArray.skipBytes(4);
                parsableByteArray.readUtf8EncodedLong();
                if (i12 == 6) {
                    readUnsignedShort = parsableByteArray.readUnsignedByte();
                } else {
                    readUnsignedShort = parsableByteArray.readUnsignedShort();
                }
                parsableByteArray.setPosition(0);
                return readUnsignedShort + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i11 = i12 - 8;
                i10 = NotificationCompat.FLAG_LOCAL_ONLY;
                return i10 << i11;
            default:
                return -1;
        }
    }

    private static boolean isAudioPacket(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() >= 5 && parsableByteArray.readUnsignedByte() == 127 && parsableByteArray.readUnsignedInt() == 1179402563) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    public final long preparePayload(ParsableByteArray parsableByteArray) {
        if (!isAudioPacket(parsableByteArray.data)) {
            return -1L;
        }
        return getFlacFrameBlockSize(parsableByteArray);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    public final boolean readHeaders(ParsableByteArray parsableByteArray, long j3, StreamReader.SetupData setupData) throws IOException, InterruptedException {
        byte[] bArr = parsableByteArray.data;
        if (this.streamInfo == null) {
            this.streamInfo = new FlacStreamInfo(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, parsableByteArray.limit());
            copyOfRange[4] = ByteCompanionObject.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            int bitRate = this.streamInfo.bitRate();
            FlacStreamInfo flacStreamInfo = this.streamInfo;
            setupData.format = Format.createAudioSampleFormat(null, MimeTypes.AUDIO_FLAC, null, -1, bitRate, flacStreamInfo.channels, flacStreamInfo.sampleRate, singletonList, null, 0, null);
            return true;
        }
        if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            FlacOggSeeker flacOggSeeker = new FlacOggSeeker();
            this.flacOggSeeker = flacOggSeeker;
            flacOggSeeker.parseSeekTable(parsableByteArray);
            return true;
        }
        if (isAudioPacket(bArr)) {
            FlacOggSeeker flacOggSeeker2 = this.flacOggSeeker;
            if (flacOggSeeker2 != null) {
                flacOggSeeker2.setFirstFrameOffset(j3);
                setupData.oggSeeker = this.flacOggSeeker;
            }
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    public final void reset(boolean z10) {
        super.reset(z10);
        if (z10) {
            this.streamInfo = null;
            this.flacOggSeeker = null;
        }
    }
}
