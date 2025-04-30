package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class TTInteractionStyle016009VLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle016009VLayout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView KS(Context context) {
        PAGTextView KS = super.KS(context);
        KS.setGravity(16);
        KS.setMaxWidth(WNy.lMd(context, 153.0f));
        KS.setTextColor(-1);
        KS.setTextSize(2, 13.0f);
        return KS;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView jU(Context context) {
        PAGTextView jU = super.jU(context);
        jU.setBackground(ku.zp(context, "tt_download_corner_bg"));
        jU.setTextSize(2, 14.0f);
        return jU;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView lMd(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(16);
        pAGTextView.setMaxWidth(WNy.lMd(context, 153.0f));
        pAGTextView.setSingleLine();
        pAGTextView.setText("Pangle");
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 14.0f);
        return pAGTextView;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public void zp(Context context) {
        int lMd = WNy.lMd(context, 10.0f);
        int lMd2 = WNy.lMd(context, 6.0f);
        int lMd3 = WNy.lMd(context, 16.0f);
        int lMd4 = WNy.lMd(context, 15.0f);
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
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, WNy.lMd(context, 48.0f));
        layoutParams2.addRule(12);
        pAGRelativeLayout2.setLayoutParams(layoutParams2);
        pAGRelativeLayout2.setBackgroundColor(Color.parseColor("#26000000"));
        pAGRelativeLayout2.setGravity(16);
        pAGRelativeLayout2.setPadding(lMd4, 0, 0, 0);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        TTRoundRectImageView QR = QR(context);
        this.KS = QR;
        int i10 = vDp.Fm;
        QR.setId(i10);
        int lMd5 = WNy.lMd(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(lMd5, lMd5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        layoutParams3.leftMargin = lMd;
        layoutParams3.setMarginStart(lMd);
        this.KS.setLayoutParams(layoutParams3);
        pAGRelativeLayout2.addView(this.KS);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(17, i10);
        layoutParams4.addRule(1, i10);
        pAGLinearLayout.setLayoutParams(layoutParams4);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGRelativeLayout2.addView(pAGLinearLayout);
        PAGTextView lMd6 = lMd(context);
        this.jU = lMd6;
        lMd6.setId(vDp.RRQ);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(WNy.lMd(context, 130.0f), WNy.lMd(context, 20.0f));
        layoutParams5.leftMargin = lMd2;
        layoutParams5.setMarginStart(lMd2);
        this.jU.setLayoutParams(layoutParams5);
        pAGLinearLayout.addView(this.jU);
        PAGTextView KS = KS(context);
        this.COT = KS;
        KS.setId(vDp.tyQ);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = lMd2;
        layoutParams6.setMarginStart(lMd2);
        this.COT.setLayoutParams(layoutParams6);
        pAGLinearLayout.addView(this.COT);
        PAGTextView jU = jU(context);
        this.HWF = jU;
        jU.setId(vDp.xg);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(WNy.lMd(context, 80.0f), WNy.lMd(context, 30.0f));
        layoutParams7.addRule(21);
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = lMd;
        layoutParams7.setMarginEnd(lMd);
        this.HWF.setLayoutParams(layoutParams7);
        pAGRelativeLayout2.addView(this.HWF);
        View ku = ku(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, i9);
        layoutParams8.leftMargin = lMd3;
        layoutParams8.bottomMargin = lMd;
        ku.setLayoutParams(layoutParams8);
        pAGRelativeLayout.addView(ku);
    }

    public TTInteractionStyle016009VLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle016009VLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }
}
