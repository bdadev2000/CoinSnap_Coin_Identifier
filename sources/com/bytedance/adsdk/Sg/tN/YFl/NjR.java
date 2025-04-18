package com.bytedance.adsdk.Sg.tN.YFl;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class NjR implements GA<PointF, PointF> {
    private final Sg Sg;
    private final Sg YFl;

    public NjR(Sg sg2, Sg sg3) {
        this.YFl = sg2;
        this.Sg = sg3;
    }

    @Override // com.bytedance.adsdk.Sg.tN.YFl.GA
    public boolean Sg() {
        return this.YFl.Sg() && this.Sg.Sg();
    }

    @Override // com.bytedance.adsdk.Sg.tN.YFl.GA
    public com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> YFl() {
        return new com.bytedance.adsdk.Sg.YFl.Sg.pDU(this.YFl.YFl(), this.Sg.YFl());
    }

    @Override // com.bytedance.adsdk.Sg.tN.YFl.GA
    public List<com.bytedance.adsdk.Sg.DSW.YFl<PointF>> tN() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
