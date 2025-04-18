package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class VectorizedTweenSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final int f2401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2402b;

    /* renamed from: c, reason: collision with root package name */
    public final Easing f2403c;
    public final VectorizedFloatAnimationSpec d;

    public VectorizedTweenSpec(int i2, int i3, Easing easing) {
        this.f2401a = i2;
        this.f2402b = i3;
        this.f2403c = easing;
        this.d = new VectorizedFloatAnimationSpec(new FloatTweenSpec(i2, i3, easing));
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int c() {
        return this.f2402b;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int e() {
        return this.f2401a;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.d.f(j2, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector g(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.d.g(j2, animationVector, animationVector2, animationVector3);
    }
}
