package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class pDU implements DSW<com.bytedance.sdk.component.adexpress.vc.rkt> {
    private com.bytedance.sdk.component.adexpress.vc.rkt YFl;

    public pDU(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        this.YFl = new com.bytedance.sdk.component.adexpress.vc.rkt(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, 20.0f);
        this.YFl.setLayoutParams(layoutParams);
        this.YFl.setGuideText(dsw.Cqy());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    /* renamed from: AlY, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.vc.rkt tN() {
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
