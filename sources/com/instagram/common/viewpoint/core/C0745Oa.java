package com.instagram.common.viewpoint.core;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Oa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0745Oa extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"5HLU", "cJmhtdIbv5Y5xdwCDl3dT8HPvklAUmwI", "4stzzs6gVfUC8wPYX", "7o6tBFGKBnQKcZsvXBJ4ayd9LnRtCNJ", "BSijPHOaulEPVGa4U1fKlqwI", "TamflSlcNH2rcKEIo3f72qWopMk8DENN", "Hhh3HDuTgivrAf4KqreTZK2", "SugScFu"};
    public static final float A06;
    public static final int A07;
    public static final int A08;
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final boolean A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{31, 26, 26, 27, 10, 31, 23, 18, 13};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().density;
        A08 = (int) (A06 * 6.0f);
        A07 = (int) (A06 * 8.0f);
    }

    public C0745Oa(C1045Zs c1045Zs, C1O c1o, boolean z2, int i2, int i3, int i4) {
        super(c1045Zs);
        setOrientation(1);
        this.A02 = new TextView(c1045Zs);
        M3.A0Y(this.A02, true, i2);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setLineSpacing(A08, 1.0f);
        this.A01 = new TextView(c1045Zs);
        this.A00 = new TextView(c1045Zs);
        M3.A0Y(this.A00, false, i3);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setLineSpacing(A08, 1.0f);
        this.A03 = C0608Im.A12(c1045Zs);
        int i5 = this.A03 ? -2 : -1;
        addView(this.A02, new LinearLayout.LayoutParams(i5, -2));
        addView(this.A01, new LinearLayout.LayoutParams(i5, -2));
        this.A01.setVisibility(8);
        A02(c1o, z2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, -2);
        layoutParams.setMargins(0, i4, 0, 0);
        addView(this.A00, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0745Oa(com.instagram.common.viewpoint.core.C1045Zs r8, com.instagram.common.viewpoint.core.C1O r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r11 == 0) goto L19
            r4 = 18
        L4:
            if (r11 == 0) goto L16
            r5 = 14
        L8:
            int r6 = com.instagram.common.viewpoint.core.C0745Oa.A07
            if (r12 == 0) goto Le
            int r6 = r6 / 2
        Le:
            r0 = r7
            r3 = r10
            r2 = r9
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L16:
            r5 = 16
            goto L8
        L19:
            r4 = 22
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0745Oa.<init>(com.facebook.ads.redexgen.X.Zs, com.facebook.ads.redexgen.X.1O, boolean, boolean, boolean):void");
    }

    public final void A02(C1O c1o, boolean z2) {
        this.A02.setTextColor(c1o.A06(z2));
        this.A01.setTextColor(c1o.A04(z2));
        this.A00.setTextColor(c1o.A05(z2));
    }

    public final void A03(String str, String str2, String str3, boolean z2, boolean z3) {
        boolean z4 = !TextUtils.isEmpty(str);
        boolean z5 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z4) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z4) {
            str2 = A00(0, 0, 51);
        }
        textView2.setText(str2);
        int i2 = 3;
        String[] strArr = A05;
        if (strArr[6].length() != strArr[4].length()) {
            String[] strArr2 = A05;
            strArr2[3] = "nuTyQWYrKUsKt4wC014k9cpf4UiNlrc";
            strArr2[0] = "l7Wy";
            if (!z4 || !z5) {
                TextView textView3 = this.A02;
                if (A05[1].charAt(4) != 'F') {
                    String[] strArr3 = A05;
                    strArr3[3] = "qWmgL2iM9nfMb7yMq7CVR7HS6Guvx6S";
                    strArr3[0] = "mFhP";
                    if (z2) {
                        i2 = 2;
                    } else if (z3) {
                        i2 = 4;
                    }
                    textView3.setMaxLines(i2);
                    return;
                }
            } else {
                this.A02.setMaxLines(z2 ? 1 : 2);
                this.A00.setMaxLines(z2 ? 1 : z3 ? 3 : 2);
                return;
            }
        }
        throw new RuntimeException();
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i2) {
        if (this.A03) {
            setGravity(i2);
        }
        this.A02.setGravity(i2);
        this.A00.setGravity(i2);
    }

    public void setCTAClickListener(ViewOnClickListenerC0909Ui viewOnClickListenerC0909Ui) {
        ViewOnClickListenerC0749Oe A03 = AbstractC0750Of.A03(viewOnClickListenerC0909Ui, A00(0, 9, 20));
        this.A02.setOnClickListener(A03);
        this.A00.setOnClickListener(A03);
        this.A01.setOnClickListener(A03);
    }

    public void setDescriptionVisibility(int i2) {
        this.A00.setVisibility(i2);
    }
}
