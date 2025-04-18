package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes4.dex */
public final class FlacStreamInfo {
    public final int bitsPerSample;
    public final int channels;
    public final int maxBlockSize;
    public final int maxFrameSize;
    public final int minBlockSize;
    public final int minFrameSize;
    public final int sampleRate;
    public final long totalSamples;

    public FlacStreamInfo(byte[] bArr, int i10) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.setPosition(i10 * 8);
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
        long j3;
        long j10;
        long j11;
        int i10 = this.maxFrameSize;
        if (i10 > 0) {
            j10 = (i10 + this.minFrameSize) / 2;
            j11 = 1;
        } else {
            int i11 = this.minBlockSize;
            if (i11 == this.maxBlockSize && i11 > 0) {
                j3 = i11;
            } else {
                j3 = 4096;
            }
            j10 = ((j3 * this.channels) * this.bitsPerSample) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public final long getSampleIndex(long j3) {
        return Util.constrainValue((j3 * this.sampleRate) / 1000000, 0L, this.totalSamples - 1);
    }

    public final int maxDecodedFrameSize() {
        return (this.bitsPerSample / 8) * this.maxBlockSize * this.channels;
    }

    public FlacStreamInfo(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j3) {
        this.minBlockSize = i10;
        this.maxBlockSize = i11;
        this.minFrameSize = i12;
        this.maxFrameSize = i13;
        this.sampleRate = i14;
        this.channels = i15;
        this.bitsPerSample = i16;
        this.totalSamples = j3;
    }
}
