package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements Animation.AnimationListener {
    public final /* synthetic */ c2 a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1673c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f1674d;

    public k(View view, g gVar, l lVar, c2 c2Var) {
        this.a = c2Var;
        this.f1672b = lVar;
        this.f1673c = view;
        this.f1674d = gVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        l lVar = this.f1672b;
        lVar.a.post(new androidx.emoji2.text.n(3, lVar, this.f1673c, this.f1674d));
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}
