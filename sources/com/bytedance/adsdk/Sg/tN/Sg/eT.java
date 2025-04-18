package com.bytedance.adsdk.Sg.tN.Sg;

import android.graphics.PointF;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class eT implements tN {
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg AlY;
    private final com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> Sg;
    private final String YFl;
    private final com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> tN;
    private final boolean wN;

    public eT(String str, com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> ga2, com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> ga3, com.bytedance.adsdk.Sg.tN.YFl.Sg sg2, boolean z10) {
        this.YFl = str;
        this.Sg = ga2;
        this.tN = ga3;
        this.AlY = sg2;
        this.wN = z10;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> AlY() {
        return this.Sg;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg Sg() {
        return this.AlY;
    }

    public String YFl() {
        return this.YFl;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> tN() {
        return this.tN;
    }

    public String toString() {
        return "RectangleShape{position=" + this.Sg + ", size=" + this.tN + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean wN() {
        return this.wN;
    }

    @Override // com.bytedance.adsdk.Sg.tN.Sg.tN
    public com.bytedance.adsdk.Sg.YFl.YFl.tN YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl) {
        return new com.bytedance.adsdk.Sg.YFl.YFl.EH(njR, yFl, this);
    }
}
