package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public final class SilenceSkippingAudioProcessor implements AudioProcessor {
    private static final long MINIMUM_SILENCE_DURATION_US = 150000;
    private static final long PADDING_SILENCE_US = 20000;
    private static final short SILENCE_THRESHOLD_LEVEL = 1024;
    private static final byte SILENCE_THRESHOLD_LEVEL_MSB = 4;
    private static final int STATE_MAYBE_SILENT = 1;
    private static final int STATE_NOISY = 0;
    private static final int STATE_SILENT = 2;
    private ByteBuffer buffer;
    private int bytesPerFrame;
    private int channelCount;
    private boolean enabled;
    private boolean hasOutputNoise;
    private boolean inputEnded;
    private byte[] maybeSilenceBuffer;
    private int maybeSilenceBufferSize;
    private ByteBuffer outputBuffer;
    private byte[] paddingBuffer;
    private int paddingSize;
    private int sampleRateHz;
    private long skippedFrames;
    private int state;

    /* loaded from: classes4.dex */
    public @interface State {
    }

    public SilenceSkippingAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.outputBuffer = byteBuffer;
        this.channelCount = -1;
        this.sampleRateHz = -1;
        this.maybeSilenceBuffer = new byte[0];
        this.paddingBuffer = new byte[0];
    }

    private int durationUsToFrames(long j3) {
        return (int) ((j3 * this.sampleRateHz) / 1000000);
    }

    private int findNoiseLimit(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs((int) byteBuffer.get(limit)) > 4) {
                int i10 = this.bytesPerFrame;
                return ((limit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    private int findNoisePosition(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.get(position)) > 4) {
                int i10 = this.bytesPerFrame;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    private void output(byte[] bArr, int i10) {
        prepareForOutput(i10);
        this.buffer.put(bArr, 0, i10);
        this.buffer.flip();
        this.outputBuffer = this.buffer;
    }

    private void prepareForOutput(int i10) {
        if (this.buffer.capacity() < i10) {
            this.buffer = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
        if (i10 > 0) {
            this.hasOutputNoise = true;
        }
    }

    private void processMaybeSilence(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int findNoisePosition = findNoisePosition(byteBuffer);
        int position = findNoisePosition - byteBuffer.position();
        byte[] bArr = this.maybeSilenceBuffer;
        int length = bArr.length;
        int i10 = this.maybeSilenceBufferSize;
        int i11 = length - i10;
        if (findNoisePosition < limit && position < i11) {
            output(bArr, i10);
            this.maybeSilenceBufferSize = 0;
            this.state = 0;
            return;
        }
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.maybeSilenceBuffer, this.maybeSilenceBufferSize, min);
        int i12 = this.maybeSilenceBufferSize + min;
        this.maybeSilenceBufferSize = i12;
        byte[] bArr2 = this.maybeSilenceBuffer;
        if (i12 == bArr2.length) {
            if (this.hasOutputNoise) {
                output(bArr2, this.paddingSize);
                this.skippedFrames += (this.maybeSilenceBufferSize - (this.paddingSize * 2)) / this.bytesPerFrame;
            } else {
                this.skippedFrames += (i12 - this.paddingSize) / this.bytesPerFrame;
            }
            updatePaddingBuffer(byteBuffer, this.maybeSilenceBuffer, this.maybeSilenceBufferSize);
            this.maybeSilenceBufferSize = 0;
            this.state = 2;
        }
        byteBuffer.limit(limit);
    }

    private void processNoisy(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.maybeSilenceBuffer.length));
        int findNoiseLimit = findNoiseLimit(byteBuffer);
        if (findNoiseLimit == byteBuffer.position()) {
            this.state = 1;
        } else {
            byteBuffer.limit(findNoiseLimit);
            output(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void processSilence(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int findNoisePosition = findNoisePosition(byteBuffer);
        byteBuffer.limit(findNoisePosition);
        this.skippedFrames += byteBuffer.remaining() / this.bytesPerFrame;
        updatePaddingBuffer(byteBuffer, this.paddingBuffer, this.paddingSize);
        if (findNoisePosition < limit) {
            output(this.paddingBuffer, this.paddingSize);
            this.state = 0;
            byteBuffer.limit(limit);
        }
    }

    private void updatePaddingBuffer(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.paddingSize);
        int i11 = this.paddingSize - min;
        System.arraycopy(bArr, i10 - i11, this.paddingBuffer, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.paddingBuffer, i11, min);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean configure(int i10, int i11, int i12) throws AudioProcessor.UnhandledFormatException {
        if (i12 == 2) {
            if (this.sampleRateHz == i10 && this.channelCount == i11) {
                return false;
            }
            this.sampleRateHz = i10;
            this.channelCount = i11;
            this.bytesPerFrame = i11 * 2;
            return true;
        }
        throw new AudioProcessor.UnhandledFormatException(i10, i11, i12);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            int durationUsToFrames = durationUsToFrames(MINIMUM_SILENCE_DURATION_US) * this.bytesPerFrame;
            if (this.maybeSilenceBuffer.length != durationUsToFrames) {
                this.maybeSilenceBuffer = new byte[durationUsToFrames];
            }
            int durationUsToFrames2 = durationUsToFrames(PADDING_SILENCE_US) * this.bytesPerFrame;
            this.paddingSize = durationUsToFrames2;
            if (this.paddingBuffer.length != durationUsToFrames2) {
                this.paddingBuffer = new byte[durationUsToFrames2];
            }
        }
        this.state = 0;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.inputEnded = false;
        this.skippedFrames = 0L;
        this.maybeSilenceBufferSize = 0;
        this.hasOutputNoise = false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputChannelCount() {
        return this.channelCount;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputEncoding() {
        return 2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final int getOutputSampleRateHz() {
        return this.sampleRateHz;
    }

    public final long getSkippedFrames() {
        return this.skippedFrames;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        return this.sampleRateHz != -1 && this.enabled;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean isEnded() {
        return this.inputEnded && this.outputBuffer == AudioProcessor.EMPTY_BUFFER;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.inputEnded = true;
        int i10 = this.maybeSilenceBufferSize;
        if (i10 > 0) {
            output(this.maybeSilenceBuffer, i10);
        }
        if (!this.hasOutputNoise) {
            this.skippedFrames += this.paddingSize / this.bytesPerFrame;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.outputBuffer.hasRemaining()) {
            int i10 = this.state;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        processSilence(byteBuffer);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    processMaybeSilence(byteBuffer);
                }
            } else {
                processNoisy(byteBuffer);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void reset() {
        this.enabled = false;
        flush();
        this.buffer = AudioProcessor.EMPTY_BUFFER;
        this.channelCount = -1;
        this.sampleRateHz = -1;
        this.paddingSize = 0;
        this.maybeSilenceBuffer = new byte[0];
        this.paddingBuffer = new byte[0];
    }

    public final void setEnabled(boolean z10) {
        this.enabled = z10;
        flush();
    }

    private void output(ByteBuffer byteBuffer) {
        prepareForOutput(byteBuffer.remaining());
        this.buffer.put(byteBuffer);
        this.buffer.flip();
        this.outputBuffer = this.buffer;
    }
}
