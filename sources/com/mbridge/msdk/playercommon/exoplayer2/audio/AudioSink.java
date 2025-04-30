package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;

    /* loaded from: classes3.dex */
    public static final class ConfigurationException extends Exception {
        public ConfigurationException(Throwable th) {
            super(th);
        }

        public ConfigurationException(String str) {
            super(str);
        }
    }

    /* loaded from: classes3.dex */
    public static final class InitializationException extends Exception {
        public final int audioTrackState;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InitializationException(int r4, int r5, int r6, int r7) {
            /*
                r3 = this;
                java.lang.String r0 = "AudioTrack init failed: "
                java.lang.String r1 = ", Config("
                java.lang.String r2 = ", "
                java.lang.StringBuilder r5 = Q7.n0.o(r4, r5, r0, r1, r2)
                r5.append(r6)
                r5.append(r2)
                r5.append(r7)
                java.lang.String r6 = ")"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r3.<init>(r5)
                r3.audioTrackState = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.InitializationException.<init>(int, int, int, int):void");
        }
    }

    /* loaded from: classes3.dex */
    public interface Listener {
        void onAudioSessionId(int i9);

        void onPositionDiscontinuity();

        void onUnderrun(int i9, long j7, long j9);
    }

    /* loaded from: classes3.dex */
    public static final class WriteException extends Exception {
        public final int errorCode;

        public WriteException(int i9) {
            super(o.h(i9, "AudioTrack write failed: "));
            this.errorCode = i9;
        }
    }

    void configure(int i9, int i10, int i11, int i12, int[] iArr, int i13, int i14) throws ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21(int i9);

    long getCurrentPositionUs(boolean z8);

    PlaybackParameters getPlaybackParameters();

    boolean handleBuffer(ByteBuffer byteBuffer, long j7) throws InitializationException, WriteException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEncodingSupported(int i9);

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    void release();

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioSessionId(int i9);

    void setListener(Listener listener);

    PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters);

    void setVolume(float f9);
}
