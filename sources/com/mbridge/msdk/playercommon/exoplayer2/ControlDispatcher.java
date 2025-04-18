package com.mbridge.msdk.playercommon.exoplayer2;

/* loaded from: classes4.dex */
public interface ControlDispatcher {
    boolean dispatchSeekTo(Player player, int i10, long j3);

    boolean dispatchSetPlayWhenReady(Player player, boolean z10);

    boolean dispatchSetRepeatMode(Player player, int i10);

    boolean dispatchSetShuffleModeEnabled(Player player, boolean z10);

    boolean dispatchStop(Player player, boolean z10);
}
