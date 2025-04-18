package com.facebook.ads.redexgen.uinode;

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
public final class C0815Oo extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC0942Tl A02;
    public static final int A05 = (int) (LD.A02 * 36.0f);
    public static final int A06 = (int) (LD.A02 * 36.0f);
    public static final int A03 = (int) (LD.A02 * 23.0f);
    public static final int A04 = (int) (LD.A02 * 3.0f);
    public static final int A07 = (int) (LD.A02 * 4.0f);

    public C0815Oo(C1070Yn c1070Yn, AbstractC1173b5 abstractC1173b5, J2 j22, MC mc2, RE re2, C0729Lg c0729Lg, C1P c1p, InterfaceC0791Nq interfaceC0791Nq) {
        super(c1070Yn);
        this.A00 = c1p.A08(true);
        RelativeLayout relativeLayout = new RelativeLayout(c1070Yn);
        this.A01 = relativeLayout;
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setClickable(false);
        A01(c1070Yn, abstractC1173b5.A0x().A0F().A04());
        ViewOnClickListenerC0942Tl viewOnClickListenerC0942Tl = new ViewOnClickListenerC0942Tl(c1070Yn, abstractC1173b5.A0L(), null, j22, mc2, re2, c0729Lg, abstractC1173b5.A0y());
        this.A02 = viewOnClickListenerC0942Tl;
        viewOnClickListenerC0942Tl.setCta(abstractC1173b5.A0x().A0F(), abstractC1173b5.A12(), new HashMap(), interfaceC0791Nq);
        viewOnClickListenerC0942Tl.setIsInAppBrowser(true);
        addView(viewOnClickListenerC0942Tl, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(C1070Yn c1070Yn, View view) {
        ImageView imageView = new ImageView(c1070Yn);
        imageView.setImageBitmap(AbstractC0746Lx.A01(EnumC0745Lw.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i10 = A03;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        int i11 = A04;
        imageView.setPadding(i11, i11, i11, i11);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1070Yn c1070Yn, String str) {
        Button button = new Button(c1070Yn);
        AbstractC0737Lo.A0K(button);
        int i10 = A06;
        button.setPadding(i10, 0, i10, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        AbstractC0737Lo.A0O(button, this.A00, A07);
        button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1070Yn, button);
    }

    public final void A02(String str) {
        this.A02.A09(str);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC1173b5 abstractC1173b5, MB mb2) {
        this.A02.A0A(abstractC1173b5, mb2);
    }
}
