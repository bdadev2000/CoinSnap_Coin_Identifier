package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {
    public boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1975b;

    public n(p pVar) {
        this.f1975b = pVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        p pVar = this.f1975b;
        if (((Float) pVar.f2006z.getAnimatedValue()).floatValue() == 0.0f) {
            pVar.A = 0;
            pVar.c(0);
        } else {
            pVar.A = 2;
            pVar.f2000s.invalidate();
        }
    }
}
