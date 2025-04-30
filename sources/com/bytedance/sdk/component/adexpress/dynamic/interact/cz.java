package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cz implements ku<WriggleGuideAnimationView> {
    private String COT;
    private com.bytedance.sdk.component.adexpress.dynamic.KS.dT HWF;
    private DynamicBaseWidget KS;
    private com.bytedance.sdk.component.adexpress.dynamic.KS.QR jU;
    private Context lMd;
    private WriggleGuideAnimationView zp;

    public cz(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr, String str, com.bytedance.sdk.component.adexpress.dynamic.KS.dT dTVar) {
        this.lMd = context;
        this.KS = dynamicBaseWidget;
        this.jU = qr;
        this.COT = str;
        this.HWF = dTVar;
        COT();
    }

    private void COT() {
        int DY = this.jU.DY();
        final com.bytedance.sdk.component.adexpress.dynamic.COT.zp dynamicClickListener = this.KS.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.COT)) {
            Context context = this.lMd;
            WriggleGuideAnimationView wriggleGuideAnimationView = new WriggleGuideAnimationView(context, com.bytedance.sdk.component.adexpress.KS.zp.dT(context), this.HWF);
            this.zp = wriggleGuideAnimationView;
            if (wriggleGuideAnimationView.getWriggleLayout() != null) {
                this.zp.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.zp.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.jU.YcG())) {
                    this.zp.getTopTextView().setText(com.bytedance.sdk.component.utils.cz.lMd(this.lMd, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.zp.getTopTextView().setText(this.jU.YcG());
                }
            }
        } else {
            Context context2 = this.lMd;
            this.zp = new WriggleGuideAnimationView(context2, com.bytedance.sdk.component.adexpress.KS.zp.dT(context2), this.HWF);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.zp.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.lMd, DY)));
        this.zp.setLayoutParams(layoutParams);
        this.zp.setShakeText(this.jU.MBR());
        this.zp.setClipChildren(false);
        final View wriggleProgressIv = this.zp.getWriggleProgressIv();
        this.zp.setOnShakeViewListener(new WriggleGuideAnimationView.zp() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.cz.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.ku
    /* renamed from: jU, reason: merged with bridge method [inline-methods] */
    public WriggleGuideAnimationView KS() {
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
