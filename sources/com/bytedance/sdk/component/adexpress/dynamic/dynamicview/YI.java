package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class YI extends DSW implements com.bytedance.sdk.component.adexpress.dynamic.tN {
    private boolean Sg;
    private boolean YFl;
    private boolean aIu;

    public YI(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(qsh.nc().Sg())) {
            dynamicRootView.setTimedown(this.qsH);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DSW, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        super.NjR();
        if (com.bytedance.sdk.component.adexpress.AlY.DSW.Sg(this.pDU.getRenderRequest().AlY())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.GA.nc().Sg())) {
            ((TextView) this.EH).setText(String.valueOf((int) Double.parseDouble(this.YoT.nc())));
            return true;
        }
        ((TextView) this.EH).setText(((int) Double.parseDouble(this.YoT.nc())) + "s");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN
    public void YFl(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        String str = "";
        if (!z11 && !this.aIu) {
            try {
                if (Integer.parseInt((String) charSequence) <= 0) {
                    setVisibility(8);
                    return;
                }
            } catch (Exception unused) {
            }
            setVisibility(0);
            if (!z10 && this.pDU.getRenderRequest().YFl() && com.bytedance.sdk.component.adexpress.AlY.DSW.Sg(this.pDU.getRenderRequest().AlY())) {
                if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                    ((TextView) this.EH).setText(i10 + "s");
                } else {
                    ((TextView) this.EH).setText(String.format(com.bytedance.sdk.component.utils.qO.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), "tt_reward_full_skip"), Integer.valueOf(i10)));
                }
                this.YFl = true;
                return;
            }
            if (com.bytedance.sdk.component.adexpress.AlY.Sg() && !"open_ad".equals(this.pDU.getRenderRequest().AlY()) && this.pDU.getRenderRequest().YFl()) {
                this.aIu = true;
                setVisibility(8);
                return;
            }
            if ("timedown".equals(this.GA.nc().Sg())) {
                ((TextView) this.EH).setText(charSequence);
                return;
            }
            ((TextView) this.EH).setText(((Object) charSequence) + "s");
            this.Sg = true;
            if (this.YFl) {
                CharSequence text = ((TextView) this.EH).getText();
                if (text != null) {
                    str = text.toString();
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.AlY() + this.YoT.tN()) + com.bytedance.sdk.component.adexpress.dynamic.wN.eT.Sg(str, this.YoT.wN(), true)[0]), this.qsH);
                layoutParams.gravity = 8388629;
                this.EH.setLayoutParams(layoutParams);
                this.YFl = false;
                requestLayout();
                return;
            }
            return;
        }
        ((TextView) this.EH).setText("");
        setVisibility(8);
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
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.GA.nc().Sg()) && !TextUtils.equals("skip-with-time-countdown", this.GA.nc().Sg())) {
            super.vc();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.DSW, this.qsH);
        layoutParams.gravity = 8388627;
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            layoutParams.leftMargin = this.NjR;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }
}
