package com.bytedance.sdk.component.wN.AlY;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class tN extends YFl {
    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public String YFl() {
        return "generate_key";
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public void YFl(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        if (TextUtils.isEmpty(tNVar.wN())) {
            com.bytedance.sdk.component.wN.YoT wN = tNVar.qO().wN();
            tNVar.Sg(wN.YFl(tNVar));
            tNVar.YFl(wN.Sg(tNVar));
        }
        tNVar.YFl(new DSW());
    }
}
