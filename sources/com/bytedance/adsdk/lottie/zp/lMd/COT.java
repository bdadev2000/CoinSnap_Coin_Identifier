package com.bytedance.adsdk.lottie.zp.lMd;

import java.util.List;

/* loaded from: classes.dex */
public class COT extends QR<com.bytedance.adsdk.lottie.KS.lMd.jU> {
    private final com.bytedance.adsdk.lottie.KS.lMd.jU jU;

    public COT(List<com.bytedance.adsdk.lottie.QR.zp<com.bytedance.adsdk.lottie.KS.lMd.jU>> list) {
        super(list);
        com.bytedance.adsdk.lottie.KS.lMd.jU jUVar = list.get(0).zp;
        int KS = jUVar != null ? jUVar.KS() : 0;
        this.jU = new com.bytedance.adsdk.lottie.KS.lMd.jU(new float[KS], new int[KS]);
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp
    /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lottie.KS.lMd.jU zp(com.bytedance.adsdk.lottie.QR.zp<com.bytedance.adsdk.lottie.KS.lMd.jU> zpVar, float f9) {
        this.jU.zp(zpVar.zp, zpVar.lMd, f9);
        return this.jU;
    }
}
