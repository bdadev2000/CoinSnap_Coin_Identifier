package M0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class O extends AnimatorListenerAdapter implements u {

    /* renamed from: a, reason: collision with root package name */
    public final View f1852a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f1853c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1855e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1856f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1854d = true;

    public O(View view, int i9) {
        this.f1852a = view;
        this.b = i9;
        this.f1853c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // M0.u
    public final void b() {
        g(false);
        if (!this.f1856f) {
            H.b(this.f1852a, this.b);
        }
    }

    @Override // M0.u
    public final void c(w wVar) {
        wVar.A(this);
    }

    @Override // M0.u
    public final void e() {
        g(true);
        if (!this.f1856f) {
            H.b(this.f1852a, 0);
        }
    }

    public final void g(boolean z8) {
        ViewGroup viewGroup;
        if (this.f1854d && this.f1855e != z8 && (viewGroup = this.f1853c) != null) {
            this.f1855e = z8;
            r8.k.A(viewGroup, z8);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1856f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f1856f) {
            H.b(this.f1852a, this.b);
            ViewGroup viewGroup = this.f1853c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z8) {
        if (z8) {
            H.b(this.f1852a, 0);
            ViewGroup viewGroup = this.f1853c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z8) {
        if (z8) {
            return;
        }
        if (!this.f1856f) {
            H.b(this.f1852a, this.b);
            ViewGroup viewGroup = this.f1853c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // M0.u
    public final void d(w wVar) {
    }

    @Override // M0.u
    public final void f(w wVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
