package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import eb.j;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;

    /* loaded from: classes4.dex */
    public static final class ConfigurationException extends Exception {
        public ConfigurationException(Throwable th2) {
            super(th2);
        }

        public ConfigurationException(String str) {
            super(str);
        }
    }

    /* loaded from: classes4.dex */
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
                java.lang.StringBuilder r5 = a4.j.n(r0, r4, r1, r5, r2)
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

    /* loaded from: classes4.dex */
    public interface Listener {
        void onAudioSessionId(int i10);

        void onPositionDiscontinuity();

        void onUnderrun(int i10, long j3, long j10);
    }

    /* loaded from: classes4.dex */
    public static final class WriteException extends Exception {
        public final int errorCode;

        public WriteException(int i10) {
            super(j.i("AudioTrack write failed: ", i10));
            this.errorCode = i10;
        }
    }

    void configure(int i10, int i11, int i12, int i13, int[] iArr, int i14, int i15) throws ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21(int i10);

    long getCurrentPositionUs(boolean z10);

    PlaybackParameters getPlaybackParameters();

    boolean handleBuffer(ByteBuffer byteBuffer, long j3) throws InitializationException, WriteException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEncodingSupported(int i10);

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    void release();

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioSessionId(int i10);

    void setListener(Listener listener);

    PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters);

    void setVolume(float f10);
}
