package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class PAGLogoView extends LinearLayout {
    public PAGLogoView(Context context) {
        this(context, null);
    }

    private void initView(Context context) {
        GS.tN(context, 1.0f);
        int tN = GS.tN(context, 2.0f);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(GS.tN(context, 14.0f), GS.tN(context, 6.0f));
        layoutParams.leftMargin = tN;
        alY.setLayoutParams(layoutParams);
        alY.setImageDrawable(com.bytedance.sdk.component.utils.qO.tN(context, "tt_ad_logo"));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = tN;
        layoutParams2.rightMargin = tN;
        qsh.setLayoutParams(layoutParams2);
        qsh.setText(com.bytedance.sdk.component.utils.qO.YFl(context, "tt_logo_en"));
        qsh.setTextSize(1, 8.0f);
        qsh.setGravity(17);
        qsh.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(alY);
        addView(qsh);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(tN);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = GS.tN(getContext(), 12.0f);
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.wN.NjR.YFl(this, layoutParams));
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }

    @RequiresApi(api = 21)
    public PAGLogoView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initView(context);
    }
}
