package com.meta.analytics.dsp.uinode;

import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public final class O5 extends LinearLayout {
    public static final int A06 = (int) (LD.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1636Yn A04;
    public final O6[] A05;

    public O5(C1636Yn c1636Yn, int i9, int i10, int i11, int i12) {
        super(c1636Yn);
        this.A00 = A06;
        this.A04 = c1636Yn;
        setOrientation(0);
        this.A03 = i9;
        this.A01 = i11;
        this.A02 = i12;
        this.A05 = new O6[i10];
        for (int i13 = 0; i13 < i10; i13++) {
            this.A05[i13] = A00();
            addView(this.A05[i13]);
        }
        A01();
    }

    private O6 A00() {
        O6 o62 = new O6(this.A04, this.A01, this.A02);
        int i9 = this.A03;
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(i9, i9);
        starRatingViewParams.gravity = 16;
        o62.setLayoutParams(starRatingViewParams);
        return o62;
    }

    private void A01() {
        int i9 = 0;
        while (true) {
            O6[] o6Arr = this.A05;
            int i10 = o6Arr.length;
            if (i9 < i10) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) o6Arr[i9].getLayoutParams();
                int i11 = i9 == 0 ? 0 : this.A00;
                layoutParams.leftMargin = i11;
                i9++;
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(float r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.O6[] r0 = r3.A05
            int r0 = r0.length
            if (r2 >= r0) goto L1f
            float r0 = (float) r2
            float r1 = r4 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r0, r1)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L15
            r1 = 0
        L15:
            com.facebook.ads.redexgen.X.O6[] r0 = r3.A05
            r0 = r0[r2]
            r0.setFillRatio(r1)
            int r2 = r2 + 1
            goto L1
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.O5.A02(float):void");
    }

    public void setItemSpacing(int i9) {
        this.A00 = i9;
        A01();
    }

    public void setRating(float f9) {
        A02(f9);
    }
}
