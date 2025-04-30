package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpView;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* loaded from: classes.dex */
public class COT extends vwr<ClickSlideUpView> {
    public COT(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        super(context, dynamicBaseWidget, qr);
        zp(qr);
    }

    private void zp(com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        this.zp = new ClickSlideUpView(this.lMd);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.lMd, qr.DY());
        this.zp.setLayoutParams(layoutParams);
        this.zp.setSlideText(this.jU.MBR());
        SlideUpView slideUpView = this.zp;
        if (slideUpView instanceof ClickSlideUpView) {
            ((ClickSlideUpView) slideUpView).setButtonText(this.jU.dT());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.vwr
    public void jU() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.vwr, com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void lMd() {
        this.zp.lMd();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.vwr, com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void zp() {
        this.zp.zp();
    }
}
