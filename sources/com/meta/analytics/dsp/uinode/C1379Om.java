package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Om, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1379Om extends RelativeLayout {
    public final View A00;
    public final O4 A01;

    public C1379Om(C1636Yn c1636Yn, View view) {
        super(c1636Yn);
        this.A00 = view;
        O4 o42 = new O4(c1636Yn);
        this.A01 = o42;
        AbstractC1303Lo.A0K(o42);
    }

    public final void A00(int i9) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i9));
    }

    public final void A01(O9 o9, boolean z8) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (o9 != null) {
            if (z8) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                o9.setAlignment(3);
                layoutParams2.setMargins(OL.A07 / 2, OL.A07 / 2, OL.A07 / 2, OL.A07 / 2);
                linearLayout.addView(o9, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                AbstractC1303Lo.A0S(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams insideLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                insideLayoutParams.addRule(3, this.A01.getId());
                insideLayoutParams.setMargins(0, OL.A07, 0, 0);
                o9.setAlignment(17);
                addView(o9, insideLayoutParams);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
