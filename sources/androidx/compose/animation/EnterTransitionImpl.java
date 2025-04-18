package androidx.compose.animation;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
final class EnterTransitionImpl extends EnterTransition {

    /* renamed from: b, reason: collision with root package name */
    public final TransitionData f1876b;

    public EnterTransitionImpl(TransitionData transitionData) {
        this.f1876b = transitionData;
    }

    @Override // androidx.compose.animation.EnterTransition
    public final TransitionData a() {
        return this.f1876b;
    }
}
