package com.meta.analytics.dsp.uinode;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Oo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1381Oo extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC1508Tl A02;
    public static final int A05 = (int) (LD.A02 * 36.0f);
    public static final int A06 = (int) (LD.A02 * 36.0f);
    public static final int A03 = (int) (LD.A02 * 23.0f);
    public static final int A04 = (int) (LD.A02 * 3.0f);
    public static final int A07 = (int) (LD.A02 * 4.0f);

    public C1381Oo(C1636Yn c1636Yn, AbstractC1739b5 abstractC1739b5, J2 j22, MC mc, RE re, C1295Lg c1295Lg, C1P c1p, InterfaceC1357Nq interfaceC1357Nq) {
        super(c1636Yn);
        this.A00 = c1p.A08(true);
        RelativeLayout relativeLayout = new RelativeLayout(c1636Yn);
        this.A01 = relativeLayout;
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setClickable(false);
        A01(c1636Yn, abstractC1739b5.A0x().A0F().A04());
        ViewOnClickListenerC1508Tl viewOnClickListenerC1508Tl = new ViewOnClickListenerC1508Tl(c1636Yn, abstractC1739b5.A0L(), null, j22, mc, re, c1295Lg, abstractC1739b5.A0y());
        this.A02 = viewOnClickListenerC1508Tl;
        viewOnClickListenerC1508Tl.setCta(abstractC1739b5.A0x().A0F(), abstractC1739b5.A12(), new HashMap(), interfaceC1357Nq);
        viewOnClickListenerC1508Tl.setIsInAppBrowser(true);
        addView(viewOnClickListenerC1508Tl, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(C1636Yn c1636Yn, View view) {
        ImageView imageView = new ImageView(c1636Yn);
        imageView.setImageBitmap(AbstractC1312Lx.A01(EnumC1311Lw.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i9 = A03;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i9, i9);
        int i10 = A04;
        imageView.setPadding(i10, i10, i10, i10);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1636Yn c1636Yn, String str) {
        Button button = new Button(c1636Yn);
        AbstractC1303Lo.A0K(button);
        int i9 = A06;
        button.setPadding(i9, 0, i9, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        AbstractC1303Lo.A0O(button, this.A00, A07);
        button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1636Yn, button);
    }

    public final void A02(String str) {
        this.A02.A09(str);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC1739b5 abstractC1739b5, MB mb) {
        this.A02.A0A(abstractC1739b5, mb);
    }
}
