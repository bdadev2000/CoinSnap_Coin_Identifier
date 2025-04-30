package com.mbridge.msdk.newreward.function.common;

/* loaded from: classes3.dex */
public class MBridgeOffsetManager {
    private int offset = 0;

    public int getOffset() {
        return Math.max(this.offset, 0);
    }

    public void increaseOffset(int i9) {
        this.offset += i9;
    }

    public void resetOffset() {
        this.offset = 0;
    }
}
