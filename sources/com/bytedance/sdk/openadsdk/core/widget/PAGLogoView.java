package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class PAGLogoView extends LinearLayout {
    public PAGLogoView(Context context) {
        this(context, null);
    }

    private void zp(Context context) {
        PAGImageView pAGImageView = new PAGImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(WNy.lMd(context, 14.0f), WNy.lMd(context, 5.0f));
        int lMd = WNy.lMd(context, 4.0f);
        int lMd2 = WNy.lMd(context, 2.0f);
        layoutParams.topMargin = lMd;
        layoutParams.bottomMargin = lMd;
        layoutParams.leftMargin = lMd2;
        pAGImageView.setLayoutParams(layoutParams);
        pAGImageView.setImageDrawable(cz.KS(context, "tt_ad_logo"));
        PAGTextView pAGTextView = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = lMd2;
        layoutParams2.rightMargin = lMd2;
        pAGTextView.setLayoutParams(layoutParams2);
        pAGTextView.setText(cz.zp(context, "tt_logo_en"));
        pAGTextView.setTextSize(1, 8.0f);
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(pAGImageView);
        addView(pAGTextView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#1F161823"));
        gradientDrawable.setCornerRadius(WNy.lMd(context, 2.0f));
        setBackground(gradientDrawable);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = WNy.lMd(getContext(), 13.0f);
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.customview.zp.zp(this, layoutParams));
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        zp(context);
    }
}
