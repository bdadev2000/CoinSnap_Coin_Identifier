package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Th, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0938Th extends AbstractC0789No {
    public static byte[] A0I;
    public static String[] A0J = {"ZYFZvgakVe", "Z9juamcNffZ", "L6NhnuluGVbfOuIZp07EBLc1k7rVfOba", "poGipFcmqzgO1AN9d1VwktKUuwbeuE2x", "1MA0bi3k", "zUZ", "l0mlyabDLiJh1QvHe0VixDkOpEP8aZzg", "KStQaqdBmF0CfboN9Wjc4"};
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C1N A06;
    public C1P A07;
    public C1Q A08;
    public O5 A09;
    public boolean A0A;
    public boolean A0B;
    public final LinearLayout A0C;
    public final RelativeLayout A0D;
    public final RelativeLayout A0E;
    public final TextView A0F;
    public final C1070Yn A0G;
    public final boolean A0H;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 99);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A04() {
        this.A0D.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = A0N;
        this.A0D.setLayoutParams(layoutParams);
        AbstractC0737Lo.A0K(this.A0D);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(super.A00, super.A00);
        layoutParams2.addRule(15);
        layoutParams2.addRule(9);
        this.A0D.addView(super.A05, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        int i10 = A0O;
        layoutParams3.leftMargin = i10;
        layoutParams3.addRule(1, super.A05.getId());
        layoutParams3.addRule(15);
        this.A0D.addView(this.A0E, layoutParams3);
        this.A0E.removeAllViews();
        AbstractC0737Lo.A0K(this.A05);
        this.A05.setLayoutParams(AbstractC0789No.A08);
        this.A05.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        AbstractC0737Lo.A0X(this.A05, true, 18);
        this.A0E.addView(this.A05);
        this.A02.setOrientation(0);
        this.A02.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0P);
        layoutParams4.topMargin = i10 / 2;
        layoutParams4.addRule(3, this.A05.getId());
        this.A0E.addView(this.A02, layoutParams4);
        this.A02.removeAllViews();
        this.A09.setGravity(16);
        this.A02.addView(this.A09, new LinearLayout.LayoutParams(-2, -1));
        this.A04.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        this.A04.setGravity(16);
        this.A04.setIncludeFontPadding(false);
        AbstractC0737Lo.A0X(this.A04, false, 14);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams5.leftMargin = i10;
        this.A02.addView(this.A04, layoutParams5);
    }

    public static void A08() {
        A0I = new byte[]{-111, -20};
    }

    static {
        A08();
        A0Q = AbstractC02862p.A01(-1, 77);
        A0N = (int) (LD.A02 * 12.0f);
        A0O = (int) (LD.A02 * 8.0f);
        A0K = (int) (LD.A02 * 26.0f);
        A0M = (int) (LD.A02 * 144.0f);
        A0L = (int) (LD.A02 * 48.0f);
        A0P = (int) (LD.A02 * 16.0f);
        A0R = (int) (LD.A02 * 14.0f);
    }

    public C0938Th(C1070Yn c1070Yn, int i10, boolean z10, C1P c1p, boolean z11, String str, J2 j22, MC mc2, RE re2, C0729Lg c0729Lg, C1U c1u) {
        super(c1070Yn, i10, c1p, z11, str, j22, mc2, re2, c0729Lg, c1u);
        this.A0B = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0G = c1070Yn;
        super.A05.setFullCircleCorners(z10);
        int i11 = A0N;
        setPadding(i11, i11, i11, A0K);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A0D = relativeLayout;
        this.A05 = new TextView(getContext());
        this.A02 = new LinearLayout(getContext());
        this.A09 = new O5(c1070Yn, A0R, 5, A0Q, -1);
        this.A0E = new RelativeLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A0C = linearLayout;
        this.A04 = new TextView(getContext());
        this.A03 = new TextView(getContext());
        super.A02.addView(relativeLayout);
        super.A02.addView(linearLayout);
        this.A0F = new TextView(getContext());
        this.A07 = c1p;
        this.A0H = C0659Ih.A0y(c1070Yn);
        AbstractC0737Lo.A0R(this, c1070Yn);
        this.A0A = C0659Ih.A24(c1070Yn);
        A06();
    }

    private void A02() {
        super.A04.setPadding(0, 0, 0, 0);
        super.A04.setLayoutParams(new LinearLayout.LayoutParams(-1, A0L));
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams;
        this.A0C.setOrientation(1);
        this.A0C.setPadding(0, 0, 0, A0N);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A0D.getId());
        this.A0C.setLayoutParams(layoutParams2);
        this.A0C.removeAllViews();
        this.A03.setMaxLines(2);
        this.A03.setEllipsize(TextUtils.TruncateAt.END);
        this.A03.setGravity(16);
        this.A03.setTextColor(this.A0A ? this.A07.A05(true) : -1);
        if (A0J[3].charAt(12) != '1') {
            throw new RuntimeException();
        }
        A0J[3] = "GrwjTtxURhrO1EQl6RsuguGKXpAC8Gmx";
        AbstractC0737Lo.A0X(this.A03, false, 16);
        if (this.A0H) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        LinearLayout linearLayout = this.A0C;
        String[] strArr = A0J;
        if (strArr[2].charAt(17) != strArr[6].charAt(17)) {
            throw new RuntimeException();
        }
        A0J[1] = "ewlwa2SJNlK21mEN5Hlfw30tD2ecrw";
        linearLayout.addView(this.A03, layoutParams);
    }

    private void A05() {
        LinearLayout.LayoutParams layoutParams;
        this.A0F.setMaxLines(1);
        this.A0F.setEllipsize(TextUtils.TruncateAt.END);
        this.A0F.setGravity(17);
        this.A0F.setTextColor(this.A0A ? this.A07.A06(true) : -1);
        this.A0F.setAllCaps(true);
        AbstractC0737Lo.A0X(this.A0F, false, 12);
        new LinearLayout.LayoutParams(-1, -2);
        if (this.A0H) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.topMargin = A0N;
        this.A0F.setLayoutParams(layoutParams);
    }

    private void A06() {
        removeAllViews();
        super.A02.setLayoutParams(AbstractC0789No.A08);
        A04();
        A03();
        A02();
        A05();
        A07();
        AbstractC0737Lo.A0J(super.A02);
        AbstractC0737Lo.A0J(super.A04);
        AbstractC0737Lo.A0J(this.A0F);
        addView(super.A02);
        addView(super.A04);
        addView(this.A0F);
    }

    private void A07() {
        C1N c1n = this.A06;
        if (c1n == null) {
            return;
        }
        this.A05.setText(c1n.A06());
        this.A03.setText(this.A06.A01());
        this.A0F.setText(this.A06.A04());
        if (TextUtils.isEmpty(this.A08.A04())) {
            AbstractC0737Lo.A0H(super.A04);
        }
        if (TextUtils.isEmpty(this.A06.A04())) {
            AbstractC0737Lo.A0H(this.A0F);
        }
        if (TextUtils.isEmpty(this.A06.A03())) {
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setVisibility(0);
        O5 o52 = this.A09;
        String A03 = this.A06.A03();
        if (A0J[0].length() == 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[2] = "VSVKlO90K15ihGB4A0qZPRqEppX5OU7U";
        strArr[6] = "xs76xd0mQfWREabMq0mbrfEp6FCRmbTD";
        o52.setRating(Float.parseFloat(A03));
        if (this.A06.A02() == null) {
            return;
        }
        this.A04.setText(A01(0, 1, 6) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A06.A02())) + A01(1, 1, 96));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0789No
    public final void A09() {
        super.A09();
        this.A09.setOnClickListener(super.A01);
        this.A0F.setOnClickListener(super.A01);
        this.A04.setOnClickListener(super.A01);
        this.A03.setOnClickListener(super.A01);
        this.A05.setOnClickListener(super.A01);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0789No
    public final void A0A(int i10) {
        boolean z10 = i10 == 1;
        setOrientation(z10 ? 1 : 0);
        if (!z10) {
            setWeightSum(5.0f);
            LinearLayout.LayoutParams auxContainerParams = new LinearLayout.LayoutParams(0, -2);
            auxContainerParams.weight = 4.0f;
            int i11 = A0K;
            auxContainerParams.bottomMargin = i11 - A0N;
            super.A02.setLayoutParams(auxContainerParams);
            LinearLayout.LayoutParams auxContainerParams2 = new LinearLayout.LayoutParams(0, A0L);
            auxContainerParams2.bottomMargin = i11 / 2;
            auxContainerParams2.weight = 1.0f;
            auxContainerParams2.gravity = 80;
            super.A04.setLayoutParams(auxContainerParams2);
            super.A04.setMinWidth(A0M);
            AbstractC0737Lo.A0J(this.A0F);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = A0O;
            this.A0C.addView(this.A0F, layoutParams);
            this.A0C.setPadding(0, 0, 0, 0);
            this.A0F.setGravity(3);
        } else {
            A06();
        }
        bringToFront();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0789No
    public final View getExpandableLayout() {
        return this.A0C;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.A00 == 0) {
            this.A00 = this.A03.getHeight();
            this.A01 = this.A0F.getHeight();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0789No
    public void setInfo(C1N c1n, C1Q c1q, String str, String str2, InterfaceC0791Nq interfaceC0791Nq) {
        super.setInfo(c1n, c1q, str, str2, interfaceC0791Nq);
        this.A06 = c1n;
        this.A08 = c1q;
        A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC0789No
    public void setTitleMaxLines(int i10) {
        this.A05.setMaxLines(i10);
        this.A05.setEllipsize(TextUtils.TruncateAt.END);
    }
}
