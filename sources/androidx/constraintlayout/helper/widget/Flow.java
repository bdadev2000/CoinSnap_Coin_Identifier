package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class Flow extends VirtualLayout {

    /* renamed from: k, reason: collision with root package name */
    public final androidx.constraintlayout.solver.widgets.Flow f17735k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18191a = new int[32];
        this.f18195g = null;
        this.f18196h = new HashMap();
        this.f18193c = context;
        super.i(attributeSet);
        this.f17735k = new androidx.constraintlayout.solver.widgets.Flow();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f18327b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f17735k.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    androidx.constraintlayout.solver.widgets.Flow flow = this.f17735k;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    flow.f18091h0 = dimensionPixelSize;
                    flow.f18092i0 = dimensionPixelSize;
                    flow.f18093j0 = dimensionPixelSize;
                    flow.f18094k0 = dimensionPixelSize;
                } else if (index == 11) {
                    androidx.constraintlayout.solver.widgets.Flow flow2 = this.f17735k;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    flow2.f18093j0 = dimensionPixelSize2;
                    flow2.f18095l0 = dimensionPixelSize2;
                    flow2.f18096m0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f17735k.f18094k0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f17735k.f18095l0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f17735k.f18091h0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f17735k.f18096m0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f17735k.f18092i0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f17735k.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f17735k.f18058s0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f17735k.f18059t0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f17735k.f18060u0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f17735k.f18062w0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f17735k.f18061v0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f17735k.f18063x0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f17735k.f18064y0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f17735k.A0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f17735k.C0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f17735k.B0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f17735k.D0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f17735k.f18065z0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f17735k.G0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f17735k.H0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f17735k.E0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f17735k.F0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f17735k.J0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.d = this.f17735k;
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j(ConstraintWidget constraintWidget, boolean z2) {
        androidx.constraintlayout.solver.widgets.Flow flow = this.f17735k;
        int i2 = flow.f18093j0;
        if (i2 > 0 || flow.f18094k0 > 0) {
            if (z2) {
                flow.f18095l0 = flow.f18094k0;
                flow.f18096m0 = i2;
            } else {
                flow.f18095l0 = i2;
                flow.f18096m0 = flow.f18094k0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void n(androidx.constraintlayout.solver.widgets.VirtualLayout virtualLayout, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (virtualLayout == null) {
            setMeasuredDimension(0, 0);
        } else {
            virtualLayout.D(mode, size, mode2, size2);
            setMeasuredDimension(virtualLayout.f18098o0, virtualLayout.f18099p0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i2, int i3) {
        n(this.f17735k, i2, i3);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f17735k.A0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.f17735k.f18060u0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f17735k.B0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.f17735k.f18061v0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.f17735k.G0 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f17735k.f18064y0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.f17735k.E0 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.f17735k.f18058s0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.f17735k.J0 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.f17735k.K0 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        androidx.constraintlayout.solver.widgets.Flow flow = this.f17735k;
        flow.f18091h0 = i2;
        flow.f18092i0 = i2;
        flow.f18093j0 = i2;
        flow.f18094k0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.f17735k.f18092i0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.f17735k.f18095l0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.f17735k.f18096m0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.f17735k.f18091h0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.f17735k.H0 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f17735k.f18065z0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.f17735k.F0 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.f17735k.f18059t0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.f17735k.I0 = i2;
        requestLayout();
    }
}
