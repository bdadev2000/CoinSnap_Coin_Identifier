package com.instagram.common.viewpoint.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class PD extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC0909Ui A02;
    public static final int A05 = (int) (LP.A02 * 36.0f);
    public static final int A06 = (int) (LP.A02 * 36.0f);
    public static final int A03 = (int) (LP.A02 * 23.0f);
    public static final int A04 = (int) (LP.A02 * 3.0f);
    public static final int A07 = (int) (LP.A02 * 4.0f);

    public PD(C1045Zs c1045Zs, AbstractC1187cD abstractC1187cD, J7 j7, MR mr, C0833Rk c0833Rk, C0688Lv c0688Lv, C1O c1o, OG og) {
        super(c1045Zs);
        this.A00 = c1o.A08(true);
        this.A01 = new RelativeLayout(c1045Zs);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1045Zs, abstractC1187cD.A1P().A0G().A04());
        this.A02 = new ViewOnClickListenerC0909Ui(c1045Zs, abstractC1187cD.A0Y(), (C1O) null, j7, mr, c0833Rk, c0688Lv, abstractC1187cD.A1Q());
        this.A02.setCta(abstractC1187cD.A1P().A0G(), abstractC1187cD.A1U(), new HashMap(), og);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C1045Zs c1045Zs, View view) {
        ImageView imageView = new ImageView(c1045Zs);
        imageView.setImageBitmap(MC.A01(MB.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1045Zs c1045Zs, String str) {
        Button button = new Button(c1045Zs);
        M3.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        M3.A0O(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1045Zs, button);
    }

    public final void A02(String str) {
        this.A02.A09(str);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC1187cD abstractC1187cD, MQ mq) {
        this.A02.A0A(abstractC1187cD, mq);
    }
}
