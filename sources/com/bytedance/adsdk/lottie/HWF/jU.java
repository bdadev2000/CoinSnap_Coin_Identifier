package com.bytedance.adsdk.lottie.HWF;

/* loaded from: classes.dex */
public class jU {
    private int lMd;
    private float zp;

    public void zp(float f9) {
        float f10 = this.zp + f9;
        this.zp = f10;
        int i9 = this.lMd + 1;
        this.lMd = i9;
        if (i9 == Integer.MAX_VALUE) {
            this.zp = f10 / 2.0f;
            this.lMd = i9 / 2;
        }
    }
}
