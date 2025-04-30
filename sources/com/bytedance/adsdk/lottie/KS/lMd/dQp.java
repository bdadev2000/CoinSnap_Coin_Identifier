package com.bytedance.adsdk.lottie.KS.lMd;

import Q7.n0;
import android.graphics.Path;

/* loaded from: classes.dex */
public class dQp implements KS {
    private final com.bytedance.adsdk.lottie.KS.zp.jU COT;
    private final boolean HWF;
    private final String KS;
    private final com.bytedance.adsdk.lottie.KS.zp.zp jU;
    private final Path.FillType lMd;
    private final boolean zp;

    public dQp(String str, boolean z8, Path.FillType fillType, com.bytedance.adsdk.lottie.KS.zp.zp zpVar, com.bytedance.adsdk.lottie.KS.zp.jU jUVar, boolean z9) {
        this.KS = str;
        this.zp = z8;
        this.lMd = fillType;
        this.jU = zpVar;
        this.COT = jUVar;
        this.HWF = z9;
    }

    public boolean COT() {
        return this.HWF;
    }

    public com.bytedance.adsdk.lottie.KS.zp.jU KS() {
        return this.COT;
    }

    public Path.FillType jU() {
        return this.lMd;
    }

    public com.bytedance.adsdk.lottie.KS.zp.zp lMd() {
        return this.jU;
    }

    public String toString() {
        return n0.n(new StringBuilder("ShapeFill{color=, fillEnabled="), this.zp, '}');
    }

    public String zp() {
        return this.KS;
    }

    @Override // com.bytedance.adsdk.lottie.KS.lMd.KS
    public com.bytedance.adsdk.lottie.zp.zp.KS zp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.KS.KS.zp zpVar) {
        return new com.bytedance.adsdk.lottie.zp.zp.QR(kuVar, zpVar, this);
    }
}
