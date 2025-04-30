package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4987a;
    public final /* synthetic */ C0529i b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4988c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f4989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0531k f4990e;

    public /* synthetic */ C0528h(C0531k c0531k, C0529i c0529i, ViewPropertyAnimator viewPropertyAnimator, View view, int i9) {
        this.f4987a = i9;
        this.f4990e = c0531k;
        this.b = c0529i;
        this.f4988c = viewPropertyAnimator;
        this.f4989d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4987a) {
            case 0:
                this.f4988c.setListener(null);
                View view = this.f4989d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0529i c0529i = this.b;
                p0 p0Var = c0529i.f4992a;
                C0531k c0531k = this.f4990e;
                c0531k.c(p0Var);
                c0531k.f5017r.remove(c0529i.f4992a);
                c0531k.i();
                return;
            default:
                this.f4988c.setListener(null);
                View view2 = this.f4989d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0529i c0529i2 = this.b;
                p0 p0Var2 = c0529i2.b;
                C0531k c0531k2 = this.f4990e;
                c0531k2.c(p0Var2);
                c0531k2.f5017r.remove(c0529i2.b);
                c0531k2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4987a) {
            case 0:
                p0 p0Var = this.b.f4992a;
                this.f4990e.getClass();
                return;
            default:
                p0 p0Var2 = this.b.b;
                this.f4990e.getClass();
                return;
        }
    }
}
