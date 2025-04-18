package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ o1 a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1912c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f1915f;

    public g(k kVar, o1 o1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1915f = kVar;
        this.a = o1Var;
        this.f1911b = i10;
        this.f1912c = view;
        this.f1913d = i11;
        this.f1914e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f1911b;
        View view = this.f1912c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f1913d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1914e.setListener(null);
        k kVar = this.f1915f;
        o1 o1Var = this.a;
        kVar.c(o1Var);
        kVar.f1957p.remove(o1Var);
        kVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1915f.getClass();
    }
}
