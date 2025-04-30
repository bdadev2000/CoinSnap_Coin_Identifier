package com.mbridge.msdk.playercommon.exoplayer2;

/* loaded from: classes3.dex */
public class DefaultControlDispatcher implements ControlDispatcher {
    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchSeekTo(Player player, int i9, long j7) {
        player.seekTo(i9, j7);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchSetPlayWhenReady(Player player, boolean z8) {
        player.setPlayWhenReady(z8);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchSetRepeatMode(Player player, int i9) {
        player.setRepeatMode(i9);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchSetShuffleModeEnabled(Player player, boolean z8) {
        player.setShuffleModeEnabled(z8);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchStop(Player player, boolean z8) {
        player.stop(z8);
        return true;
    }
}
