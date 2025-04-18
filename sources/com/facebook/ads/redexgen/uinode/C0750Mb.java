package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0750Mb extends LinearLayout {
    public static String[] A07 = {"RdKbZKE5ShqjtspsYuId0BpVT", "jFs6Ox2yxsj", "", "O0DGVMIkWcl", "ZjYxtVw01iwSMNXN0b17Jtyc9gHU9Z2d", "b1LSaO6GQJOSELIr8C99", "", "wukZGaaSm"};
    public static final int A08 = (int) (LD.A02 * 15.0f);
    public static final int A09 = (int) (LD.A02 * 10.0f);
    public static final int A0A = (int) (LD.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final C1070Yn A05;
    public final C0794Nt A06;

    public C0750Mb(C1070Yn c1070Yn, int i10) {
        super(c1070Yn);
        this.A01 = false;
        this.A05 = c1070Yn;
        ImageView imageView = new ImageView(c1070Yn);
        this.A02 = imageView;
        int i11 = A09;
        imageView.setPadding(i11, i11, i11, i11);
        C0794Nt c0794Nt = new C0794Nt(c1070Yn);
        this.A06 = c0794Nt;
        c0794Nt.setProgress(0.0f);
        c0794Nt.setPadding(i11, i11, i11, i11);
        this.A04 = new TextView(c1070Yn);
        setOrientation(0);
        this.A03 = new LinearLayout(c1070Yn);
        this.A00 = i10;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i10 = A0A;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i10, i10);
        AbstractC0737Lo.A0X(this.A04, true, 16);
        this.A04.setTextColor(-1);
        this.A04.setVisibility(8);
        this.A03.addView(this.A02, layoutParams2);
        this.A03.addView(this.A06, layoutParams2);
        addView(this.A03, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A04, actionTextLayoutParams);
    }

    private void A01() {
        int i10;
        C0794Nt c0794Nt = this.A06;
        int i11 = this.A00;
        int i12 = 8;
        if (i11 == 2 || i11 == 6) {
            i10 = this.A01 ? 4 : 0;
        } else {
            i10 = 8;
        }
        c0794Nt.setVisibility(i10);
        ImageView imageView = this.A02;
        int i13 = this.A00;
        if (i13 == 5) {
            i12 = 4;
        } else if (i13 != 2 && i13 != 6) {
            i12 = 0;
        }
        imageView.setVisibility(i12);
    }

    public final void A02(C1P c1p, boolean z10, boolean z11) {
        int A04 = c1p.A04(z10);
        C0794Nt c0794Nt = this.A06;
        int accentColor = AbstractC02862p.A01(A04, 77);
        c0794Nt.A02(accentColor, A04, 110);
        this.A02.setColorFilter(A04);
        if (z11) {
            TextView textView = this.A04;
            int accentColor2 = AbstractC02862p.A01(-1, 110);
            textView.setTextColor(accentColor2);
            return;
        }
        this.A04.setTextColor(A04);
    }

    public final boolean A03() {
        return !this.A04.getText().toString().isEmpty();
    }

    public final boolean A04() {
        int i10 = this.A00;
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i10) {
        if (i10 > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f10) {
        this.A06.setProgressWithAnimation(f10);
    }

    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A06.setOnClickListener(onClickListener);
    }

    public void setProgressImage(EnumC0745Lw enumC0745Lw) {
        this.A06.setImage(enumC0745Lw);
    }

    public void setProgressImmediate(float f10) {
        this.A06.clearAnimation();
        this.A06.setProgress(f10);
    }

    public void setProgressSpinnerInvisible(boolean z10) {
        this.A01 = z10;
        A01();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setToolbarActionMode(int r6) {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Yn r0 = r5.A05
            com.facebook.ads.redexgen.X.0S r0 = r0.A0E()
            r0.ADK(r6)
            r5.A00 = r6
            r5.A01()
            r0 = 0
            r5.setVisibility(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 < r2) goto L1f
            android.widget.ImageView r1 = r5.A02
            r0 = 255(0xff, float:3.57E-43)
            r1.setImageAlpha(r0)
        L1f:
            android.widget.ImageView r1 = r5.A02
            int r0 = com.facebook.ads.redexgen.uinode.C0750Mb.A09
            r1.setPadding(r0, r0, r0, r0)
            switch(r6) {
                case 0: goto L90;
                case 1: goto L8d;
                case 2: goto L29;
                case 3: goto L8a;
                case 4: goto L7d;
                case 5: goto L7a;
                case 6: goto L77;
                case 7: goto L47;
                default: goto L29;
            }
        L29:
            com.facebook.ads.redexgen.X.Lw r4 = com.facebook.ads.redexgen.uinode.EnumC0745Lw.CROSS
        L2b:
            android.widget.ImageView r1 = r5.A02
            android.graphics.Bitmap r0 = com.facebook.ads.redexgen.uinode.AbstractC0746Lx.A01(r4)
            r1.setImageBitmap(r0)
            r0 = 1
            if (r6 != r0) goto L3f
            r1 = 1005(0x3ed, float:1.408E-42)
            android.widget.ImageView r0 = r5.A02
            com.facebook.ads.redexgen.uinode.AbstractC0737Lo.A0G(r1, r0)
        L3e:
            return
        L3f:
            r1 = 1002(0x3ea, float:1.404E-42)
            android.widget.ImageView r0 = r5.A02
            com.facebook.ads.redexgen.uinode.AbstractC0737Lo.A0G(r1, r0)
            goto L3e
        L47:
            com.facebook.ads.redexgen.X.Lw r4 = com.facebook.ads.redexgen.uinode.EnumC0745Lw.CROSS
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L54
            android.widget.ImageView r1 = r5.A02
            r0 = 110(0x6e, float:1.54E-43)
            r1.setImageAlpha(r0)
        L54:
            android.widget.ImageView r3 = r5.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C0750Mb.A07
            r0 = 4
            r1 = r1[r0]
            r0 = 13
            char r1 = r1.charAt(r0)
            r0 = 67
            if (r1 == r0) goto L93
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0750Mb.A07
            java.lang.String r1 = ""
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = ""
            r0 = 2
            r2[r0] = r1
            int r0 = com.facebook.ads.redexgen.uinode.C0750Mb.A08
            r3.setPadding(r0, r0, r0, r0)
            goto L2b
        L77:
            com.facebook.ads.redexgen.X.Lw r4 = com.facebook.ads.redexgen.uinode.EnumC0745Lw.CROSS
            goto L2b
        L7a:
            com.facebook.ads.redexgen.X.Lw r4 = com.facebook.ads.redexgen.uinode.EnumC0745Lw.CROSS
            goto L2b
        L7d:
            com.facebook.ads.redexgen.X.Lw r4 = com.facebook.ads.redexgen.uinode.EnumC0745Lw.CROSS
            android.widget.ImageView r1 = r5.A02
            r0 = 8
            r1.setVisibility(r0)
            r5.setVisibility(r0)
            goto L2b
        L8a:
            com.facebook.ads.redexgen.X.Lw r4 = com.facebook.ads.redexgen.uinode.EnumC0745Lw.MINIMIZE_ARROW
            goto L2b
        L8d:
            com.facebook.ads.redexgen.X.Lw r4 = com.facebook.ads.redexgen.uinode.EnumC0745Lw.SKIP_ARROW
            goto L2b
        L90:
            com.facebook.ads.redexgen.X.Lw r4 = com.facebook.ads.redexgen.uinode.EnumC0745Lw.CROSS
            goto L2b
        L93:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0750Mb.setToolbarActionMode(int):void");
    }

    public void setToolbarMessage(String str) {
        this.A04.setText(str);
        this.A04.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z10) {
        this.A04.setVisibility(z10 ? 0 : 4);
    }
}
