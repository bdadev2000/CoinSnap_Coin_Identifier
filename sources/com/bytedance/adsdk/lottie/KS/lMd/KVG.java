package com.bytedance.adsdk.lottie.KS.lMd;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class KVG implements KS {
    private final boolean KS;
    private final List<KS> lMd;
    private final String zp;

    public KVG(String str, List<KS> list, boolean z8) {
        this.zp = str;
        this.lMd = list;
        this.KS = z8;
    }

    public boolean KS() {
        return this.KS;
    }

    public List<KS> lMd() {
        return this.lMd;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.zp + "' Shapes: " + Arrays.toString(this.lMd.toArray()) + '}';
    }

    public String zp() {
        return this.zp;
    }

    @Override // com.bytedance.adsdk.lottie.KS.lMd.KS
    public com.bytedance.adsdk.lottie.zp.zp.KS zp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.KS.KS.zp zpVar) {
        return new com.bytedance.adsdk.lottie.zp.zp.jU(kuVar, zpVar, this, hwf);
    }
}
