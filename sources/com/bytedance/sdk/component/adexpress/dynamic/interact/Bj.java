package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.DynamicLottieView;

/* loaded from: classes.dex */
public class Bj implements ku<ViewGroup> {
    private final FrameLayout lMd;
    private final DynamicLottieView zp;

    public Bj(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr, String str) {
        DynamicLottieView dynamicLottieView = new DynamicLottieView(context);
        this.zp = dynamicLottieView;
        dynamicLottieView.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.lMd = frameLayout;
        frameLayout.addView(dynamicLottieView, new FrameLayout.LayoutParams(-2, -2));
        double sqt = qr.sqt();
        sqt = sqt == 0.0d ? 1.0d : sqt;
        double fVt = qr.fVt();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * sqt), (int) (dynamicBaseWidget.getDynamicWidth() * 0.32d * (fVt != 0.0d ? fVt : 1.0d)));
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public ViewGroup KS() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void lMd() {
        this.zp.jU();
        ViewParent parent = this.lMd.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.lMd);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void zp() {
        this.zp.HWF();
    }
}
