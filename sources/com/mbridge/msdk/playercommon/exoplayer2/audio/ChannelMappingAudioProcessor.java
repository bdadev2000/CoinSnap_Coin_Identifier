package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class ChannelMappingAudioProcessor implements AudioProcessor {
    private boolean active;
    private ByteBuffer buffer;
    private int channelCount;
    private boolean inputEnded;
    private ByteBuffer outputBuffer;
    private int[] outputChannels;
    private int[] pendingOutputChannels;
    private int sampleRateHz;

    public ChannelMappingAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.outputBuffer = byteBuffer;
        this.channelCount = -1;
        this.sampleRateHz = -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean configure(int i10, int i11, int i12) throws AudioProcessor.UnhandledFormatException {
        boolean z10;
        boolean z11;
        boolean z12 = !Arrays.equals(this.pendingOutputChannels, this.outputChannels);
        int[] iArr = this.pendingOutputChannels;
        this.outputChannels = iArr;
        if (iArr == null) {
            this.active = false;
            return z12;
        }
        if (i12 == 2) {
            if (!z12 && this.sampleRateHz == i10 && this.channelCount == i11) {
                return false;
            }
            this.sampleRateHz = i10;
            this.channelCount = i11;
            if (i11 != iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.active = z10;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.outputChannels;
                if (i13 >= iArr2.length) {
                    return true;
                }
                int i14 = iArr2[i13];
                if (i14 < i11) {
                    boolean z13 = this.active;
                    if (i14 != i13) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.active = z11 | z13;
                    i13++;
                } else {
                    throw new AudioProcessor.UnhandledFormatException(i10, i11, i12);
                }
            }
        } else {
            throw new AudioProcessor.UnhandledFormatException(i10, i11, i12);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.inputEnded = false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputChannelCount() {
        int[] iArr = this.outputChannels;
        return iArr == null ? this.channelCount : iArr.length;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputEncoding() {
        return 2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputSampleRateHz() {
        return this.sampleRateHz;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        return this.active;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean isEnded() {
        return this.inputEnded && this.outputBuffer == AudioProcessor.EMPTY_BUFFER;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.inputEnded = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        boolean z10;
        if (this.outputChannels != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.channelCount * 2)) * this.outputChannels.length * 2;
        if (this.buffer.capacity() < length) {
            this.buffer = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
        while (position < limit) {
            for (int i10 : this.outputChannels) {
                this.buffer.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.channelCount * 2;
        }
        byteBuffer.position(limit);
        this.buffer.flip();
        this.outputBuffer = this.buffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.buffer = AudioProcessor.EMPTY_BUFFER;
        this.channelCount = -1;
        this.sampleRateHz = -1;
        this.outputChannels = null;
        this.pendingOutputChannels = null;
        this.active = false;
    }

    public final void setChannelMap(int[] iArr) {
        this.pendingOutputChannels = iArr;
    }
}
