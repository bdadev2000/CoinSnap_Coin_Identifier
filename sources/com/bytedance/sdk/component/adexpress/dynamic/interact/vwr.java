package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* loaded from: classes.dex */
public class vwr<E extends SlideUpView> implements ku<E> {
    protected int COT;
    protected DynamicBaseWidget KS;
    protected com.bytedance.sdk.component.adexpress.dynamic.KS.QR jU;
    protected Context lMd;
    protected SlideUpView zp;

    public vwr(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr, int i9) {
        this.COT = i9;
        this.lMd = context;
        this.KS = dynamicBaseWidget;
        this.jU = qr;
        jU();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    /* renamed from: COT, reason: merged with bridge method [inline-methods] */
    public E KS() {
        return (E) this.zp;
    }

    public void jU() {
        this.zp = new SlideUpView(this.lMd, this.jU.Iv());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.lMd, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.lMd, 100 - this.COT);
        this.zp.setLayoutParams(layoutParams);
        try {
            this.zp.setGuideText(this.jU.MBR());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void lMd() {
        this.zp.lMd();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void zp() {
        this.zp.zp();
    }

    public vwr(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr) {
        this(context, dynamicBaseWidget, qr, 0);
    }
}
