package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Po, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1407Po extends LinearLayout {
    public static final int A04 = (int) (LD.A02 * 32.0f);
    public static final int A05 = (int) (LD.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public O3 A02;
    public final C1636Yn A03;

    public C1407Po(C1636Yn c1636Yn) {
        super(c1636Yn);
        this.A03 = c1636Yn;
        A00(c1636Yn);
    }

    private final void A00(C1636Yn c1636Yn) {
        setGravity(16);
        O3 o3 = new O3(c1636Yn);
        this.A02 = o3;
        o3.setFullCircleCorners(true);
        int i9 = A04;
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(i9, i9);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c1636Yn);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c1636Yn);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        AbstractC1303Lo.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        TextView textView = new TextView(c1636Yn);
        this.A01 = textView;
        AbstractC1303Lo.A0X(textView, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i9, int i10) {
        this.A00.setTextColor(i9);
        this.A01.setTextColor(i10);
    }

    public void setPageDetails(C08111a c08111a) {
        AsyncTaskC1513Tq asyncTaskC1513Tq = new AsyncTaskC1513Tq(this.A02, this.A03);
        int i9 = A04;
        asyncTaskC1513Tq.A05(i9, i9);
        asyncTaskC1513Tq.A07(c08111a.A01());
        this.A00.setText(c08111a.A02());
        this.A01.setText(c08111a.A03());
    }
}
