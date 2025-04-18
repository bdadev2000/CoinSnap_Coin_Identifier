package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class wXo extends DSW implements com.bytedance.sdk.component.adexpress.dynamic.tN {
    private int Sg;
    private int[] YFl;
    private int aIu;

    public wXo(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DSW, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        super.NjR();
        ((TextView) this.EH).setText("");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN
    @SuppressLint({"SetTextI18n"})
    public void YFl(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        String YFl = com.bytedance.sdk.component.utils.qO.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), "tt_reward_screen_skip_tx");
        if (i10 == 0) {
            this.EH.setVisibility(0);
            ((TextView) this.EH).setText("| ".concat(String.valueOf(YFl)));
            this.EH.measure(-2, -2);
            this.YFl = new int[]{this.EH.getMeasuredWidth() + 1, this.EH.getMeasuredHeight()};
            View view = this.EH;
            int[] iArr = this.YFl;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.EH).setGravity(17);
            ((TextView) this.EH).setIncludeFontPadding(false);
            YFl();
            this.EH.setPadding(this.YoT.tN(), this.Sg, this.YoT.AlY(), this.aIu);
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.EH).getText())) {
            setMeasuredDimension(0, this.qsH);
        } else {
            setMeasuredDimension(this.DSW, this.qsH);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public void vc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.DSW, this.qsH);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    private void YFl() {
        int YFl = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.wN());
        this.Sg = ((this.qsH - YFl) / 2) - this.YoT.YFl();
        this.aIu = 0;
    }
}
