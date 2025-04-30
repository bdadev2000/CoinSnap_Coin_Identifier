package com.bytedance.adsdk.lottie.zp.lMd;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public class YW extends com.bytedance.adsdk.lottie.QR.zp<PointF> {
    private final com.bytedance.adsdk.lottie.QR.zp<PointF> Bj;
    private Path dT;

    public YW(com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.QR.zp<PointF> zpVar) {
        super(hwf, zpVar.zp, zpVar.lMd, zpVar.KS, zpVar.jU, zpVar.COT, zpVar.HWF, zpVar.QR);
        this.Bj = zpVar;
        zp();
    }

    public Path lMd() {
        return this.dT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void zp() {
        boolean z8;
        T t9;
        T t10;
        T t11 = this.lMd;
        if (t11 != 0 && (t10 = this.zp) != 0 && ((PointF) t10).equals(((PointF) t11).x, ((PointF) t11).y)) {
            z8 = true;
        } else {
            z8 = false;
        }
        T t12 = this.zp;
        if (t12 != 0 && (t9 = this.lMd) != 0 && !z8) {
            com.bytedance.adsdk.lottie.QR.zp<PointF> zpVar = this.Bj;
            this.dT = com.bytedance.adsdk.lottie.HWF.HWF.zp((PointF) t12, (PointF) t9, zpVar.ku, zpVar.YW);
        }
    }
}
