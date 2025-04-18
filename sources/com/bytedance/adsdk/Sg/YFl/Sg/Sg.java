package com.bytedance.adsdk.Sg.YFl.Sg;

import java.util.List;

/* loaded from: classes.dex */
public class Sg extends DSW<Integer> {
    public Sg(List<com.bytedance.adsdk.Sg.DSW.YFl<Integer>> list) {
        super(list);
    }

    public int NjR() {
        return tN(tN(), wN());
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public Integer YFl(com.bytedance.adsdk.Sg.DSW.YFl<Integer> yFl, float f10) {
        return Integer.valueOf(tN(yFl, f10));
    }

    public int tN(com.bytedance.adsdk.Sg.DSW.YFl<Integer> yFl, float f10) {
        if (yFl.YFl != null && yFl.Sg != null) {
            if (this.tN == null) {
                return com.bytedance.adsdk.Sg.vc.Sg.YFl(com.bytedance.adsdk.Sg.vc.wN.Sg(f10, 0.0f, 1.0f), yFl.YFl.intValue(), yFl.Sg.intValue());
            }
            yFl.DSW.floatValue();
            AlY();
            qsH();
            throw null;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
