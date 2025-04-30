package com.bytedance.adsdk.lottie.KS.lMd;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class lMd implements KS {
    private final boolean COT;
    private final com.bytedance.adsdk.lottie.KS.zp.HWF KS;
    private final boolean jU;
    private final com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> lMd;
    private final String zp;

    public lMd(String str, com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> tGVar, com.bytedance.adsdk.lottie.KS.zp.HWF hwf, boolean z8, boolean z9) {
        this.zp = str;
        this.lMd = tGVar;
        this.KS = hwf;
        this.jU = z8;
        this.COT = z9;
    }

    public boolean COT() {
        return this.COT;
    }

    public com.bytedance.adsdk.lottie.KS.zp.HWF KS() {
        return this.KS;
    }

    public boolean jU() {
        return this.jU;
    }

    public com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> lMd() {
        return this.lMd;
    }

    @Override // com.bytedance.adsdk.lottie.KS.lMd.KS
    public com.bytedance.adsdk.lottie.zp.zp.KS zp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.KS.KS.zp zpVar) {
        return new com.bytedance.adsdk.lottie.zp.zp.HWF(kuVar, zpVar, this);
    }

    public String zp() {
        return this.zp;
    }
}
