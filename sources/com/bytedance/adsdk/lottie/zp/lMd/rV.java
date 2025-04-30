package com.bytedance.adsdk.lottie.zp.lMd;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes.dex */
public class rV extends zp<PointF, PointF> {
    protected com.bytedance.adsdk.lottie.QR.lMd<Float> COT;
    private final PointF HWF;
    private final PointF QR;
    private final zp<Float, Float> YW;
    protected com.bytedance.adsdk.lottie.QR.lMd<Float> jU;
    private final zp<Float, Float> ku;

    public rV(zp<Float, Float> zpVar, zp<Float, Float> zpVar2) {
        super(Collections.emptyList());
        this.HWF = new PointF();
        this.QR = new PointF();
        this.ku = zpVar;
        this.YW = zpVar2;
        zp(ku());
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp
    /* renamed from: YW, reason: merged with bridge method [inline-methods] */
    public PointF QR() {
        return zp(null, 0.0f);
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp
    /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
    public PointF zp(com.bytedance.adsdk.lottie.QR.zp<PointF> zpVar, float f9) {
        if (this.jU != null && this.ku.KS() != null) {
            this.ku.COT();
            throw null;
        }
        if (this.COT != null && this.YW.KS() != null) {
            this.YW.COT();
            throw null;
        }
        this.QR.set(this.HWF.x, 0.0f);
        PointF pointF = this.QR;
        pointF.set(pointF.x, this.HWF.y);
        return this.QR;
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp
    public void zp(float f9) {
        this.ku.zp(f9);
        this.YW.zp(f9);
        this.HWF.set(this.ku.QR().floatValue(), this.YW.QR().floatValue());
        for (int i9 = 0; i9 < this.zp.size(); i9++) {
            this.zp.get(i9).zp();
        }
    }
}
