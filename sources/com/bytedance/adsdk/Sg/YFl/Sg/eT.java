package com.bytedance.adsdk.Sg.YFl.Sg;

import android.graphics.PointF;
import java.util.List;
import vd.e;

/* loaded from: classes.dex */
public class eT extends DSW<PointF> {
    private final PointF AlY;

    public eT(List<com.bytedance.adsdk.Sg.DSW.YFl<PointF>> list) {
        super(list);
        this.AlY = new PointF();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public PointF YFl(com.bytedance.adsdk.Sg.DSW.YFl<PointF> yFl, float f10) {
        return YFl(yFl, f10, f10, f10);
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public PointF YFl(com.bytedance.adsdk.Sg.DSW.YFl<PointF> yFl, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = yFl.YFl;
        if (pointF2 != null && (pointF = yFl.Sg) != null) {
            PointF pointF3 = pointF2;
            PointF pointF4 = pointF;
            if (this.tN == null) {
                PointF pointF5 = this.AlY;
                float f13 = pointF3.x;
                float b3 = e.b(pointF4.x, f13, f11, f13);
                float f14 = pointF3.y;
                pointF5.set(b3, ((pointF4.y - f14) * f12) + f14);
                return this.AlY;
            }
            yFl.DSW.floatValue();
            AlY();
            qsH();
            throw null;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
