package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes3.dex */
public final class FlacStreamInfo {
    public final int bitsPerSample;
    public final int channels;
    public final int maxBlockSize;
    public final int maxFrameSize;
    public final int minBlockSize;
    public final int minFrameSize;
    public final int sampleRate;
    public final long totalSamples;

    public FlacStreamInfo(byte[] bArr, int i9) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.setPosition(i9 * 8);
        this.minBlockSize = parsableBitArray.readBits(16);
        this.maxBlockSize = parsableBitArray.readBits(16);
        this.minFrameSize = parsableBitArray.readBits(24);
        this.maxFrameSize = parsableBitArray.readBits(24);
        this.sampleRate = parsableBitArray.readBits(20);
        this.channels = parsableBitArray.readBits(3) + 1;
        this.bitsPerSample = parsableBitArray.readBits(5) + 1;
        this.totalSamples = ((parsableBitArray.readBits(4) & 15) << 32) | (parsableBitArray.readBits(32) & 4294967295L);
    }

    public final int bitRate() {
        return this.bitsPerSample * this.sampleRate;
    }

    public final long durationUs() {
        return (this.totalSamples * 1000000) / this.sampleRate;
    }

    public final long getApproxBytesPerFrame() {
        long j7;
        long j9;
        long j10;
        int i9 = this.maxFrameSize;
        if (i9 > 0) {
            j9 = (i9 + this.minFrameSize) / 2;
            j10 = 1;
        } else {
            int i10 = this.minBlockSize;
            if (i10 == this.maxBlockSize && i10 > 0) {
                j7 = i10;
            } else {
                j7 = 4096;
            }
            j9 = ((j7 * this.channels) * this.bitsPerSample) / 8;
            j10 = 64;
        }
        return j9 + j10;
    }

    public final long getSampleIndex(long j7) {
        return Util.constrainValue((j7 * this.sampleRate) / 1000000, 0L, this.totalSamples - 1);
    }

    public final int maxDecodedFrameSize() {
        return (this.bitsPerSample / 8) * this.maxBlockSize * this.channels;
    }

    public FlacStreamInfo(int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j7) {
        this.minBlockSize = i9;
        this.maxBlockSize = i10;
        this.minFrameSize = i11;
        this.maxFrameSize = i12;
        this.sampleRate = i13;
        this.channels = i14;
        this.bitsPerSample = i15;
        this.totalSamples = j7;
    }
}
