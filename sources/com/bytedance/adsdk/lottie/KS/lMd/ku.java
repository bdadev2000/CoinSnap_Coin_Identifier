package com.bytedance.adsdk.lottie.KS.lMd;

/* loaded from: classes.dex */
public class ku {
    private final com.bytedance.adsdk.lottie.KS.zp.jU KS;
    private final boolean jU;
    private final com.bytedance.adsdk.lottie.KS.zp.ku lMd;
    private final zp zp;

    /* loaded from: classes.dex */
    public enum zp {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public ku(zp zpVar, com.bytedance.adsdk.lottie.KS.zp.ku kuVar, com.bytedance.adsdk.lottie.KS.zp.jU jUVar, boolean z8) {
        this.zp = zpVar;
        this.lMd = kuVar;
        this.KS = jUVar;
        this.jU = z8;
    }

    public com.bytedance.adsdk.lottie.KS.zp.jU KS() {
        return this.KS;
    }

    public boolean jU() {
        return this.jU;
    }

    public com.bytedance.adsdk.lottie.KS.zp.ku lMd() {
        return this.lMd;
    }

    public zp zp() {
        return this.zp;
    }
}
