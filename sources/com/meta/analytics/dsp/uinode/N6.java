package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class N6 extends LinearLayout {
    public static final int A03 = (int) (LD.A02 * 40.0f);
    public static final int A04 = (int) (LD.A02 * 20.0f);
    public static final int A05 = (int) (LD.A02 * 10.0f);
    public final C2W A00;
    public final C1636Yn A01;
    public final InterfaceC1331Mq A02;

    public N6(C1636Yn c1636Yn, C2W c2w, InterfaceC1331Mq interfaceC1331Mq, EnumC1311Lw enumC1311Lw) {
        this(c1636Yn, c2w, interfaceC1331Mq, null, enumC1311Lw);
    }

    public N6(C1636Yn c1636Yn, C2W c2w, InterfaceC1331Mq interfaceC1331Mq, String str, EnumC1311Lw enumC1311Lw) {
        super(c1636Yn);
        this.A01 = c1636Yn;
        this.A00 = c2w;
        this.A02 = interfaceC1331Mq;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View A01 = A01(str);
            A01.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            AbstractC1303Lo.A0M(view, -10459280);
            addView(A01, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(c2w.A03())) {
            View A00 = A00(enumC1311Lw, c2w.A03());
            int i9 = A05;
            A00.setPadding(0, i9, 0, i9);
            addView(A00, layoutParams);
        }
        NC A032 = A03();
        A032.setPadding(0, A05, 0, 0);
        addView(A032, layoutParams);
    }

    private View A00(EnumC1311Lw enumC1311Lw, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i9 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i9, i9);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(AbstractC1312Lx.A01(enumC1311Lw));
        TextView textView = new TextView(getContext());
        AbstractC1303Lo.A0X(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(AbstractC1312Lx.A01(EnumC1311Lw.BACK_ARROW));
        int i9 = A05;
        imageView.setPadding(0, i9, i9 * 2, i9);
        int i10 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        imageView.setOnClickListener(new N4(this));
        TextView titleView = new TextView(getContext());
        titleView.setGravity(17);
        titleView.setText(str);
        AbstractC1303Lo.A0X(titleView, true, 16);
        titleView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, i10, 0);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(titleView, layoutParams2);
        return linearLayout;
    }

    private NC A03() {
        NC nc = new NC(this.A01);
        for (C2W c2w : this.A00.A05()) {
            C1333Ms c1333Ms = new C1333Ms(this.A01);
            c1333Ms.setData(c2w.A04(), null);
            c1333Ms.setOnClickListener(new N5(this, c1333Ms, c2w));
            nc.addView(c1333Ms);
        }
        return nc;
    }
}
