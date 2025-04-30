package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f4982a;
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4983c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0531k f4986f;

    public C0527g(C0531k c0531k, p0 p0Var, int i9, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4986f = c0531k;
        this.f4982a = p0Var;
        this.b = i9;
        this.f4983c = view;
        this.f4984d = i10;
        this.f4985e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i9 = this.b;
        View view = this.f4983c;
        if (i9 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f4984d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4985e.setListener(null);
        C0531k c0531k = this.f4986f;
        p0 p0Var = this.f4982a;
        c0531k.c(p0Var);
        c0531k.f5015p.remove(p0Var);
        c0531k.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4986f.getClass();
    }
}
