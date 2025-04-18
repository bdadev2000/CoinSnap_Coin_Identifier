package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class q1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22346c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22347d;

    public /* synthetic */ q1(int i10, Object obj, Object obj2, Object obj3) {
        this.a = i10;
        this.f22347d = obj;
        this.f22346c = obj2;
        this.f22345b = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((s1) this.f22346c).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Object obj = this.f22346c;
        switch (i10) {
            case 0:
                ((s1) obj).c();
                return;
            default:
                c2 c2Var = (c2) obj;
                c2Var.a.d(1.0f);
                y1.e((View) this.f22345b, c2Var);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((s1) this.f22346c).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
