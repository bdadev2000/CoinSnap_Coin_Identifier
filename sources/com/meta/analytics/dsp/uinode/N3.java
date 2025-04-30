package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class N3 extends LinearLayout {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public static final int A05 = (int) (LD.A02 * 8.0f);
    public static final int A06 = (int) (LD.A02 * 14.5d);
    public static final int A04 = (int) (LD.A02 * 20.0f);
    public static final LinearLayout.LayoutParams A03 = new LinearLayout.LayoutParams(-1, -2);

    public N3(C1636Yn c1636Yn) {
        super(c1636Yn);
        ImageView imageView = new ImageView(c1636Yn);
        this.A00 = imageView;
        imageView.setColorFilter(-10459280);
        int i9 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i9, i9);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(c1636Yn);
        this.A01 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A05 * 2, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = A03;
        linearLayout.setLayoutParams(layoutParams2);
        TextView textView = new TextView(c1636Yn);
        this.A02 = textView;
        AbstractC1303Lo.A0X(textView, true, 16);
        textView.setTextColor(-14934495);
        linearLayout.addView(textView, layoutParams2);
        setOrientation(0);
        addView(imageView);
        addView(linearLayout);
    }

    public void setInfo(EnumC1311Lw enumC1311Lw, String str, String str2) {
        this.A00.setImageBitmap(AbstractC1312Lx.A01(enumC1311Lw));
        this.A02.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = new TextView(getContext());
            AbstractC1303Lo.A0X(textView, false, 14);
            textView.setTextColor(-10459280);
            textView.setText(str2);
            this.A01.addView(textView, A03);
            int i9 = A05;
            setPadding(0, i9, 0, i9);
            return;
        }
        int i10 = A06;
        setPadding(0, i10, 0, i10);
    }
}
