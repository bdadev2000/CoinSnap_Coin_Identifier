package com.bytedance.sdk.component.wN.AlY;

/* loaded from: classes.dex */
public class AlY extends YFl {
    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public String YFl() {
        return "cache_policy";
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public void YFl(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        com.bytedance.sdk.component.wN.Sg aIu = tNVar.aIu();
        if (aIu != null) {
            if (aIu.tN()) {
                tNVar.YFl(new nc());
                return;
            } else if (aIu.AlY()) {
                tNVar.YFl(new vc());
                return;
            }
        }
        tNVar.YFl(new eT());
    }
}
