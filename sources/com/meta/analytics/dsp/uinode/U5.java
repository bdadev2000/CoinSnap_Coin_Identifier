package com.meta.analytics.dsp.uinode;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class U5 extends AbstractC1329Mo {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C2S A04;
    public final C1636Yn A05;

    public static String A0B(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{-57, -26, -24, -16, -92, -51, -48, -44, -58, -127, -94, -59, -127, -77, -58, -47, -48, -45, -43, -54, -49, -56};
    }

    static {
        A0C();
        A09 = (int) (LD.A02 * 4.0f);
        A08 = (int) (LD.A02 * 10.0f);
        A07 = (int) (LD.A02 * 44.0f);
    }

    public U5(C1636Yn c1636Yn, J2 j22, String str) {
        super(c1636Yn, j22, str);
        this.A05 = c1636Yn;
        this.A04 = C2T.A00(c1636Yn.A01());
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        int i9 = A08;
        imageView.setPadding(i9, i9, i9, i9);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(-10459280);
        int i10 = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 16;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A02 = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
        this.A00 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setLayoutParams(layoutParams2);
        horizontalScrollView.addView(linearLayout, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.A03 = linearLayout2;
        linearLayout2.setOrientation(0);
        AbstractC1303Lo.A0M(linearLayout2, -218103809);
        linearLayout2.setMotionEventSplittingEnabled(false);
        linearLayout2.addView(imageView, layoutParams);
        linearLayout2.addView(horizontalScrollView, layoutParams2);
        addView(linearLayout2, new FrameLayout.LayoutParams(-1, -1));
        linearLayout2.setClickable(true);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final void A0L() {
        this.A01.setImageBitmap(AbstractC1312Lx.A01(EnumC1311Lw.CROSS));
        this.A01.setOnClickListener(new ViewOnClickListenerC1338Mx(this));
        this.A01.setContentDescription(A0B(4, 18, 89));
        C1333Ms c1333Ms = new C1333Ms(this.A05);
        c1333Ms.setData(this.A04.A0H(), EnumC1311Lw.HIDE_AD);
        c1333Ms.setOnClickListener(new ViewOnClickListenerC1339My(this, c1333Ms));
        C1333Ms c1333Ms2 = new C1333Ms(this.A05);
        c1333Ms2.setData(this.A04.A0L(), EnumC1311Lw.REPORT_AD);
        c1333Ms2.setOnClickListener(new ViewOnClickListenerC1340Mz(this, c1333Ms2));
        C1333Ms c1333Ms3 = new C1333Ms(this.A05);
        c1333Ms3.setData(this.A04.A0M(), EnumC1311Lw.AD_CHOICES_ICON);
        c1333Ms3.setOnClickListener(new N0(this, c1333Ms3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i9 = A09;
        layoutParams.setMargins(0, i9, i9, i9);
        AbstractC1303Lo.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c1333Ms, layoutParams);
        this.A02.addView(c1333Ms2, layoutParams);
        this.A02.addView(c1333Ms3, layoutParams);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final void A0M() {
        AbstractC1303Lo.A0I(this);
        AbstractC1303Lo.A0J(this);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final void A0N(C2W c2w, C2U c2u) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        AbstractC1303Lo.A0X(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        AbstractC1303Lo.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final void A0O(C2W c2w, C2U c2u) {
        AbstractC1303Lo.A0T(this.A03);
        this.A01.setImageBitmap(AbstractC1312Lx.A01(EnumC1311Lw.BACK_ARROW));
        this.A01.setOnClickListener(new N1(this));
        this.A01.setContentDescription(A0B(0, 4, 125));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i9 = A09;
        layoutParams.setMargins(0, i9, i9, i9);
        for (C2W c2w2 : c2w.A05()) {
            C1333Ms c1333Ms = new C1333Ms(this.A05);
            c1333Ms.setData(c2w2.A04(), null);
            c1333Ms.setOnClickListener(new N2(this, c1333Ms, c2w2));
            this.A02.addView(c1333Ms, layoutParams);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1329Mo
    public final boolean A0P() {
        return true;
    }
}
