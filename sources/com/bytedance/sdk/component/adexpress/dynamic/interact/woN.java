package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideUp3DView;

/* loaded from: classes.dex */
public class woN implements ku<SlideUp3DView> {
    private DynamicBaseWidget KS;
    private com.bytedance.sdk.component.adexpress.dynamic.KS.QR jU;
    private Context lMd;
    private SlideUp3DView zp;

    public woN(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        this.lMd = context;
        this.KS = dynamicBaseWidget;
        this.jU = qr;
        jU();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    /* renamed from: COT, reason: merged with bridge method [inline-methods] */
    public SlideUp3DView KS() {
        return this.zp;
    }

    public void jU() {
        this.zp = new SlideUp3DView(this.lMd);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.lMd, 250.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.lMd, 120.0f);
        this.zp.setLayoutParams(layoutParams);
        this.zp.setGuideText(this.jU.MBR());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void lMd() {
        this.zp.KS();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void zp() {
        this.zp.lMd();
    }
}
