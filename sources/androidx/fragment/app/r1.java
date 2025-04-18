package androidx.fragment.app;

import android.transition.Transition;

/* loaded from: classes.dex */
public final class r1 implements Transition.TransitionListener {
    public final /* synthetic */ Runnable a;

    public r1(h.o0 o0Var) {
        this.a = o0Var;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
