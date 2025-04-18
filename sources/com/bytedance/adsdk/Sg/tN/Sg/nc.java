package com.bytedance.adsdk.Sg.tN.Sg;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class nc implements tN {
    private final com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> AlY;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg DSW;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg NjR;
    private final YFl Sg;
    private final String YFl;
    private final boolean eT;

    /* renamed from: nc, reason: collision with root package name */
    private final boolean f10195nc;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg qsH;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg tN;

    /* renamed from: vc, reason: collision with root package name */
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg f10196vc;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg wN;

    /* loaded from: classes.dex */
    public enum YFl {
        STAR(1),
        POLYGON(2);

        private final int tN;

        YFl(int i10) {
            this.tN = i10;
        }

        public static YFl YFl(int i10) {
            for (YFl yFl : values()) {
                if (yFl.tN == i10) {
                    return yFl;
                }
            }
            return null;
        }
    }

    public nc(String str, YFl yFl, com.bytedance.adsdk.Sg.tN.YFl.Sg sg2, com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> ga2, com.bytedance.adsdk.Sg.tN.YFl.Sg sg3, com.bytedance.adsdk.Sg.tN.YFl.Sg sg4, com.bytedance.adsdk.Sg.tN.YFl.Sg sg5, com.bytedance.adsdk.Sg.tN.YFl.Sg sg6, com.bytedance.adsdk.Sg.tN.YFl.Sg sg7, boolean z10, boolean z11) {
        this.YFl = str;
        this.Sg = yFl;
        this.tN = sg2;
        this.AlY = ga2;
        this.wN = sg3;
        this.f10196vc = sg4;
        this.DSW = sg5;
        this.qsH = sg6;
        this.NjR = sg7;
        this.f10195nc = z10;
        this.eT = z11;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> AlY() {
        return this.AlY;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg DSW() {
        return this.DSW;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg NjR() {
        return this.NjR;
    }

    public YFl Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public boolean eT() {
        return this.eT;
    }

    public boolean nc() {
        return this.f10195nc;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg qsH() {
        return this.qsH;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg tN() {
        return this.tN;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg vc() {
        return this.f10196vc;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg wN() {
        return this.wN;
    }

    @Override // com.bytedance.adsdk.Sg.tN.Sg.tN
    public com.bytedance.adsdk.Sg.YFl.YFl.tN YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl) {
        return new com.bytedance.adsdk.Sg.YFl.YFl.pDU(njR, yFl, this);
    }
}
