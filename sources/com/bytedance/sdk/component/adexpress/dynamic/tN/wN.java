package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.vc.Ne;

/* loaded from: classes.dex */
public class wN extends lG<com.bytedance.sdk.component.adexpress.vc.DSW> {
    public wN(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        super(context, wNVar, dsw);
        YFl(dsw);
    }

    private void YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        this.YFl = new com.bytedance.sdk.component.adexpress.vc.qsH(this.Sg);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.YFl.setLayoutParams(layoutParams);
        Ne ne2 = this.YFl;
        if (ne2 instanceof com.bytedance.sdk.component.adexpress.vc.qsH) {
            ((com.bytedance.sdk.component.adexpress.vc.qsH) ne2).setButtonText(this.AlY.Cqy());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.lG
    public void AlY() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.lG, com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void Sg() {
        this.YFl.Sg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.lG, com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void YFl() {
        this.YFl.YFl();
    }
}
