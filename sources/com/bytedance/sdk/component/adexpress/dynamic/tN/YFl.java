package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class YFl implements DSW {
    private com.bytedance.sdk.component.adexpress.vc.Sg YFl;

    public YFl(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        double lL = dsw.lL();
        lL = lL == 0.0d ? 1.0d : lL;
        double zz = dsw.zz();
        int dynamicWidth = (int) (wNVar.getDynamicWidth() * 0.32d * lL);
        int dynamicWidth2 = (int) (wNVar.getDynamicWidth() * 0.32d * (zz != 0.0d ? zz : 1.0d));
        this.YFl = new com.bytedance.sdk.component.adexpress.vc.Sg(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, dsw.Hjb() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, dsw.dd() - 3);
        this.YFl.setLayoutParams(layoutParams);
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
