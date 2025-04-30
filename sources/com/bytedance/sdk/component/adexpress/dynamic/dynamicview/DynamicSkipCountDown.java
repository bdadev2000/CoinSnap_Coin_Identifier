package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class DynamicSkipCountDown extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.KS {
    public DynamicSkipCountDown(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void HWF() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.QR, this.ku);
        int i9 = this.YW;
        layoutParams.leftMargin = i9;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(i9);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (TextUtils.isEmpty(((TextView) this.dQp).getText())) {
            setMeasuredDimension(0, this.ku);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.KS
    public void zp(CharSequence charSequence, boolean z8, int i9, boolean z9) {
        if (i9 == 0) {
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
        } else {
            ((TextView) this.dQp).setText(" | ".concat(String.format(cz.zp(com.bytedance.sdk.component.adexpress.jU.zp(), "tt_reward_full_skip_count_down"), Integer.valueOf(i9))));
        }
        requestLayout();
    }
}
