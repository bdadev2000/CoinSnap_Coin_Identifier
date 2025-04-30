package com.meta.analytics.dsp.uinode;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class U4 extends AbstractC1329Mo {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2S A03;
    public final C1636Yn A04;

    public static String A0B(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{53, Ascii.SYN, Ascii.DC4, Ascii.FS, 105, 70, 69, 89, 79, 10, 107, 78, 10, 120, 79, 90, 69, 88, 94, 67, 68, 77};
    }

    static {
        A0C();
        A08 = (int) (LD.A02 * 8.0f);
        A07 = (int) (LD.A02 * 10.0f);
        A06 = (int) (LD.A02 * 44.0f);
    }

    public U4(C1636Yn c1636Yn, J2 j22, String str) {
        super(c1636Yn, j22, str);
        this.A04 = c1636Yn;
        this.A03 = C2T.A00(c1636Yn.A01());
        ImageView imageView = new ImageView(getContext());
        this.A00 = imageView;
        int i9 = A07;
        imageView.setPadding(i9, i9, i9, i9);
        imageView.setColorFilter(-10459280);
        int i10 = A06;
        LinearLayout.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(i10, i10);
        closeButtonParams.gravity = 3;
        imageView.setLayoutParams(closeButtonParams);
        ScrollView scrollView = new ScrollView(getContext());
        this.A02 = scrollView;
        scrollView.setFillViewport(true);
        AbstractC1303Lo.A0M(scrollView, -218103809);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A01 = linearLayout;
        linearLayout.setOrientation(1);
        int i11 = A08;
        linearLayout.setPadding(i11, i11, i11, i11);
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final void A0L() {
        this.A00.setImageBitmap(AbstractC1312Lx.A01(EnumC1311Lw.CROSS));
        this.A00.setOnClickListener(new N7(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        C1333Ms c1333Ms = new C1333Ms(this.A04);
        c1333Ms.setData(this.A03.A0H(), EnumC1311Lw.HIDE_AD);
        c1333Ms.setOnClickListener(new N8(this, c1333Ms));
        C1333Ms c1333Ms2 = new C1333Ms(this.A04);
        c1333Ms2.setData(this.A03.A0L(), EnumC1311Lw.REPORT_AD);
        c1333Ms2.setOnClickListener(new N9(this, c1333Ms2));
        C1333Ms c1333Ms3 = new C1333Ms(this.A04);
        c1333Ms3.setData(this.A03.A0M(), EnumC1311Lw.AD_CHOICES_ICON);
        c1333Ms3.setOnClickListener(new NA(this, c1333Ms3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        int i9 = A08;
        menuParams.setMargins(i9, i9, i9, i9);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        AbstractC1303Lo.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(c1333Ms, menuParams);
        linearLayout.addView(c1333Ms2, menuParams);
        linearLayout.addView(c1333Ms3, menuParams);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final void A0M() {
        AbstractC1303Lo.A0I(this);
        AbstractC1303Lo.A0J(this);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final void A0N(C2W c2w, C2U c2u) {
        String A0H;
        EnumC1311Lw enumC1311Lw;
        int i9;
        this.A00.setOnClickListener(null);
        if (c2u == C2U.A05) {
            A0H = this.A03.A0F();
            enumC1311Lw = EnumC1311Lw.REPORT_AD;
            i9 = -552389;
        } else {
            A0H = this.A03.A0H();
            enumC1311Lw = EnumC1311Lw.HIDE_AD;
            i9 = -13272859;
        }
        C1327Mm A0I = new C1327Mm(this.A04, this.A0B).A0I(A0H);
        String title = this.A03.A0D();
        C1327Mm A0H2 = A0I.A0H(title);
        String title2 = c2w.A04();
        C1328Mn adHiddenView = A0H2.A0F(title2).A0K(false).A0E(enumC1311Lw).A0D(i9).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        AbstractC1303Lo.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final void A0O(C2W c2w, C2U c2u) {
        boolean isReportFlow = c2u == C2U.A05;
        N6 n62 = new N6(this.A04, c2w, this.A0B, isReportFlow ? EnumC1311Lw.REPORT_AD : EnumC1311Lw.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(AbstractC1312Lx.A01(EnumC1311Lw.BACK_ARROW));
        this.A00.setOnClickListener(new NB(this));
        this.A00.setContentDescription(A0B(0, 4, 64));
        AbstractC1303Lo.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(n62, layoutParams);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final boolean A0P() {
        return true;
    }
}
