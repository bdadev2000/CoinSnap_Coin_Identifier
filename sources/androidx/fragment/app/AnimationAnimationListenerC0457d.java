package androidx.fragment.app;

import U4.RunnableC0311g;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0457d implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f4711a;
    public final /* synthetic */ ViewGroup b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4712c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0459e f4713d;

    public AnimationAnimationListenerC0457d(L0 l02, ViewGroup viewGroup, View view, C0459e c0459e) {
        this.f4711a = l02;
        this.b = viewGroup;
        this.f4712c = view;
        this.f4713d = c0459e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        G7.j.e(animation, "animation");
        ViewGroup viewGroup = this.b;
        viewGroup.post(new RunnableC0311g(viewGroup, this.f4712c, this.f4713d, 1));
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + this.f4711a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        G7.j.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        G7.j.e(animation, "animation");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + this.f4711a + " has reached onAnimationStart.");
        }
    }
}
