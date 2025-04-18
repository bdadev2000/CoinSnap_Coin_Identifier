package fa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17764b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f17765c;

    public h(i iVar, boolean z10, int i10) {
        this.f17765c = iVar;
        this.a = z10;
        this.f17764b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i iVar = this.f17765c;
        iVar.f17754b.setTranslationX(0.0f);
        iVar.a(0.0f, this.f17764b, this.a);
    }
}
