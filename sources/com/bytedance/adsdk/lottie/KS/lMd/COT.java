package com.bytedance.adsdk.lottie.KS.lMd;

import android.graphics.Path;

/* loaded from: classes.dex */
public class COT implements KS {
    private final com.bytedance.adsdk.lottie.KS.zp.HWF COT;
    private final com.bytedance.adsdk.lottie.KS.zp.HWF HWF;
    private final com.bytedance.adsdk.lottie.KS.zp.KS KS;
    private final String QR;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd YW;
    private final boolean dT;
    private final com.bytedance.adsdk.lottie.KS.zp.jU jU;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd ku;
    private final Path.FillType lMd;
    private final QR zp;

    public COT(String str, QR qr, Path.FillType fillType, com.bytedance.adsdk.lottie.KS.zp.KS ks, com.bytedance.adsdk.lottie.KS.zp.jU jUVar, com.bytedance.adsdk.lottie.KS.zp.HWF hwf, com.bytedance.adsdk.lottie.KS.zp.HWF hwf2, com.bytedance.adsdk.lottie.KS.zp.lMd lmd, com.bytedance.adsdk.lottie.KS.zp.lMd lmd2, boolean z8) {
        this.zp = qr;
        this.lMd = fillType;
        this.KS = ks;
        this.jU = jUVar;
        this.COT = hwf;
        this.HWF = hwf2;
        this.QR = str;
        this.ku = lmd;
        this.YW = lmd2;
        this.dT = z8;
    }

    public com.bytedance.adsdk.lottie.KS.zp.jU COT() {
        return this.jU;
    }

    public com.bytedance.adsdk.lottie.KS.zp.HWF HWF() {
        return this.COT;
    }

    public Path.FillType KS() {
        return this.lMd;
    }

    public com.bytedance.adsdk.lottie.KS.zp.HWF QR() {
        return this.HWF;
    }

    public com.bytedance.adsdk.lottie.KS.zp.KS jU() {
        return this.KS;
    }

    public boolean ku() {
        return this.dT;
    }

    public QR lMd() {
        return this.zp;
    }

    public String zp() {
        return this.QR;
    }

    @Override // com.bytedance.adsdk.lottie.KS.lMd.KS
    public com.bytedance.adsdk.lottie.zp.zp.KS zp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.KS.KS.zp zpVar) {
        return new com.bytedance.adsdk.lottie.zp.zp.ku(kuVar, hwf, zpVar, this);
    }
}
