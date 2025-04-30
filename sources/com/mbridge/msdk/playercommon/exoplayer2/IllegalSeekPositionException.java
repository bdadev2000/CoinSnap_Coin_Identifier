package com.mbridge.msdk.playercommon.exoplayer2;

/* loaded from: classes3.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(Timeline timeline, int i9, long j7) {
        this.timeline = timeline;
        this.windowIndex = i9;
        this.positionMs = j7;
    }
}
