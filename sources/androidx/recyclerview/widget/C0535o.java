package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* renamed from: androidx.recyclerview.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0536p f5039a;

    public C0535o(C0536p c0536p) {
        this.f5039a = c0536p;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0536p c0536p = this.f5039a;
        c0536p.f5051c.setAlpha(floatValue);
        c0536p.f5052d.setAlpha(floatValue);
        c0536p.f5065s.invalidate();
    }
}
