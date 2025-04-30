package M0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: M0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216g extends AnimatorListenerAdapter implements u {

    /* renamed from: a, reason: collision with root package name */
    public final View f1880a;
    public boolean b = false;

    public C0216g(View view) {
        this.f1880a = view;
    }

    @Override // M0.u
    public final void b() {
        float f9;
        View view = this.f1880a;
        if (view.getVisibility() == 0) {
            f9 = H.f1847a.n(view);
        } else {
            f9 = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f9));
    }

    @Override // M0.u
    public final void e() {
        this.f1880a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        H.f1847a.A(this.f1880a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f1880a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z8) {
        boolean z9 = this.b;
        View view = this.f1880a;
        if (z9) {
            view.setLayerType(0, null);
        }
        if (z8) {
            return;
        }
        M m = H.f1847a;
        m.A(view, 1.0f);
        m.getClass();
    }

    @Override // M0.u
    public final void a(w wVar) {
    }

    @Override // M0.u
    public final void c(w wVar) {
    }

    @Override // M0.u
    public final void d(w wVar) {
    }

    @Override // M0.u
    public final void f(w wVar) {
    }
}
