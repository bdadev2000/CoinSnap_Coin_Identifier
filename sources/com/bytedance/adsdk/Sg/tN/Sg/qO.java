package com.bytedance.adsdk.Sg.tN.Sg;

import com.bytedance.adsdk.Sg.YFl.YFl.wXo;

/* loaded from: classes.dex */
public class qO implements tN {
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg AlY;
    private final YFl Sg;
    private final String YFl;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg tN;

    /* renamed from: vc, reason: collision with root package name */
    private final boolean f10197vc;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg wN;

    /* loaded from: classes.dex */
    public enum YFl {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static YFl YFl(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i10)));
            }
            return SIMULTANEOUSLY;
        }
    }

    public qO(String str, YFl yFl, com.bytedance.adsdk.Sg.tN.YFl.Sg sg2, com.bytedance.adsdk.Sg.tN.YFl.Sg sg3, com.bytedance.adsdk.Sg.tN.YFl.Sg sg4, boolean z10) {
        this.YFl = str;
        this.Sg = yFl;
        this.tN = sg2;
        this.AlY = sg3;
        this.wN = sg4;
        this.f10197vc = z10;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg AlY() {
        return this.tN;
    }

    public YFl Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg tN() {
        return this.AlY;
    }

    public String toString() {
        return "Trim Path: {start: " + this.tN + ", end: " + this.AlY + ", offset: " + this.wN + "}";
    }

    public boolean vc() {
        return this.f10197vc;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg wN() {
        return this.wN;
    }

    @Override // com.bytedance.adsdk.Sg.tN.Sg.tN
    public com.bytedance.adsdk.Sg.YFl.YFl.tN YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl) {
        return new wXo(yFl, this);
    }
}
