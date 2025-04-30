package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class dQp implements TTClientBidding {
    private final ku zp;

    public dQp(Context context, com.bytedance.sdk.openadsdk.core.model.zp zpVar, AdSlot adSlot) {
        this.zp = new ku(context, zpVar, adSlot);
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

    public ku zp() {
        return this.zp;
    }
}
