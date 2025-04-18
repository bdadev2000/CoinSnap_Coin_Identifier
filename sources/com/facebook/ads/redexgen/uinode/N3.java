package com.facebook.ads.redexgen.uinode;

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

    public N3(C1070Yn c1070Yn) {
        super(c1070Yn);
        ImageView imageView = new ImageView(c1070Yn);
        this.A00 = imageView;
        imageView.setColorFilter(-10459280);
        int i10 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(c1070Yn);
        this.A01 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A05 * 2, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = A03;
        linearLayout.setLayoutParams(layoutParams2);
        TextView textView = new TextView(c1070Yn);
        this.A02 = textView;
        AbstractC0737Lo.A0X(textView, true, 16);
        textView.setTextColor(-14934495);
        linearLayout.addView(textView, layoutParams2);
        setOrientation(0);
        addView(imageView);
        addView(linearLayout);
    }

    public void setInfo(EnumC0745Lw enumC0745Lw, String str, String str2) {
        this.A00.setImageBitmap(AbstractC0746Lx.A01(enumC0745Lw));
        this.A02.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = new TextView(getContext());
            AbstractC0737Lo.A0X(textView, false, 14);
            textView.setTextColor(-10459280);
            textView.setText(str2);
            this.A01.addView(textView, A03);
            int i10 = A05;
            setPadding(0, i10, 0, i10);
            return;
        }
        int i11 = A06;
        setPadding(0, i11, 0, i11);
    }
}
