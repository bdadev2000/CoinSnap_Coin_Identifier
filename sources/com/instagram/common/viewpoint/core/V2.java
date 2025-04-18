package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class V2 extends NE {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C2S A04;
    public final C1045Zs A05;

    public static String A0B(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 20);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{3, 32, 34, 42, 3, 44, 47, 51, 37, 96, 1, 36, 96, 18, 37, 48, 47, 50, 52, 41, 46, 39};
    }

    static {
        A0C();
        A09 = (int) (LP.A02 * 4.0f);
        A08 = (int) (LP.A02 * 10.0f);
        A07 = (int) (LP.A02 * 44.0f);
    }

    public V2(C1045Zs c1045Zs, J7 j7, String str) {
        super(c1045Zs, j7, str);
        this.A05 = c1045Zs;
        this.A04 = C2T.A00(c1045Zs.A01());
        this.A01 = new ImageView(getContext());
        this.A01.setPadding(A08, A08, A08, A08);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        M3.A0M(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.instagram.common.viewpoint.core.NE
    public final void A0L() {
        this.A01.setImageBitmap(MC.A01(MB.CROSS));
        this.A01.setOnClickListener(new NN(this));
        this.A01.setContentDescription(A0B(4, 18, 84));
        NI ni = new NI(this.A05);
        ni.setData(this.A04.A0H(), MB.HIDE_AD);
        ni.setOnClickListener(new NO(this, ni));
        NI ni2 = new NI(this.A05);
        ni2.setData(this.A04.A0L(), MB.REPORT_AD);
        ni2.setOnClickListener(new NP(this, ni2));
        NI ni3 = new NI(this.A05);
        ni3.setData(this.A04.A0M(), MB.AD_CHOICES_ICON);
        ni3.setOnClickListener(new NQ(this, ni3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        M3.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(ni, layoutParams);
        this.A02.addView(ni2, layoutParams);
        this.A02.addView(ni3, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.NE
    public final void A0M() {
        M3.A0I(this);
        M3.A0J(this);
    }

    @Override // com.instagram.common.viewpoint.core.NE
    public final void A0N(C2W c2w, C2U c2u) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        M3.A0Y(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        M3.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.instagram.common.viewpoint.core.NE
    public final void A0O(C2W c2w, C2U c2u) {
        M3.A0T(this.A03);
        this.A01.setImageBitmap(MC.A01(MB.BACK_ARROW));
        this.A01.setOnClickListener(new NR(this));
        this.A01.setContentDescription(A0B(0, 4, 85));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        for (C2W c2w2 : c2w.A05()) {
            NI ni = new NI(this.A05);
            ni.setData(c2w2.A04(), null);
            ni.setOnClickListener(new NS(this, ni, c2w2));
            this.A02.addView(ni, layoutParams);
        }
    }

    @Override // com.instagram.common.viewpoint.core.NE
    public final boolean A0P() {
        return true;
    }
}
