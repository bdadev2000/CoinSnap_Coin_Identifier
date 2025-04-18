package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class VO extends OE {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (LP.A02 * 36.0f);
    public static final int A05 = (int) (LP.A02 * 4.0f);
    public static final int A03 = (int) (LP.A02 * 8.0f);
    public static final int A04 = (int) (LP.A02 * 4.0f);

    public VO(C1045Zs c1045Zs, int i2, C1O c1o, boolean z2, String str, J7 j7, MR mr, C0833Rk c0833Rk, C0688Lv c0688Lv, C1T c1t) {
        super(c1045Zs, i2, c1o, z2, str, j7, mr, c0833Rk, c0688Lv, c1t, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A02(-16448251, 13, true);
        this.A00 = A02(-10131605, 12, false);
        this.A06.addView(A01(i2), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A01(int i2) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, OE.A0B);
        linearLayout.addView(this.A00, OE.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i2, i2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A02(int i2, int i3, boolean z2) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i2);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        M3.A0Y(textView, z2, i3);
        return textView;
    }

    @Override // com.instagram.common.viewpoint.core.OE
    public final void A0C() {
        super.A0C();
        this.A01.setOnClickListener(this.A05);
        this.A00.setOnClickListener(this.A05);
    }

    @Override // com.instagram.common.viewpoint.core.OE
    public final void A0D(int i2) {
    }

    @Override // com.instagram.common.viewpoint.core.OE
    public void setInfo(C1M c1m, C1P c1p, String str, String str2, LZ lz, OG og) {
        super.setInfo(c1m, c1p, str, str2, lz, og);
        this.A01.setText(c1m.A08());
        this.A00.setText(c1m.A07());
        if (TextUtils.isEmpty(c1p.A04())) {
            M3.A0H(this.A08);
        }
    }
}
