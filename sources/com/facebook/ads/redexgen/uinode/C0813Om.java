package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Om, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0813Om extends RelativeLayout {
    public final View A00;
    public final O4 A01;

    public C0813Om(C1070Yn c1070Yn, View view) {
        super(c1070Yn);
        this.A00 = view;
        O4 o42 = new O4(c1070Yn);
        this.A01 = o42;
        AbstractC0737Lo.A0K(o42);
    }

    public final void A00(int i10) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i10));
    }

    public final void A01(O9 o92, boolean z10) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (o92 != null) {
            if (z10) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                o92.setAlignment(3);
                layoutParams2.setMargins(OL.A07 / 2, OL.A07 / 2, OL.A07 / 2, OL.A07 / 2);
                linearLayout.addView(o92, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                AbstractC0737Lo.A0S(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams insideLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                insideLayoutParams.addRule(3, this.A01.getId());
                insideLayoutParams.setMargins(0, OL.A07, 0, 0);
                o92.setAlignment(17);
                addView(o92, insideLayoutParams);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
