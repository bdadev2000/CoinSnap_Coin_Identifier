package androidx.constraintlayout.helper.widget;

import B.d;
import B.g;
import B.i;
import E.r;
import E.t;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Flow extends t {
    public g l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [B.g, B.i] */
    /* JADX WARN: Type inference failed for: r2v0, types: [C.b, java.lang.Object] */
    @Override // E.t, E.c
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        ?? iVar = new i();
        iVar.f236s0 = 0;
        iVar.f237t0 = 0;
        iVar.f238u0 = 0;
        iVar.f239v0 = 0;
        iVar.f240w0 = 0;
        iVar.f241x0 = 0;
        iVar.f242y0 = false;
        iVar.f243z0 = 0;
        iVar.f210A0 = 0;
        iVar.f211B0 = new Object();
        iVar.f212C0 = null;
        iVar.f213D0 = -1;
        iVar.f214E0 = -1;
        iVar.f215F0 = -1;
        iVar.f216G0 = -1;
        iVar.f217H0 = -1;
        iVar.f218I0 = -1;
        iVar.f219J0 = 0.5f;
        iVar.K0 = 0.5f;
        iVar.f220L0 = 0.5f;
        iVar.f221M0 = 0.5f;
        iVar.f222N0 = 0.5f;
        iVar.f223O0 = 0.5f;
        iVar.P0 = 0;
        iVar.f224Q0 = 0;
        iVar.f225R0 = 2;
        iVar.f226S0 = 2;
        iVar.f227T0 = 0;
        iVar.f228U0 = -1;
        iVar.f229V0 = 0;
        iVar.f230W0 = new ArrayList();
        iVar.f231X0 = null;
        iVar.f232Y0 = null;
        iVar.f233Z0 = null;
        iVar.f235b1 = 0;
        this.l = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = obtainStyledAttributes.getIndex(i9);
                if (index == 0) {
                    this.l.f229V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.l;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f236s0 = dimensionPixelSize;
                    gVar.f237t0 = dimensionPixelSize;
                    gVar.f238u0 = dimensionPixelSize;
                    gVar.f239v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar2 = this.l;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f238u0 = dimensionPixelSize2;
                    gVar2.f240w0 = dimensionPixelSize2;
                    gVar2.f241x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.l.f239v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.l.f240w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.l.f236s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.l.f241x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.l.f237t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.l.f227T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.l.f213D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.l.f214E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.l.f215F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.l.f217H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.l.f216G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.l.f218I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.l.f219J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.l.f220L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.l.f222N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.l.f221M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.l.f223O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.l.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.l.f225R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.l.f226S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.l.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.l.f224Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.l.f228U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f768f = this.l;
        k();
    }

    @Override // E.c
    public final void i(d dVar, boolean z8) {
        g gVar = this.l;
        int i9 = gVar.f238u0;
        if (i9 > 0 || gVar.f239v0 > 0) {
            if (z8) {
                gVar.f240w0 = gVar.f239v0;
                gVar.f241x0 = i9;
            } else {
                gVar.f240w0 = i9;
                gVar.f241x0 = gVar.f239v0;
            }
        }
    }

    @Override // E.t
    public final void l(g gVar, int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (gVar != null) {
            gVar.V(mode, size, mode2, size2);
            setMeasuredDimension(gVar.f243z0, gVar.f210A0);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // E.c, android.view.View
    public final void onMeasure(int i9, int i10) {
        l(this.l, i9, i10);
    }

    public void setFirstHorizontalBias(float f9) {
        this.l.f220L0 = f9;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i9) {
        this.l.f215F0 = i9;
        requestLayout();
    }

    public void setFirstVerticalBias(float f9) {
        this.l.f221M0 = f9;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i9) {
        this.l.f216G0 = i9;
        requestLayout();
    }

    public void setHorizontalAlign(int i9) {
        this.l.f225R0 = i9;
        requestLayout();
    }

    public void setHorizontalBias(float f9) {
        this.l.f219J0 = f9;
        requestLayout();
    }

    public void setHorizontalGap(int i9) {
        this.l.P0 = i9;
        requestLayout();
    }

    public void setHorizontalStyle(int i9) {
        this.l.f213D0 = i9;
        requestLayout();
    }

    public void setLastHorizontalBias(float f9) {
        this.l.f222N0 = f9;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i9) {
        this.l.f217H0 = i9;
        requestLayout();
    }

    public void setLastVerticalBias(float f9) {
        this.l.f223O0 = f9;
        requestLayout();
    }

    public void setLastVerticalStyle(int i9) {
        this.l.f218I0 = i9;
        requestLayout();
    }

    public void setMaxElementsWrap(int i9) {
        this.l.f228U0 = i9;
        requestLayout();
    }

    public void setOrientation(int i9) {
        this.l.f229V0 = i9;
        requestLayout();
    }

    public void setPadding(int i9) {
        g gVar = this.l;
        gVar.f236s0 = i9;
        gVar.f237t0 = i9;
        gVar.f238u0 = i9;
        gVar.f239v0 = i9;
        requestLayout();
    }

    public void setPaddingBottom(int i9) {
        this.l.f237t0 = i9;
        requestLayout();
    }

    public void setPaddingLeft(int i9) {
        this.l.f240w0 = i9;
        requestLayout();
    }

    public void setPaddingRight(int i9) {
        this.l.f241x0 = i9;
        requestLayout();
    }

    public void setPaddingTop(int i9) {
        this.l.f236s0 = i9;
        requestLayout();
    }

    public void setVerticalAlign(int i9) {
        this.l.f226S0 = i9;
        requestLayout();
    }

    public void setVerticalBias(float f9) {
        this.l.K0 = f9;
        requestLayout();
    }

    public void setVerticalGap(int i9) {
        this.l.f224Q0 = i9;
        requestLayout();
    }

    public void setVerticalStyle(int i9) {
        this.l.f214E0 = i9;
        requestLayout();
    }

    public void setWrapMode(int i9) {
        this.l.f227T0 = i9;
        requestLayout();
    }
}
