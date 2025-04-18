package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class o0 extends AnimatorListenerAdapter implements r {
    public final ViewGroup a;

    /* renamed from: b, reason: collision with root package name */
    public final View f17617b;

    /* renamed from: c, reason: collision with root package name */
    public final View f17618c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17619d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f17620e;

    public o0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f17620e = hVar;
        this.a = viewGroup;
        this.f17617b = view;
        this.f17618c = view2;
    }

    @Override // f2.r
    public final void a() {
    }

    @Override // f2.r
    public final void c(t tVar) {
        if (this.f17619d) {
            g();
        }
    }

    @Override // f2.r
    public final void d() {
    }

    @Override // f2.r
    public final void e(t tVar) {
    }

    @Override // f2.r
    public final void f(t tVar) {
        tVar.z(this);
    }

    public final void g() {
        this.f17618c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.f17617b);
        this.f17619d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.f17617b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f17617b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.f17620e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z10) {
        if (z10) {
            View view = this.f17618c;
            View view2 = this.f17617b;
            view.setTag(R.id.save_overlay_view, view2);
            this.a.getOverlay().add(view2);
            this.f17619d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        if (z10) {
            return;
        }
        g();
    }
}
