package com.facebook.ads.redexgen.uinode;

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

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 69);
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
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        A06 = f10;
        A08 = (int) (6.0f * f10);
        A07 = (int) (f10 * 8.0f);
    }

    public O9(C1070Yn c1070Yn, C1P c1p, boolean z10, int i10, int i11, int i12) {
        super(c1070Yn);
        setOrientation(1);
        TextView textView = new TextView(c1070Yn);
        this.A02 = textView;
        AbstractC0737Lo.A0X(textView, true, i10);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i13 = A08;
        textView.setLineSpacing(i13, 1.0f);
        TextView textView2 = new TextView(c1070Yn);
        this.A01 = textView2;
        TextView textView3 = new TextView(c1070Yn);
        this.A00 = textView3;
        AbstractC0737Lo.A0X(textView3, false, i11);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setLineSpacing(i13, 1.0f);
        boolean A0y = C0659Ih.A0y(c1070Yn);
        this.A03 = A0y;
        int i14 = A0y ? -2 : -1;
        ViewGroup.LayoutParams titleParams = new LinearLayout.LayoutParams(i14, -2);
        addView(textView, titleParams);
        ViewGroup.LayoutParams titleParams2 = new LinearLayout.LayoutParams(i14, -2);
        addView(textView2, titleParams2);
        textView2.setVisibility(8);
        A02(c1p, z10);
        LinearLayout.LayoutParams titleParams3 = new LinearLayout.LayoutParams(i14, -2);
        titleParams3.setMargins(0, i12, 0, 0);
        addView(textView3, titleParams3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public O9(com.facebook.ads.redexgen.uinode.C1070Yn r8, com.facebook.ads.redexgen.uinode.C1P r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r11 == 0) goto L19
            r4 = 18
        L4:
            if (r11 == 0) goto L16
            r5 = 14
        L8:
            int r6 = com.facebook.ads.redexgen.uinode.O9.A07
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.O9.<init>(com.facebook.ads.redexgen.X.Yn, com.facebook.ads.redexgen.X.1P, boolean, boolean, boolean):void");
    }

    public final void A02(C1P c1p, boolean z10) {
        this.A02.setTextColor(c1p.A06(z10));
        this.A01.setTextColor(c1p.A04(z10));
        this.A00.setTextColor(c1p.A05(z10));
    }

    public final void A03(String str, String str2, String str3, boolean z10, boolean z11) {
        boolean z12 = !TextUtils.isEmpty(str);
        boolean z13 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z12) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z12) {
            str2 = A00(0, 0, 28);
        }
        textView2.setText(str2);
        if (A05[4].charAt(18) != 'y') {
            throw new RuntimeException();
        }
        A05[4] = "cGsHRNQKRzUTXMDBZCyzngEN4Bg1pclE";
        int i10 = 3;
        if (!z12 || !z13) {
            TextView textView3 = this.A02;
            if (z10) {
                i10 = 2;
            } else if (z11) {
                i10 = 4;
            }
            textView3.setMaxLines(i10);
            return;
        }
        this.A02.setMaxLines(z10 ? 1 : 2);
        this.A00.setMaxLines(z10 ? 1 : z11 ? 3 : 2);
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i10) {
        if (this.A03) {
            setGravity(i10);
        }
        this.A02.setGravity(i10);
        this.A00.setGravity(i10);
    }

    public void setCTAClickListener(ViewOnClickListenerC0942Tl viewOnClickListenerC0942Tl) {
        OH A03 = OI.A03(viewOnClickListenerC0942Tl, A00(0, 9, 57));
        this.A02.setOnClickListener(A03);
        this.A00.setOnClickListener(A03);
        this.A01.setOnClickListener(A03);
    }

    public void setDescriptionVisibility(int i10) {
        this.A00.setVisibility(i10);
    }
}
