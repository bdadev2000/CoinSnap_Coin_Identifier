package M3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1997a;
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f1998c;

    public i(j jVar, boolean z8, int i9) {
        this.f1998c = jVar;
        this.f1997a = z8;
        this.b = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j jVar = this.f1998c;
        jVar.b.setTranslationX(0.0f);
        jVar.a(0.0f, this.f1997a, this.b);
    }
}
