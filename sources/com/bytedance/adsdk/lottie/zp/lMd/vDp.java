package com.bytedance.adsdk.lottie.zp.lMd;

import java.util.List;

/* loaded from: classes.dex */
public class vDp extends QR<com.bytedance.adsdk.lottie.QR.KS> {
    private final com.bytedance.adsdk.lottie.QR.KS jU;

    public vDp(List<com.bytedance.adsdk.lottie.QR.zp<com.bytedance.adsdk.lottie.QR.KS>> list) {
        super(list);
        this.jU = new com.bytedance.adsdk.lottie.QR.KS();
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp
    /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lottie.QR.KS zp(com.bytedance.adsdk.lottie.QR.zp<com.bytedance.adsdk.lottie.QR.KS> zpVar, float f9) {
        com.bytedance.adsdk.lottie.QR.KS ks;
        com.bytedance.adsdk.lottie.QR.KS ks2 = zpVar.zp;
        if (ks2 != null && (ks = zpVar.lMd) != null) {
            com.bytedance.adsdk.lottie.QR.KS ks3 = ks2;
            com.bytedance.adsdk.lottie.QR.KS ks4 = ks;
            if (this.KS == null) {
                this.jU.zp(com.bytedance.adsdk.lottie.HWF.COT.zp(ks3.zp(), ks4.zp(), f9), com.bytedance.adsdk.lottie.HWF.COT.zp(ks3.lMd(), ks4.lMd(), f9));
                return this.jU;
            }
            zpVar.QR.getClass();
            jU();
            ku();
            throw null;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
