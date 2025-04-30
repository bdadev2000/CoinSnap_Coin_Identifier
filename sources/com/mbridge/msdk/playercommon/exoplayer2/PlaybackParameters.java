package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes3.dex */
public final class PlaybackParameters {
    public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0f);
    public final float pitch;
    private final int scaledUsPerMs;
    public final boolean skipSilence;
    public final float speed;

    public PlaybackParameters(float f9) {
        this(f9, 1.0f, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PlaybackParameters.class != obj.getClass()) {
            return false;
        }
        PlaybackParameters playbackParameters = (PlaybackParameters) obj;
        if (this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch && this.skipSilence == playbackParameters.skipSilence) {
            return true;
        }
        return false;
    }

    public final long getMediaTimeUsForPlayoutTimeMs(long j7) {
        return j7 * this.scaledUsPerMs;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.pitch) + ((Float.floatToRawIntBits(this.speed) + 527) * 31)) * 31) + (this.skipSilence ? 1 : 0);
    }

    public PlaybackParameters(float f9, float f10) {
        this(f9, f10, false);
    }

    public PlaybackParameters(float f9, float f10, boolean z8) {
        Assertions.checkArgument(f9 > 0.0f);
        Assertions.checkArgument(f10 > 0.0f);
        this.speed = f9;
        this.pitch = f10;
        this.skipSilence = z8;
        this.scaledUsPerMs = Math.round(f9 * 1000.0f);
    }
}
