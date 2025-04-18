package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class V1 extends NE {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2S A03;
    public final C1045Zs A04;

    public static String A0B(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{-52, -21, -19, -11, 120, -95, -92, -88, -102, 85, 118, -103, 85, -121, -102, -91, -92, -89, -87, -98, -93, -100};
    }

    static {
        A0C();
        A08 = (int) (LP.A02 * 8.0f);
        A07 = (int) (LP.A02 * 10.0f);
        A06 = (int) (LP.A02 * 44.0f);
    }

    public V1(C1045Zs c1045Zs, J7 j7, String str) {
        super(c1045Zs, j7, str);
        this.A04 = c1045Zs;
        this.A03 = C2T.A00(this.A04.A01());
        this.A00 = new ImageView(getContext());
        this.A00.setPadding(A07, A07, A07, A07);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        M3.A0M(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        this.A01.setPadding(A08, A08, A08, A08);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.instagram.common.viewpoint.core.NE
    public final void A0L() {
        this.A00.setImageBitmap(MC.A01(MB.CROSS));
        this.A00.setOnClickListener(new NX(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        NI ni = new NI(this.A04);
        ni.setData(this.A03.A0H(), MB.HIDE_AD);
        ni.setOnClickListener(new NY(this, ni));
        NI ni2 = new NI(this.A04);
        ni2.setData(this.A03.A0L(), MB.REPORT_AD);
        ni2.setOnClickListener(new NZ(this, ni2));
        NI ni3 = new NI(this.A04);
        ni3.setData(this.A03.A0M(), MB.AD_CHOICES_ICON);
        ni3.setOnClickListener(new ViewOnClickListenerC0719Na(this, ni3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        menuParams.setMargins(A08, A08, A08, A08);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        M3.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(ni, menuParams);
        linearLayout.addView(ni2, menuParams);
        linearLayout.addView(ni3, menuParams);
    }

    @Override // com.instagram.common.viewpoint.core.NE
    public final void A0M() {
        M3.A0I(this);
        M3.A0J(this);
    }

    @Override // com.instagram.common.viewpoint.core.NE
    public final void A0N(C2W c2w, C2U c2u) {
        String A0H;
        MB mb;
        int i2;
        this.A00.setOnClickListener(null);
        if (c2u == C2U.A06) {
            A0H = this.A03.A0F();
            mb = MB.REPORT_AD;
            i2 = -552389;
        } else {
            A0H = this.A03.A0H();
            mb = MB.HIDE_AD;
            i2 = -13272859;
        }
        NC A0I = new NC(this.A04, this.A0B).A0I(A0H);
        String title = this.A03.A0D();
        NC A0H2 = A0I.A0H(title);
        String title2 = c2w.A04();
        ND adHiddenView = A0H2.A0F(title2).A0K(false).A0E(mb).A0D(i2).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        M3.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.NE
    public final void A0O(C2W c2w, C2U c2u) {
        boolean isReportFlow = c2u == C2U.A06;
        NW nw = new NW(this.A04, c2w, this.A0B, isReportFlow ? MB.REPORT_AD : MB.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(MC.A01(MB.BACK_ARROW));
        this.A00.setOnClickListener(new ViewOnClickListenerC0720Nb(this));
        this.A00.setContentDescription(A0B(0, 4, Opcodes.FREM));
        M3.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(nw, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.NE
    public final boolean A0P() {
        return true;
    }
}
