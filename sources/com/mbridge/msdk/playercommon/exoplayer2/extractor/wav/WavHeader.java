package com.mbridge.msdk.playercommon.exoplayer2.extractor.wav;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class WavHeader implements SeekMap {
    private final int averageBytesPerSecond;
    private final int bitsPerSample;
    private final int blockAlignment;
    private long dataSize;
    private long dataStartPosition;
    private final int encoding;
    private final int numChannels;
    private final int sampleRateHz;

    public WavHeader(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.numChannels = i10;
        this.sampleRateHz = i11;
        this.averageBytesPerSecond = i12;
        this.blockAlignment = i13;
        this.bitsPerSample = i14;
        this.encoding = i15;
    }

    public final int getBitrate() {
        return this.sampleRateHz * this.bitsPerSample * this.numChannels;
    }

    public final int getBytesPerFrame() {
        return this.blockAlignment;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return ((this.dataSize / this.blockAlignment) * 1000000) / this.sampleRateHz;
    }

    public final int getEncoding() {
        return this.encoding;
    }

    public final int getNumChannels() {
        return this.numChannels;
    }

    public final int getSampleRateHz() {
        return this.sampleRateHz;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j3) {
        int i10 = this.blockAlignment;
        long constrainValue = Util.constrainValue((((this.averageBytesPerSecond * j3) / 1000000) / i10) * i10, 0L, this.dataSize - i10);
        long j10 = this.dataStartPosition + constrainValue;
        long timeUs = getTimeUs(j10);
        SeekPoint seekPoint = new SeekPoint(timeUs, j10);
        if (timeUs < j3) {
            long j11 = this.dataSize;
            int i11 = this.blockAlignment;
            if (constrainValue != j11 - i11) {
                long j12 = j10 + i11;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUs(j12), j12));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    public final long getTimeUs(long j3) {
        return (Math.max(0L, j3 - this.dataStartPosition) * 1000000) / this.averageBytesPerSecond;
    }

    public final boolean hasDataBounds() {
        return (this.dataStartPosition == 0 || this.dataSize == 0) ? false : true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    public final void setDataBounds(long j3, long j10) {
        this.dataStartPosition = j3;
        this.dataSize = j10;
    }
}
