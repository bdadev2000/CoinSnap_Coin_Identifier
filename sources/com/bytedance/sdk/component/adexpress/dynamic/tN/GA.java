package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class GA implements DSW {
    private com.bytedance.sdk.component.adexpress.vc.EH YFl;

    public GA(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        this.YFl = new com.bytedance.sdk.component.adexpress.vc.EH(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(wNVar.getDynamicHeight(), wNVar.getDynamicHeight());
        layoutParams.gravity = 8388629;
        this.YFl.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    /* renamed from: AlY, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.vc.EH tN() {
        return this.YFl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void Sg() {
        this.YFl.Sg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void YFl() {
        this.YFl.YFl();
    }
}
