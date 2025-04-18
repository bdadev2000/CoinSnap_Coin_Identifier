package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class aIu extends DSW implements com.bytedance.sdk.component.adexpress.dynamic.tN {
    public aIu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN
    public void YFl(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        if (i10 == 0) {
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
        } else {
            ((TextView) this.EH).setText(" | " + String.format(com.bytedance.sdk.component.utils.qO.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), "tt_reward_full_skip_count_down"), Integer.valueOf(i10)));
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DSW, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.EH).getText())) {
            setMeasuredDimension(0, this.qsH);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public void vc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.DSW, this.qsH);
        int i10 = this.NjR;
        layoutParams.leftMargin = i10;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }
}
