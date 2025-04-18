package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AnimationResult<T, V extends AnimationVector> {

    /* renamed from: a, reason: collision with root package name */
    public final AnimationState f2025a;

    /* renamed from: b, reason: collision with root package name */
    public final AnimationEndReason f2026b;

    public AnimationResult(AnimationState animationState, AnimationEndReason animationEndReason) {
        this.f2025a = animationState;
        this.f2026b = animationEndReason;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.f2026b + ", endState=" + this.f2025a + ')';
    }
}
