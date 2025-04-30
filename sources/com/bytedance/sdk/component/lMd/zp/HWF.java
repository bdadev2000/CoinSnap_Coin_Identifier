package com.bytedance.sdk.component.lMd.zp;

/* loaded from: classes.dex */
public final class HWF {
    private final String[] zp;

    public HWF(String[] strArr) {
        this.zp = strArr;
    }

    public String lMd(int i9) {
        return this.zp[(i9 * 2) + 1];
    }

    public int zp() {
        return this.zp.length / 2;
    }

    public String zp(int i9) {
        return this.zp[i9 * 2];
    }
}
