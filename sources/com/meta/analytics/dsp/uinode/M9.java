package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class M9 extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C2S A02;
    public final C1636Yn A03;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{118, 83};
    }

    static {
        A03();
        A08 = (int) (LD.A02 * 50.0f);
        A05 = (int) (LD.A02 * 10.0f);
        A06 = (int) (LD.A02 * 20.0f);
        A09 = (int) (LD.A02 * 4.0f);
        A07 = (int) (LD.A02 * 12.0f);
    }

    public M9(C1636Yn c1636Yn, int i9) {
        super(c1636Yn);
        this.A03 = c1636Yn;
        this.A02 = C2T.A00(c1636Yn.A01());
        setOrientation(0);
        this.A00 = new ImageView(c1636Yn);
        this.A01 = new ImageView(c1636Yn);
        A04(i9);
    }

    private void A04(int i9) {
        EnumC1311Lw enumC1311Lw;
        A05(this.A00, EnumC1311Lw.AD_CHOICES_ICON);
        if (i9 == 2) {
            int i10 = A05;
            setPadding(i10, i10 / 3, i10, i10 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 108));
            textView.setTextColor(-1);
            textView.setPadding(0, i10 / 2, i10 / 2, i10 / 2);
            AbstractC1303Lo.A0X(textView, true, 13);
            LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            int i11 = A07;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        int i12 = A05;
        setPadding(i12, i12, i12, i12);
        if (i9 == 1) {
            enumC1311Lw = EnumC1311Lw.AN_INFO_ICON;
        } else {
            enumC1311Lw = EnumC1311Lw.DEFAULT_INFO_ICON;
        }
        A05(this.A01, enumC1311Lw);
        int i13 = A06;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i13, i13);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i13, i13);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(ImageView imageView, EnumC1311Lw enumC1311Lw) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(AbstractC1312Lx.A01(enumC1311Lw));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C08111a c08111a, String str, JA ja, MC mc) {
        setOnClickListener(new M8(this, ja, mc, str, c08111a));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i9);
        AbstractC1303Lo.A0S(this, gradientDrawable);
    }

    public void setIconColors(int i9) {
        this.A00.setColorFilter(i9);
        this.A01.setColorFilter(i9);
    }
}
