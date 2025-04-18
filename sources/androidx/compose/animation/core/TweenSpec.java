package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes4.dex */
public final class TweenSpec<T> implements DurationBasedAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f2335a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2336b;

    /* renamed from: c, reason: collision with root package name */
    public final Easing f2337c;

    public TweenSpec(int i2, Easing easing, int i3) {
        this((i3 & 1) != 0 ? 300 : i2, 0, (i3 & 4) != 0 ? EasingKt.f2083a : easing);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedTweenSpec(this.f2335a, this.f2336b, this.f2337c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TweenSpec)) {
            return false;
        }
        TweenSpec tweenSpec = (TweenSpec) obj;
        return tweenSpec.f2335a == this.f2335a && tweenSpec.f2336b == this.f2336b && p0.a.g(tweenSpec.f2337c, this.f2337c);
    }

    public final int hashCode() {
        return ((this.f2337c.hashCode() + (this.f2335a * 31)) * 31) + this.f2336b;
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedTweenSpec(this.f2335a, this.f2336b, this.f2337c);
    }

    public TweenSpec(int i2, int i3, Easing easing) {
        this.f2335a = i2;
        this.f2336b = i3;
        this.f2337c = easing;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter) {
        TwoWayConverter twoWayConverter2 = VectorConvertersKt.f2340a;
        return new VectorizedTweenSpec(this.f2335a, this.f2336b, this.f2337c);
    }
}
