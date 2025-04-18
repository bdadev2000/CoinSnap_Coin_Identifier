package androidx.transition;

/* loaded from: classes.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        k(1);
        g(new Fade(2));
        g(new Transition());
        g(new Fade(1));
    }
}
