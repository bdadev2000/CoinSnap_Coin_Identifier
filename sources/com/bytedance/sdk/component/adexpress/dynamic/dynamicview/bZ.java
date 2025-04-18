package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class bZ extends vc {
    private int YFl;

    public bZ(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        this.YFl = 0;
        com.bytedance.sdk.component.adexpress.vc.bZ bZVar = new com.bytedance.sdk.component.adexpress.vc.bZ(context, null);
        this.EH = bZVar;
        bZVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.EH, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        double d10;
        DynamicRootView dynamicRootView;
        super.NjR();
        double GA = this.YoT.GA();
        if (com.bytedance.sdk.component.adexpress.AlY.Sg() && (GA < 0.0d || GA > 5.0d || ((dynamicRootView = this.pDU) != null && dynamicRootView.getRenderRequest() != null && this.pDU.getRenderRequest().nc() != 4))) {
            this.EH.setVisibility(8);
            return true;
        }
        if (GA >= 0.0d && GA <= 5.0d) {
            d10 = GA;
        } else {
            d10 = 5.0d;
        }
        this.EH.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.vc.bZ) this.EH).YFl(d10, this.YoT.DSW(), (int) this.YoT.wN(), ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.Sg())) + ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.YFl())) + ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.wN())));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        int YFl = (int) (com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.AlY()) + this.YoT.tN()) + (com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.wN()) * 5.0f));
        if (this.DSW > YFl && 4 == this.YoT.qsH()) {
            this.YFl = (this.DSW - YFl) / 2;
        }
        this.DSW = YFl;
        return new FrameLayout.LayoutParams(this.DSW, this.qsH);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public void vc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.DSW, this.qsH);
        layoutParams.topMargin = this.f10387nc;
        int i10 = this.NjR + this.YFl;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }
}
