package androidx.compose.animation;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
final class ExitTransitionImpl extends ExitTransition {

    /* renamed from: c, reason: collision with root package name */
    public final TransitionData f1879c;

    public ExitTransitionImpl(TransitionData transitionData) {
        this.f1879c = transitionData;
    }

    @Override // androidx.compose.animation.ExitTransition
    public final TransitionData a() {
        return this.f1879c;
    }
}
