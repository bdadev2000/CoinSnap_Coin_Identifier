package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Mn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1328Mn extends RelativeLayout {
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public final int A00;
    public final int A01;
    public final C2S A02;
    public final C1636Yn A03;
    public final InterfaceC1331Mq A04;
    public final boolean A05;

    static {
        int i9 = (int) (LD.A02 * 16.0f);
        A09 = i9;
        A0A = (int) (LD.A02 * 8.0f);
        A0D = (int) (LD.A02 * 44.0f);
        int i10 = (int) (LD.A02 * 10.0f);
        A08 = i10;
        A07 = i9 - i10;
        A0E = (int) (LD.A02 * 75.0f);
        A0B = (int) (LD.A02 * 25.0f);
        A0F = (int) (LD.A02 * 45.0f);
        A0C = (int) (LD.A02 * 15.0f);
        A06 = (int) (LD.A02 * 16.0f);
    }

    public C1328Mn(C1327Mm c1327Mm) {
        super(C1327Mm.A01(c1327Mm));
        C1636Yn A01 = C1327Mm.A01(c1327Mm);
        this.A03 = A01;
        this.A02 = C2T.A00(A01.A01());
        this.A04 = C1327Mm.A03(c1327Mm);
        this.A01 = C1327Mm.A09(c1327Mm) ? A0E : A0F;
        this.A00 = C1327Mm.A09(c1327Mm) ? A0B : A0C;
        this.A05 = C1327Mm.A0A(c1327Mm);
        setFocusable(true);
        View A012 = A01(c1327Mm);
        View A00 = A00(c1327Mm);
        View footerView = getFooterView();
        AbstractC1303Lo.A0K(A012);
        AbstractC1303Lo.A0K(A00);
        AbstractC1303Lo.A0K(footerView);
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(10);
        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(-1, -1);
        headerParams.addRule(13);
        headerParams.addRule(3, A012.getId());
        headerParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i9 = A09;
        layoutParams.setMargins(i9, 0, i9, i9);
        addView(A012, footerParams);
        addView(A00, headerParams);
        addView(footerView, layoutParams);
        footerView.setVisibility(C1327Mm.A0B(c1327Mm) ? 0 : 8);
    }

    public /* synthetic */ C1328Mn(C1327Mm c1327Mm, ViewOnClickListenerC1325Mk viewOnClickListenerC1325Mk) {
        this(c1327Mm);
    }

    private View A00(C1327Mm c1327Mm) {
        ImageView imageView = new ImageView(getContext());
        int i9 = this.A00;
        imageView.setPadding(i9, i9, i9, i9);
        imageView.setImageBitmap(AbstractC1312Lx.A01(C1327Mm.A02(c1327Mm)));
        imageView.setColorFilter(-1);
        int i10 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(C1327Mm.A00(c1327Mm));
        AbstractC1303Lo.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i11 = A09;
        layoutParams.setMargins(i11, 0, i11, i11);
        TextView textView = new TextView(getContext());
        AbstractC1303Lo.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(C1327Mm.A04(c1327Mm));
        textView.setGravity(17);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(-1, -2);
        iconParams.setMargins(i11, 0, i11, i11);
        TextView textView2 = new TextView(getContext());
        AbstractC1303Lo.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(C1327Mm.A05(c1327Mm));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i11, 0, i11, i11);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, iconParams);
        linearLayout.addView(textView2, layoutParams2);
        if (C1327Mm.A08(c1327Mm)) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(C1327Mm.A06(c1327Mm))) {
                O3 o3 = new O3(this.A03);
                int i12 = A0F;
                LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(i12, i12);
                subtitleParams.setMargins(0, 0, A0A, 0);
                o3.setFullCircleCorners(true);
                new AsyncTaskC1513Tq(o3, this.A03).A05(i12, i12).A07(C1327Mm.A06(c1327Mm));
                linearLayout2.addView(o3, subtitleParams);
            }
            C1333Ms c1333Ms = new C1333Ms(this.A03);
            c1333Ms.setData(C1327Mm.A07(c1327Mm), EnumC1311Lw.CHECKMARK);
            c1333Ms.setSelected(true);
            linearLayout2.addView(c1333Ms, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C1327Mm c1327Mm) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (C1327Mm.A0C(c1327Mm)) {
            ImageView imageView = new ImageView(getContext());
            int i9 = A08;
            imageView.setPadding(i9, i9, i9, i9);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(AbstractC1312Lx.A01(EnumC1311Lw.CROSS));
            imageView.setOnClickListener(new ViewOnClickListenerC1325Mk(this));
            int i10 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
            int i11 = A07;
            layoutParams.setMargins(i11, i11, i11, i11);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(AbstractC1312Lx.A01(EnumC1311Lw.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i9 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i9, i9);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        AbstractC1303Lo.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i10 = A0A;
        managePrefsText.setPadding(i10, i10, i10, i10);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC1326Ml(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
