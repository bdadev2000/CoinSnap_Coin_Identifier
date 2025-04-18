package com.bytedance.adsdk.Sg.tN.Sg;

/* loaded from: classes.dex */
public class qsH {
    private final boolean AlY;
    private final com.bytedance.adsdk.Sg.tN.YFl.qsH Sg;
    private final YFl YFl;
    private final com.bytedance.adsdk.Sg.tN.YFl.AlY tN;

    /* loaded from: classes.dex */
    public enum YFl {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public qsH(YFl yFl, com.bytedance.adsdk.Sg.tN.YFl.qsH qsh, com.bytedance.adsdk.Sg.tN.YFl.AlY alY, boolean z10) {
        this.YFl = yFl;
        this.Sg = qsh;
        this.tN = alY;
        this.AlY = z10;
    }

    public boolean AlY() {
        return this.AlY;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.qsH Sg() {
        return this.Sg;
    }

    public YFl YFl() {
        return this.YFl;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.AlY tN() {
        return this.tN;
    }
}
