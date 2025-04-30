package M0;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* loaded from: classes.dex */
public abstract class r {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j7) {
        ((AnimatorSet) animator).setCurrentPlayTime(j7);
    }
}
