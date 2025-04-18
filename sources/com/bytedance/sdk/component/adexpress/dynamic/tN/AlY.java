package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.vc.Ne;

/* loaded from: classes.dex */
public class AlY extends lG<com.bytedance.sdk.component.adexpress.vc.DSW> {
    public AlY(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        super(context, wNVar, dsw);
        YFl(dsw);
    }

    private void YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        this.YFl = new com.bytedance.sdk.component.adexpress.vc.DSW(this.Sg);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.Sg, dsw.iY());
        this.YFl.setLayoutParams(layoutParams);
        this.YFl.setSlideText(this.AlY.Cqy());
        Ne ne2 = this.YFl;
        if (ne2 instanceof com.bytedance.sdk.component.adexpress.vc.DSW) {
            ((com.bytedance.sdk.component.adexpress.vc.DSW) ne2).setButtonText(this.AlY.nc());
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
