package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.b0;
import java.util.Iterator;

@StabilityInferred
/* loaded from: classes4.dex */
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Animations f2367a;

    /* renamed from: b, reason: collision with root package name */
    public AnimationVector f2368b;

    /* renamed from: c, reason: collision with root package name */
    public AnimationVector f2369c;
    public AnimationVector d;

    public VectorizedFloatAnimationSpec(Animations animations) {
        this.f2367a = animations;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        Iterator it = p0.a.F0(0, animationVector.b()).iterator();
        long j2 = 0;
        while (it.hasNext()) {
            int b2 = ((b0) it).b();
            j2 = Math.max(j2, this.f2367a.get(b2).f(animationVector.a(b2), animationVector2.a(b2), animationVector3.a(b2)));
        }
        return j2;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector d(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.d == null) {
            AnimationVector c2 = animationVector3.c();
            p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.d = c2;
        }
        AnimationVector animationVector4 = this.d;
        if (animationVector4 == null) {
            p0.a.B0("endVelocityVector");
            throw null;
        }
        int b2 = animationVector4.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector5 = this.d;
            if (animationVector5 == null) {
                p0.a.B0("endVelocityVector");
                throw null;
            }
            animationVector5.e(this.f2367a.get(i2).c(animationVector.a(i2), animationVector2.a(i2), animationVector3.a(i2)), i2);
        }
        AnimationVector animationVector6 = this.d;
        if (animationVector6 != null) {
            return animationVector6;
        }
        p0.a.B0("endVelocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.f2369c == null) {
            AnimationVector c2 = animationVector3.c();
            p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f2369c = c2;
        }
        AnimationVector animationVector4 = this.f2369c;
        if (animationVector4 == null) {
            p0.a.B0("velocityVector");
            throw null;
        }
        int b2 = animationVector4.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector5 = this.f2369c;
            if (animationVector5 == null) {
                p0.a.B0("velocityVector");
                throw null;
            }
            animationVector5.e(this.f2367a.get(i2).e(j2, animationVector.a(i2), animationVector2.a(i2), animationVector3.a(i2)), i2);
        }
        AnimationVector animationVector6 = this.f2369c;
        if (animationVector6 != null) {
            return animationVector6;
        }
        p0.a.B0("velocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector g(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.f2368b == null) {
            AnimationVector c2 = animationVector.c();
            p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f2368b = c2;
        }
        AnimationVector animationVector4 = this.f2368b;
        if (animationVector4 == null) {
            p0.a.B0("valueVector");
            throw null;
        }
        int b2 = animationVector4.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector5 = this.f2368b;
            if (animationVector5 == null) {
                p0.a.B0("valueVector");
                throw null;
            }
            animationVector5.e(this.f2367a.get(i2).d(j2, animationVector.a(i2), animationVector2.a(i2), animationVector3.a(i2)), i2);
        }
        AnimationVector animationVector6 = this.f2368b;
        if (animationVector6 != null) {
            return animationVector6;
        }
        p0.a.B0("valueVector");
        throw null;
    }

    public VectorizedFloatAnimationSpec(final FloatAnimationSpec floatAnimationSpec) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public final FloatAnimationSpec get(int i2) {
                return FloatAnimationSpec.this;
            }
        });
    }
}
