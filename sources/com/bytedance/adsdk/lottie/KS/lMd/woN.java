package com.bytedance.adsdk.lottie.KS.lMd;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes.dex */
public class woN implements KS {
    private final com.bytedance.adsdk.lottie.KS.zp.ku KS;
    private final boolean jU;
    private final int lMd;
    private final String zp;

    public woN(String str, int i9, com.bytedance.adsdk.lottie.KS.zp.ku kuVar, boolean z8) {
        this.zp = str;
        this.lMd = i9;
        this.KS = kuVar;
        this.jU = z8;
    }

    public boolean KS() {
        return this.jU;
    }

    public com.bytedance.adsdk.lottie.KS.zp.ku lMd() {
        return this.KS;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.zp);
        sb.append(", index=");
        return o.l(sb, this.lMd, '}');
    }

    public String zp() {
        return this.zp;
    }

    @Override // com.bytedance.adsdk.lottie.KS.lMd.KS
    public com.bytedance.adsdk.lottie.zp.zp.KS zp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.KS.KS.zp zpVar) {
        return new com.bytedance.adsdk.lottie.zp.zp.vwr(kuVar, zpVar, this);
    }
}
