package com.bytedance.adsdk.lottie.zp.lMd;

import android.graphics.Path;
import com.bytedance.adsdk.lottie.zp.zp.pvr;
import java.util.List;

/* loaded from: classes.dex */
public class tG extends zp<com.bytedance.adsdk.lottie.KS.lMd.rV, Path> {
    private final Path COT;
    private List<pvr> HWF;
    private final com.bytedance.adsdk.lottie.KS.lMd.rV jU;

    public tG(List<com.bytedance.adsdk.lottie.QR.zp<com.bytedance.adsdk.lottie.KS.lMd.rV>> list) {
        super(list);
        this.jU = new com.bytedance.adsdk.lottie.KS.lMd.rV();
        this.COT = new Path();
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp
    /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
    public Path zp(com.bytedance.adsdk.lottie.QR.zp<com.bytedance.adsdk.lottie.KS.lMd.rV> zpVar, float f9) {
        this.jU.zp(zpVar.zp, zpVar.lMd, f9);
        com.bytedance.adsdk.lottie.KS.lMd.rV rVVar = this.jU;
        List<pvr> list = this.HWF;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                rVVar = this.HWF.get(size).zp(rVVar);
            }
        }
        com.bytedance.adsdk.lottie.HWF.COT.zp(rVVar, this.COT);
        return this.COT;
    }

    public void zp(List<pvr> list) {
        this.HWF = list;
    }
}
