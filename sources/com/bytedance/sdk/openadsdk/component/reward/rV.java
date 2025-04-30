package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class rV implements TTClientBidding {
    private final HWF zp;

    public rV(Context context, com.bytedance.sdk.openadsdk.core.model.zp zpVar) {
        this.zp = new HWF(context, zpVar);
    }

    public void lMd() {
        this.zp.zp();
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d2, String str, String str2) {
        this.zp.loss(d2, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d2) {
        this.zp.win(d2);
    }

    public HWF zp() {
        return this.zp;
    }

    public void zp(boolean z8) {
        this.zp.zp(z8);
    }
}
