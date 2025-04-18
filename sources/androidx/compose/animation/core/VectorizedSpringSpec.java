package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.b0;
import e0.q;
import java.util.ArrayList;
import java.util.Iterator;
import w0.f;
import w0.g;

@StabilityInferred
/* loaded from: classes2.dex */
public final class VectorizedSpringSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VectorizedFloatAnimationSpec f2400a;

    public VectorizedSpringSpec(final float f2, final float f3, final AnimationVector animationVector) {
        this.f2400a = new VectorizedFloatAnimationSpec(animationVector != null ? new Animations(f2, f3, animationVector) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList f2365a;

            {
                g F0 = p0.a.F0(0, animationVector.b());
                ArrayList arrayList = new ArrayList(q.M(F0, 10));
                Iterator it = F0.iterator();
                while (((f) it).f31411c) {
                    arrayList.add(new FloatSpringSpec(f2, f3, animationVector.a(((b0) it).b())));
                }
                this.f2365a = arrayList;
            }

            @Override // androidx.compose.animation.core.Animations
            public final FloatAnimationSpec get(int i2) {
                return (FloatSpringSpec) this.f2365a.get(i2);
            }
        } : new Animations(f2, f3) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2

            /* renamed from: a, reason: collision with root package name */
            public final FloatSpringSpec f2366a;

            {
                this.f2366a = new FloatSpringSpec(f2, f3, 0.01f);
            }

            @Override // androidx.compose.animation.core.Animations
            public final FloatAnimationSpec get(int i2) {
                return this.f2366a;
            }
        });
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public final boolean a() {
        this.f2400a.getClass();
        return false;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2400a.b(animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector d(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2400a.d(animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2400a.f(j2, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector g(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2400a.g(j2, animationVector, animationVector2, animationVector3);
    }
}
