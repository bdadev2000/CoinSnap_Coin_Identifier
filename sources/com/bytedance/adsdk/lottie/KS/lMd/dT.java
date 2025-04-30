package com.bytedance.adsdk.lottie.KS.lMd;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class dT implements KS {
    private final boolean Bj;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd COT;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd HWF;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd KS;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd QR;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd YW;
    private final boolean dT;
    private final com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> jU;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd ku;
    private final zp lMd;
    private final String zp;

    /* loaded from: classes.dex */
    public enum zp {
        STAR(1),
        POLYGON(2);

        private final int KS;

        zp(int i9) {
            this.KS = i9;
        }

        public static zp zp(int i9) {
            for (zp zpVar : values()) {
                if (zpVar.KS == i9) {
                    return zpVar;
                }
            }
            return null;
        }
    }

    public dT(String str, zp zpVar, com.bytedance.adsdk.lottie.KS.zp.lMd lmd, com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> tGVar, com.bytedance.adsdk.lottie.KS.zp.lMd lmd2, com.bytedance.adsdk.lottie.KS.zp.lMd lmd3, com.bytedance.adsdk.lottie.KS.zp.lMd lmd4, com.bytedance.adsdk.lottie.KS.zp.lMd lmd5, com.bytedance.adsdk.lottie.KS.zp.lMd lmd6, boolean z8, boolean z9) {
        this.zp = str;
        this.lMd = zpVar;
        this.KS = lmd;
        this.jU = tGVar;
        this.COT = lmd2;
        this.HWF = lmd3;
        this.QR = lmd4;
        this.ku = lmd5;
        this.YW = lmd6;
        this.dT = z8;
        this.Bj = z9;
    }

    public boolean Bj() {
        return this.Bj;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd COT() {
        return this.COT;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd HWF() {
        return this.HWF;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd KS() {
        return this.KS;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd QR() {
        return this.QR;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd YW() {
        return this.YW;
    }

    public boolean dT() {
        return this.dT;
    }

    public com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> jU() {
        return this.jU;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd ku() {
        return this.ku;
    }

    public zp lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.zp;
    }

    @Override // com.bytedance.adsdk.lottie.KS.lMd.KS
    public com.bytedance.adsdk.lottie.zp.zp.KS zp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.KS.KS.zp zpVar) {
        return new com.bytedance.adsdk.lottie.zp.zp.rV(kuVar, zpVar, this);
    }
}
