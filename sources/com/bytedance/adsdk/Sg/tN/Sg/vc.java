package com.bytedance.adsdk.Sg.tN.Sg;

import com.bytedance.adsdk.Sg.tN.Sg.Wwa;
import java.util.List;

/* loaded from: classes.dex */
public class vc implements tN {
    private final com.bytedance.adsdk.Sg.tN.YFl.AlY AlY;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg DSW;
    private final boolean GA;
    private final Wwa.Sg NjR;
    private final DSW Sg;
    private final String YFl;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg YoT;
    private final List<com.bytedance.adsdk.Sg.tN.YFl.Sg> eT;

    /* renamed from: nc, reason: collision with root package name */
    private final float f10198nc;
    private final Wwa.YFl qsH;
    private final com.bytedance.adsdk.Sg.tN.YFl.tN tN;

    /* renamed from: vc, reason: collision with root package name */
    private final com.bytedance.adsdk.Sg.tN.YFl.vc f10199vc;
    private final com.bytedance.adsdk.Sg.tN.YFl.vc wN;

    public vc(String str, DSW dsw, com.bytedance.adsdk.Sg.tN.YFl.tN tNVar, com.bytedance.adsdk.Sg.tN.YFl.AlY alY, com.bytedance.adsdk.Sg.tN.YFl.vc vcVar, com.bytedance.adsdk.Sg.tN.YFl.vc vcVar2, com.bytedance.adsdk.Sg.tN.YFl.Sg sg2, Wwa.YFl yFl, Wwa.Sg sg3, float f10, List<com.bytedance.adsdk.Sg.tN.YFl.Sg> list, com.bytedance.adsdk.Sg.tN.YFl.Sg sg4, boolean z10) {
        this.YFl = str;
        this.Sg = dsw;
        this.tN = tNVar;
        this.AlY = alY;
        this.wN = vcVar;
        this.f10199vc = vcVar2;
        this.DSW = sg2;
        this.qsH = yFl;
        this.NjR = sg3;
        this.f10198nc = f10;
        this.eT = list;
        this.YoT = sg4;
        this.GA = z10;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.AlY AlY() {
        return this.AlY;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg DSW() {
        return this.DSW;
    }

    public boolean GA() {
        return this.GA;
    }

    public Wwa.Sg NjR() {
        return this.NjR;
    }

    public DSW Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public float YoT() {
        return this.f10198nc;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg eT() {
        return this.YoT;
    }

    public List<com.bytedance.adsdk.Sg.tN.YFl.Sg> nc() {
        return this.eT;
    }

    public Wwa.YFl qsH() {
        return this.qsH;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.tN tN() {
        return this.tN;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.vc vc() {
        return this.f10199vc;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.vc wN() {
        return this.wN;
    }

    @Override // com.bytedance.adsdk.Sg.tN.Sg.tN
    public com.bytedance.adsdk.Sg.YFl.YFl.tN YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl) {
        return new com.bytedance.adsdk.Sg.YFl.YFl.NjR(njR, yFl, this);
    }
}
