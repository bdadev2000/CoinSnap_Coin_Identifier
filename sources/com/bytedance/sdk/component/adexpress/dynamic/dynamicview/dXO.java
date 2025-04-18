package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class dXO extends vc implements com.bytedance.sdk.component.adexpress.dynamic.tN {
    private boolean Ne;
    boolean Sg;
    int YFl;
    private int aIu;
    private int wXo;

    public dXO(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        this.wXo = 0;
        setTag(Integer.valueOf(getClickArea()));
        YFl();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null && !dynamicRootView.getRenderRequest().UZM()) {
            View view = this.EH;
            if (view != null) {
                view.setVisibility(8);
            }
            setVisibility(8);
        }
    }

    private void YFl() {
        List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> eT = this.GA.eT();
        if (eT == null || eT.size() <= 0) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> it = eT.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH next = it.next();
            if (TextUtils.equals("skip-with-time-skip-btn", next.nc().Sg())) {
                int YFl = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, next.qsH() + (com.bytedance.sdk.component.adexpress.AlY.Sg() ? next.GA() : 0));
                this.aIu = YFl;
                this.YFl = this.DSW - YFl;
            }
        }
        this.wXo = this.DSW - this.YFl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        if (com.bytedance.sdk.component.adexpress.AlY.DSW.Sg(this.pDU.getRenderRequest().AlY())) {
            return true;
        }
        super.NjR();
        setPadding((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.tN()), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.Sg()), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.AlY()), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.YFl()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.Ne && this.YoT != null) {
            setMeasuredDimension(this.aIu + ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.tN())) + ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.AlY())), this.qsH);
        } else if (this.Sg) {
            setMeasuredDimension(this.DSW, this.qsH);
        } else {
            setMeasuredDimension(this.YFl, this.qsH);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public void vc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.Sg) {
            layoutParams.leftMargin = this.NjR;
        } else {
            layoutParams.leftMargin = this.NjR + this.wXo;
        }
        if (this.Ne && this.YoT != null) {
            layoutParams.leftMargin = ((this.NjR + this.wXo) - ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.tN()))) - ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.AlY()));
        }
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            layoutParams.topMargin = this.f10387nc - ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.Sg()));
        } else {
            layoutParams.topMargin = this.f10387nc;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN
    public void YFl(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        if (z11 && this.Ne != z11) {
            this.Ne = z11;
            vc();
            return;
        }
        if (z10 && this.Sg != z10) {
            this.Sg = z10;
            vc();
        }
        this.Sg = z10;
    }
}
