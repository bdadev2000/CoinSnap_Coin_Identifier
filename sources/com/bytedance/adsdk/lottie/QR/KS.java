package com.bytedance.adsdk.lottie.QR;

/* loaded from: classes.dex */
public class KS {
    private float lMd;
    private float zp;

    public KS(float f9, float f10) {
        this.zp = f9;
        this.lMd = f10;
    }

    public float lMd() {
        return this.lMd;
    }

    public String toString() {
        return zp() + "x" + lMd();
    }

    public float zp() {
        return this.zp;
    }

    public boolean lMd(float f9, float f10) {
        return this.zp == f9 && this.lMd == f10;
    }

    public void zp(float f9, float f10) {
        this.zp = f9;
        this.lMd = f10;
    }

    public KS() {
        this(1.0f, 1.0f);
    }
}
