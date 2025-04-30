package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class TTInteractionStyle016009HLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle016009HLayout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView jU(Context context) {
        PAGTextView jU = super.jU(context);
        jU.setBackground(ku.zp(context, "tt_download_corner_bg"));
        jU.setTextSize(2, 15.0f);
        return jU;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView lMd(Context context) {
        PAGTextView lMd = super.lMd(context);
        lMd.setGravity(16);
        lMd.setMaxWidth(WNy.lMd(context, 250.0f));
        lMd.setTextColor(-1);
        lMd.setTextSize(2, 17.0f);
        lMd.setText("APP NAME");
        return lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public void zp(Context context) {
        int lMd = WNy.lMd(context, 10.0f);
        int lMd2 = WNy.lMd(context, 16.0f);
        int lMd3 = WNy.lMd(context, 15.0f);
        int lMd4 = WNy.lMd(context, 20.0f);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGRelativeLayout.setLayoutParams(layoutParams);
        addView(pAGRelativeLayout);
        PAGFrameLayout COT = COT(context);
        this.zp = COT;
        COT.setId(vDp.etV);
        this.zp.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGRelativeLayout.addView(this.zp);
        PAGImageView HWF = HWF(context);
        this.lMd = HWF;
        HWF.setId(vDp.hRp);
        this.lMd.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGRelativeLayout.addView(this.lMd);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        int i9 = vDp.VuU;
        pAGRelativeLayout2.setId(i9);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, WNy.lMd(context, 60.0f));
        layoutParams2.addRule(12);
        layoutParams2.rightMargin = lMd3;
        layoutParams2.leftMargin = lMd3;
        layoutParams2.bottomMargin = lMd3;
        layoutParams2.setMarginEnd(lMd3);
        layoutParams2.setMarginStart(lMd3);
        pAGRelativeLayout2.setBackgroundColor(Color.parseColor("#26000000"));
        pAGRelativeLayout2.setLayoutParams(layoutParams2);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        TTRoundRectImageView QR = QR(context);
        this.KS = QR;
        int i10 = vDp.Fm;
        QR.setId(i10);
        int lMd5 = WNy.lMd(context, 50.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(lMd5, lMd5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.KS.setLayoutParams(layoutParams3);
        pAGRelativeLayout2.addView(this.KS);
        PAGTextView lMd6 = lMd(context);
        this.jU = lMd6;
        lMd6.setId(vDp.RRQ);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15);
        layoutParams4.leftMargin = lMd4;
        layoutParams4.setMarginStart(lMd4);
        layoutParams4.addRule(1, i10);
        layoutParams4.addRule(17, i10);
        this.jU.setLayoutParams(layoutParams4);
        pAGRelativeLayout2.addView(this.jU);
        PAGTextView jU = jU(context);
        this.HWF = jU;
        jU.setId(vDp.xg);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(WNy.lMd(context, 100.0f), WNy.lMd(context, 30.0f));
        layoutParams5.addRule(21);
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        layoutParams5.rightMargin = lMd;
        layoutParams5.setMarginEnd(lMd);
        this.HWF.setLayoutParams(layoutParams5);
        pAGRelativeLayout2.addView(this.HWF);
        View ku = ku(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(2, i9);
        layoutParams6.leftMargin = lMd2;
        layoutParams6.bottomMargin = lMd;
        ku.setLayoutParams(layoutParams6);
        pAGRelativeLayout.addView(ku);
    }

    public TTInteractionStyle016009HLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle016009HLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }
}
