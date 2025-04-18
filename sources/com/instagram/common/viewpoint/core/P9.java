package com.instagram.common.viewpoint.core;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class P9 extends RelativeLayout {
    public final View A00;
    public final OV A01;

    public P9(C1045Zs c1045Zs, View view) {
        super(c1045Zs);
        this.A00 = view;
        this.A01 = new OV(c1045Zs);
        M3.A0K(this.A01);
    }

    public final void A00(int i2) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i2));
    }

    public final void A01(C0745Oa c0745Oa, boolean z2) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (c0745Oa != null) {
            if (z2) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                c0745Oa.setAlignment(3);
                layoutParams2.setMargins(AbstractC0753Oi.A07 / 2, AbstractC0753Oi.A07 / 2, AbstractC0753Oi.A07 / 2, AbstractC0753Oi.A07 / 2);
                linearLayout.addView(c0745Oa, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                M3.A0S(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams insideLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                insideLayoutParams.addRule(3, this.A01.getId());
                insideLayoutParams.setMargins(0, AbstractC0753Oi.A07, 0, 0);
                c0745Oa.setAlignment(17);
                addView(c0745Oa, insideLayoutParams);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
