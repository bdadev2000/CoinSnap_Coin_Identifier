package U3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3140a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i9) {
        this.f3140a = i9;
        this.b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f3140a) {
            case 1:
                this.b.b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3140a) {
            case 0:
                this.b.b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
