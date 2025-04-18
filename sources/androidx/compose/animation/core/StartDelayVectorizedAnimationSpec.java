package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes4.dex */
final class StartDelayVectorizedAnimationSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final VectorizedAnimationSpec f2236a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2237b;

    public StartDelayVectorizedAnimationSpec(VectorizedAnimationSpec vectorizedAnimationSpec, long j2) {
        this.f2236a = vectorizedAnimationSpec;
        this.f2237b = j2;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final boolean a() {
        return this.f2236a.a();
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2236a.b(animationVector, animationVector2, animationVector3) + this.f2237b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StartDelayVectorizedAnimationSpec)) {
            return false;
        }
        StartDelayVectorizedAnimationSpec startDelayVectorizedAnimationSpec = (StartDelayVectorizedAnimationSpec) obj;
        return startDelayVectorizedAnimationSpec.f2237b == this.f2237b && p0.a.g(startDelayVectorizedAnimationSpec.f2236a, this.f2236a);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j3 = this.f2237b;
        return j2 < j3 ? animationVector3 : this.f2236a.f(j2 - j3, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector g(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j3 = this.f2237b;
        return j2 < j3 ? animationVector : this.f2236a.g(j2 - j3, animationVector, animationVector2, animationVector3);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2237b) + (this.f2236a.hashCode() * 31);
    }
}
