package com.bytedance.sdk.openadsdk.component.ku;

/* loaded from: classes.dex */
public final class zp {
    private long lMd;
    private float zp;

    public long lMd() {
        return this.lMd;
    }

    public float zp() {
        return this.zp;
    }

    public void zp(float f9) {
        StringBuilder sb = new StringBuilder("setTotalTime() called with: time = [");
        sb.append(f9);
        sb.append("]");
        this.zp = f9;
    }

    public void zp(long j7) {
        this.lMd = j7;
    }
}
