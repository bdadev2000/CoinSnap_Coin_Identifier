package com.instagram.common.viewpoint.core;

import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public final class OW extends LinearLayout {
    public static final int A06 = (int) (LP.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1045Zs A04;
    public final OX[] A05;

    public OW(C1045Zs c1045Zs, int i2, int i3, int i4, int i5) {
        super(c1045Zs);
        this.A00 = A06;
        this.A04 = c1045Zs;
        setOrientation(0);
        this.A03 = i2;
        this.A01 = i4;
        this.A02 = i5;
        this.A05 = new OX[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            this.A05[i6] = A00();
            addView(this.A05[i6]);
        }
        A01();
    }

    private OX A00() {
        OX ox = new OX(this.A04, this.A01, this.A02);
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(this.A03, this.A03);
        starRatingViewParams.gravity = 16;
        ox.setLayoutParams(starRatingViewParams);
        return ox;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01() {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.OX[] r0 = r3.A05
            int r0 = r0.length
            if (r2 >= r0) goto L1b
            com.facebook.ads.redexgen.X.OX[] r0 = r3.A05
            r0 = r0[r2]
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r2 != 0) goto L18
            r0 = 0
        L13:
            r1.leftMargin = r0
            int r2 = r2 + 1
            goto L1
        L18:
            int r0 = r3.A00
            goto L13
        L1b:
            r3.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.OW.A01():void");
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
            com.facebook.ads.redexgen.X.OX[] r0 = r3.A05
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
            com.facebook.ads.redexgen.X.OX[] r0 = r3.A05
            r0 = r0[r2]
            r0.setFillRatio(r1)
            int r2 = r2 + 1
            goto L1
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.OW.A02(float):void");
    }

    public void setItemSpacing(int i2) {
        this.A00 = i2;
        A01();
    }

    public void setRating(float f2) {
        A02(f2);
    }
}
