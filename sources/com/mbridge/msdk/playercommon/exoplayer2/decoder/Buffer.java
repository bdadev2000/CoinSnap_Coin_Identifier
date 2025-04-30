package com.mbridge.msdk.playercommon.exoplayer2.decoder;

/* loaded from: classes3.dex */
public abstract class Buffer {
    private int flags;

    public final void addFlag(int i9) {
        this.flags = i9 | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i9) {
        this.flags = (~i9) & this.flags;
    }

    public final boolean getFlag(int i9) {
        if ((this.flags & i9) == i9) {
            return true;
        }
        return false;
    }

    public final boolean isDecodeOnly() {
        return getFlag(Integer.MIN_VALUE);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final void setFlags(int i9) {
        this.flags = i9;
    }
}
