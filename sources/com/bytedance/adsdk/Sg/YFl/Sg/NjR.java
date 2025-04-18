package com.bytedance.adsdk.Sg.YFl.Sg;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public class NjR extends com.bytedance.adsdk.Sg.DSW.YFl<PointF> {
    private final com.bytedance.adsdk.Sg.DSW.YFl<PointF> eT;

    /* renamed from: nc, reason: collision with root package name */
    private Path f10156nc;

    public NjR(com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.DSW.YFl<PointF> yFl) {
        super(dsw, yFl.YFl, yFl.Sg, yFl.tN, yFl.AlY, yFl.wN, yFl.f10148vc, yFl.DSW);
        this.eT = yFl;
        YFl();
    }

    public Path Sg() {
        return this.f10156nc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void YFl() {
        boolean z10;
        T t5;
        T t10;
        T t11 = this.Sg;
        if (t11 != 0 && (t10 = this.YFl) != 0 && ((PointF) t10).equals(((PointF) t11).x, ((PointF) t11).y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        T t12 = this.YFl;
        if (t12 != 0 && (t5 = this.Sg) != 0 && !z10) {
            com.bytedance.adsdk.Sg.DSW.YFl<PointF> yFl = this.eT;
            this.f10156nc = com.bytedance.adsdk.Sg.vc.vc.YFl((PointF) t12, (PointF) t5, yFl.qsH, yFl.NjR);
        }
    }
}
