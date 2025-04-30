package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpView;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpView2;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* loaded from: classes.dex */
public class HWF extends vwr<ClickSlideUpView> {
    public HWF(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        super(context, dynamicBaseWidget, qr);
        zp(qr);
    }

    private void zp(com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        this.zp = new ClickSlideUpView2(this.lMd);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.zp.setLayoutParams(layoutParams);
        SlideUpView slideUpView = this.zp;
        if (slideUpView instanceof ClickSlideUpView2) {
            ((ClickSlideUpView2) slideUpView).setButtonText(this.jU.MBR());
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
