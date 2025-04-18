package com.mbridge.msdk.playercommon.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class AudioTimestampPoller {
    private static final int ERROR_POLL_INTERVAL_US = 500000;
    private static final int FAST_POLL_INTERVAL_US = 5000;
    private static final int INITIALIZING_DURATION_US = 500000;
    private static final int SLOW_POLL_INTERVAL_US = 10000000;
    private static final int STATE_ERROR = 4;
    private static final int STATE_INITIALIZING = 0;
    private static final int STATE_NO_TIMESTAMP = 3;
    private static final int STATE_TIMESTAMP = 1;
    private static final int STATE_TIMESTAMP_ADVANCING = 2;
    private final AudioTimestampV19 audioTimestamp;
    private long initialTimestampPositionFrames;
    private long initializeSystemTimeUs;
    private long lastTimestampSampleTimeUs;
    private long sampleIntervalUs;
    private int state;

    /* loaded from: classes4.dex */
    public static final class AudioTimestampV19 {
        private final AudioTimestamp audioTimestamp = new AudioTimestamp();
        private final AudioTrack audioTrack;
        private long lastTimestampPositionFrames;
        private long lastTimestampRawPositionFrames;
        private long rawTimestampFramePositionWrapCount;

        public AudioTimestampV19(AudioTrack audioTrack) {
            this.audioTrack = audioTrack;
        }

        public final long getTimestampPositionFrames() {
            return this.lastTimestampPositionFrames;
        }

        public final long getTimestampSystemTimeUs() {
            return this.audioTimestamp.nanoTime / 1000;
        }

        public final boolean maybeUpdateTimestamp() {
            boolean timestamp = this.audioTrack.getTimestamp(this.audioTimestamp);
            if (timestamp) {
                long j3 = this.audioTimestamp.framePosition;
                if (this.lastTimestampRawPositionFrames > j3) {
                    this.rawTimestampFramePositionWrapCount++;
                }
                this.lastTimestampRawPositionFrames = j3;
                this.lastTimestampPositionFrames = j3 + (this.rawTimestampFramePositionWrapCount << 32);
            }
            return timestamp;
        }
    }

    /* loaded from: classes4.dex */
    public @interface State {
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
        if (Util.SDK_INT >= 19) {
            this.audioTimestamp = new AudioTimestampV19(audioTrack);
            reset();
        } else {
            this.audioTimestamp = null;
            updateState(3);
        }
    }

    private void updateState(int i10) {
        this.state = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.sampleIntervalUs = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.sampleIntervalUs = 10000000L;
                return;
            }
            this.sampleIntervalUs = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
            return;
        }
        this.lastTimestampSampleTimeUs = 0L;
        this.initialTimestampPositionFrames = -1L;
        this.initializeSystemTimeUs = System.nanoTime() / 1000;
        this.sampleIntervalUs = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
    }

    public final void acceptTimestamp() {
        if (this.state == 4) {
            reset();
        }
    }

    public final long getTimestampPositionFrames() {
        AudioTimestampV19 audioTimestampV19 = this.audioTimestamp;
        if (audioTimestampV19 != null) {
            return audioTimestampV19.getTimestampPositionFrames();
        }
        return -1L;
    }

    public final long getTimestampSystemTimeUs() {
        AudioTimestampV19 audioTimestampV19 = this.audioTimestamp;
        return audioTimestampV19 != null ? audioTimestampV19.getTimestampSystemTimeUs() : C.TIME_UNSET;
    }

    public final boolean hasTimestamp() {
        int i10 = this.state;
        return i10 == 1 || i10 == 2;
    }

    public final boolean isTimestampAdvancing() {
        return this.state == 2;
    }

    public final boolean maybePollTimestamp(long j3) {
        AudioTimestampV19 audioTimestampV19 = this.audioTimestamp;
        if (audioTimestampV19 == null || j3 - this.lastTimestampSampleTimeUs < this.sampleIntervalUs) {
            return false;
        }
        this.lastTimestampSampleTimeUs = j3;
        boolean maybeUpdateTimestamp = audioTimestampV19.maybeUpdateTimestamp();
        int i10 = this.state;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (maybeUpdateTimestamp) {
                        reset();
                    }
                } else if (!maybeUpdateTimestamp) {
                    reset();
                }
            } else if (maybeUpdateTimestamp) {
                if (this.audioTimestamp.getTimestampPositionFrames() > this.initialTimestampPositionFrames) {
                    updateState(2);
                }
            } else {
                reset();
            }
        } else if (maybeUpdateTimestamp) {
            if (this.audioTimestamp.getTimestampSystemTimeUs() < this.initializeSystemTimeUs) {
                return false;
            }
            this.initialTimestampPositionFrames = this.audioTimestamp.getTimestampPositionFrames();
            updateState(1);
        } else if (j3 - this.initializeSystemTimeUs > 500000) {
            updateState(3);
        }
        return maybeUpdateTimestamp;
    }

    public final void rejectTimestamp() {
        updateState(4);
    }

    public final void reset() {
        if (this.audioTimestamp != null) {
            updateState(0);
        }
    }
}
