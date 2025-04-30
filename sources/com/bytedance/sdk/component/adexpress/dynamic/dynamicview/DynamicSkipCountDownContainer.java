package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.jU.QR;
import java.util.List;

/* loaded from: classes.dex */
public class DynamicSkipCountDownContainer extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.KS {
    private int cz;
    private int lMd;
    private int zp;

    public DynamicSkipCountDownContainer(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        zp();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void HWF() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i9 = this.YW;
        layoutParams.leftMargin = i9;
        layoutParams.topMargin = this.dT;
        layoutParams.setMarginStart(i9);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        setBackground(getBackgroundDrawable());
        setPadding((int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.KS()), (int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.lMd()), (int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.jU()), (int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.zp()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.cz == 0) {
            setMeasuredDimension(this.lMd, this.ku);
        } else {
            setMeasuredDimension(this.zp, this.ku);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.KS
    public void zp(CharSequence charSequence, boolean z8, int i9, boolean z9) {
        this.cz = i9;
    }

    private void zp() {
        List<ku> Bj = this.tG.Bj();
        if (Bj == null || Bj.size() <= 0) {
            return;
        }
        for (ku kuVar : Bj) {
            if (kuVar.dT().zp() == 21) {
                this.zp = (int) (this.QR - QR.zp(this.Bj, kuVar.ku()));
            }
            if (kuVar.dT().zp() == 20) {
                this.lMd = (int) (this.QR - QR.zp(this.Bj, kuVar.ku()));
            }
        }
    }
}
