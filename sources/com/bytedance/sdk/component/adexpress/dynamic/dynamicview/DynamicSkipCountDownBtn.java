package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class DynamicSkipCountDownBtn extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.KS {
    private int cz;
    private int lMd;
    private int[] zp;

    public DynamicSkipCountDownBtn(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void HWF() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.QR, this.ku);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        super.YW();
        ((TextView) this.dQp).setText("");
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (TextUtils.isEmpty(((TextView) this.dQp).getText())) {
            setMeasuredDimension(0, this.ku);
        } else {
            setMeasuredDimension(this.QR, this.ku);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.KS
    @SuppressLint({"SetTextI18n"})
    public void zp(CharSequence charSequence, boolean z8, int i9, boolean z9) {
        String zp = cz.zp(com.bytedance.sdk.component.adexpress.jU.zp(), "tt_reward_screen_skip_tx");
        if (i9 == 0) {
            this.dQp.setVisibility(0);
            ((TextView) this.dQp).setText("| ".concat(String.valueOf(zp)));
            this.dQp.measure(-2, -2);
            this.zp = new int[]{this.dQp.getMeasuredWidth() + 1, this.dQp.getMeasuredHeight()};
            View view = this.dQp;
            int[] iArr = this.zp;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.dQp).setGravity(17);
            ((TextView) this.dQp).setIncludeFontPadding(false);
            zp();
            this.dQp.setPadding(this.vDp.KS(), this.lMd, this.vDp.jU(), this.cz);
        }
        requestLayout();
    }

    private void zp() {
        int zp = (int) QR.zp(this.Bj, this.vDp.COT());
        this.lMd = ((this.ku - zp) / 2) - this.vDp.zp();
        this.cz = 0;
    }
}
