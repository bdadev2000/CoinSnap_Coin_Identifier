package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {

    /* renamed from: a, reason: collision with root package name */
    public final VectorizedDecayAnimationSpec f2072a;

    /* renamed from: b, reason: collision with root package name */
    public final TwoWayConverter f2073b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2074c;
    public final AnimationVector d;
    public final AnimationVector e;

    /* renamed from: f, reason: collision with root package name */
    public final AnimationVector f2075f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2076g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2077h;

    public DecayAnimation(DecayAnimationSpec decayAnimationSpec, TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector) {
        VectorizedDecayAnimationSpec b2 = decayAnimationSpec.b();
        this.f2072a = b2;
        this.f2073b = twoWayConverter;
        this.f2074c = obj;
        AnimationVector animationVector2 = (AnimationVector) twoWayConverter.a().invoke(obj);
        this.d = animationVector2;
        this.e = AnimationVectorsKt.a(animationVector);
        this.f2076g = twoWayConverter.b().invoke(b2.d(animationVector2, animationVector));
        long c2 = b2.c(animationVector2, animationVector);
        this.f2077h = c2;
        AnimationVector a2 = AnimationVectorsKt.a(b2.b(c2, animationVector2, animationVector));
        this.f2075f = a2;
        int b3 = a2.b();
        for (int i2 = 0; i2 < b3; i2++) {
            AnimationVector animationVector3 = this.f2075f;
            animationVector3.e(p0.a.z(animationVector3.a(i2), -this.f2072a.a(), this.f2072a.a()), i2);
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public final boolean a() {
        return false;
    }

    @Override // androidx.compose.animation.core.Animation
    public final AnimationVector b(long j2) {
        if (c(j2)) {
            return this.f2075f;
        }
        return this.f2072a.b(j2, this.d, this.e);
    }

    @Override // androidx.compose.animation.core.Animation
    public final long d() {
        return this.f2077h;
    }

    @Override // androidx.compose.animation.core.Animation
    public final TwoWayConverter e() {
        return this.f2073b;
    }

    @Override // androidx.compose.animation.core.Animation
    public final Object f(long j2) {
        if (c(j2)) {
            return this.f2076g;
        }
        return this.f2073b.b().invoke(this.f2072a.e(j2, this.d, this.e));
    }

    @Override // androidx.compose.animation.core.Animation
    public final Object g() {
        return this.f2076g;
    }
}
