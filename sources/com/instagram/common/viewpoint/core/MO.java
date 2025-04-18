package com.instagram.common.viewpoint.core;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class MO extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C2S A02;
    public final C1045Zs A03;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ Opcodes.FNEG);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{103, 66};
    }

    static {
        A03();
        A08 = (int) (LP.A02 * 50.0f);
        A05 = (int) (LP.A02 * 10.0f);
        A06 = (int) (LP.A02 * 20.0f);
        A09 = (int) (LP.A02 * 4.0f);
        A07 = (int) (LP.A02 * 12.0f);
    }

    public MO(C1045Zs c1045Zs, int i2) {
        super(c1045Zs);
        this.A03 = c1045Zs;
        this.A02 = C2T.A00(c1045Zs.A01());
        setOrientation(0);
        this.A00 = new ImageView(c1045Zs);
        this.A01 = new ImageView(c1045Zs);
        A04(i2);
    }

    private void A04(int i2) {
        MB mb;
        A05(this.A00, MB.AD_CHOICES_ICON);
        if (i2 == 2) {
            setPadding(A05, A05 / 3, A05, A05 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 80));
            textView.setTextColor(-1);
            textView.setPadding(0, A05 / 2, A05 / 2, A05 / 2);
            M3.A0Y(textView, true, 13);
            LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        setPadding(A05, A05, A05, A05);
        if (i2 == 1) {
            mb = MB.AN_INFO_ICON;
        } else {
            mb = MB.DEFAULT_INFO_ICON;
        }
        A05(this.A01, mb);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A06, A06);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A06, A06);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(ImageView imageView, MB mb) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(MC.A01(mb));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1Z c1z, String str, JF jf, MR mr) {
        setOnClickListener(new MN(this, jf, mr, str, c1z));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i2);
        M3.A0S(this, gradientDrawable);
    }

    public void setIconColors(int i2) {
        this.A00.setColorFilter(i2);
        this.A01.setColorFilter(i2);
    }
}
