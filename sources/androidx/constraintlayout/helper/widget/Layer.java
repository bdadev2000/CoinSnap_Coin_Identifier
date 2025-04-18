package androidx.constraintlayout.helper.widget;

import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* renamed from: i, reason: collision with root package name */
    public float f17736i;

    /* renamed from: j, reason: collision with root package name */
    public float f17737j;

    /* renamed from: k, reason: collision with root package name */
    public float f17738k;

    /* renamed from: l, reason: collision with root package name */
    public ConstraintLayout f17739l;

    /* renamed from: m, reason: collision with root package name */
    public float f17740m;

    /* renamed from: n, reason: collision with root package name */
    public float f17741n;

    /* renamed from: o, reason: collision with root package name */
    public float f17742o;

    /* renamed from: p, reason: collision with root package name */
    public float f17743p;

    /* renamed from: q, reason: collision with root package name */
    public float f17744q;

    /* renamed from: r, reason: collision with root package name */
    public float f17745r;

    /* renamed from: s, reason: collision with root package name */
    public float f17746s;

    /* renamed from: t, reason: collision with root package name */
    public float f17747t;

    /* renamed from: u, reason: collision with root package name */
    public View[] f17748u;

    /* renamed from: v, reason: collision with root package name */
    public float f17749v;
    public float w;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k() {
        o();
        this.f17742o = Float.NaN;
        this.f17743p = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).f18219l0;
        constraintWidget.z(0);
        constraintWidget.w(0);
        n();
        layout(((int) this.f17746s) - getPaddingLeft(), ((int) this.f17747t) - getPaddingTop(), getPaddingRight() + ((int) this.f17744q), getPaddingBottom() + ((int) this.f17745r));
        if (Float.isNaN(this.f17738k)) {
            return;
        }
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(ConstraintLayout constraintLayout) {
        this.f17739l = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f17738k = rotation;
        } else {
            if (Float.isNaN(this.f17738k)) {
                return;
            }
            this.f17738k = rotation;
        }
    }

    public final void n() {
        if (this.f17739l == null) {
            return;
        }
        if (Float.isNaN(this.f17742o) || Float.isNaN(this.f17743p)) {
            if (!Float.isNaN(this.f17736i) && !Float.isNaN(this.f17737j)) {
                this.f17743p = this.f17737j;
                this.f17742o = this.f17736i;
                return;
            }
            View[] h2 = h(this.f17739l);
            int left = h2[0].getLeft();
            int top = h2[0].getTop();
            int right = h2[0].getRight();
            int bottom = h2[0].getBottom();
            for (int i2 = 0; i2 < this.f18192b; i2++) {
                View view = h2[i2];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f17744q = right;
            this.f17745r = bottom;
            this.f17746s = left;
            this.f17747t = top;
            if (Float.isNaN(this.f17736i)) {
                this.f17742o = (left + right) / 2;
            } else {
                this.f17742o = this.f17736i;
            }
            if (Float.isNaN(this.f17737j)) {
                this.f17743p = (top + bottom) / 2;
            } else {
                this.f17743p = this.f17737j;
            }
        }
    }

    public final void o() {
        int i2;
        if (this.f17739l == null || (i2 = this.f18192b) == 0) {
            return;
        }
        View[] viewArr = this.f17748u;
        if (viewArr == null || viewArr.length != i2) {
            this.f17748u = new View[i2];
        }
        for (int i3 = 0; i3 < this.f18192b; i3++) {
            this.f17748u[i3] = this.f17739l.getViewById(this.f18191a[i3]);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17739l = (ConstraintLayout) getParent();
    }

    public final void p() {
        if (this.f17739l == null) {
            return;
        }
        if (this.f17748u == null) {
            o();
        }
        n();
        double radians = Math.toRadians(this.f17738k);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f2 = this.f17740m;
        float f3 = f2 * cos;
        float f4 = this.f17741n;
        float f5 = (-f4) * sin;
        float f6 = f2 * sin;
        float f7 = f4 * cos;
        for (int i2 = 0; i2 < this.f18192b; i2++) {
            View view = this.f17748u[i2];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f8 = right - this.f17742o;
            float f9 = bottom - this.f17743p;
            float f10 = (((f5 * f9) + (f3 * f8)) - f8) + this.f17749v;
            float f11 = (((f7 * f9) + (f8 * f6)) - f9) + this.w;
            view.setTranslationX(f10);
            view.setTranslationY(f11);
            view.setScaleY(this.f17741n);
            view.setScaleX(this.f17740m);
            view.setRotation(this.f17738k);
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        e();
    }

    @Override // android.view.View
    public void setPivotX(float f2) {
        this.f17736i = f2;
        p();
    }

    @Override // android.view.View
    public void setPivotY(float f2) {
        this.f17737j = f2;
        p();
    }

    @Override // android.view.View
    public void setRotation(float f2) {
        this.f17738k = f2;
        p();
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        this.f17740m = f2;
        p();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        this.f17741n = f2;
        p();
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        this.f17749v = f2;
        p();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        this.w = f2;
        p();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        e();
    }
}
