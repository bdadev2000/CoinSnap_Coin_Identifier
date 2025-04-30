package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpShakeView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.ShakeClickView;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* loaded from: classes.dex */
public class QR extends vwr<ClickSlideUpShakeView> {
    public QR(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr, int i9, int i10, int i11) {
        super(context, dynamicBaseWidget, qr);
        this.lMd = context;
        this.jU = qr;
        this.KS = dynamicBaseWidget;
        zp(i9, i10, i11, qr);
    }

    private void zp(int i9, int i10, int i11, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        int i12;
        this.zp = new ClickSlideUpShakeView(this.lMd, i9, i10, i11);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.lMd, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.lMd;
        if (qr.DY() > 0) {
            i12 = qr.DY();
        } else if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            i12 = 0;
        } else {
            i12 = 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(context, i12);
        this.zp.setLayoutParams(layoutParams);
        this.zp.setClipChildren(false);
        this.zp.setSlideText(this.jU.MBR());
        SlideUpView slideUpView = this.zp;
        if (slideUpView instanceof ClickSlideUpShakeView) {
            ((ClickSlideUpShakeView) slideUpView).setShakeText(this.jU.fgJ());
            final ShakeClickView shakeView = ((ClickSlideUpShakeView) this.zp).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new ShakeAnimationView.zp() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.QR.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.KS.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.vwr
    public void jU() {
    }
}
