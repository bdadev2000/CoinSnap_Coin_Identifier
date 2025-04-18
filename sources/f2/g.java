package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements r {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17595b = false;

    public g(View view) {
        this.a = view;
    }

    @Override // f2.r
    public final void a() {
        float f10;
        View view = this.a;
        if (view.getVisibility() == 0) {
            f10 = e0.a.m(view);
        } else {
            f10 = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f10));
    }

    @Override // f2.r
    public final void b(t tVar) {
    }

    @Override // f2.r
    public final void c(t tVar) {
    }

    @Override // f2.r
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // f2.r
    public final void e(t tVar) {
    }

    @Override // f2.r
    public final void f(t tVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        e0.a.w(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f17595b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        boolean z11 = this.f17595b;
        View view = this.a;
        if (z11) {
            view.setLayerType(0, null);
        }
        if (z10) {
            return;
        }
        l0 l0Var = e0.a;
        l0Var.w(view, 1.0f);
        l0Var.getClass();
    }
}
