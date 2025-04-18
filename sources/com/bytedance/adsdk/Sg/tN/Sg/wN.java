package com.bytedance.adsdk.Sg.tN.Sg;

import android.graphics.Path;

/* loaded from: classes.dex */
public class wN implements tN {
    private final com.bytedance.adsdk.Sg.tN.YFl.AlY AlY;
    private final String DSW;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg NjR;
    private final Path.FillType Sg;
    private final DSW YFl;

    /* renamed from: nc, reason: collision with root package name */
    private final boolean f10200nc;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg qsH;
    private final com.bytedance.adsdk.Sg.tN.YFl.tN tN;

    /* renamed from: vc, reason: collision with root package name */
    private final com.bytedance.adsdk.Sg.tN.YFl.vc f10201vc;
    private final com.bytedance.adsdk.Sg.tN.YFl.vc wN;

    public wN(String str, DSW dsw, Path.FillType fillType, com.bytedance.adsdk.Sg.tN.YFl.tN tNVar, com.bytedance.adsdk.Sg.tN.YFl.AlY alY, com.bytedance.adsdk.Sg.tN.YFl.vc vcVar, com.bytedance.adsdk.Sg.tN.YFl.vc vcVar2, com.bytedance.adsdk.Sg.tN.YFl.Sg sg2, com.bytedance.adsdk.Sg.tN.YFl.Sg sg3, boolean z10) {
        this.YFl = dsw;
        this.Sg = fillType;
        this.tN = tNVar;
        this.AlY = alY;
        this.wN = vcVar;
        this.f10201vc = vcVar2;
        this.DSW = str;
        this.qsH = sg2;
        this.NjR = sg3;
        this.f10200nc = z10;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.tN AlY() {
        return this.tN;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.vc DSW() {
        return this.f10201vc;
    }

    public DSW Sg() {
        return this.YFl;
    }

    public String YFl() {
        return this.DSW;
    }

    public boolean qsH() {
        return this.f10200nc;
    }

    public Path.FillType tN() {
        return this.Sg;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.vc vc() {
        return this.wN;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.AlY wN() {
        return this.AlY;
    }

    @Override // com.bytedance.adsdk.Sg.tN.Sg.tN
    public com.bytedance.adsdk.Sg.YFl.YFl.tN YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl) {
        return new com.bytedance.adsdk.Sg.YFl.YFl.qsH(njR, dsw, yFl, this);
    }
}
