package na;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f22605b;

    public /* synthetic */ c(d dVar, int i10) {
        this.a = i10;
        this.f22605b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.f22605b.f22656b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.f22605b.f22656b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
