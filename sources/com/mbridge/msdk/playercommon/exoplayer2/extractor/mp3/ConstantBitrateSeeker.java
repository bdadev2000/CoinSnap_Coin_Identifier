package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class ConstantBitrateSeeker implements Mp3Extractor.Seeker {
    private static final int BITS_PER_BYTE = 8;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFramePosition;
    private final int frameSize;

    public ConstantBitrateSeeker(long j3, long j10, MpegAudioHeader mpegAudioHeader) {
        this.firstFramePosition = j10;
        this.frameSize = mpegAudioHeader.frameSize;
        this.bitrate = mpegAudioHeader.bitrate;
        if (j3 == -1) {
            this.dataSize = -1L;
            this.durationUs = C.TIME_UNSET;
        } else {
            this.dataSize = j3 - j10;
            this.durationUs = getTimeUs(j3);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j3) {
        long j10 = this.dataSize;
        if (j10 == -1) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFramePosition));
        }
        int i10 = this.frameSize;
        long constrainValue = Util.constrainValue((((this.bitrate * j3) / 8000000) / i10) * i10, 0L, j10 - i10);
        long j11 = this.firstFramePosition + constrainValue;
        long timeUs = getTimeUs(j11);
        SeekPoint seekPoint = new SeekPoint(timeUs, j11);
        if (timeUs < j3) {
            long j12 = this.dataSize;
            int i11 = this.frameSize;
            if (constrainValue != j12 - i11) {
                long j13 = j11 + i11;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUs(j13), j13));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public final long getTimeUs(long j3) {
        return ((Math.max(0L, j3 - this.firstFramePosition) * 1000000) * 8) / this.bitrate;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return this.dataSize != -1;
    }
}
