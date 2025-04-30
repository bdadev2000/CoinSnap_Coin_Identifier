package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4978a = 1;
    public final /* synthetic */ p0 b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4979c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0531k f4981e;

    public C0526f(C0531k c0531k, p0 p0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4981e = c0531k;
        this.b = p0Var;
        this.f4980d = viewPropertyAnimator;
        this.f4979c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4978a) {
            case 1:
                this.f4979c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4978a) {
            case 0:
                this.f4980d.setListener(null);
                this.f4979c.setAlpha(1.0f);
                C0531k c0531k = this.f4981e;
                p0 p0Var = this.b;
                c0531k.c(p0Var);
                c0531k.f5016q.remove(p0Var);
                c0531k.i();
                return;
            default:
                this.f4980d.setListener(null);
                C0531k c0531k2 = this.f4981e;
                p0 p0Var2 = this.b;
                c0531k2.c(p0Var2);
                c0531k2.f5014o.remove(p0Var2);
                c0531k2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4978a) {
            case 0:
                this.f4981e.getClass();
                return;
            default:
                this.f4981e.getClass();
                return;
        }
    }

    public C0526f(C0531k c0531k, p0 p0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4981e = c0531k;
        this.b = p0Var;
        this.f4979c = view;
        this.f4980d = viewPropertyAnimator;
    }
}
