package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class n0 extends AnimatorListenerAdapter implements r {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17612b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f17613c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17615e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17616f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17614d = true;

    public n0(View view, int i10) {
        this.a = view;
        this.f17612b = i10;
        this.f17613c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // f2.r
    public final void a() {
        g(false);
        if (!this.f17616f) {
            e0.b(this.a, this.f17612b);
        }
    }

    @Override // f2.r
    public final void c(t tVar) {
    }

    @Override // f2.r
    public final void d() {
        g(true);
        if (!this.f17616f) {
            e0.b(this.a, 0);
        }
    }

    @Override // f2.r
    public final void e(t tVar) {
    }

    @Override // f2.r
    public final void f(t tVar) {
        tVar.z(this);
    }

    public final void g(boolean z10) {
        ViewGroup viewGroup;
        if (this.f17614d && this.f17615e != z10 && (viewGroup = this.f17613c) != null) {
            this.f17615e = z10;
            com.facebook.appevents.i.g(viewGroup, z10);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f17616f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f17616f) {
            e0.b(this.a, this.f17612b);
            ViewGroup viewGroup = this.f17613c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z10) {
        if (z10) {
            e0.b(this.a, 0);
            ViewGroup viewGroup = this.f17613c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        if (z10) {
            return;
        }
        if (!this.f17616f) {
            e0.b(this.a, this.f17612b);
            ViewGroup viewGroup = this.f17613c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
