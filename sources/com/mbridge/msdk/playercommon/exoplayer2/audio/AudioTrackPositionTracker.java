package com.mbridge.msdk.playercommon.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class AudioTrackPositionTracker {
    private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200;
    private static final long MAX_AUDIO_TIMESTAMP_OFFSET_US = 5000000;
    private static final long MAX_LATENCY_US = 5000000;
    private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
    private static final int MIN_LATENCY_SAMPLE_INTERVAL_US = 500000;
    private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
    private static final int PLAYSTATE_PAUSED = 2;
    private static final int PLAYSTATE_PLAYING = 3;
    private static final int PLAYSTATE_STOPPED = 1;
    private AudioTimestampPoller audioTimestampPoller;
    private AudioTrack audioTrack;
    private int bufferSize;
    private long bufferSizeUs;
    private long endPlaybackHeadPosition;
    private long forceResetWorkaroundTimeMs;
    private Method getLatencyMethod;
    private boolean hasData;
    private boolean isOutputPcm;
    private long lastLatencySampleTimeUs;
    private long lastPlayheadSampleTimeUs;
    private long lastRawPlaybackHeadPosition;
    private long latencyUs;
    private final Listener listener;
    private boolean needsPassthroughWorkarounds;
    private int nextPlayheadOffsetIndex;
    private int outputPcmFrameSize;
    private int outputSampleRate;
    private long passthroughWorkaroundPauseOffset;
    private int playheadOffsetCount;
    private final long[] playheadOffsets;
    private long rawPlaybackHeadWrapCount;
    private long smoothedPlayheadOffsetUs;
    private long stopPlaybackHeadPosition;
    private long stopTimestampUs;

    /* loaded from: classes4.dex */
    public interface Listener {
        void onInvalidLatency(long j3);

        void onPositionFramesMismatch(long j3, long j10, long j11, long j12);

        void onSystemTimeUsMismatch(long j3, long j10, long j11, long j12);

        void onUnderrun(int i10, long j3);
    }

    /* loaded from: classes4.dex */
    public @interface PlayState {
    }

    public AudioTrackPositionTracker(Listener listener) {
        this.listener = (Listener) Assertions.checkNotNull(listener);
        if (Util.SDK_INT >= 18) {
            try {
                this.getLatencyMethod = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.playheadOffsets = new long[10];
    }

    private boolean forceHasPendingData() {
        if (this.needsPassthroughWorkarounds && this.audioTrack.getPlayState() == 2 && getPlaybackHeadPosition() == 0) {
            return true;
        }
        return false;
    }

    private long framesToDurationUs(long j3) {
        return (j3 * 1000000) / this.outputSampleRate;
    }

    private long getPlaybackHeadPosition() {
        if (this.stopTimestampUs != C.TIME_UNSET) {
            return Math.min(this.endPlaybackHeadPosition, this.stopPlaybackHeadPosition + ((((SystemClock.elapsedRealtime() * 1000) - this.stopTimestampUs) * this.outputSampleRate) / 1000000));
        }
        int playState = this.audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.needsPassthroughWorkarounds) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.passthroughWorkaroundPauseOffset = this.lastRawPlaybackHeadPosition;
            }
            playbackHeadPosition += this.passthroughWorkaroundPauseOffset;
        }
        if (Util.SDK_INT <= 28) {
            if (playbackHeadPosition == 0 && this.lastRawPlaybackHeadPosition > 0 && playState == 3) {
                if (this.forceResetWorkaroundTimeMs == C.TIME_UNSET) {
                    this.forceResetWorkaroundTimeMs = SystemClock.elapsedRealtime();
                }
                return this.lastRawPlaybackHeadPosition;
            }
            this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        }
        if (this.lastRawPlaybackHeadPosition > playbackHeadPosition) {
            this.rawPlaybackHeadWrapCount++;
        }
        this.lastRawPlaybackHeadPosition = playbackHeadPosition;
        return playbackHeadPosition + (this.rawPlaybackHeadWrapCount << 32);
    }

    private long getPlaybackHeadPositionUs() {
        return framesToDurationUs(getPlaybackHeadPosition());
    }

    private void maybePollAndCheckTimestamp(long j3, long j10) {
        if (!this.audioTimestampPoller.maybePollTimestamp(j3)) {
            return;
        }
        long timestampSystemTimeUs = this.audioTimestampPoller.getTimestampSystemTimeUs();
        long timestampPositionFrames = this.audioTimestampPoller.getTimestampPositionFrames();
        if (Math.abs(timestampSystemTimeUs - j3) > 5000000) {
            this.listener.onSystemTimeUsMismatch(timestampPositionFrames, timestampSystemTimeUs, j3, j10);
            this.audioTimestampPoller.rejectTimestamp();
        } else if (Math.abs(framesToDurationUs(timestampPositionFrames) - j10) > 5000000) {
            this.listener.onPositionFramesMismatch(timestampPositionFrames, timestampSystemTimeUs, j3, j10);
            this.audioTimestampPoller.rejectTimestamp();
        } else {
            this.audioTimestampPoller.acceptTimestamp();
        }
    }

    private void maybeSampleSyncParams() {
        long playbackHeadPositionUs = getPlaybackHeadPositionUs();
        if (playbackHeadPositionUs == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.lastPlayheadSampleTimeUs >= 30000) {
            long[] jArr = this.playheadOffsets;
            int i10 = this.nextPlayheadOffsetIndex;
            jArr[i10] = playbackHeadPositionUs - nanoTime;
            this.nextPlayheadOffsetIndex = (i10 + 1) % 10;
            int i11 = this.playheadOffsetCount;
            if (i11 < 10) {
                this.playheadOffsetCount = i11 + 1;
            }
            this.lastPlayheadSampleTimeUs = nanoTime;
            this.smoothedPlayheadOffsetUs = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.playheadOffsetCount;
                if (i12 >= i13) {
                    break;
                }
                this.smoothedPlayheadOffsetUs = (this.playheadOffsets[i12] / i13) + this.smoothedPlayheadOffsetUs;
                i12++;
            }
        }
        if (this.needsPassthroughWorkarounds) {
            return;
        }
        maybePollAndCheckTimestamp(nanoTime, playbackHeadPositionUs);
        maybeUpdateLatency(nanoTime);
    }

    private void maybeUpdateLatency(long j3) {
        Method method;
        if (this.isOutputPcm && (method = this.getLatencyMethod) != null && j3 - this.lastLatencySampleTimeUs >= 500000) {
            try {
                long intValue = (((Integer) method.invoke(this.audioTrack, null)).intValue() * 1000) - this.bufferSizeUs;
                this.latencyUs = intValue;
                long max = Math.max(intValue, 0L);
                this.latencyUs = max;
                if (max > 5000000) {
                    this.listener.onInvalidLatency(max);
                    this.latencyUs = 0L;
                }
            } catch (Exception unused) {
                this.getLatencyMethod = null;
            }
            this.lastLatencySampleTimeUs = j3;
        }
    }

    private static boolean needsPassthroughWorkarounds(int i10) {
        return Util.SDK_INT < 23 && (i10 == 5 || i10 == 6);
    }

    private void resetSyncParams() {
        this.smoothedPlayheadOffsetUs = 0L;
        this.playheadOffsetCount = 0;
        this.nextPlayheadOffsetIndex = 0;
        this.lastPlayheadSampleTimeUs = 0L;
    }

    public final int getAvailableBufferSize(long j3) {
        return this.bufferSize - ((int) (j3 - (getPlaybackHeadPosition() * this.outputPcmFrameSize)));
    }

    public final long getCurrentPositionUs(boolean z10) {
        long j3;
        if (this.audioTrack.getPlayState() == 3) {
            maybeSampleSyncParams();
        }
        long nanoTime = System.nanoTime() / 1000;
        if (this.audioTimestampPoller.hasTimestamp()) {
            long framesToDurationUs = framesToDurationUs(this.audioTimestampPoller.getTimestampPositionFrames());
            if (!this.audioTimestampPoller.isTimestampAdvancing()) {
                return framesToDurationUs;
            }
            return (nanoTime - this.audioTimestampPoller.getTimestampSystemTimeUs()) + framesToDurationUs;
        }
        if (this.playheadOffsetCount == 0) {
            j3 = getPlaybackHeadPositionUs();
        } else {
            j3 = nanoTime + this.smoothedPlayheadOffsetUs;
        }
        if (!z10) {
            return j3 - this.latencyUs;
        }
        return j3;
    }

    public final void handleEndOfStream(long j3) {
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
        this.stopTimestampUs = SystemClock.elapsedRealtime() * 1000;
        this.endPlaybackHeadPosition = j3;
    }

    public final boolean hasPendingData(long j3) {
        if (j3 <= getPlaybackHeadPosition() && !forceHasPendingData()) {
            return false;
        }
        return true;
    }

    public final boolean isPlaying() {
        return this.audioTrack.getPlayState() == 3;
    }

    public final boolean isStalled(long j3) {
        if (this.forceResetWorkaroundTimeMs != C.TIME_UNSET && j3 > 0 && SystemClock.elapsedRealtime() - this.forceResetWorkaroundTimeMs >= FORCE_RESET_WORKAROUND_TIMEOUT_MS) {
            return true;
        }
        return false;
    }

    public final boolean mayHandleBuffer(long j3) {
        Listener listener;
        int playState = this.audioTrack.getPlayState();
        if (this.needsPassthroughWorkarounds) {
            if (playState == 2) {
                this.hasData = false;
                return false;
            }
            if (playState == 1 && getPlaybackHeadPosition() == 0) {
                return false;
            }
        }
        boolean z10 = this.hasData;
        boolean hasPendingData = hasPendingData(j3);
        this.hasData = hasPendingData;
        if (z10 && !hasPendingData && playState != 1 && (listener = this.listener) != null) {
            listener.onUnderrun(this.bufferSize, C.usToMs(this.bufferSizeUs));
        }
        return true;
    }

    public final boolean pause() {
        resetSyncParams();
        if (this.stopTimestampUs == C.TIME_UNSET) {
            this.audioTimestampPoller.reset();
            return true;
        }
        return false;
    }

    public final void reset() {
        resetSyncParams();
        this.audioTrack = null;
        this.audioTimestampPoller = null;
    }

    public final void setAudioTrack(AudioTrack audioTrack, int i10, int i11, int i12) {
        long j3;
        this.audioTrack = audioTrack;
        this.outputPcmFrameSize = i11;
        this.bufferSize = i12;
        this.audioTimestampPoller = new AudioTimestampPoller(audioTrack);
        this.outputSampleRate = audioTrack.getSampleRate();
        this.needsPassthroughWorkarounds = needsPassthroughWorkarounds(i10);
        boolean isEncodingPcm = Util.isEncodingPcm(i10);
        this.isOutputPcm = isEncodingPcm;
        if (isEncodingPcm) {
            j3 = framesToDurationUs(i12 / i11);
        } else {
            j3 = -9223372036854775807L;
        }
        this.bufferSizeUs = j3;
        this.lastRawPlaybackHeadPosition = 0L;
        this.rawPlaybackHeadWrapCount = 0L;
        this.passthroughWorkaroundPauseOffset = 0L;
        this.hasData = false;
        this.stopTimestampUs = C.TIME_UNSET;
        this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        this.latencyUs = 0L;
    }

    public final void start() {
        this.audioTimestampPoller.reset();
    }
}
