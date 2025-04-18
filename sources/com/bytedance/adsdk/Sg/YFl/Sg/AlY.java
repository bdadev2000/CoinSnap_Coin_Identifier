package com.bytedance.adsdk.Sg.YFl.Sg;

import java.util.List;

/* loaded from: classes.dex */
public class AlY extends DSW<Float> {
    public AlY(List<com.bytedance.adsdk.Sg.DSW.YFl<Float>> list) {
        super(list);
    }

    public float NjR() {
        return tN(tN(), wN());
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public Float YFl(com.bytedance.adsdk.Sg.DSW.YFl<Float> yFl, float f10) {
        return Float.valueOf(tN(yFl, f10));
    }

    public float tN(com.bytedance.adsdk.Sg.DSW.YFl<Float> yFl, float f10) {
        if (yFl.YFl != null && yFl.Sg != null) {
            if (this.tN == null) {
                return com.bytedance.adsdk.Sg.vc.wN.YFl(yFl.vc(), yFl.DSW(), f10);
            }
            yFl.DSW.floatValue();
            AlY();
            qsH();
            throw null;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
