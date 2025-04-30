package com.mbridge.msdk.playercommon.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioTrackPositionTracker;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import y.AbstractC2933a;

/* loaded from: classes3.dex */
public final class DefaultAudioSink implements AudioSink {
    private static final int BUFFER_MULTIPLICATION_FACTOR = 4;
    private static final int ERROR_BAD_VALUE = -2;
    private static final long MAX_BUFFER_DURATION_US = 750000;
    private static final long MIN_BUFFER_DURATION_US = 250000;
    private static final int MODE_STATIC = 0;
    private static final int MODE_STREAM = 1;
    private static final long PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int START_IN_SYNC = 1;
    private static final int START_NEED_SYNC = 2;
    private static final int START_NOT_SET = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final String TAG = "AudioTrack";
    private static final int WRITE_NON_BLOCKING = 1;
    public static boolean enablePreV21AudioSessionWorkaround = false;
    public static boolean failOnSpuriousAudioTimestamp = false;
    private AudioProcessor[] activeAudioProcessors;
    private PlaybackParameters afterDrainPlaybackParameters;
    private AudioAttributes audioAttributes;
    private final AudioCapabilities audioCapabilities;
    private final AudioProcessorChain audioProcessorChain;
    private int audioSessionId;
    private AudioTrack audioTrack;
    private final AudioTrackPositionTracker audioTrackPositionTracker;
    private ByteBuffer avSyncHeader;
    private int bufferSize;
    private int bytesUntilNextAvSync;
    private boolean canApplyPlaybackParameters;
    private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private int drainingAudioProcessorIndex;
    private final boolean enableConvertHighResIntPcmToFloat;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private ByteBuffer inputBuffer;
    private int inputSampleRate;
    private boolean isInputPcm;
    private AudioTrack keepSessionIdAudioTrack;
    private long lastFeedElapsedRealtimeMs;
    private AudioSink.Listener listener;
    private ByteBuffer outputBuffer;
    private ByteBuffer[] outputBuffers;
    private int outputChannelConfig;
    private int outputEncoding;
    private int outputPcmFrameSize;
    private int outputSampleRate;
    private int pcmFrameSize;
    private PlaybackParameters playbackParameters;
    private final ArrayDeque<PlaybackParametersCheckpoint> playbackParametersCheckpoints;
    private long playbackParametersOffsetUs;
    private long playbackParametersPositionUs;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;
    private boolean processingEnabled;
    private final ConditionVariable releasingConditionVariable;
    private boolean shouldConvertHighResIntPcmToFloat;
    private int startMediaTimeState;
    private long startMediaTimeUs;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final AudioProcessor[] toFloatPcmAvailableAudioProcessors;
    private final AudioProcessor[] toIntPcmAvailableAudioProcessors;
    private final TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    /* loaded from: classes3.dex */
    public interface AudioProcessorChain {
        PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

        AudioProcessor[] getAudioProcessors();

        long getMediaDuration(long j7);

        long getSkippedOutputFrameCount();
    }

    /* loaded from: classes3.dex */
    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            AudioProcessor[] audioProcessorArr2 = (AudioProcessor[]) Arrays.copyOf(audioProcessorArr, audioProcessorArr.length + 2);
            this.audioProcessors = audioProcessorArr2;
            SilenceSkippingAudioProcessor silenceSkippingAudioProcessor = new SilenceSkippingAudioProcessor();
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            SonicAudioProcessor sonicAudioProcessor = new SonicAudioProcessor();
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.silenceSkippingAudioProcessor.setEnabled(playbackParameters.skipSilence);
            return new PlaybackParameters(this.sonicAudioProcessor.setSpeed(playbackParameters.speed), this.sonicAudioProcessor.setPitch(playbackParameters.pitch), playbackParameters.skipSilence);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public long getMediaDuration(long j7) {
            return this.sonicAudioProcessor.scaleDurationForSpeedup(j7);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }
    }

    /* loaded from: classes3.dex */
    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    /* loaded from: classes3.dex */
    public static final class PlaybackParametersCheckpoint {
        private final long mediaTimeUs;
        private final PlaybackParameters playbackParameters;
        private final long positionUs;

        private PlaybackParametersCheckpoint(PlaybackParameters playbackParameters, long j7, long j9) {
            this.playbackParameters = playbackParameters;
            this.mediaTimeUs = j7;
            this.positionUs = j9;
        }
    }

    /* loaded from: classes3.dex */
    public final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        private PositionTrackerListener() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public final void onInvalidLatency(long j7) {
            Log.w(DefaultAudioSink.TAG, "Ignoring impossibly large audio latency: " + j7);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public final void onPositionFramesMismatch(long j7, long j9, long j10, long j11) {
            StringBuilder a6 = AbstractC2933a.a("Spurious audio timestamp (frame position mismatch): ", j7, ", ");
            a6.append(j9);
            a6.append(", ");
            a6.append(j10);
            a6.append(", ");
            a6.append(j11);
            a6.append(", ");
            a6.append(DefaultAudioSink.this.getSubmittedFrames());
            a6.append(", ");
            a6.append(DefaultAudioSink.this.getWrittenFrames());
            String sb = a6.toString();
            if (!DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                Log.w(DefaultAudioSink.TAG, sb);
                return;
            }
            throw new InvalidAudioTrackTimestampException(sb);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public final void onSystemTimeUsMismatch(long j7, long j9, long j10, long j11) {
            StringBuilder a6 = AbstractC2933a.a("Spurious audio timestamp (system clock mismatch): ", j7, ", ");
            a6.append(j9);
            a6.append(", ");
            a6.append(j10);
            a6.append(", ");
            a6.append(j11);
            a6.append(", ");
            a6.append(DefaultAudioSink.this.getSubmittedFrames());
            a6.append(", ");
            a6.append(DefaultAudioSink.this.getWrittenFrames());
            String sb = a6.toString();
            if (!DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                Log.w(DefaultAudioSink.TAG, sb);
                return;
            }
            throw new InvalidAudioTrackTimestampException(sb);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public final void onUnderrun(int i9, long j7) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onUnderrun(i9, j7, SystemClock.elapsedRealtime() - DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }

    /* loaded from: classes3.dex */
    public @interface StartMediaTimeState {
    }

    public DefaultAudioSink(AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr) {
        this(audioCapabilities, audioProcessorArr, false);
    }

    private long applySkipping(long j7) {
        return j7 + framesToDurationUs(this.audioProcessorChain.getSkippedOutputFrameCount());
    }

    private long applySpeedup(long j7) {
        PlaybackParametersCheckpoint playbackParametersCheckpoint = null;
        while (!this.playbackParametersCheckpoints.isEmpty() && j7 >= this.playbackParametersCheckpoints.getFirst().positionUs) {
            playbackParametersCheckpoint = this.playbackParametersCheckpoints.remove();
        }
        if (playbackParametersCheckpoint != null) {
            this.playbackParameters = playbackParametersCheckpoint.playbackParameters;
            this.playbackParametersPositionUs = playbackParametersCheckpoint.positionUs;
            this.playbackParametersOffsetUs = playbackParametersCheckpoint.mediaTimeUs - this.startMediaTimeUs;
        }
        if (this.playbackParameters.speed == 1.0f) {
            return (j7 + this.playbackParametersOffsetUs) - this.playbackParametersPositionUs;
        }
        if (this.playbackParametersCheckpoints.isEmpty()) {
            return this.audioProcessorChain.getMediaDuration(j7 - this.playbackParametersPositionUs) + this.playbackParametersOffsetUs;
        }
        return Util.getMediaDurationForPlayoutDuration(j7 - this.playbackParametersPositionUs, this.playbackParameters.speed) + this.playbackParametersOffsetUs;
    }

    private AudioTrack createAudioTrackV21() {
        android.media.AudioAttributes audioAttributesV21;
        if (this.tunneling) {
            audioAttributesV21 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            audioAttributesV21 = this.audioAttributes.getAudioAttributesV21();
        }
        android.media.AudioAttributes audioAttributes = audioAttributesV21;
        AudioFormat build = new AudioFormat.Builder().setChannelMask(this.outputChannelConfig).setEncoding(this.outputEncoding).setSampleRate(this.outputSampleRate).build();
        int i9 = this.audioSessionId;
        if (i9 == 0) {
            i9 = 0;
        }
        return new AudioTrack(audioAttributes, build, this.bufferSize, 1, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:7:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean drainAudioProcessorsToEndOfStream() throws com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.drainingAudioProcessorIndex
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L14
            boolean r0 = r9.processingEnabled
            if (r0 == 0) goto Ld
            r0 = r2
            goto L10
        Ld:
            com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor[] r0 = r9.activeAudioProcessors
            int r0 = r0.length
        L10:
            r9.drainingAudioProcessorIndex = r0
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            int r4 = r9.drainingAudioProcessorIndex
            com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor[] r5 = r9.activeAudioProcessors
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.queueEndOfStream()
        L28:
            r9.processBuffers(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L32
            return r2
        L32:
            int r0 = r9.drainingAudioProcessorIndex
            int r0 = r0 + r1
            r9.drainingAudioProcessorIndex = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L44
            r9.writeBuffer(r0, r7)
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L44
            return r2
        L44:
            r9.drainingAudioProcessorIndex = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.drainAudioProcessorsToEndOfStream():boolean");
    }

    private long durationUsToFrames(long j7) {
        return (j7 * this.outputSampleRate) / 1000000;
    }

    private void flushAudioProcessors() {
        int i9 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.activeAudioProcessors;
            if (i9 < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i9];
                audioProcessor.flush();
                this.outputBuffers[i9] = audioProcessor.getOutput();
                i9++;
            } else {
                return;
            }
        }
    }

    private long framesToDurationUs(long j7) {
        return (j7 * 1000000) / this.outputSampleRate;
    }

    private AudioProcessor[] getAvailableAudioProcessors() {
        if (this.shouldConvertHighResIntPcmToFloat) {
            return this.toFloatPcmAvailableAudioProcessors;
        }
        return this.toIntPcmAvailableAudioProcessors;
    }

    private static int getFramesPerEncodedSample(int i9, ByteBuffer byteBuffer) {
        if (i9 != 7 && i9 != 8) {
            if (i9 == 5) {
                return Ac3Util.getAc3SyncframeAudioSampleCount();
            }
            if (i9 == 6) {
                return Ac3Util.parseEAc3SyncframeAudioSampleCount(byteBuffer);
            }
            if (i9 == 14) {
                int findTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                if (findTrueHdSyncframeOffset == -1) {
                    return 0;
                }
                return Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, findTrueHdSyncframeOffset) * 16;
            }
            throw new IllegalStateException(o.h(i9, "Unexpected audio encoding: "));
        }
        return DtsUtil.parseDtsAudioSampleCount(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        if (this.isInputPcm) {
            return this.submittedPcmBytes / this.pcmFrameSize;
        }
        return this.submittedEncodedFrames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        if (this.isInputPcm) {
            return this.writtenPcmBytes / this.outputPcmFrameSize;
        }
        return this.writtenEncodedFrames;
    }

    private void initialize() throws AudioSink.InitializationException {
        PlaybackParameters playbackParameters;
        this.releasingConditionVariable.block();
        AudioTrack initializeAudioTrack = initializeAudioTrack();
        this.audioTrack = initializeAudioTrack;
        int audioSessionId = initializeAudioTrack.getAudioSessionId();
        if (enablePreV21AudioSessionWorkaround && Util.SDK_INT < 21) {
            AudioTrack audioTrack = this.keepSessionIdAudioTrack;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                releaseKeepSessionIdAudioTrack();
            }
            if (this.keepSessionIdAudioTrack == null) {
                this.keepSessionIdAudioTrack = initializeKeepSessionIdAudioTrack(audioSessionId);
            }
        }
        if (this.audioSessionId != audioSessionId) {
            this.audioSessionId = audioSessionId;
            AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioSessionId(audioSessionId);
            }
        }
        if (this.canApplyPlaybackParameters) {
            playbackParameters = this.audioProcessorChain.applyPlaybackParameters(this.playbackParameters);
        } else {
            playbackParameters = PlaybackParameters.DEFAULT;
        }
        this.playbackParameters = playbackParameters;
        setupAudioProcessors();
        this.audioTrackPositionTracker.setAudioTrack(this.audioTrack, this.outputEncoding, this.outputPcmFrameSize, this.bufferSize);
        setVolumeInternal();
    }

    private AudioTrack initializeAudioTrack() throws AudioSink.InitializationException {
        AudioTrack audioTrack;
        if (Util.SDK_INT >= 21) {
            audioTrack = createAudioTrackV21();
        } else {
            int streamTypeForAudioUsage = Util.getStreamTypeForAudioUsage(this.audioAttributes.usage);
            if (this.audioSessionId == 0) {
                audioTrack = new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1);
            } else {
                audioTrack = new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1, this.audioSessionId);
            }
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new AudioSink.InitializationException(state, this.outputSampleRate, this.outputChannelConfig, this.bufferSize);
    }

    private AudioTrack initializeKeepSessionIdAudioTrack(int i9) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i9);
    }

    private long inputFramesToDurationUs(long j7) {
        return (j7 * 1000000) / this.inputSampleRate;
    }

    private boolean isInitialized() {
        if (this.audioTrack != null) {
            return true;
        }
        return false;
    }

    private void processBuffers(long j7) throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        int length = this.activeAudioProcessors.length;
        int i9 = length;
        while (i9 >= 0) {
            if (i9 > 0) {
                byteBuffer = this.outputBuffers[i9 - 1];
            } else {
                byteBuffer = this.inputBuffer;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.EMPTY_BUFFER;
                }
            }
            if (i9 == length) {
                writeBuffer(byteBuffer, j7);
            } else {
                AudioProcessor audioProcessor = this.activeAudioProcessors[i9];
                audioProcessor.queueInput(byteBuffer);
                ByteBuffer output = audioProcessor.getOutput();
                this.outputBuffers[i9] = output;
                if (output.hasRemaining()) {
                    i9++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i9--;
            }
        }
    }

    private void releaseKeepSessionIdAudioTrack() {
        final AudioTrack audioTrack = this.keepSessionIdAudioTrack;
        if (audioTrack == null) {
            return;
        }
        this.keepSessionIdAudioTrack = null;
        new Thread() { // from class: com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                audioTrack.release();
            }
        }.start();
    }

    private void setVolumeInternal() {
        if (isInitialized()) {
            if (Util.SDK_INT >= 21) {
                setVolumeInternalV21(this.audioTrack, this.volume);
            } else {
                setVolumeInternalV3(this.audioTrack, this.volume);
            }
        }
    }

    private static void setVolumeInternalV21(AudioTrack audioTrack, float f9) {
        audioTrack.setVolume(f9);
    }

    private static void setVolumeInternalV3(AudioTrack audioTrack, float f9) {
        audioTrack.setStereoVolume(f9, f9);
    }

    private void setupAudioProcessors() {
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : getAvailableAudioProcessors()) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.activeAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.outputBuffers = new ByteBuffer[size];
        flushAudioProcessors();
    }

    private void writeBuffer(ByteBuffer byteBuffer, long j7) throws AudioSink.WriteException {
        boolean z8;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.outputBuffer;
        boolean z9 = true;
        int i9 = 0;
        if (byteBuffer2 != null) {
            if (byteBuffer2 == byteBuffer) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkArgument(z8);
        } else {
            this.outputBuffer = byteBuffer;
            if (Util.SDK_INT < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.preV21OutputBuffer;
                if (bArr == null || bArr.length < remaining) {
                    this.preV21OutputBuffer = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.preV21OutputBuffer, 0, remaining);
                byteBuffer.position(position);
                this.preV21OutputBufferOffset = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (Util.SDK_INT < 21) {
            int availableBufferSize = this.audioTrackPositionTracker.getAvailableBufferSize(this.writtenPcmBytes);
            if (availableBufferSize > 0) {
                i9 = this.audioTrack.write(this.preV21OutputBuffer, this.preV21OutputBufferOffset, Math.min(remaining2, availableBufferSize));
                if (i9 > 0) {
                    this.preV21OutputBufferOffset += i9;
                    byteBuffer.position(byteBuffer.position() + i9);
                }
            }
        } else if (this.tunneling) {
            if (j7 == C.TIME_UNSET) {
                z9 = false;
            }
            Assertions.checkState(z9);
            i9 = writeNonBlockingWithAvSyncV21(this.audioTrack, byteBuffer, remaining2, j7);
        } else {
            i9 = writeNonBlockingV21(this.audioTrack, byteBuffer, remaining2);
        }
        this.lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
        if (i9 >= 0) {
            boolean z10 = this.isInputPcm;
            if (z10) {
                this.writtenPcmBytes += i9;
            }
            if (i9 == remaining2) {
                if (!z10) {
                    this.writtenEncodedFrames += this.framesPerEncodedSample;
                }
                this.outputBuffer = null;
                return;
            }
            return;
        }
        throw new AudioSink.WriteException(i9);
    }

    private static int writeNonBlockingV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i9) {
        return audioTrack.write(byteBuffer, i9, 1);
    }

    private int writeNonBlockingWithAvSyncV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i9, long j7) {
        if (this.avSyncHeader == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.avSyncHeader = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i9);
            this.avSyncHeader.putLong(8, j7 * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i9;
        }
        int remaining = this.avSyncHeader.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.avSyncHeader, remaining, 1);
            if (write < 0) {
                this.bytesUntilNextAvSync = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int writeNonBlockingV21 = writeNonBlockingV21(audioTrack, byteBuffer, i9);
        if (writeNonBlockingV21 < 0) {
            this.bytesUntilNextAvSync = 0;
            return writeNonBlockingV21;
        }
        this.bytesUntilNextAvSync -= writeNonBlockingV21;
        return writeNonBlockingV21;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0128  */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void configure(int r18, int r19, int r20, int r21, int[] r22, int r23, int r24) throws com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.ConfigurationException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.configure(int, int, int, int, int[], int, int):void");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            this.audioSessionId = 0;
            reset();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final void enableTunnelingV21(int i9) {
        boolean z8;
        if (Util.SDK_INT >= 21) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        if (!this.tunneling || this.audioSessionId != i9) {
            this.tunneling = true;
            this.audioSessionId = i9;
            reset();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final long getCurrentPositionUs(boolean z8) {
        if (isInitialized() && this.startMediaTimeState != 0) {
            return this.startMediaTimeUs + applySkipping(applySpeedup(Math.min(this.audioTrackPositionTracker.getCurrentPositionUs(z8), framesToDurationUs(getWrittenFrames()))));
        }
        return Long.MIN_VALUE;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final boolean handleBuffer(ByteBuffer byteBuffer, long j7) throws AudioSink.InitializationException, AudioSink.WriteException {
        boolean z8;
        ByteBuffer byteBuffer2 = this.inputBuffer;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            z8 = false;
        } else {
            z8 = true;
        }
        Assertions.checkArgument(z8);
        if (!isInitialized()) {
            initialize();
            if (this.playing) {
                play();
            }
        }
        if (!this.audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
            return false;
        }
        if (this.inputBuffer == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.isInputPcm && this.framesPerEncodedSample == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(this.outputEncoding, byteBuffer);
                this.framesPerEncodedSample = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.afterDrainPlaybackParameters != null) {
                if (!drainAudioProcessorsToEndOfStream()) {
                    return false;
                }
                PlaybackParameters playbackParameters = this.afterDrainPlaybackParameters;
                this.afterDrainPlaybackParameters = null;
                this.playbackParametersCheckpoints.add(new PlaybackParametersCheckpoint(this.audioProcessorChain.applyPlaybackParameters(playbackParameters), Math.max(0L, j7), framesToDurationUs(getWrittenFrames())));
                setupAudioProcessors();
            }
            if (this.startMediaTimeState == 0) {
                this.startMediaTimeUs = Math.max(0L, j7);
                this.startMediaTimeState = 1;
            } else {
                long inputFramesToDurationUs = this.startMediaTimeUs + inputFramesToDurationUs(getSubmittedFrames());
                if (this.startMediaTimeState == 1 && Math.abs(inputFramesToDurationUs - j7) > 200000) {
                    StringBuilder a6 = AbstractC2933a.a("Discontinuity detected [expected ", inputFramesToDurationUs, ", got ");
                    a6.append(j7);
                    a6.append("]");
                    Log.e(TAG, a6.toString());
                    this.startMediaTimeState = 2;
                }
                if (this.startMediaTimeState == 2) {
                    this.startMediaTimeUs = (j7 - inputFramesToDurationUs) + this.startMediaTimeUs;
                    this.startMediaTimeState = 1;
                    AudioSink.Listener listener = this.listener;
                    if (listener != null) {
                        listener.onPositionDiscontinuity();
                    }
                }
            }
            if (this.isInputPcm) {
                this.submittedPcmBytes += byteBuffer.remaining();
            } else {
                this.submittedEncodedFrames += this.framesPerEncodedSample;
            }
            this.inputBuffer = byteBuffer;
        }
        if (this.processingEnabled) {
            processBuffers(j7);
        } else {
            writeBuffer(this.inputBuffer, j7);
        }
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            return true;
        }
        if (this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
            Log.w(TAG, "Resetting stalled audio track");
            reset();
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final void handleDiscontinuity() {
        if (this.startMediaTimeState == 1) {
            this.startMediaTimeState = 2;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final boolean hasPendingData() {
        if (isInitialized() && this.audioTrackPositionTracker.hasPendingData(getWrittenFrames())) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final boolean isEncodingSupported(int i9) {
        if (Util.isEncodingPcm(i9)) {
            if (i9 != 4 || Util.SDK_INT >= 21) {
                return true;
            }
            return false;
        }
        AudioCapabilities audioCapabilities = this.audioCapabilities;
        if (audioCapabilities != null && audioCapabilities.supportsEncoding(i9)) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final boolean isEnded() {
        if (isInitialized() && (!this.handledEndOfStream || hasPendingData())) {
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final void pause() {
        this.playing = false;
        if (isInitialized() && this.audioTrackPositionTracker.pause()) {
            this.audioTrack.pause();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final void play() {
        this.playing = true;
        if (isInitialized()) {
            this.audioTrackPositionTracker.start();
            this.audioTrack.play();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final void playToEndOfStream() throws AudioSink.WriteException {
        if (!this.handledEndOfStream && isInitialized() && drainAudioProcessorsToEndOfStream()) {
            this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
            this.audioTrack.stop();
            this.bytesUntilNextAvSync = 0;
            this.handledEndOfStream = true;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final void release() {
        reset();
        releaseKeepSessionIdAudioTrack();
        for (AudioProcessor audioProcessor : this.toIntPcmAvailableAudioProcessors) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.toFloatPcmAvailableAudioProcessors) {
            audioProcessor2.reset();
        }
        this.audioSessionId = 0;
        this.playing = false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final void reset() {
        if (isInitialized()) {
            this.submittedPcmBytes = 0L;
            this.submittedEncodedFrames = 0L;
            this.writtenPcmBytes = 0L;
            this.writtenEncodedFrames = 0L;
            this.framesPerEncodedSample = 0;
            PlaybackParameters playbackParameters = this.afterDrainPlaybackParameters;
            if (playbackParameters != null) {
                this.playbackParameters = playbackParameters;
                this.afterDrainPlaybackParameters = null;
            } else if (!this.playbackParametersCheckpoints.isEmpty()) {
                this.playbackParameters = this.playbackParametersCheckpoints.getLast().playbackParameters;
            }
            this.playbackParametersCheckpoints.clear();
            this.playbackParametersOffsetUs = 0L;
            this.playbackParametersPositionUs = 0L;
            this.inputBuffer = null;
            this.outputBuffer = null;
            flushAudioProcessors();
            this.handledEndOfStream = false;
            this.drainingAudioProcessorIndex = -1;
            this.avSyncHeader = null;
            this.bytesUntilNextAvSync = 0;
            this.startMediaTimeState = 0;
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            final AudioTrack audioTrack = this.audioTrack;
            this.audioTrack = null;
            this.audioTrackPositionTracker.reset();
            this.releasingConditionVariable.close();
            new Thread() { // from class: com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        DefaultAudioSink.this.releasingConditionVariable.open();
                    }
                }
            }.start();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        reset();
        this.audioSessionId = 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final void setAudioSessionId(int i9) {
        if (this.audioSessionId != i9) {
            this.audioSessionId = i9;
            reset();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final void setListener(AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (isInitialized() && !this.canApplyPlaybackParameters) {
            PlaybackParameters playbackParameters2 = PlaybackParameters.DEFAULT;
            this.playbackParameters = playbackParameters2;
            return playbackParameters2;
        }
        PlaybackParameters playbackParameters3 = this.afterDrainPlaybackParameters;
        if (playbackParameters3 == null) {
            if (!this.playbackParametersCheckpoints.isEmpty()) {
                playbackParameters3 = this.playbackParametersCheckpoints.getLast().playbackParameters;
            } else {
                playbackParameters3 = this.playbackParameters;
            }
        }
        if (!playbackParameters.equals(playbackParameters3)) {
            if (isInitialized()) {
                this.afterDrainPlaybackParameters = playbackParameters;
            } else {
                this.playbackParameters = this.audioProcessorChain.applyPlaybackParameters(playbackParameters);
            }
        }
        return this.playbackParameters;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public final void setVolume(float f9) {
        if (this.volume != f9) {
            this.volume = f9;
            setVolumeInternal();
        }
    }

    public DefaultAudioSink(AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr, boolean z8) {
        this(audioCapabilities, new DefaultAudioProcessorChain(audioProcessorArr), z8);
    }

    public DefaultAudioSink(AudioCapabilities audioCapabilities, AudioProcessorChain audioProcessorChain, boolean z8) {
        this.audioCapabilities = audioCapabilities;
        this.audioProcessorChain = (AudioProcessorChain) Assertions.checkNotNull(audioProcessorChain);
        this.enableConvertHighResIntPcmToFloat = z8;
        this.releasingConditionVariable = new ConditionVariable(true);
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new PositionTrackerListener());
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ResamplingAudioProcessor(), channelMappingAudioProcessor, trimmingAudioProcessor);
        Collections.addAll(arrayList, audioProcessorChain.getAudioProcessors());
        this.toIntPcmAvailableAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[arrayList.size()]);
        this.toFloatPcmAvailableAudioProcessors = new AudioProcessor[]{new FloatResamplingAudioProcessor()};
        this.volume = 1.0f;
        this.startMediaTimeState = 0;
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.audioSessionId = 0;
        this.playbackParameters = PlaybackParameters.DEFAULT;
        this.drainingAudioProcessorIndex = -1;
        this.activeAudioProcessors = new AudioProcessor[0];
        this.outputBuffers = new ByteBuffer[0];
        this.playbackParametersCheckpoints = new ArrayDeque<>();
    }
}
