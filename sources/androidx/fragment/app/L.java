package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final Animation f4665a;
    public final AnimatorSet b;

    public L(Animation animation) {
        this.f4665a = animation;
        this.b = null;
    }

    public L(Animator animator) {
        this.f4665a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }
}
