package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes4.dex */
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final FloatDecayAnimationSpec f2371a;

    /* renamed from: b, reason: collision with root package name */
    public AnimationVector f2372b;

    /* renamed from: c, reason: collision with root package name */
    public AnimationVector f2373c;
    public AnimationVector d;
    public final float e;

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.f2371a = floatDecayAnimationSpec;
        this.e = floatDecayAnimationSpec.a();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final float a() {
        return this.e;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final AnimationVector b(long j2, AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.f2373c == null) {
            AnimationVector c2 = animationVector.c();
            p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f2373c = c2;
        }
        AnimationVector animationVector3 = this.f2373c;
        if (animationVector3 == null) {
            p0.a.B0("velocityVector");
            throw null;
        }
        int b2 = animationVector3.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector4 = this.f2373c;
            if (animationVector4 == null) {
                p0.a.B0("velocityVector");
                throw null;
            }
            animationVector.a(i2);
            animationVector4.e(this.f2371a.d(j2, animationVector2.a(i2)), i2);
        }
        AnimationVector animationVector5 = this.f2373c;
        if (animationVector5 != null) {
            return animationVector5;
        }
        p0.a.B0("velocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final long c(AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.f2373c == null) {
            AnimationVector c2 = animationVector.c();
            p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f2373c = c2;
        }
        AnimationVector animationVector3 = this.f2373c;
        if (animationVector3 == null) {
            p0.a.B0("velocityVector");
            throw null;
        }
        int b2 = animationVector3.b();
        long j2 = 0;
        for (int i2 = 0; i2 < b2; i2++) {
            animationVector.a(i2);
            j2 = Math.max(j2, this.f2371a.b(animationVector2.a(i2)));
        }
        return j2;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final AnimationVector d(AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.d == null) {
            AnimationVector c2 = animationVector.c();
            p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.d = c2;
        }
        AnimationVector animationVector3 = this.d;
        if (animationVector3 == null) {
            p0.a.B0("targetVector");
            throw null;
        }
        int b2 = animationVector3.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector4 = this.d;
            if (animationVector4 == null) {
                p0.a.B0("targetVector");
                throw null;
            }
            animationVector4.e(this.f2371a.c(animationVector.a(i2), animationVector2.a(i2)), i2);
        }
        AnimationVector animationVector5 = this.d;
        if (animationVector5 != null) {
            return animationVector5;
        }
        p0.a.B0("targetVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final AnimationVector e(long j2, AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.f2372b == null) {
            AnimationVector c2 = animationVector.c();
            p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f2372b = c2;
        }
        AnimationVector animationVector3 = this.f2372b;
        if (animationVector3 == null) {
            p0.a.B0("valueVector");
            throw null;
        }
        int b2 = animationVector3.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector4 = this.f2372b;
            if (animationVector4 == null) {
                p0.a.B0("valueVector");
                throw null;
            }
            animationVector4.e(this.f2371a.e(j2, animationVector.a(i2), animationVector2.a(i2)), i2);
        }
        AnimationVector animationVector5 = this.f2372b;
        if (animationVector5 != null) {
            return animationVector5;
        }
        p0.a.B0("valueVector");
        throw null;
    }
}
