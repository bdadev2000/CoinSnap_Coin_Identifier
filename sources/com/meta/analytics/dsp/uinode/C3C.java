package com.meta.analytics.dsp.uinode;

import android.util.AttributeSet;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3C extends C3P implements InterfaceC1405Pm {
    public static byte[] A07;
    public static String[] A08 = {"T7MK6mm4Fzbg8PTMnM4kcHpb21LLpIaw", "PTQtUxKdjysMmbj8hCZsGKEwd1IRWqqZ", "Zw8mt4VncD", "79VYCrnrWW", "2MnAMBnkkiKtyd2cP7mHhabJycDYuMiE", "jaMauIT7sdi", "OgIH7ZaBRtH9hoDgrnw", "xZmsCngT77DU5lblEiekqTVKPqNdsast"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MM A04;
    public boolean A05;
    public final C1062Bg A06;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-6, -7, -37, -20, -14, -16, -50, -13, -20, -7, -14, -16, -17};
    }

    static {
        A03();
    }

    public C3C(C1636Yn c1636Yn) {
        super(c1636Yn);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C1062Bg(c1636Yn, new C1402Pj(), new C1401Pi());
        A02();
    }

    public C3C(C1636Yn c1636Yn, AttributeSet attributeSet) {
        super(c1636Yn, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C1062Bg(c1636Yn, new C1402Pj(), new C1401Pi());
        A02();
    }

    public C3C(C1636Yn c1636Yn, AttributeSet attributeSet, int i9) {
        super(c1636Yn, attributeSet, i9);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C1062Bg(c1636Yn, new C1402Pj(), new C1401Pi());
        A02();
    }

    private int A00(int i9) {
        int i10 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i11 = (measuredWidth - spacing) - i10;
        int itemSize = getAdapter().A0E();
        int numFullItems = 0;
        int spacing2 = Integer.MAX_VALUE;
        while (spacing2 > i9) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i9;
            }
            int spacing3 = numFullItems * i10;
            spacing2 = (int) ((i11 - spacing3) / (numFullItems + 0.333f));
        }
        return spacing2;
    }

    private void A02() {
        this.A06.A2A(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        AbstractC1303Lo.A0K(this);
    }

    private void A04(int i9, int i10) {
        if (i9 == this.A03 && i10 == this.A02) {
            return;
        }
        this.A03 = i9;
        if (A08[1].charAt(11) == 'q') {
            throw new RuntimeException();
        }
        A08[6] = "hNBaptvkpj";
        this.A02 = i10;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 13, 111));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C3P
    public final void A1y(int i9, boolean z8) {
        super.A1y(i9, z8);
        A04(i9, 0);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1405Pm
    public final int A7j(int i9) {
        int abs = Math.abs(i9);
        int scrollXAbs = ((C3P) this).A06;
        if (abs <= scrollXAbs) {
            return 0;
        }
        int i10 = this.A01;
        if (i10 == 0) {
            return 1;
        }
        int scrollXAbs2 = 1 + (abs / i10);
        return scrollXAbs2;
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.C1119Eb, android.view.View
    public final void onMeasure(int i9, int i10) {
        int height;
        int itemSize;
        super.onMeasure(i9, i10);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i11 = (int) LD.A02;
            int verticalPadding = C1225Ih.A0E(getContext());
            height = (i11 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            height = Math.round(verticalPadding2 / 1.91f);
        }
        int verticalPadding3 = View.MeasureSpec.getMode(i10);
        switch (verticalPadding3) {
            case Integer.MIN_VALUE:
                int verticalPadding4 = View.MeasureSpec.getSize(i10);
                height = Math.min(verticalPadding4, height);
                break;
            case 1073741824:
                height = View.MeasureSpec.getSize(i10);
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

    @Override // com.meta.analytics.dsp.uinode.C1119Eb
    public void setAdapter(AbstractC08904c abstractC08904c) {
        this.A06.A2H(abstractC08904c == null ? -1 : abstractC08904c.hashCode());
        super.setAdapter(abstractC08904c);
    }

    public void setChildSpacing(int i9) {
        this.A00 = i9;
    }

    public void setChildWidth(int i9) {
        this.A01 = i9;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i10 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i11 = i10 - pageWidth2;
        C1062Bg c1062Bg = this.A06;
        int pageWidth3 = this.A01;
        c1062Bg.A2I((i11 - pageWidth3) / 2);
        C1062Bg c1062Bg2 = this.A06;
        int pageWidth4 = this.A01;
        c1062Bg2.A2G(pageWidth4 / measuredWidth);
    }

    public void setCurrentPosition(int i9) {
        A1y(i9, false);
    }

    public void setOnPageChangedListener(MM mm) {
        this.A04 = mm;
    }

    public void setShowTextInCarousel(boolean z8) {
        this.A05 = z8;
    }
}
