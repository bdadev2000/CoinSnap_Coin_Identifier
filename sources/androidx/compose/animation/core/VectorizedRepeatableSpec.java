package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class VectorizedRepeatableSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final int f2396a;

    /* renamed from: b, reason: collision with root package name */
    public final VectorizedDurationBasedAnimationSpec f2397b;

    /* renamed from: c, reason: collision with root package name */
    public final RepeatMode f2398c;
    public final long d;
    public final long e;

    public VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.f2396a = i2;
        this.f2397b = vectorizedDurationBasedAnimationSpec;
        this.f2398c = repeatMode;
        if (i2 < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.d = (vectorizedDurationBasedAnimationSpec.e() + vectorizedDurationBasedAnimationSpec.c()) * 1000000;
        this.e = j2 * 1000000;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return (this.f2396a * this.d) - this.e;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2397b.f(h(j2), animationVector, animationVector2, i(j2, animationVector, animationVector3, animationVector2));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector g(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2397b.g(h(j2), animationVector, animationVector2, i(j2, animationVector, animationVector3, animationVector2));
    }

    public final long h(long j2) {
        long j3 = this.e;
        if (j2 + j3 <= 0) {
            return 0L;
        }
        long j4 = j2 + j3;
        long j5 = this.d;
        long min = Math.min(j4 / j5, this.f2396a - 1);
        return (this.f2398c == RepeatMode.f2158a || min % ((long) 2) == 0) ? j4 - (min * j5) : ((min + 1) * j5) - j4;
    }

    public final AnimationVector i(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j3 = this.e;
        long j4 = j2 + j3;
        long j5 = this.d;
        return j4 > j5 ? f(j5 - j3, animationVector, animationVector2, animationVector3) : animationVector2;
    }
}
