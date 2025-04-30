package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView;

/* loaded from: classes.dex */
public class pvr implements ku<DynamicUnlockView> {
    private final DynamicUnlockView zp;

    public pvr(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        int i9;
        DynamicUnlockView dynamicUnlockView = new DynamicUnlockView(context);
        this.zp = dynamicUnlockView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (qr.DY() > 0) {
            i9 = qr.DY();
        } else if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            i9 = 0;
        } else {
            i9 = 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(context, i9);
        dynamicUnlockView.setLayoutParams(layoutParams);
        dynamicUnlockView.setClipChildren(false);
        dynamicUnlockView.setText(qr.MBR());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    /* renamed from: jU, reason: merged with bridge method [inline-methods] */
    public DynamicUnlockView KS() {
        return this.zp;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void lMd() {
        DynamicUnlockView dynamicUnlockView = this.zp;
        if (dynamicUnlockView != null) {
            dynamicUnlockView.lMd();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void zp() {
        DynamicUnlockView dynamicUnlockView = this.zp;
        if (dynamicUnlockView != null) {
            dynamicUnlockView.zp();
        }
    }
}
