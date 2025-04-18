package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes4.dex */
public class MotionTelltales extends MockView {

    /* renamed from: a, reason: collision with root package name */
    public MotionLayout f18175a;

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(null);
        if (this.f18175a == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f18175a = (MotionLayout) parent;
                return;
            }
            return;
        }
        getWidth();
        getHeight();
        MotionLayout motionLayout = this.f18175a;
        float f2 = motionLayout.f17829n;
        if (motionLayout.f17819b != null) {
            Math.signum(motionLayout.f17831p - f2);
            motionLayout.f17819b.getInterpolation(motionLayout.f17829n + 1.0E-5f);
            motionLayout.f17819b.getInterpolation(motionLayout.f17829n);
        }
        Interpolator interpolator = motionLayout.f17819b;
        if (!(interpolator instanceof MotionInterpolator)) {
            throw null;
        }
        ((MotionInterpolator) interpolator).a();
        throw null;
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        charSequence.toString();
        requestLayout();
    }
}
