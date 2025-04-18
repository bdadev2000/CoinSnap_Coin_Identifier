package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f1903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1904c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f1906e;

    public f(k kVar, o1 o1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1906e = kVar;
        this.f1903b = o1Var;
        this.f1905d = viewPropertyAnimator;
        this.f1904c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.f1904c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        o1 o1Var = this.f1903b;
        k kVar = this.f1906e;
        ViewPropertyAnimator viewPropertyAnimator = this.f1905d;
        switch (i10) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.f1904c.setAlpha(1.0f);
                kVar.c(o1Var);
                kVar.f1958q.remove(o1Var);
                kVar.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                kVar.c(o1Var);
                kVar.f1956o.remove(o1Var);
                kVar.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.a;
        k kVar = this.f1906e;
        switch (i10) {
            case 0:
                kVar.getClass();
                return;
            default:
                kVar.getClass();
                return;
        }
    }

    public f(k kVar, o1 o1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1906e = kVar;
        this.f1903b = o1Var;
        this.f1904c = view;
        this.f1905d = viewPropertyAnimator;
    }
}
