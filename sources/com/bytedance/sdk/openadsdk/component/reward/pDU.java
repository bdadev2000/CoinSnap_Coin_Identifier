package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class pDU implements TTClientBidding {
    private final vc YFl;

    public pDU(Context context, com.bytedance.sdk.openadsdk.core.model.YFl yFl) {
        this.YFl = new vc(context, yFl);
    }

    public void Sg() {
        this.YFl.YFl();
    }

    public vc YFl() {
        return this.YFl;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
        this.YFl.loss(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
        this.YFl.win(d10);
    }

    public void YFl(boolean z10) {
        this.YFl.YFl(z10);
    }
}
