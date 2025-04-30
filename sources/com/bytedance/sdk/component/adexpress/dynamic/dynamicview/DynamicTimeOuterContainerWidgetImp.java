package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.jU.HWF;
import com.bytedance.sdk.component.adexpress.jU.QR;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DynamicTimeOuterContainerWidgetImp extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.KS {
    private int FP;
    private int cz;
    boolean lMd;
    private boolean ot;
    int zp;

    public DynamicTimeOuterContainerWidgetImp(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        this.FP = 0;
        setTag(Integer.valueOf(getClickArea()));
        zp();
        dynamicRootView.setTimeOutListener(this);
    }

    private void zp() {
        List<ku> Bj = this.tG.Bj();
        if (Bj == null || Bj.size() <= 0) {
            return;
        }
        Iterator<ku> it = Bj.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ku next = it.next();
            if (TextUtils.equals("skip-with-time-skip-btn", next.dT().lMd())) {
                int zp = (int) QR.zp(this.Bj, next.ku() + (com.bytedance.sdk.component.adexpress.jU.lMd() ? next.tG() : 0));
                this.cz = zp;
                this.zp = this.QR - zp;
            }
        }
        this.FP = this.QR - this.zp;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void HWF() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.lMd) {
            layoutParams.leftMargin = this.YW;
        } else {
            layoutParams.leftMargin = this.YW + this.FP;
        }
        if (this.ot && this.vDp != null) {
            layoutParams.leftMargin = ((this.YW + this.FP) - ((int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.KS()))) - ((int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.jU()));
        }
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            layoutParams.topMargin = this.dT - ((int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.lMd()));
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        if (HWF.lMd(this.rV.getRenderRequest().jU())) {
            return true;
        }
        super.YW();
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
        if (this.ot && this.vDp != null) {
            setMeasuredDimension(this.cz + ((int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.KS())) + ((int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.jU())), this.ku);
        } else if (this.lMd) {
            setMeasuredDimension(this.QR, this.ku);
        } else {
            setMeasuredDimension(this.zp, this.ku);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.KS
    public void zp(CharSequence charSequence, boolean z8, int i9, boolean z9) {
        if (z9 && this.ot != z9) {
            this.ot = z9;
            HWF();
            return;
        }
        if (z8 && this.lMd != z8) {
            this.lMd = z8;
            HWF();
        }
        this.lMd = z8;
    }
}
