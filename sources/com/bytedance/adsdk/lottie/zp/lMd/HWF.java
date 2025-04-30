package com.bytedance.adsdk.lottie.zp.lMd;

import java.util.List;

/* loaded from: classes.dex */
public class HWF extends QR<Integer> {
    public HWF(List<com.bytedance.adsdk.lottie.QR.zp<Integer>> list) {
        super(list);
    }

    public int KS(com.bytedance.adsdk.lottie.QR.zp<Integer> zpVar, float f9) {
        if (zpVar.zp != null && zpVar.lMd != null) {
            if (this.KS == null) {
                return com.bytedance.adsdk.lottie.HWF.COT.zp(zpVar.ku(), zpVar.YW(), f9);
            }
            zpVar.QR.getClass();
            jU();
            ku();
            throw null;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    public int YW() {
        return KS(KS(), COT());
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp
    /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
    public Integer zp(com.bytedance.adsdk.lottie.QR.zp<Integer> zpVar, float f9) {
        return Integer.valueOf(KS(zpVar, f9));
    }
}
