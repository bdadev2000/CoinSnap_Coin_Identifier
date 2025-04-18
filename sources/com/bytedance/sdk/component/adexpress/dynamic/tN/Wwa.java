package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class Wwa implements DSW<com.bytedance.sdk.component.adexpress.vc.eT> {
    private final com.bytedance.sdk.component.adexpress.vc.eT YFl;

    public Wwa(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        int i10;
        com.bytedance.sdk.component.adexpress.vc.eT eTVar = new com.bytedance.sdk.component.adexpress.vc.eT(context);
        this.YFl = eTVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (dsw.iY() > 0) {
            i10 = dsw.iY();
        } else if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            i10 = 0;
        } else {
            i10 = 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, i10);
        eTVar.setLayoutParams(layoutParams);
        eTVar.setClipChildren(false);
        eTVar.setText(dsw.Cqy());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    /* renamed from: AlY, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.vc.eT tN() {
        return this.YFl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void Sg() {
        com.bytedance.sdk.component.adexpress.vc.eT eTVar = this.YFl;
        if (eTVar != null) {
            eTVar.Sg();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void YFl() {
        com.bytedance.sdk.component.adexpress.vc.eT eTVar = this.YFl;
        if (eTVar != null) {
            eTVar.YFl();
        }
    }
}
