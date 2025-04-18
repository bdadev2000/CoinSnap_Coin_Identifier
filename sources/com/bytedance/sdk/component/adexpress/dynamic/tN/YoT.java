package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class YoT implements DSW {
    private com.bytedance.sdk.component.adexpress.vc.pDU YFl;

    public YoT(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        this.YFl = new com.bytedance.sdk.component.adexpress.vc.pDU(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, 180.0f));
        layoutParams.gravity = 17;
        this.YFl.setLayoutParams(layoutParams);
        this.YFl.setGuideText(dsw.Cqy());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void Sg() {
        this.YFl.Sg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void YFl() {
        this.YFl.YFl();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public ViewGroup tN() {
        return this.YFl;
    }
}
