package com.bytedance.adsdk.Sg.tN.Sg;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class rkt implements tN {
    private final List<tN> Sg;
    private final String YFl;
    private final boolean tN;

    public rkt(String str, List<tN> list, boolean z10) {
        this.YFl = str;
        this.Sg = list;
        this.tN = z10;
    }

    public List<tN> Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public boolean tN() {
        return this.tN;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.YFl + "' Shapes: " + Arrays.toString(this.Sg.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // com.bytedance.adsdk.Sg.tN.Sg.tN
    public com.bytedance.adsdk.Sg.YFl.YFl.tN YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl) {
        return new com.bytedance.adsdk.Sg.YFl.YFl.AlY(njR, yFl, this, dsw);
    }
}
