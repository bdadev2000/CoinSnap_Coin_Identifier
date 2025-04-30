package com.bytedance.adsdk.lottie.KS.lMd;

import com.bytedance.adsdk.lottie.zp.zp.FP;

/* loaded from: classes.dex */
public class pvr implements KS {
    private final com.bytedance.adsdk.lottie.KS.zp.lMd COT;
    private final boolean HWF;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd KS;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd jU;
    private final zp lMd;
    private final String zp;

    /* loaded from: classes.dex */
    public enum zp {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static zp zp(int i9) {
            if (i9 != 1) {
                if (i9 == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i9)));
            }
            return SIMULTANEOUSLY;
        }
    }

    public pvr(String str, zp zpVar, com.bytedance.adsdk.lottie.KS.zp.lMd lmd, com.bytedance.adsdk.lottie.KS.zp.lMd lmd2, com.bytedance.adsdk.lottie.KS.zp.lMd lmd3, boolean z8) {
        this.zp = str;
        this.lMd = zpVar;
        this.KS = lmd;
        this.jU = lmd2;
        this.COT = lmd3;
        this.HWF = z8;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd COT() {
        return this.COT;
    }

    public boolean HWF() {
        return this.HWF;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd KS() {
        return this.jU;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd jU() {
        return this.KS;
    }

    public zp lMd() {
        return this.lMd;
    }

    public String toString() {
        return "Trim Path: {start: " + this.KS + ", end: " + this.jU + ", offset: " + this.COT + "}";
    }

    public String zp() {
        return this.zp;
    }

    @Override // com.bytedance.adsdk.lottie.KS.lMd.KS
    public com.bytedance.adsdk.lottie.zp.zp.KS zp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.KS.KS.zp zpVar) {
        return new FP(zpVar, this);
    }
}
