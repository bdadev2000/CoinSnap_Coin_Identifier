package androidx.compose.animation.core;

import androidx.compose.ui.MotionDurationScale;
import d0.b0;
import h0.g;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
public final class SuspendAnimationKt {
    public static final Object a(float f2, float f3, float f4, AnimationSpec animationSpec, p pVar, g gVar) {
        TwoWayConverter twoWayConverter = VectorConvertersKt.f2340a;
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        Float f7 = new Float(f4);
        l lVar = ((TwoWayConverterImpl) twoWayConverter).f2338a;
        AnimationVector animationVector = (AnimationVector) lVar.invoke(f7);
        if (animationVector == null) {
            animationVector = ((AnimationVector) lVar.invoke(f5)).c();
            p0.a.q(animationVector, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        }
        AnimationVector animationVector2 = animationVector;
        Object b2 = b(new AnimationState(twoWayConverter, f5, animationVector2, 56), new TargetBasedAnimation(animationSpec, twoWayConverter, f5, f6, animationVector2), Long.MIN_VALUE, new SuspendAnimationKt$animate$3(pVar), gVar);
        i0.a aVar = i0.a.f30806a;
        b0 b0Var = b0.f30125a;
        if (b2 != aVar) {
            b2 = b0Var;
        }
        return b2 == aVar ? b2 : b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fe A[Catch: CancellationException -> 0x003a, TryCatch #1 {CancellationException -> 0x003a, blocks: (B:13:0x0036, B:16:0x00e9, B:18:0x00fe, B:20:0x0127, B:27:0x012c), top: B:12:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.animation.core.SuspendAnimationKt$animate$4, h0.g, j0.c] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /* JADX WARN: Type inference failed for: r14v4, types: [kotlin.jvm.internal.f0] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.compose.runtime.MonotonicFrameClock] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.runtime.MonotonicFrameClock] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.animation.core.AnimationState r24, androidx.compose.animation.core.Animation r25, long r26, q0.l r28, h0.g r29) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.b(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, q0.l, h0.g):java.lang.Object");
    }

    public static /* synthetic */ Object c(float f2, float f3, AnimationSpec animationSpec, p pVar, g gVar, int i2) {
        if ((i2 & 8) != 0) {
            animationSpec = AnimationSpecKt.c(0.0f, 0.0f, null, 7);
        }
        return a(f2, f3, 0.0f, animationSpec, pVar, gVar);
    }

    public static final Object d(float f2, float f3, FloatDecayAnimationSpec floatDecayAnimationSpec, p pVar, g gVar) {
        Object b2 = b(AnimationStateKt.a(f2, f3, 28), new DecayAnimation(new DecayAnimationSpecImpl(floatDecayAnimationSpec), VectorConvertersKt.f2340a, Float.valueOf(f2), new AnimationVector1D(f3)), Long.MIN_VALUE, new SuspendAnimationKt$animateDecay$2(pVar), gVar);
        return b2 == i0.a.f30806a ? b2 : b0.f30125a;
    }

    public static final Object e(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z2, l lVar, g gVar) {
        Object b2 = b(animationState, new DecayAnimation(decayAnimationSpec, animationState.f2034a, animationState.f2035b.getValue(), animationState.f2036c), z2 ? animationState.d : Long.MIN_VALUE, lVar, gVar);
        return b2 == i0.a.f30806a ? b2 : b0.f30125a;
    }

    public static final Object f(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z2, l lVar, g gVar) {
        Object b2 = b(animationState, new TargetBasedAnimation(animationSpec, animationState.f2034a, animationState.f2035b.getValue(), obj, animationState.f2036c), z2 ? animationState.d : Long.MIN_VALUE, lVar, gVar);
        return b2 == i0.a.f30806a ? b2 : b0.f30125a;
    }

    public static /* synthetic */ Object g(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z2, l lVar, g gVar, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.c(0.0f, 0.0f, null, 7);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i2 & 8) != 0) {
            lVar = SuspendAnimationKt$animateTo$2.f2258a;
        }
        return f(animationState, obj, animationSpec2, z3, lVar, gVar);
    }

    public static final void h(AnimationScope animationScope, long j2, float f2, Animation animation, AnimationState animationState, l lVar) {
        long d = f2 == 0.0f ? animation.d() : ((float) (j2 - animationScope.f2029c)) / f2;
        animationScope.f2031g = j2;
        animationScope.e.setValue(animation.f(d));
        animationScope.f2030f = animation.b(d);
        if (animation.c(d)) {
            animationScope.f2032h = animationScope.f2031g;
            animationScope.f2033i.setValue(Boolean.FALSE);
        }
        j(animationScope, animationState);
        lVar.invoke(animationScope);
    }

    public static final float i(h0.l lVar) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) lVar.i(MotionDurationScale.Key.f14701a);
        float o2 = motionDurationScale != null ? motionDurationScale.o() : 1.0f;
        if (o2 >= 0.0f) {
            return o2;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static final void j(AnimationScope animationScope, AnimationState animationState) {
        animationState.f2035b.setValue(animationScope.e.getValue());
        AnimationVector animationVector = animationState.f2036c;
        AnimationVector animationVector2 = animationScope.f2030f;
        int b2 = animationVector.b();
        for (int i2 = 0; i2 < b2; i2++) {
            animationVector.e(animationVector2.a(i2), i2);
        }
        animationState.f2037f = animationScope.f2032h;
        animationState.d = animationScope.f2031g;
        animationState.f2038g = ((Boolean) animationScope.f2033i.getValue()).booleanValue();
    }
}
