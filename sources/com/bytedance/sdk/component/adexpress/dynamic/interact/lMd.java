package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView;

/* loaded from: classes.dex */
public class lMd implements ku<DynamicBrushMaskView> {
    private DynamicBrushMaskView zp;

    public lMd(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        int i9;
        this.zp = new DynamicBrushMaskView(context);
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
        this.zp.setLayoutParams(layoutParams);
        this.zp.setClipChildren(false);
        this.zp.setBrushText(qr.MBR());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    /* renamed from: jU, reason: merged with bridge method [inline-methods] */
    public DynamicBrushMaskView KS() {
        return this.zp;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void lMd() {
        DynamicBrushMaskView dynamicBrushMaskView = this.zp;
        if (dynamicBrushMaskView != null) {
            dynamicBrushMaskView.lMd();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void zp() {
    }
}
