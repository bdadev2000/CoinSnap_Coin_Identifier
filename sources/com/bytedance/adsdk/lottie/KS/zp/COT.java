package com.bytedance.adsdk.lottie.KS.zp;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class COT implements tG<PointF, PointF> {
    private final List<com.bytedance.adsdk.lottie.QR.zp<PointF>> zp;

    public COT(List<com.bytedance.adsdk.lottie.QR.zp<PointF>> list) {
        this.zp = list;
    }

    @Override // com.bytedance.adsdk.lottie.KS.zp.tG
    public List<com.bytedance.adsdk.lottie.QR.zp<PointF>> KS() {
        return this.zp;
    }

    @Override // com.bytedance.adsdk.lottie.KS.zp.tG
    public boolean lMd() {
        if (this.zp.size() != 1 || !this.zp.get(0).COT()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.adsdk.lottie.KS.zp.tG
    public com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> zp() {
        if (this.zp.get(0).COT()) {
            return new com.bytedance.adsdk.lottie.zp.lMd.Bj(this.zp);
        }
        return new com.bytedance.adsdk.lottie.zp.lMd.dT(this.zp);
    }
}
