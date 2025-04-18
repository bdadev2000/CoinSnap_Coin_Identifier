package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import w.e;
import w.h;
import z.r;
import z.t;

/* loaded from: classes.dex */
public class Flow extends t {

    /* renamed from: l, reason: collision with root package name */
    public h f1127l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // z.t, z.c
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f1127l = new h();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f28445b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f1127l.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    h hVar = this.f1127l;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar.f26648s0 = dimensionPixelSize;
                    hVar.f26649t0 = dimensionPixelSize;
                    hVar.f26650u0 = dimensionPixelSize;
                    hVar.f26651v0 = dimensionPixelSize;
                } else if (index == 18) {
                    h hVar2 = this.f1127l;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar2.f26650u0 = dimensionPixelSize2;
                    hVar2.f26652w0 = dimensionPixelSize2;
                    hVar2.f26653x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1127l.f26651v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1127l.f26652w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1127l.f26648s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1127l.f26653x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1127l.f26649t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1127l.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1127l.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1127l.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1127l.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1127l.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1127l.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1127l.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1127l.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1127l.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1127l.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1127l.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1127l.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1127l.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1127l.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1127l.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1127l.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1127l.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1127l.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f28309f = this.f1127l;
        i();
    }

    @Override // z.c
    public final void h(e eVar, boolean z10) {
        h hVar = this.f1127l;
        int i10 = hVar.f26650u0;
        if (i10 > 0 || hVar.f26651v0 > 0) {
            if (z10) {
                hVar.f26652w0 = hVar.f26651v0;
                hVar.f26653x0 = i10;
            } else {
                hVar.f26652w0 = i10;
                hVar.f26653x0 = hVar.f26651v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0850  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // z.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(w.h r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 2198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(w.h, int, int):void");
    }

    @Override // z.c, android.view.View
    public final void onMeasure(int i10, int i11) {
        j(this.f1127l, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f1127l.L0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f1127l.F0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f1127l.M0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f1127l.G0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f1127l.R0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f1127l.J0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f1127l.P0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f1127l.D0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f1127l.N0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f1127l.H0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f1127l.O0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f1127l.I0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f1127l.U0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f1127l.V0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        h hVar = this.f1127l;
        hVar.f26648s0 = i10;
        hVar.f26649t0 = i10;
        hVar.f26650u0 = i10;
        hVar.f26651v0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f1127l.f26649t0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f1127l.f26652w0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f1127l.f26653x0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f1127l.f26648s0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f1127l.S0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f1127l.K0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f1127l.Q0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f1127l.E0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f1127l.T0 = i10;
        requestLayout();
    }
}
