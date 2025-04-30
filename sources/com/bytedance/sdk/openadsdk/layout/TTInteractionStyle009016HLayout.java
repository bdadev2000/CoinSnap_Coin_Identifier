package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.cz;
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
public class TTInteractionStyle009016HLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle009016HLayout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView KS(Context context) {
        PAGTextView KS = super.KS(context);
        KS.setGravity(16);
        KS.setMaxWidth(WNy.lMd(context, 53.0f));
        KS.setTextColor(-1);
        KS.setTextSize(2, 8.0f);
        return KS;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView jU(Context context) {
        PAGTextView jU = super.jU(context);
        jU.setBackground(ku.zp(context, "tt_download_corner_bg"));
        jU.setTextSize(2, 8.0f);
        return jU;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView lMd(Context context) {
        PAGTextView lMd = super.lMd(context);
        lMd.setGravity(16);
        lMd.setMaxWidth(WNy.lMd(context, 53.0f));
        lMd.setTextColor(-1);
        lMd.setTextSize(2, 10.0f);
        return lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public void zp(Context context) {
        int lMd = WNy.lMd(context, 10.0f);
        int lMd2 = WNy.lMd(context, 5.0f);
        int lMd3 = WNy.lMd(context, 6.0f);
        int lMd4 = WNy.lMd(context, 16.0f);
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
        layoutParams2.setMargins(lMd2, lMd2, lMd2, lMd2);
        layoutParams2.addRule(12);
        pAGRelativeLayout2.setBackgroundResource(cz.jU(context, "center_vertical"));
        pAGRelativeLayout2.setGravity(16);
        pAGRelativeLayout2.setLayoutParams(layoutParams2);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        TTRoundRectImageView QR = QR(context);
        this.KS = QR;
        int i10 = vDp.Fm;
        QR.setId(i10);
        int lMd5 = WNy.lMd(context, 25.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(lMd5, lMd5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
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
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = lMd3;
        layoutParams5.setMarginStart(lMd3);
        this.jU.setLayoutParams(layoutParams5);
        pAGLinearLayout.addView(this.jU);
        PAGTextView KS = KS(context);
        this.COT = KS;
        KS.setId(vDp.tyQ);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = lMd3;
        layoutParams6.setMarginStart(lMd3);
        this.COT.setLayoutParams(layoutParams6);
        pAGLinearLayout.addView(this.COT);
        PAGTextView jU = jU(context);
        this.HWF = jU;
        jU.setId(vDp.xg);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(21);
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        this.HWF.setLayoutParams(layoutParams7);
        int lMd7 = WNy.lMd(context, 4.0f);
        this.HWF.setPadding(lMd7, lMd7, lMd7, lMd7);
        pAGRelativeLayout2.addView(this.HWF);
        View ku = ku(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, i9);
        layoutParams8.leftMargin = lMd4;
        layoutParams8.bottomMargin = lMd;
        ku.setLayoutParams(layoutParams8);
        pAGRelativeLayout.addView(ku);
    }

    public TTInteractionStyle009016HLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle009016HLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }
}
