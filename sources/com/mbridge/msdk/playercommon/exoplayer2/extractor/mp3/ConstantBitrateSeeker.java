package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes3.dex */
final class ConstantBitrateSeeker implements Mp3Extractor.Seeker {
    private static final int BITS_PER_BYTE = 8;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFramePosition;
    private final int frameSize;

    public ConstantBitrateSeeker(long j7, long j9, MpegAudioHeader mpegAudioHeader) {
        this.firstFramePosition = j9;
        this.frameSize = mpegAudioHeader.frameSize;
        this.bitrate = mpegAudioHeader.bitrate;
        if (j7 == -1) {
            this.dataSize = -1L;
            this.durationUs = C.TIME_UNSET;
        } else {
            this.dataSize = j7 - j9;
            this.durationUs = getTimeUs(j7);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j7) {
        long j9 = this.dataSize;
        if (j9 == -1) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFramePosition));
        }
        int i9 = this.frameSize;
        long constrainValue = Util.constrainValue((((this.bitrate * j7) / 8000000) / i9) * i9, 0L, j9 - i9);
        long j10 = this.firstFramePosition + constrainValue;
        long timeUs = getTimeUs(j10);
        SeekPoint seekPoint = new SeekPoint(timeUs, j10);
        if (timeUs < j7) {
            long j11 = this.dataSize;
            int i10 = this.frameSize;
            if (constrainValue != j11 - i10) {
                long j12 = j10 + i10;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUs(j12), j12));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public final long getTimeUs(long j7) {
        return (Math.max(0L, j7 - this.firstFramePosition) * 8000000) / this.bitrate;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        if (this.dataSize != -1) {
            return true;
        }
        return false;
    }
}
