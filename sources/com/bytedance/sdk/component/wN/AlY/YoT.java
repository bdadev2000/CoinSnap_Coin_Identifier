package com.bytedance.sdk.component.wN.AlY;

/* loaded from: classes.dex */
public class YoT extends YFl {
    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public String YFl() {
        return "raw_cache";
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public void YFl(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        byte[] YFl = tNVar.qO().Sg(tNVar.aIu()).YFl(tNVar.nc());
        if (YFl == null) {
            tNVar.YFl(new vc());
        } else {
            tNVar.YFl(new Sg(YFl, null));
        }
    }
}
