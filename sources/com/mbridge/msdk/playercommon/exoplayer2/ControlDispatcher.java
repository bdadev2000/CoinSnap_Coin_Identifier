package com.mbridge.msdk.playercommon.exoplayer2;

/* loaded from: classes3.dex */
public interface ControlDispatcher {
    boolean dispatchSeekTo(Player player, int i9, long j7);

    boolean dispatchSetPlayWhenReady(Player player, boolean z8);

    boolean dispatchSetRepeatMode(Player player, int i9);

    boolean dispatchSetShuffleModeEnabled(Player player, boolean z8);

    boolean dispatchStop(Player player, boolean z8);
}
