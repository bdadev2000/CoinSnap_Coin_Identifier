package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dQp implements ku<ShakeAnimationView> {
    private String COT;
    private int HWF;
    private DynamicBaseWidget KS;
    private int QR;
    private com.bytedance.sdk.component.adexpress.dynamic.KS.QR jU;
    private int ku;
    private Context lMd;
    private ShakeAnimationView zp;

    public dQp(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr, String str, int i9, int i10, int i11) {
        this.lMd = context;
        this.KS = dynamicBaseWidget;
        this.jU = qr;
        this.COT = str;
        this.HWF = i9;
        this.QR = i10;
        this.ku = i11;
        COT();
    }

    private void COT() {
        final com.bytedance.sdk.component.adexpress.dynamic.COT.zp dynamicClickListener = this.KS.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.COT)) {
            Context context = this.lMd;
            ShakeAnimationView shakeAnimationView = new ShakeAnimationView(context, com.bytedance.sdk.component.adexpress.KS.zp.YW(context), this.HWF, this.QR, this.ku);
            this.zp = shakeAnimationView;
            if (shakeAnimationView.getShakeLayout() != null) {
                this.zp.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.lMd;
            this.zp = new ShakeAnimationView(context2, com.bytedance.sdk.component.adexpress.KS.zp.ku(context2), this.HWF, this.QR, this.ku);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.zp.setGravity(17);
        layoutParams.gravity = 17;
        this.zp.setLayoutParams(layoutParams);
        this.zp.setTranslationY(com.bytedance.sdk.component.adexpress.jU.QR.zp(this.lMd, this.jU.Np()));
        this.zp.setShakeText(this.jU.MBR());
        this.zp.setClipChildren(false);
        this.zp.setOnShakeViewListener(new ShakeAnimationView.zp() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.dQp.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    /* renamed from: jU, reason: merged with bridge method [inline-methods] */
    public ShakeAnimationView KS() {
        return this.zp;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void lMd() {
        this.zp.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    public void zp() {
        this.zp.zp();
    }
}
