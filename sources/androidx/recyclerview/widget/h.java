package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1920c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f1921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f1922e;

    public /* synthetic */ h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.a = i10;
        this.f1922e = kVar;
        this.f1919b = iVar;
        this.f1920c = viewPropertyAnimator;
        this.f1921d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        k kVar = this.f1922e;
        i iVar = this.f1919b;
        View view = this.f1921d;
        ViewPropertyAnimator viewPropertyAnimator = this.f1920c;
        switch (i10) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.c(iVar.a);
                kVar.f1959r.remove(iVar.a);
                kVar.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.c(iVar.f1929b);
                kVar.f1959r.remove(iVar.f1929b);
                kVar.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.a;
        k kVar = this.f1922e;
        i iVar = this.f1919b;
        switch (i10) {
            case 0:
                o1 o1Var = iVar.a;
                kVar.getClass();
                return;
            default:
                o1 o1Var2 = iVar.f1929b;
                kVar.getClass();
                return;
        }
    }
}
