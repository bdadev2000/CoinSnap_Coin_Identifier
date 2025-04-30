package com.mbridge.msdk.playercommon.exoplayer2.extractor.wav;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes3.dex */
final class WavHeader implements SeekMap {
    private final int averageBytesPerSecond;
    private final int bitsPerSample;
    private final int blockAlignment;
    private long dataSize;
    private long dataStartPosition;
    private final int encoding;
    private final int numChannels;
    private final int sampleRateHz;

    public WavHeader(int i9, int i10, int i11, int i12, int i13, int i14) {
        this.numChannels = i9;
        this.sampleRateHz = i10;
        this.averageBytesPerSecond = i11;
        this.blockAlignment = i12;
        this.bitsPerSample = i13;
        this.encoding = i14;
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
    public final SeekMap.SeekPoints getSeekPoints(long j7) {
        int i9 = this.blockAlignment;
        long constrainValue = Util.constrainValue((((this.averageBytesPerSecond * j7) / 1000000) / i9) * i9, 0L, this.dataSize - i9);
        long j9 = this.dataStartPosition + constrainValue;
        long timeUs = getTimeUs(j9);
        SeekPoint seekPoint = new SeekPoint(timeUs, j9);
        if (timeUs < j7) {
            long j10 = this.dataSize;
            int i10 = this.blockAlignment;
            if (constrainValue != j10 - i10) {
                long j11 = j9 + i10;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUs(j11), j11));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    public final long getTimeUs(long j7) {
        return (Math.max(0L, j7 - this.dataStartPosition) * 1000000) / this.averageBytesPerSecond;
    }

    public final boolean hasDataBounds() {
        if (this.dataStartPosition != 0 && this.dataSize != 0) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    public final void setDataBounds(long j7, long j9) {
        this.dataStartPosition = j7;
        this.dataSize = j9;
    }
}
