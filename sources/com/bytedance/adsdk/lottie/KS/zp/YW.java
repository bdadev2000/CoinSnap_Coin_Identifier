package com.bytedance.adsdk.lottie.KS.zp;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class YW implements tG<PointF, PointF> {
    private final lMd lMd;
    private final lMd zp;

    public YW(lMd lmd, lMd lmd2) {
        this.zp = lmd;
        this.lMd = lmd2;
    }

    @Override // com.bytedance.adsdk.lottie.KS.zp.tG
    public List<com.bytedance.adsdk.lottie.QR.zp<PointF>> KS() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.lottie.KS.zp.tG
    public boolean lMd() {
        if (this.zp.lMd() && this.lMd.lMd()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.adsdk.lottie.KS.zp.tG
    public com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> zp() {
        return new com.bytedance.adsdk.lottie.zp.lMd.rV(this.zp.zp(), this.lMd.zp());
    }
}
