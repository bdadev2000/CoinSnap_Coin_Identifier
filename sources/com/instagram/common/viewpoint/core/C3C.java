package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.common.primitives.Ints;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3C extends C3P implements QH {
    public static byte[] A07;
    public static String[] A08 = {"J7yX0QGw9CwhbXJlOgK1AZPNtt2UF0On", "oXMSY1TARkqssgt6s8jHvILUEU9", "ivvOLLZvAzFcQQYEM", "46hEJr0dkjUa2YxjnqHHZtVzHBYgDtfX", "qOyhICr4SrTKnx9gG6JsVKrXp45uLK", "kbgvhlczlSdLn8qANYfrfCagYhnCySOb", "Z6RoLzaVoBLmlhzvAeWOPUTl5laN13sF", "YB9cTMd7bVO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC0694Mb A04;
    public boolean A05;
    public final CD A06;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 46);
            if (A08[0].charAt(21) != 'Z') {
                throw new RuntimeException();
            }
            A08[3] = "76s3uTgYoGqvxE8PFJZmOuk3NB8C1jhQ";
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-68, -69, -99, -82, -76, -78, -112, -75, -82, -69, -76, -78, -79};
    }

    static {
        A03();
    }

    public C3C(C1045Zs c1045Zs) {
        super(c1045Zs);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new CD(c1045Zs, new QE(), new QD());
        A02();
    }

    public C3C(C1045Zs c1045Zs, AttributeSet attributeSet) {
        super(c1045Zs, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new CD(c1045Zs, new QE(), new QD());
        A02();
    }

    public C3C(C1045Zs c1045Zs, AttributeSet attributeSet, int i2) {
        super(c1045Zs, attributeSet, i2);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new CD(c1045Zs, new QE(), new QD());
        A02();
    }

    private int A00(int i2) {
        int i3 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i4 = (measuredWidth - spacing) - i3;
        int itemSize = getAdapter().A0E();
        int numFullItems = 0;
        int spacing2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        while (spacing2 > i2) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i2;
            }
            int spacing3 = numFullItems * i3;
            spacing2 = (int) ((i4 - spacing3) / (numFullItems + 0.333f));
        }
        return spacing2;
    }

    private void A02() {
        this.A06.A2A(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        M3.A0K(this);
    }

    private void A04(int i2, int i3) {
        if (i2 == this.A03 && i3 == this.A02) {
            return;
        }
        this.A03 = i2;
        this.A02 = i3;
        if (A08[3].charAt(25) != 'B') {
            throw new RuntimeException();
        }
        A08[2] = "arB2ao";
        if (0 != 0) {
            throw new NullPointerException(A01(0, 13, 31));
        }
    }

    @Override // com.instagram.common.viewpoint.core.C3P
    public final void A1y(int i2, boolean z2) {
        super.A1y(i2, z2);
        A04(i2, 0);
    }

    @Override // com.instagram.common.viewpoint.core.QH
    public final int A87(int i2) {
        int abs = Math.abs(i2);
        int scrollXAbs = ((C3P) this).A06;
        if (abs <= scrollXAbs) {
            return 0;
        }
        int scrollXAbs2 = this.A01;
        if (scrollXAbs2 == 0) {
            return 1;
        }
        int scrollXAbs3 = this.A01;
        return 1 + (abs / scrollXAbs3);
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.FL, android.view.View
    public final void onMeasure(int i2, int i3) {
        int height;
        int itemSize;
        super.onMeasure(i2, i3);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i4 = (int) LP.A02;
            int verticalPadding = C0608Im.A0F(getContext());
            height = (i4 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            height = Math.round(verticalPadding2 / 1.91f);
        }
        int verticalPadding3 = View.MeasureSpec.getMode(i3);
        switch (verticalPadding3) {
            case Integer.MIN_VALUE:
                int verticalPadding4 = View.MeasureSpec.getSize(i3);
                height = Math.min(verticalPadding4, height);
                break;
            case Ints.MAX_POWER_OF_TWO /* 1073741824 */:
                height = View.MeasureSpec.getSize(i3);
                break;
        }
        int height2 = height - paddingTop;
        if (this.A05) {
            int verticalPadding5 = MX.A09;
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

    @Override // com.instagram.common.viewpoint.core.FL
    public void setAdapter(AbstractC02684c abstractC02684c) {
        this.A06.A2H(abstractC02684c == null ? -1 : abstractC02684c.hashCode());
        super.setAdapter(abstractC02684c);
    }

    public void setChildSpacing(int i2) {
        this.A00 = i2;
    }

    public void setChildWidth(int i2) {
        this.A01 = i2;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i3 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i4 = i3 - pageWidth2;
        CD cd = this.A06;
        int pageWidth3 = this.A01;
        cd.A2I((i4 - pageWidth3) / 2);
        CD cd2 = this.A06;
        int pageWidth4 = this.A01;
        cd2.A2G(pageWidth4 / measuredWidth);
    }

    public void setCurrentPosition(int i2) {
        A1y(i2, false);
    }

    public void setOnPageChangedListener(InterfaceC0694Mb interfaceC0694Mb) {
        this.A04 = interfaceC0694Mb;
    }

    public void setShowTextInCarousel(boolean z2) {
        this.A05 = z2;
    }
}
