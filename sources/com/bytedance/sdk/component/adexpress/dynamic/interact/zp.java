package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.BluePressInteractView;

/* loaded from: classes.dex */
public class zp implements ku {
    private BluePressInteractView zp;

    public zp(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        double sqt = qr.sqt();
        sqt = sqt == 0.0d ? 1.0d : sqt;
        double fVt = qr.fVt();
        int dynamicWidth = (int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * sqt);
        int dynamicWidth2 = (int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * (fVt != 0.0d ? fVt : 1.0d));
        this.zp = new BluePressInteractView(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(context, qr.GP() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(context, qr.mW() - 3);
        this.zp.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public ViewGroup KS() {
        return this.zp;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void lMd() {
        this.zp.lMd();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void zp() {
        this.zp.zp();
    }
}
