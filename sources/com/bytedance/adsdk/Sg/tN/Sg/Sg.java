package com.bytedance.adsdk.Sg.tN.Sg;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class Sg implements tN {
    private final boolean AlY;
    private final com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> Sg;
    private final String YFl;
    private final com.bytedance.adsdk.Sg.tN.YFl.vc tN;
    private final boolean wN;

    public Sg(String str, com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> ga2, com.bytedance.adsdk.Sg.tN.YFl.vc vcVar, boolean z10, boolean z11) {
        this.YFl = str;
        this.Sg = ga2;
        this.tN = vcVar;
        this.AlY = z10;
        this.wN = z11;
    }

    public boolean AlY() {
        return this.AlY;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> Sg() {
        return this.Sg;
    }

    @Override // com.bytedance.adsdk.Sg.tN.Sg.tN
    public com.bytedance.adsdk.Sg.YFl.YFl.tN YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl) {
        return new com.bytedance.adsdk.Sg.YFl.YFl.vc(njR, yFl, this);
    }

    public com.bytedance.adsdk.Sg.tN.YFl.vc tN() {
        return this.tN;
    }

    public boolean wN() {
        return this.wN;
    }

    public String YFl() {
        return this.YFl;
    }
}
