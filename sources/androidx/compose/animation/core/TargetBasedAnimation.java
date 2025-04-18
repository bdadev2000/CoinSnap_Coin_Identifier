package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {

    /* renamed from: a, reason: collision with root package name */
    public final VectorizedAnimationSpec f2260a;

    /* renamed from: b, reason: collision with root package name */
    public final TwoWayConverter f2261b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2262c;
    public Object d;
    public AnimationVector e;

    /* renamed from: f, reason: collision with root package name */
    public AnimationVector f2263f;

    /* renamed from: g, reason: collision with root package name */
    public final AnimationVector f2264g;

    /* renamed from: h, reason: collision with root package name */
    public long f2265h;

    /* renamed from: i, reason: collision with root package name */
    public AnimationVector f2266i;

    public TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector) {
        AnimationVector c2;
        this.f2260a = animationSpec.a(twoWayConverter);
        this.f2261b = twoWayConverter;
        this.f2262c = obj2;
        this.d = obj;
        this.e = (AnimationVector) twoWayConverter.a().invoke(obj);
        this.f2263f = (AnimationVector) twoWayConverter.a().invoke(obj2);
        if (animationVector != null) {
            c2 = AnimationVectorsKt.a(animationVector);
        } else {
            c2 = ((AnimationVector) twoWayConverter.a().invoke(obj)).c();
            p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        }
        this.f2264g = c2;
        this.f2265h = -1L;
    }

    @Override // androidx.compose.animation.core.Animation
    public final boolean a() {
        return this.f2260a.a();
    }

    @Override // androidx.compose.animation.core.Animation
    public final AnimationVector b(long j2) {
        if (!c(j2)) {
            return this.f2260a.f(j2, this.e, this.f2263f, this.f2264g);
        }
        AnimationVector animationVector = this.f2266i;
        if (animationVector != null) {
            return animationVector;
        }
        AnimationVector d = this.f2260a.d(this.e, this.f2263f, this.f2264g);
        this.f2266i = d;
        return d;
    }

    @Override // androidx.compose.animation.core.Animation
    public final long d() {
        if (this.f2265h < 0) {
            this.f2265h = this.f2260a.b(this.e, this.f2263f, this.f2264g);
        }
        return this.f2265h;
    }

    @Override // androidx.compose.animation.core.Animation
    public final TwoWayConverter e() {
        return this.f2261b;
    }

    @Override // androidx.compose.animation.core.Animation
    public final Object f(long j2) {
        if (c(j2)) {
            return this.f2262c;
        }
        AnimationVector g2 = this.f2260a.g(j2, this.e, this.f2263f, this.f2264g);
        int b2 = g2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            if (!(!Float.isNaN(g2.a(i2)))) {
                throw new IllegalStateException("AnimationVector cannot contain a NaN. " + g2 + ". Animation: " + this + ", playTimeNanos: " + j2);
            }
        }
        return this.f2261b.b().invoke(g2);
    }

    @Override // androidx.compose.animation.core.Animation
    public final Object g() {
        return this.f2262c;
    }

    public final void h(Object obj) {
        if (p0.a.g(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (AnimationVector) this.f2261b.a().invoke(obj);
        this.f2266i = null;
        this.f2265h = -1L;
    }

    public final void i(Object obj) {
        if (p0.a.g(this.f2262c, obj)) {
            return;
        }
        this.f2262c = obj;
        this.f2263f = (AnimationVector) this.f2261b.a().invoke(obj);
        this.f2266i = null;
        this.f2265h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.f2262c + ",initial velocity: " + this.f2264g + ", duration: " + (d() / 1000000) + " ms,animationSpec: " + this.f2260a;
    }
}
