package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
@ExperimentalAnimationSpecApi
/* loaded from: classes4.dex */
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public AnimationVector f2393a;

    /* renamed from: b, reason: collision with root package name */
    public MonoSpline f2394b;

    /* renamed from: c, reason: collision with root package name */
    public AnimationVector f2395c;
    public AnimationVector d;

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int c() {
        return 0;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int e() {
        return 0;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        int a2 = (int) VectorizedAnimationSpecKt.a(this, j2 / 1000000);
        if (a2 < 0) {
            return animationVector3;
        }
        h(animationVector, animationVector2, animationVector3);
        IntListExtensionKt.a(null, a2);
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector g(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        VectorizedAnimationSpecKt.a(this, j2 / 1000000);
        throw null;
    }

    public final void h(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.f2393a == null) {
            AnimationVector c2 = animationVector.c();
            p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f2393a = c2;
            p0.a.q(animationVector3.c(), "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            throw null;
        }
        if (this.f2394b != null && p0.a.g(this.f2395c, animationVector) && p0.a.g(this.d, animationVector2)) {
            return;
        }
        p0.a.g(this.f2395c, animationVector);
        p0.a.g(this.d, animationVector2);
        this.f2395c = animationVector;
        this.d = animationVector2;
        animationVector.b();
        throw null;
    }
}
