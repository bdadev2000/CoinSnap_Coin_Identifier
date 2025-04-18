package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

/* loaded from: classes.dex */
public abstract class lG implements com.bytedance.adsdk.YFl.Sg.Sg.YFl {
    protected com.bytedance.adsdk.YFl.Sg.Sg.YFl Sg;
    protected com.bytedance.adsdk.YFl.Sg.Sg.YFl YFl;
    protected com.bytedance.adsdk.YFl.Sg.AlY.tN tN;

    public lG(com.bytedance.adsdk.YFl.Sg.AlY.tN tNVar) {
        this.tN = tNVar;
    }

    public void Sg(com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl) {
        this.Sg = yFl;
    }

    public void YFl(com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl) {
        this.YFl = yFl;
    }

    public String toString() {
        return Sg();
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public String Sg() {
        return this.YFl.Sg() + this.tN.YFl() + this.Sg.Sg();
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public com.bytedance.adsdk.YFl.Sg.AlY.wN YFl() {
        return com.bytedance.adsdk.YFl.Sg.AlY.vc.OPERATOR_RESULT;
    }
}
