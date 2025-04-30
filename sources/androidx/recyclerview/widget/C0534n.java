package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: androidx.recyclerview.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5038a = false;
    public final /* synthetic */ C0536p b;

    public C0534n(C0536p c0536p) {
        this.b = c0536p;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f5038a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f5038a) {
            this.f5038a = false;
            return;
        }
        C0536p c0536p = this.b;
        if (((Float) c0536p.f5072z.getAnimatedValue()).floatValue() == 0.0f) {
            c0536p.f5048A = 0;
            c0536p.d(0);
        } else {
            c0536p.f5048A = 2;
            c0536p.f5065s.invalidate();
        }
    }
}
