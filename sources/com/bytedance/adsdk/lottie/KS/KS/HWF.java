package com.bytedance.adsdk.lottie.KS.KS;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.COT.dT;
import com.bytedance.adsdk.lottie.KS.lMd.KVG;
import java.util.Collections;

/* loaded from: classes.dex */
public class HWF extends zp {
    private final com.bytedance.adsdk.lottie.zp.zp.jU QR;
    private final lMd ku;

    public HWF(com.bytedance.adsdk.lottie.ku kuVar, jU jUVar, lMd lmd, com.bytedance.adsdk.lottie.HWF hwf) {
        super(kuVar, jUVar);
        this.ku = lmd;
        com.bytedance.adsdk.lottie.zp.zp.jU jUVar2 = new com.bytedance.adsdk.lottie.zp.zp.jU(kuVar, this, new KVG("__container", jUVar.rV(), false), hwf);
        this.QR = jUVar2;
        jUVar2.zp(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp
    public com.bytedance.adsdk.lottie.KS.lMd.zp HWF() {
        com.bytedance.adsdk.lottie.KS.lMd.zp HWF = super.HWF();
        if (HWF != null) {
            return HWF;
        }
        return this.ku.HWF();
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp
    public dT QR() {
        dT QR = super.QR();
        if (QR != null) {
            return QR;
        }
        return this.ku.QR();
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp
    public void lMd(Canvas canvas, Matrix matrix, int i9) {
        this.QR.zp(canvas, matrix, i9);
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp, com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(RectF rectF, Matrix matrix, boolean z8) {
        super.zp(rectF, matrix, z8);
        this.QR.zp(rectF, this.zp, z8);
    }
}
