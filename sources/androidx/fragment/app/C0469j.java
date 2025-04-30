package androidx.fragment.app;

import android.animation.AnimatorSet;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0469j f4730a = new Object();

    public final void a(AnimatorSet animatorSet) {
        G7.j.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j7) {
        G7.j.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j7);
    }
}
