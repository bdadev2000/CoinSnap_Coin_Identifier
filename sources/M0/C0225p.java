package M0;

import T.InterfaceC0277j0;
import T.p0;
import T.t0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: M0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1894a;
    public final /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1895c;

    public /* synthetic */ C0225p(View view, int i9, Object obj) {
        this.f1894a = i9;
        this.b = obj;
        this.f1895c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1894a) {
            case 1:
                ((InterfaceC0277j0) this.b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1894a) {
            case 0:
                ((x.b) this.b).remove(animator);
                ((w) this.f1895c).f1929p.remove(animator);
                return;
            case 1:
                ((InterfaceC0277j0) this.b).c();
                return;
            default:
                t0 t0Var = (t0) this.b;
                t0Var.f2928a.d(1.0f);
                p0.e((View) this.f1895c, t0Var);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1894a) {
            case 0:
                ((w) this.f1895c).f1929p.add(animator);
                return;
            case 1:
                ((InterfaceC0277j0) this.b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public C0225p(w wVar, x.b bVar) {
        this.f1894a = 0;
        this.f1895c = wVar;
        this.b = bVar;
    }
}
