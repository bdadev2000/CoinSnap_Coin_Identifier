package com.bytedance.sdk.openadsdk.AlY.YFl;

/* loaded from: classes.dex */
class DSW implements com.bytedance.sdk.component.vc.YFl.wN.tN {
    private final com.bytedance.sdk.component.DSW.Sg.Sg YFl;

    public DSW() {
        com.bytedance.sdk.component.DSW.Sg.Sg tN = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().tN();
        this.YFl = tN;
        tN.YFl(7);
        tN.YFl("track_url");
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN.tN
    public void YFl(String str) {
        this.YFl.Sg(str);
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN.tN
    public void YFl(String str, String str2) {
        this.YFl.Sg(str, str2);
    }

    @Override // com.bytedance.sdk.component.vc.YFl.wN.tN
    public com.bytedance.sdk.component.vc.YFl.wN.AlY YFl() {
        return new NjR(this.YFl.YFl());
    }
}
