package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.applovin.impl.L;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class DynamicTimeOuterSkip extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.KS {
    private boolean zp;

    public DynamicTimeOuterSkip(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            this.zp = dynamicRootView.getRenderRequest().tG();
        }
    }

    private String zp(boolean z8) {
        String zp = cz.zp(com.bytedance.sdk.component.adexpress.jU.zp(), "tt_reward_screen_skip_tx");
        if (!"skip-with-time-skip-btn".equals(this.tG.dT().lMd())) {
            return zp;
        }
        if (com.bytedance.sdk.component.adexpress.jU.lMd() && this.zp) {
            zp = "X";
        }
        return z8 ? zp : "| ".concat(String.valueOf(zp));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void HWF() {
        if (TextUtils.equals("skip-with-time-skip-btn", this.tG.dT().lMd())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.QR, this.ku);
            layoutParams.gravity = 8388629;
            setLayoutParams(layoutParams);
            this.dQp.setTextAlignment(1);
            ((TextView) this.dQp).setGravity(17);
        } else {
            super.HWF();
        }
        if (!"skip-with-time-skip-btn".equals(this.tG.dT().lMd())) {
            this.dQp.setTextAlignment(1);
            ((TextView) this.dQp).setGravity(17);
        }
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        super.YW();
        if (L.x(this.tG, "skip-with-time-skip-btn")) {
            ((TextView) this.dQp).setText("");
            return true;
        }
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
        int i10 = 0;
        if (z8) {
            ((TextView) this.dQp).setText(zp(z9));
        } else {
            if (z9) {
                ((TextView) this.dQp).setText(zp(z9));
            }
            if (!z9) {
                i10 = 8;
            }
        }
        setVisibility(i10);
    }
}
