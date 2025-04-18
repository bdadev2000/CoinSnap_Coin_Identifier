package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {
    public final /* synthetic */ Object a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17621b;

    public /* synthetic */ p(Object obj, r.b bVar) {
        this.f17621b = obj;
        this.a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((r.b) this.a).remove(animator);
        ((t) this.f17621b).f17651p.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ((t) this.f17621b).f17651p.add(animator);
    }
}
