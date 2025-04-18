package androidx.compose.animation.core;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec;

/* loaded from: classes2.dex */
public final class DecayAnimationSpecKt {
    public static final float a(DecayAnimationSpec decayAnimationSpec, float f2, float f3) {
        TwoWayConverter twoWayConverter = VectorConvertersKt.f2340a;
        return ((AnimationVector1D) decayAnimationSpec.b().d(new AnimationVector1D(f2), new AnimationVector1D(f3))).f2039a;
    }

    public static DecayAnimationSpec b() {
        return new DecayAnimationSpecImpl(new FloatExponentialDecaySpec(1.0f, 0.1f));
    }

    public static final DecayAnimationSpec c(SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec) {
        return new DecayAnimationSpecImpl(splineBasedFloatDecayAnimationSpec);
    }
}
