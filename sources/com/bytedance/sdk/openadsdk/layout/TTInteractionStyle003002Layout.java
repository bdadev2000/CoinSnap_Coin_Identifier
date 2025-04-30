package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class TTInteractionStyle003002Layout extends TTInteractionStyleBaseFrameLayout {
    private PAGImageView QR;
    private PAGTextView ku;

    public TTInteractionStyle003002Layout(Context context) {
        this(context, null);
    }

    public PAGTextView getTtBuDescTV() {
        return this.ku;
    }

    public PAGImageView getTtBuImg() {
        return this.QR;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public void zp(Context context) {
        int lMd = WNy.lMd(context, 6.0f);
        setPadding(lMd, lMd, lMd, lMd);
        PAGFrameLayout COT = COT(context);
        this.zp = COT;
        COT.setId(vDp.etV);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int lMd2 = WNy.lMd(context, 26.0f);
        layoutParams.topMargin = lMd2;
        this.zp.setLayoutParams(layoutParams);
        addView(this.zp);
        PAGImageView pAGImageView = new PAGImageView(context);
        this.QR = pAGImageView;
        pAGImageView.setId(vDp.Sr);
        this.QR.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = lMd2;
        this.QR.setLayoutParams(layoutParams2);
        addView(this.QR);
        PAGLogoView ku = ku(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int lMd3 = WNy.lMd(context, 10.0f);
        layoutParams3.leftMargin = lMd3;
        layoutParams3.topMargin = lMd3;
        layoutParams3.bottomMargin = lMd3;
        ku.setLayoutParams(layoutParams3);
        addView(ku);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        pAGLinearLayout.setOrientation(0);
        pAGLinearLayout.setGravity(17);
        addView(pAGLinearLayout);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.ku = pAGTextView;
        pAGTextView.setId(vDp.ny);
        this.ku.setEllipsize(TextUtils.TruncateAt.END);
        this.ku.setMaxLines(1);
        this.ku.setTextColor(-1);
        this.ku.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.ku.setLayoutParams(layoutParams4);
        pAGLinearLayout.addView(this.ku);
    }

    public TTInteractionStyle003002Layout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle003002Layout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }
}
