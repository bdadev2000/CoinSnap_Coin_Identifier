package com.bytedance.adsdk.Sg.YFl.Sg;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes.dex */
public class pDU extends YFl<PointF, PointF> {
    protected com.bytedance.adsdk.Sg.DSW.Sg<Float> AlY;
    private final PointF DSW;
    private final YFl<Float, Float> NjR;
    private final YFl<Float, Float> qsH;

    /* renamed from: vc, reason: collision with root package name */
    private final PointF f10159vc;
    protected com.bytedance.adsdk.Sg.DSW.Sg<Float> wN;

    public pDU(YFl<Float, Float> yFl, YFl<Float, Float> yFl2) {
        super(Collections.emptyList());
        this.f10159vc = new PointF();
        this.DSW = new PointF();
        this.qsH = yFl;
        this.NjR = yFl2;
        YFl(qsH());
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl
    /* renamed from: NjR, reason: merged with bridge method [inline-methods] */
    public PointF DSW() {
        return YFl(null, 0.0f);
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public PointF YFl(com.bytedance.adsdk.Sg.DSW.YFl<PointF> yFl, float f10) {
        com.bytedance.adsdk.Sg.DSW.YFl<Float> tN;
        com.bytedance.adsdk.Sg.DSW.YFl<Float> tN2;
        if (this.AlY != null && (tN2 = this.qsH.tN()) != null) {
            this.qsH.wN();
            Float f11 = tN2.DSW;
            if (f11 != null) {
                f11.floatValue();
                throw null;
            }
            throw null;
        }
        if (this.wN != null && (tN = this.NjR.tN()) != null) {
            this.NjR.wN();
            Float f12 = tN.DSW;
            if (f12 != null) {
                f12.floatValue();
                throw null;
            }
            throw null;
        }
        this.DSW.set(this.f10159vc.x, 0.0f);
        PointF pointF = this.DSW;
        pointF.set(pointF.x, this.f10159vc.y);
        return this.DSW;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl
    public void YFl(float f10) {
        this.qsH.YFl(f10);
        this.NjR.YFl(f10);
        this.f10159vc.set(this.qsH.DSW().floatValue(), this.NjR.DSW().floatValue());
        for (int i10 = 0; i10 < this.YFl.size(); i10++) {
            this.YFl.get(i10).YFl();
        }
    }
}
