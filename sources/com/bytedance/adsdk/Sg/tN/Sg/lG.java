package com.bytedance.adsdk.Sg.tN.Sg;

import a4.j;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class lG implements tN {
    private final boolean AlY;
    private final int Sg;
    private final String YFl;
    private final com.bytedance.adsdk.Sg.tN.YFl.qsH tN;

    public lG(String str, int i10, com.bytedance.adsdk.Sg.tN.YFl.qsH qsh, boolean z10) {
        this.YFl = str;
        this.Sg = i10;
        this.tN = qsh;
        this.AlY = z10;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.qsH Sg() {
        return this.tN;
    }

    public String YFl() {
        return this.YFl;
    }

    public boolean tN() {
        return this.AlY;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.YFl);
        sb2.append(", index=");
        return j.i(sb2, this.Sg, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // com.bytedance.adsdk.Sg.tN.Sg.tN
    public com.bytedance.adsdk.Sg.YFl.YFl.tN YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl) {
        return new com.bytedance.adsdk.Sg.YFl.YFl.Wwa(njR, yFl, this);
    }
}
