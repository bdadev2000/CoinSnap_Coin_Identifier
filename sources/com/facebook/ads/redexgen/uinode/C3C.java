package com.facebook.ads.redexgen.uinode;

import android.util.AttributeSet;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3C extends C3P implements InterfaceC0839Pm {
    public static byte[] A07;
    public static String[] A08 = {"T7MK6mm4Fzbg8PTMnM4kcHpb21LLpIaw", "PTQtUxKdjysMmbj8hCZsGKEwd1IRWqqZ", "Zw8mt4VncD", "79VYCrnrWW", "2MnAMBnkkiKtyd2cP7mHhabJycDYuMiE", "jaMauIT7sdi", "OgIH7ZaBRtH9hoDgrnw", "xZmsCngT77DU5lblEiekqTVKPqNdsast"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MM A04;
    public boolean A05;
    public final C0496Bg A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-6, -7, -37, -20, -14, -16, -50, -13, -20, -7, -14, -16, -17};
    }

    static {
        A03();
    }

    public C3C(C1070Yn c1070Yn) {
        super(c1070Yn);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C0496Bg(c1070Yn, new C0836Pj(), new C0835Pi());
        A02();
    }

    public C3C(C1070Yn c1070Yn, AttributeSet attributeSet) {
        super(c1070Yn, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C0496Bg(c1070Yn, new C0836Pj(), new C0835Pi());
        A02();
    }

    public C3C(C1070Yn c1070Yn, AttributeSet attributeSet, int i10) {
        super(c1070Yn, attributeSet, i10);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C0496Bg(c1070Yn, new C0836Pj(), new C0835Pi());
        A02();
    }

    private int A00(int i10) {
        int i11 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i12 = (measuredWidth - spacing) - i11;
        int itemSize = getAdapter().A0E();
        int numFullItems = 0;
        int spacing2 = Integer.MAX_VALUE;
        while (spacing2 > i10) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i10;
            }
            int spacing3 = numFullItems * i11;
            spacing2 = (int) ((i12 - spacing3) / (numFullItems + 0.333f));
        }
        return spacing2;
    }

    private void A02() {
        this.A06.A2A(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        AbstractC0737Lo.A0K(this);
    }

    private void A04(int i10, int i11) {
        if (i10 == this.A03 && i11 == this.A02) {
            return;
        }
        this.A03 = i10;
        if (A08[1].charAt(11) == 'q') {
            throw new RuntimeException();
        }
        A08[6] = "hNBaptvkpj";
        this.A02 = i11;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 13, 111));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C3P
    public final void A1y(int i10, boolean z10) {
        super.A1y(i10, z10);
        A04(i10, 0);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0839Pm
    public final int A7j(int i10) {
        int abs = Math.abs(i10);
        int scrollXAbs = ((C3P) this).A06;
        if (abs <= scrollXAbs) {
            return 0;
        }
        int i11 = this.A01;
        if (i11 == 0) {
            return 1;
        }
        int scrollXAbs2 = 1 + (abs / i11);
        return scrollXAbs2;
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.C0553Eb, android.view.View
    public final void onMeasure(int i10, int i11) {
        int height;
        int itemSize;
        super.onMeasure(i10, i11);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i12 = (int) LD.A02;
            int verticalPadding = C0659Ih.A0E(getContext());
            height = (i12 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            height = Math.round(verticalPadding2 / 1.91f);
        }
        int verticalPadding3 = View.MeasureSpec.getMode(i11);
        switch (verticalPadding3) {
            case Integer.MIN_VALUE:
                int verticalPadding4 = View.MeasureSpec.getSize(i11);
                height = Math.min(verticalPadding4, height);
                break;
            case 1073741824:
                height = View.MeasureSpec.getSize(i11);
                break;
        }
        int height2 = height - paddingTop;
        if (this.A05) {
            int verticalPadding5 = MI.A09;
            itemSize = Math.min(verticalPadding5, height2);
        } else {
            itemSize = A00(height2);
        }
        int height3 = getMeasuredWidth();
        int verticalPadding6 = itemSize + paddingTop;
        setMeasuredDimension(height3, verticalPadding6);
        if (!this.A05) {
            int verticalPadding7 = this.A00;
            setChildWidth((verticalPadding7 * 2) + itemSize);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C0553Eb
    public void setAdapter(AbstractC03244c abstractC03244c) {
        this.A06.A2H(abstractC03244c == null ? -1 : abstractC03244c.hashCode());
        super.setAdapter(abstractC03244c);
    }

    public void setChildSpacing(int i10) {
        this.A00 = i10;
    }

    public void setChildWidth(int i10) {
        this.A01 = i10;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i11 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i12 = i11 - pageWidth2;
        C0496Bg c0496Bg = this.A06;
        int pageWidth3 = this.A01;
        c0496Bg.A2I((i12 - pageWidth3) / 2);
        C0496Bg c0496Bg2 = this.A06;
        int pageWidth4 = this.A01;
        c0496Bg2.A2G(pageWidth4 / measuredWidth);
    }

    public void setCurrentPosition(int i10) {
        A1y(i10, false);
    }

    public void setOnPageChangedListener(MM mm) {
        this.A04 = mm;
    }

    public void setShowTextInCarousel(boolean z10) {
        this.A05 = z10;
    }
}
