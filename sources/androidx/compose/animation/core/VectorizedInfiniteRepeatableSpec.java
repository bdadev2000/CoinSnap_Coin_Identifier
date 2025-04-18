package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final VectorizedDurationBasedAnimationSpec f2374a;

    /* renamed from: b, reason: collision with root package name */
    public final RepeatMode f2375b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2376c;
    public final long d;

    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.f2374a = vectorizedDurationBasedAnimationSpec;
        this.f2375b = repeatMode;
        this.f2376c = (vectorizedDurationBasedAnimationSpec.e() + vectorizedDurationBasedAnimationSpec.c()) * 1000000;
        this.d = j2 * 1000000;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final boolean a() {
        return true;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return Long.MAX_VALUE;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2374a.f(h(j2), animationVector, animationVector2, i(j2, animationVector, animationVector3, animationVector2));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector g(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2374a.g(h(j2), animationVector, animationVector2, i(j2, animationVector, animationVector3, animationVector2));
    }

    public final long h(long j2) {
        long j3 = this.d;
        if (j2 + j3 <= 0) {
            return 0L;
        }
        long j4 = j2 + j3;
        long j5 = this.f2376c;
        long j6 = j4 / j5;
        return (this.f2375b == RepeatMode.f2158a || j6 % ((long) 2) == 0) ? j4 - (j6 * j5) : ((j6 + 1) * j5) - j4;
    }

    public final AnimationVector i(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j3 = this.d;
        long j4 = j2 + j3;
        long j5 = this.f2376c;
        return j4 > j5 ? this.f2374a.f(j5 - j3, animationVector, animationVector3, animationVector2) : animationVector2;
    }
}
