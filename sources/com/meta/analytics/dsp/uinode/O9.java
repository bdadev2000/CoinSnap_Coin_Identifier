package com.meta.analytics.dsp.uinode;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class O9 extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"lF8IVPZcS3mZAefsIaNZ6E9xMmjOqdH7", "idkW2", "HbWJiF6R60B06srsOI5ot4Pv3KsUxfPN", "7f3O1w3Qg3dv0DYXPvEPDd2nNc", "nnNATfNTHr6hSEkqMWy2MP3i9vksRg0T", "pai30RxYeYeDatKriEp6xPPXjxDmZE6E", "MhBAxeK5XElhMNsb", "N4hTYih9SgQSzhMEA04rsaAJRIerHLwS"};
    public static final float A06;
    public static final int A07;
    public static final int A08;
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final boolean A03;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 69);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A05[4].charAt(18) != 'y') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[7] = "1IRXFHeJ8iEaedLhZkECOAxJLr3083z4";
        strArr[2] = "dqFSPFlearJtxV8PFi6iCQhpIdVpxh77";
        A04 = new byte[]{-33, -30, -30, -29, -14, -33, -25, -22, -15};
    }

    static {
        A01();
        float f9 = Resources.getSystem().getDisplayMetrics().density;
        A06 = f9;
        A08 = (int) (6.0f * f9);
        A07 = (int) (f9 * 8.0f);
    }

    public O9(C1636Yn c1636Yn, C1P c1p, boolean z8, int i9, int i10, int i11) {
        super(c1636Yn);
        setOrientation(1);
        TextView textView = new TextView(c1636Yn);
        this.A02 = textView;
        AbstractC1303Lo.A0X(textView, true, i9);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i12 = A08;
        textView.setLineSpacing(i12, 1.0f);
        TextView textView2 = new TextView(c1636Yn);
        this.A01 = textView2;
        TextView textView3 = new TextView(c1636Yn);
        this.A00 = textView3;
        AbstractC1303Lo.A0X(textView3, false, i10);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setLineSpacing(i12, 1.0f);
        boolean A0y = C1225Ih.A0y(c1636Yn);
        this.A03 = A0y;
        int i13 = A0y ? -2 : -1;
        ViewGroup.LayoutParams titleParams = new LinearLayout.LayoutParams(i13, -2);
        addView(textView, titleParams);
        ViewGroup.LayoutParams titleParams2 = new LinearLayout.LayoutParams(i13, -2);
        addView(textView2, titleParams2);
        textView2.setVisibility(8);
        A02(c1p, z8);
        LinearLayout.LayoutParams titleParams3 = new LinearLayout.LayoutParams(i13, -2);
        titleParams3.setMargins(0, i11, 0, 0);
        addView(textView3, titleParams3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public O9(com.meta.analytics.dsp.uinode.C1636Yn r8, com.meta.analytics.dsp.uinode.C1P r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r11 == 0) goto L19
            r4 = 18
        L4:
            if (r11 == 0) goto L16
            r5 = 14
        L8:
            int r6 = com.meta.analytics.dsp.uinode.O9.A07
            if (r12 == 0) goto Le
            int r6 = r6 / 2
        Le:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L16:
            r5 = 16
            goto L8
        L19:
            r4 = 22
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.O9.<init>(com.facebook.ads.redexgen.X.Yn, com.facebook.ads.redexgen.X.1P, boolean, boolean, boolean):void");
    }

    public final void A02(C1P c1p, boolean z8) {
        this.A02.setTextColor(c1p.A06(z8));
        this.A01.setTextColor(c1p.A04(z8));
        this.A00.setTextColor(c1p.A05(z8));
    }

    public final void A03(String str, String str2, String str3, boolean z8, boolean z9) {
        boolean z10 = !TextUtils.isEmpty(str);
        boolean z11 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z10) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z10) {
            str2 = A00(0, 0, 28);
        }
        textView2.setText(str2);
        if (A05[4].charAt(18) != 'y') {
            throw new RuntimeException();
        }
        A05[4] = "cGsHRNQKRzUTXMDBZCyzngEN4Bg1pclE";
        int i9 = 3;
        if (!z10 || !z11) {
            TextView textView3 = this.A02;
            if (z8) {
                i9 = 2;
            } else if (z9) {
                i9 = 4;
            }
            textView3.setMaxLines(i9);
            return;
        }
        this.A02.setMaxLines(z8 ? 1 : 2);
        this.A00.setMaxLines(z8 ? 1 : z9 ? 3 : 2);
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i9) {
        if (this.A03) {
            setGravity(i9);
        }
        this.A02.setGravity(i9);
        this.A00.setGravity(i9);
    }

    public void setCTAClickListener(ViewOnClickListenerC1508Tl viewOnClickListenerC1508Tl) {
        OH A03 = OI.A03(viewOnClickListenerC1508Tl, A00(0, 9, 57));
        this.A02.setOnClickListener(A03);
        this.A00.setOnClickListener(A03);
        this.A01.setOnClickListener(A03);
    }

    public void setDescriptionVisibility(int i9) {
        this.A00.setVisibility(i9);
    }
}
