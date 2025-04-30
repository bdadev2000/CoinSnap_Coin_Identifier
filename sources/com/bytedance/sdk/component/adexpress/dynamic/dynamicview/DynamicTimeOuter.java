package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.dynamic.jU.Bj;
import com.bytedance.sdk.component.adexpress.jU.HWF;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class DynamicTimeOuter extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.KS {
    private boolean cz;
    private boolean lMd;
    private boolean zp;

    public DynamicTimeOuter(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(kuVar.dT().lMd())) {
            dynamicRootView.setTimedown(this.ku);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void HWF() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.tG.dT().lMd()) && !TextUtils.equals("skip-with-time-countdown", this.tG.dT().lMd())) {
            super.HWF();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.QR, this.ku);
        layoutParams.gravity = 8388627;
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            layoutParams.leftMargin = this.YW;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        super.YW();
        if (HWF.lMd(this.rV.getRenderRequest().jU())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.tG.dT().lMd())) {
            ((TextView) this.dQp).setText(String.valueOf((int) Double.parseDouble(this.vDp.dT())));
            return true;
        }
        ((TextView) this.dQp).setText(((int) Double.parseDouble(this.vDp.dT())) + "s");
        return true;
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
        String str = "";
        if (!z9 && !this.cz) {
            try {
                if (Integer.parseInt((String) charSequence) <= 0) {
                    setVisibility(8);
                    return;
                }
            } catch (Exception unused) {
            }
            setVisibility(0);
            if (!z8 && this.rV.getRenderRequest().zp() && HWF.lMd(this.rV.getRenderRequest().jU())) {
                ((TextView) this.dQp).setText(String.format(cz.zp(com.bytedance.sdk.component.adexpress.jU.zp(), "tt_reward_full_skip"), Integer.valueOf(i9)));
                this.zp = true;
                return;
            }
            if (com.bytedance.sdk.component.adexpress.jU.lMd() && !"open_ad".equals(this.rV.getRenderRequest().jU()) && this.rV.getRenderRequest().zp()) {
                this.cz = true;
                setVisibility(8);
                return;
            }
            if ("timedown".equals(this.tG.dT().lMd())) {
                ((TextView) this.dQp).setText(charSequence);
                return;
            }
            ((TextView) this.dQp).setText(((Object) charSequence) + "s");
            this.lMd = true;
            if (this.zp) {
                CharSequence text = ((TextView) this.dQp).getText();
                if (text != null) {
                    str = text.toString();
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.jU() + this.vDp.KS()) + Bj.lMd(str, this.vDp.COT(), true)[0]), this.ku);
                layoutParams.gravity = 8388629;
                this.dQp.setLayoutParams(layoutParams);
                this.zp = false;
                requestLayout();
                return;
            }
            return;
        }
        ((TextView) this.dQp).setText("");
        setVisibility(8);
    }
}
