package com.mbridge.msdk.playercommon.exoplayer2;

/* loaded from: classes4.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(Timeline timeline, int i10, long j3) {
        this.timeline = timeline;
        this.windowIndex = i10;
        this.positionMs = j3;
    }
}
