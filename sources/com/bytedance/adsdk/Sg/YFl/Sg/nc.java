package com.bytedance.adsdk.Sg.YFl.Sg;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class nc extends DSW<PointF> {
    private final PointF AlY;
    private NjR DSW;

    /* renamed from: vc, reason: collision with root package name */
    private final PathMeasure f10158vc;
    private final float[] wN;

    public nc(List<? extends com.bytedance.adsdk.Sg.DSW.YFl<PointF>> list) {
        super(list);
        this.AlY = new PointF();
        this.wN = new float[2];
        this.f10158vc = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public PointF YFl(com.bytedance.adsdk.Sg.DSW.YFl<PointF> yFl, float f10) {
        NjR njR = (NjR) yFl;
        Path Sg = njR.Sg();
        if (Sg == null) {
            return yFl.YFl;
        }
        if (this.tN == null) {
            if (this.DSW != njR) {
                this.f10158vc.setPath(Sg, false);
                this.DSW = njR;
            }
            PathMeasure pathMeasure = this.f10158vc;
            pathMeasure.getPosTan(pathMeasure.getLength() * f10, this.wN, null);
            PointF pointF = this.AlY;
            float[] fArr = this.wN;
            pointF.set(fArr[0], fArr[1]);
            return this.AlY;
        }
        njR.DSW.floatValue();
        AlY();
        qsH();
        throw null;
    }
}
