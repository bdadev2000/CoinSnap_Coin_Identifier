package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.PressInteractView;

/* loaded from: classes.dex */
public class rV implements ku<PressInteractView> {
    private PressInteractView zp;

    public rV(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        this.zp = new PressInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.jU.QR.zp(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(context, 20.0f);
        this.zp.setLayoutParams(layoutParams);
        this.zp.setGuideText(qr.MBR());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    /* renamed from: jU, reason: merged with bridge method [inline-methods] */
    public PressInteractView KS() {
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
