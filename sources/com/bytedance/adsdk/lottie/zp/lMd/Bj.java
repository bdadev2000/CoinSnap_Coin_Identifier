package com.bytedance.adsdk.lottie.zp.lMd;

import android.graphics.PointF;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class Bj extends QR<PointF> {
    private final PointF jU;

    public Bj(List<com.bytedance.adsdk.lottie.QR.zp<PointF>> list) {
        super(list);
        this.jU = new PointF();
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp
    /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
    public PointF zp(com.bytedance.adsdk.lottie.QR.zp<PointF> zpVar, float f9) {
        return zp(zpVar, f9, f9, f9);
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp
    /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
    public PointF zp(com.bytedance.adsdk.lottie.QR.zp<PointF> zpVar, float f9, float f10, float f11) {
        PointF pointF;
        PointF pointF2 = zpVar.zp;
        if (pointF2 != null && (pointF = zpVar.lMd) != null) {
            PointF pointF3 = pointF2;
            PointF pointF4 = pointF;
            if (this.KS == null) {
                PointF pointF5 = this.jU;
                float f12 = pointF3.x;
                float a6 = AbstractC2914a.a(pointF4.x, f12, f10, f12);
                float f13 = pointF3.y;
                pointF5.set(a6, AbstractC2914a.a(pointF4.y, f13, f11, f13));
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
