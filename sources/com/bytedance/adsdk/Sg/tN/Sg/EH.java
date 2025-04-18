package com.bytedance.adsdk.Sg.tN.Sg;

import a4.j;
import android.graphics.Path;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class EH implements tN {
    private final com.bytedance.adsdk.Sg.tN.YFl.YFl AlY;
    private final Path.FillType Sg;
    private final boolean YFl;
    private final String tN;

    /* renamed from: vc, reason: collision with root package name */
    private final boolean f10191vc;
    private final com.bytedance.adsdk.Sg.tN.YFl.AlY wN;

    public EH(String str, boolean z10, Path.FillType fillType, com.bytedance.adsdk.Sg.tN.YFl.YFl yFl, com.bytedance.adsdk.Sg.tN.YFl.AlY alY, boolean z11) {
        this.tN = str;
        this.YFl = z10;
        this.Sg = fillType;
        this.AlY = yFl;
        this.wN = alY;
        this.f10191vc = z11;
    }

    public Path.FillType AlY() {
        return this.Sg;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.YFl Sg() {
        return this.AlY;
    }

    public String YFl() {
        return this.tN;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.AlY tN() {
        return this.wN;
    }

    public String toString() {
        return j.l(new StringBuilder("ShapeFill{color=, fillEnabled="), this.YFl, AbstractJsonLexerKt.END_OBJ);
    }

    public boolean wN() {
        return this.f10191vc;
    }

    @Override // com.bytedance.adsdk.Sg.tN.Sg.tN
    public com.bytedance.adsdk.Sg.YFl.YFl.tN YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl) {
        return new com.bytedance.adsdk.Sg.YFl.YFl.DSW(njR, yFl, this);
    }
}
