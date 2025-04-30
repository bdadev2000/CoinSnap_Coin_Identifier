package com.meta.analytics.dsp.uinode;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.2e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08412e extends FrameLayout {
    public static final float A08;
    public static final int A09;
    public static final InterfaceC08432g A0A;
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final Rect A04;
    public final Rect A05;
    public final InterfaceC08422f A06;
    public static String[] A07 = {"jVZ1Tu881vaZhMQc7G1YnAdrBZwLOzLZ", "MIZgMzLB91QWfj9gVmnmcTG9oR84Ntwz", "DCbfL76gOTURmFCUeHCsoybhclYkmTay", "EMPd0g2FUYEiLKskd4o9XcZgPaWME7KU", "G2pxhAodnNK6EDlWmu9QTAPYKMlMfLOc", "qEeDuFDfyNwl7ByTckOuFZ9zHyfaVY7D", "VB67ht075LyAy5nhvmM9NplNYlVRYF1n", "i4ARItf07QURagRfhioscqF5iwXVDFyZ"};
    public static final int[] A0B = {R.attr.colorBackground};

    static {
        float f9 = Resources.getSystem().getDisplayMetrics().density;
        A08 = f9;
        A09 = (int) (f9 * 1.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            A0A = new C1681a9();
        } else if (Build.VERSION.SDK_INT >= 17) {
            A0A = new F6();
        } else {
            A0A = new C1679a7();
        }
        A0A.A8r();
    }

    public AbstractC08412e(Context context) {
        this(context, null);
    }

    public AbstractC08412e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC08412e(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Rect rect = new Rect();
        this.A04 = rect;
        this.A05 = new Rect();
        C1683aB c1683aB = new C1683aB(this);
        this.A06 = c1683aB;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(A0B);
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        Color.colorToHSV(color, new float[3]);
        ColorStateList valueOf = ColorStateList.valueOf(-328966);
        this.A02 = false;
        this.A03 = true;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        int themeColorBackground = 10.0f > 50.0f ? 1092616192 : 1112014848;
        this.A01 = 0;
        this.A00 = 0;
        A0A.A8s(c1683aB, context, valueOf, 10.0f, 10.0f, themeColorBackground);
    }

    public ColorStateList getCardBackgroundColor() {
        return A0A.A66(this.A06);
    }

    public float getCardElevation() {
        return A0A.A6t(this.A06);
    }

    public int getContentPaddingBottom() {
        return this.A04.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A04.left;
    }

    public int getContentPaddingRight() {
        return this.A04.right;
    }

    public int getContentPaddingTop() {
        return this.A04.top;
    }

    public float getMaxCardElevation() {
        return A0A.A7M(this.A06);
    }

    public boolean getPreventCornerOverlap() {
        return this.A03;
    }

    public float getRadius() {
        return A0A.A7m(this.A06);
    }

    public boolean getUseCompatPadding() {
        return this.A02;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (!(A0A instanceof C1681a9)) {
            int mode = View.MeasureSpec.getMode(i9);
            switch (mode) {
                case Integer.MIN_VALUE:
                case 1073741824:
                    double ceil = Math.ceil(r6.A7S(this.A06));
                    if (A07[1].charAt(21) == 'T') {
                        A07[1] = "CoEZjfZf0TpQ2BZBlHTi5T6DWNYutRLI";
                        int minHeight = View.MeasureSpec.getSize(i9);
                        i9 = View.MeasureSpec.makeMeasureSpec(Math.max((int) ceil, minHeight), mode);
                        break;
                    } else {
                        throw new RuntimeException();
                    }
            }
            int mode2 = View.MeasureSpec.getMode(i10);
            switch (mode2) {
                case Integer.MIN_VALUE:
                case 1073741824:
                    int ceil2 = (int) Math.ceil(r6.A7R(this.A06));
                    int minHeight2 = View.MeasureSpec.getSize(i10);
                    i10 = View.MeasureSpec.makeMeasureSpec(Math.max(ceil2, minHeight2), mode2);
                    break;
            }
            super.onMeasure(i9, i10);
            return;
        }
        super.onMeasure(i9, i10);
    }

    public void setCardBackgroundColor(int i9) {
        A0A.AFt(this.A06, ColorStateList.valueOf(i9));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A0A.AFt(this.A06, colorStateList);
    }

    public void setCardElevation(float f9) {
        A0A.AFz(this.A06, f9);
    }

    public void setMaxCardElevation(float f9) {
        A0A.AG6(this.A06, f9);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i9) {
        this.A00 = i9;
        super.setMinimumHeight(i9);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i9) {
        this.A01 = i9;
        super.setMinimumWidth(i9);
    }

    @Override // android.view.View
    public final void setPadding(int i9, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i9, int i10, int i11, int i12) {
    }

    public void setPreventCornerOverlap(boolean z8) {
        if (z8 != this.A03) {
            this.A03 = z8;
            String[] strArr = A07;
            if (strArr[5].charAt(25) == strArr[2].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "AF11DlndTIGSrqZz8tUh3XTR3YFTmMvs";
            strArr2[2] = "M7b5sm4OMM6QoyOKa0AwC0c4wRmpSBfx";
            A0A.ACk(this.A06);
        }
    }

    public void setRadius(float f9) {
        A0A.AGC(this.A06, f9);
    }

    public void setUseCompatPadding(boolean z8) {
        if (this.A02 != z8) {
            this.A02 = z8;
            A0A.AB7(this.A06);
        }
    }
}
