package com.bytedance.adsdk.lottie.KS.lMd;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class Bj implements KS {
    private final boolean COT;
    private final com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> KS;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd jU;
    private final com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> lMd;
    private final String zp;

    public Bj(String str, com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> tGVar, com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> tGVar2, com.bytedance.adsdk.lottie.KS.zp.lMd lmd, boolean z8) {
        this.zp = str;
        this.lMd = tGVar;
        this.KS = tGVar2;
        this.jU = lmd;
        this.COT = z8;
    }

    public boolean COT() {
        return this.COT;
    }

    public com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> KS() {
        return this.KS;
    }

    public com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> jU() {
        return this.lMd;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd lMd() {
        return this.jU;
    }

    public String toString() {
        return "RectangleShape{position=" + this.lMd + ", size=" + this.KS + '}';
    }

    public String zp() {
        return this.zp;
    }

    @Override // com.bytedance.adsdk.lottie.KS.lMd.KS
    public com.bytedance.adsdk.lottie.zp.zp.KS zp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.KS.KS.zp zpVar) {
        return new com.bytedance.adsdk.lottie.zp.zp.dQp(kuVar, zpVar, this);
    }
}
