package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.HandLongPressView;

/* loaded from: classes.dex */
public class vDp implements ku {
    private HandLongPressView zp;

    public vDp(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        this.zp = new HandLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.jU.QR.zp(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(context, 180.0f));
        layoutParams.gravity = 17;
        this.zp.setLayoutParams(layoutParams);
        this.zp.setGuideText(qr.MBR());
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
