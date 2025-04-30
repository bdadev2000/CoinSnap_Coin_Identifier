package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class TTInteractionStyle002003Layout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle002003Layout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView lMd(Context context) {
        PAGTextView lMd = super.lMd(context);
        lMd.setTextColor(-1);
        return lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public void zp(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGLinearLayout.setOrientation(1);
        addView(pAGLinearLayout);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 337.0f;
        pAGFrameLayout.setLayoutParams(layoutParams);
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
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        int lMd = WNy.lMd(context, 10.0f);
        layoutParams2.leftMargin = lMd;
        layoutParams2.topMargin = lMd;
        layoutParams2.bottomMargin = lMd;
        ku.setLayoutParams(layoutParams2);
        pAGFrameLayout.addView(ku);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 263.0f;
        pAGLinearLayout2.setLayoutParams(layoutParams3);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setGravity(81);
        int lMd2 = WNy.lMd(context, 16.0f);
        pAGLinearLayout2.setPadding(lMd2, lMd2, lMd2, lMd2);
        pAGLinearLayout.addView(pAGLinearLayout2);
        TTRoundRectImageView QR = QR(context);
        this.KS = QR;
        QR.setId(vDp.Fm);
        int lMd3 = WNy.lMd(context, 45.0f);
        this.KS.setLayoutParams(new LinearLayout.LayoutParams(lMd3, lMd3));
        pAGLinearLayout2.addView(this.KS);
        PAGTextView lMd4 = lMd(context);
        this.jU = lMd4;
        lMd4.setId(vDp.RRQ);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = WNy.lMd(context, 4.0f);
        this.jU.setLayoutParams(layoutParams4);
        pAGLinearLayout2.addView(this.jU);
        PAGTextView KS = KS(context);
        this.COT = KS;
        KS.setId(vDp.tyQ);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = lMd;
        layoutParams5.bottomMargin = WNy.lMd(context, 25.0f);
        this.COT.setLayoutParams(layoutParams5);
        pAGLinearLayout2.addView(this.COT);
        PAGTextView jU = jU(context);
        this.HWF = jU;
        jU.setId(vDp.xg);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, WNy.lMd(context, 32.0f));
        layoutParams6.topMargin = lMd2;
        this.HWF.setLayoutParams(layoutParams6);
        pAGLinearLayout2.addView(this.HWF);
    }

    public TTInteractionStyle002003Layout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle002003Layout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }
}
