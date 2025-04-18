package com.bytedance.adsdk.Sg.tN.YFl;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class wN implements GA<PointF, PointF> {
    private final List<com.bytedance.adsdk.Sg.DSW.YFl<PointF>> YFl;

    public wN(List<com.bytedance.adsdk.Sg.DSW.YFl<PointF>> list) {
        this.YFl = list;
    }

    @Override // com.bytedance.adsdk.Sg.tN.YFl.GA
    public boolean Sg() {
        return this.YFl.size() == 1 && this.YFl.get(0).wN();
    }

    @Override // com.bytedance.adsdk.Sg.tN.YFl.GA
    public com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> YFl() {
        if (this.YFl.get(0).wN()) {
            return new com.bytedance.adsdk.Sg.YFl.Sg.eT(this.YFl);
        }
        return new com.bytedance.adsdk.Sg.YFl.Sg.nc(this.YFl);
    }

    @Override // com.bytedance.adsdk.Sg.tN.YFl.GA
    public List<com.bytedance.adsdk.Sg.DSW.YFl<PointF>> tN() {
        return this.YFl;
    }
}
