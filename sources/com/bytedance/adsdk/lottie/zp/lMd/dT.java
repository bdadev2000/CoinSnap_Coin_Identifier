package com.bytedance.adsdk.lottie.zp.lMd;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class dT extends QR<PointF> {
    private final float[] COT;
    private final PathMeasure HWF;
    private YW QR;
    private final PointF jU;

    public dT(List<? extends com.bytedance.adsdk.lottie.QR.zp<PointF>> list) {
        super(list);
        this.jU = new PointF();
        this.COT = new float[2];
        this.HWF = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp
    /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
    public PointF zp(com.bytedance.adsdk.lottie.QR.zp<PointF> zpVar, float f9) {
        YW yw = (YW) zpVar;
        Path lMd = yw.lMd();
        if (lMd == null) {
            return zpVar.zp;
        }
        if (this.KS == null) {
            if (this.QR != yw) {
                this.HWF.setPath(lMd, false);
                this.QR = yw;
            }
            PathMeasure pathMeasure = this.HWF;
            pathMeasure.getPosTan(pathMeasure.getLength() * f9, this.COT, null);
            PointF pointF = this.jU;
            float[] fArr = this.COT;
            pointF.set(fArr[0], fArr[1]);
            return this.jU;
        }
        yw.QR.getClass();
        jU();
        ku();
        throw null;
    }
}
