package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.adexpress.widget.TTRatingBar2;

/* loaded from: classes.dex */
public class DynamicStarView extends DynamicBaseWidgetImp {
    private int zp;

    public DynamicStarView(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        this.zp = 0;
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context, null);
        this.dQp = tTRatingBar2;
        tTRatingBar2.setTag(Integer.valueOf(getClickArea()));
        addView(this.dQp, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void HWF() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.QR, this.ku);
        layoutParams.topMargin = this.dT;
        int i9 = this.YW + this.zp;
        layoutParams.leftMargin = i9;
        layoutParams.setMarginStart(i9);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        double d2;
        DynamicRootView dynamicRootView;
        super.YW();
        double tG = this.vDp.tG();
        if (com.bytedance.sdk.component.adexpress.jU.lMd() && (tG < 0.0d || tG > 5.0d || ((dynamicRootView = this.rV) != null && dynamicRootView.getRenderRequest() != null && this.rV.getRenderRequest().dT() != 4))) {
            this.dQp.setVisibility(8);
            return true;
        }
        if (tG >= 0.0d && tG <= 5.0d) {
            d2 = tG;
        } else {
            d2 = 5.0d;
        }
        this.dQp.setVisibility(0);
        ((TTRatingBar2) this.dQp).zp(d2, this.vDp.QR(), (int) this.vDp.COT(), ((int) QR.zp(this.Bj, this.vDp.lMd())) + ((int) QR.zp(this.Bj, this.vDp.zp())) + ((int) QR.zp(this.Bj, this.vDp.COT())));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        int zp = (int) (QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.jU()) + this.vDp.KS()) + (QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.COT()) * 5.0f));
        if (this.QR > zp && 4 == this.vDp.ku()) {
            this.zp = (this.QR - zp) / 2;
        }
        this.QR = zp;
        return new FrameLayout.LayoutParams(this.QR, this.ku);
    }
}
