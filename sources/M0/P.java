package M0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes.dex */
public final class P extends AnimatorListenerAdapter implements u {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1857a;
    public final View b;

    /* renamed from: c, reason: collision with root package name */
    public final View f1858c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1859d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0217h f1860e;

    public P(C0217h c0217h, ViewGroup viewGroup, View view, View view2) {
        this.f1860e = c0217h;
        this.f1857a = viewGroup;
        this.b = view;
        this.f1858c = view2;
    }

    @Override // M0.u
    public final void c(w wVar) {
        wVar.A(this);
    }

    @Override // M0.u
    public final void f(w wVar) {
        if (this.f1859d) {
            g();
        }
    }

    public final void g() {
        this.f1858c.setTag(R.id.save_overlay_view, null);
        this.f1857a.getOverlay().remove(this.b);
        this.f1859d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f1857a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.f1857a.getOverlay().add(view);
        } else {
            this.f1860e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z8) {
        if (z8) {
            View view = this.f1858c;
            View view2 = this.b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f1857a.getOverlay().add(view2);
            this.f1859d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z8) {
        if (z8) {
            return;
        }
        g();
    }

    @Override // M0.u
    public final void b() {
    }

    @Override // M0.u
    public final void e() {
    }

    @Override // M0.u
    public final void d(w wVar) {
    }
}
