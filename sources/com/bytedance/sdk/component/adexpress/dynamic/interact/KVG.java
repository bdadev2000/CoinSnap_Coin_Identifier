package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideRightView;

/* loaded from: classes.dex */
public class KVG implements ku {
    private DynamicBaseWidget KS;
    private com.bytedance.sdk.component.adexpress.dynamic.KS.QR jU;
    private Context lMd;
    private SlideRightView zp;

    public KVG(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        this.lMd = context;
        this.KS = dynamicBaseWidget;
        this.jU = qr;
        jU();
    }

    private void jU() {
        this.zp = new SlideRightView(this.lMd);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.lMd, 120.0f));
        layoutParams.gravity = 17;
        this.zp.setLayoutParams(layoutParams);
        this.zp.setClipChildren(false);
        this.zp.setGuideText(this.jU.MBR());
        DynamicBaseWidget dynamicBaseWidget = this.KS;
        if (dynamicBaseWidget != null) {
            this.zp.setOnClickListener((View.OnClickListener) dynamicBaseWidget.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public ViewGroup KS() {
        return this.zp;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void lMd() {
        SlideRightView slideRightView = this.zp;
        if (slideRightView != null) {
            slideRightView.lMd();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void zp() {
        SlideRightView slideRightView = this.zp;
        if (slideRightView != null) {
            slideRightView.zp();
        }
    }
}
