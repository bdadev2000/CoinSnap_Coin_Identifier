package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
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

    /* loaded from: classes3.dex */
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

    private int durationUsToFrames(long j7) {
        return (int) ((j7 * this.sampleRateHz) / 1000000);
    }

    private int findNoiseLimit(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs((int) byteBuffer.get(limit)) > 4) {
                int i9 = this.bytesPerFrame;
                return ((limit / i9) * i9) + i9;
            }
        }
        return byteBuffer.position();
    }

    private int findNoisePosition(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.get(position)) > 4) {
                int i9 = this.bytesPerFrame;
                return (position / i9) * i9;
            }
        }
        return byteBuffer.limit();
    }

    private void output(byte[] bArr, int i9) {
        prepareForOutput(i9);
        this.buffer.put(bArr, 0, i9);
        this.buffer.flip();
        this.outputBuffer = this.buffer;
    }

    private void prepareForOutput(int i9) {
        if (this.buffer.capacity() < i9) {
            this.buffer = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
        if (i9 > 0) {
            this.hasOutputNoise = true;
        }
    }

    private void processMaybeSilence(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int findNoisePosition = findNoisePosition(byteBuffer);
        int position = findNoisePosition - byteBuffer.position();
        byte[] bArr = this.maybeSilenceBuffer;
        int length = bArr.length;
        int i9 = this.maybeSilenceBufferSize;
        int i10 = length - i9;
        if (findNoisePosition < limit && position < i10) {
            output(bArr, i9);
            this.maybeSilenceBufferSize = 0;
            this.state = 0;
            return;
        }
        int min = Math.min(position, i10);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.maybeSilenceBuffer, this.maybeSilenceBufferSize, min);
        int i11 = this.maybeSilenceBufferSize + min;
        this.maybeSilenceBufferSize = i11;
        byte[] bArr2 = this.maybeSilenceBuffer;
        if (i11 == bArr2.length) {
            if (this.hasOutputNoise) {
                output(bArr2, this.paddingSize);
                this.skippedFrames += (this.maybeSilenceBufferSize - (this.paddingSize * 2)) / this.bytesPerFrame;
            } else {
                this.skippedFrames += (i11 - this.paddingSize) / this.bytesPerFrame;
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

    private void updatePaddingBuffer(ByteBuffer byteBuffer, byte[] bArr, int i9) {
        int min = Math.min(byteBuffer.remaining(), this.paddingSize);
        int i10 = this.paddingSize - min;
        System.arraycopy(bArr, i9 - i10, this.paddingBuffer, 0, i10);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.paddingBuffer, i10, min);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean configure(int i9, int i10, int i11) throws AudioProcessor.UnhandledFormatException {
        if (i11 == 2) {
            if (this.sampleRateHz == i9 && this.channelCount == i10) {
                return false;
            }
            this.sampleRateHz = i9;
            this.channelCount = i10;
            this.bytesPerFrame = i10 * 2;
            return true;
        }
        throw new AudioProcessor.UnhandledFormatException(i9, i10, i11);
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
        if (this.sampleRateHz != -1 && this.enabled) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final boolean isEnded() {
        if (this.inputEnded && this.outputBuffer == AudioProcessor.EMPTY_BUFFER) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.inputEnded = true;
        int i9 = this.maybeSilenceBufferSize;
        if (i9 > 0) {
            output(this.maybeSilenceBuffer, i9);
        }
        if (!this.hasOutputNoise) {
            this.skippedFrames += this.paddingSize / this.bytesPerFrame;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.outputBuffer.hasRemaining()) {
            int i9 = this.state;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
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

    public final void setEnabled(boolean z8) {
        this.enabled = z8;
        flush();
    }

    private void output(ByteBuffer byteBuffer) {
        prepareForOutput(byteBuffer.remaining());
        this.buffer.put(byteBuffer);
        this.buffer.flip();
        this.outputBuffer = this.buffer;
    }
}
