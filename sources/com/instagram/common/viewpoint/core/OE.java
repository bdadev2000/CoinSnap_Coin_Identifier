package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public abstract class OE extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1045Zs A07;
    public final ViewOnClickListenerC0909Ui A08;
    public final OU A09;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0D(int i2);

    static {
        A01();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public OE(C1045Zs c1045Zs, int i2, C1O c1o, boolean z2, String str, J7 j7, MR mr, C0833Rk c0833Rk, C0688Lv c0688Lv, C1T c1t, boolean z3, String str2) {
        super(c1045Zs);
        this.A02 = A00(0, 0, 37);
        M3.A0K(this);
        this.A07 = c1045Zs;
        this.A04 = i2;
        this.A03 = z3;
        this.A02 = str2;
        this.A09 = new OU(c1045Zs);
        M3.A0M(this.A09, 0);
        M3.A0K(this.A09);
        if (z3) {
            this.A00 = new LinearLayout(c1045Zs);
            this.A01 = new TextView(c1045Zs);
            M3.A0K(this.A01);
        }
        this.A08 = new ViewOnClickListenerC0909Ui(c1045Zs, str, c1o, z2, j7, mr, c0833Rk, c0688Lv, c1t);
        M3.A0G(1001, this.A08);
        this.A05 = AbstractC0750Of.A03(this.A08, A00(0, 9, 52));
        this.A06 = new RelativeLayout(c1045Zs);
        this.A06.setLayoutParams(A0B);
        M3.A0K(this.A06);
    }

    public void A0C() {
        this.A09.setOnClickListener(this.A05);
    }

    public final ViewOnClickListenerC0909Ui getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(C1M c1m, C1P c1p, String str, String str2, LZ lz, OG og) {
        this.A08.setCta(c1p, str, new HashMap(), lz, og);
        new AsyncTaskC0914Un(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i2) {
    }
}
