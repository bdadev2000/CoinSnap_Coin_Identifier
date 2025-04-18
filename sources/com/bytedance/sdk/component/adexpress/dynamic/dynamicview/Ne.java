package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;

/* loaded from: classes.dex */
public class Ne extends vc implements com.bytedance.sdk.component.adexpress.dynamic.tN {
    private int Sg;
    private int YFl;
    private int aIu;

    public Ne(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        YFl();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.tN()), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.Sg()), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.AlY()), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.YFl()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN
    public void YFl(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        this.aIu = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.aIu == 0) {
            setMeasuredDimension(this.Sg, this.qsH);
        } else {
            setMeasuredDimension(this.YFl, this.qsH);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public void vc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i10 = this.NjR;
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = this.f10387nc;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    private void YFl() {
        List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> eT = this.GA.eT();
        if (eT == null || eT.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh : eT) {
            if (qsh.nc().YFl() == 21) {
                this.YFl = (int) (this.DSW - com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, qsh.qsH()));
            }
            if (qsh.nc().YFl() == 20) {
                this.Sg = (int) (this.DSW - com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, qsh.qsH()));
            }
        }
    }
}
