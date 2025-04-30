package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class TTInteractionStyle003002HLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle003002HLayout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public void zp(Context context) {
        int lMd = WNy.lMd(context, 10.0f);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        layoutParams.gravity = 17;
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setPadding(lMd, lMd, lMd, lMd);
        addView(pAGLinearLayout);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 3.0f;
        pAGFrameLayout.setLayoutParams(layoutParams2);
        pAGLinearLayout.addView(pAGFrameLayout);
        PAGFrameLayout COT = COT(context);
        this.zp = COT;
        COT.setId(vDp.etV);
        this.zp.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(this.zp);
        PAGImageView HWF = HWF(context);
        this.lMd = HWF;
        HWF.setId(vDp.hRp);
        this.lMd.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(this.lMd);
        PAGLogoView ku = ku(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        layoutParams3.leftMargin = lMd;
        layoutParams3.topMargin = lMd;
        layoutParams3.bottomMargin = lMd;
        ku.setLayoutParams(layoutParams3);
        pAGFrameLayout.addView(ku);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        pAGRelativeLayout.setLayoutParams(layoutParams4);
        pAGLinearLayout.addView(pAGRelativeLayout);
        TTRoundRectImageView QR = QR(context);
        this.KS = QR;
        int i9 = vDp.Fm;
        QR.setId(i9);
        int lMd2 = WNy.lMd(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(lMd2, lMd2);
        layoutParams5.addRule(15);
        this.KS.setLayoutParams(layoutParams5);
        pAGRelativeLayout.addView(this.KS);
        PAGTextView lMd3 = lMd(context);
        this.jU = lMd3;
        lMd3.setId(vDp.RRQ);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15);
        layoutParams6.leftMargin = lMd;
        layoutParams6.setMarginStart(lMd);
        layoutParams6.addRule(1, i9);
        layoutParams6.addRule(17, i9);
        this.jU.setLayoutParams(layoutParams6);
        pAGRelativeLayout.addView(this.jU);
        PAGTextView jU = jU(context);
        this.HWF = jU;
        jU.setId(vDp.xg);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(WNy.lMd(context, 100.0f), WNy.lMd(context, 32.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(21);
        layoutParams7.addRule(15);
        this.HWF.setLayoutParams(layoutParams7);
        pAGRelativeLayout.addView(this.HWF);
    }

    public TTInteractionStyle003002HLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle003002HLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }
}
