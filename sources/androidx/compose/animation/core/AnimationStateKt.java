package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class AnimationStateKt {
    public static AnimationState a(float f2, float f3, int i2) {
        return new AnimationState(VectorConvertersKt.f2340a, Float.valueOf(f2), new AnimationVector1D((i2 & 2) != 0 ? 0.0f : f3), (i2 & 4) != 0 ? Long.MIN_VALUE : 0L, (i2 & 8) != 0 ? Long.MIN_VALUE : 0L, false);
    }

    public static AnimationState b(AnimationState animationState, float f2, float f3, int i2) {
        return new AnimationState(animationState.f2034a, Float.valueOf((i2 & 1) != 0 ? ((Number) animationState.f2035b.getValue()).floatValue() : f2), new AnimationVector1D((i2 & 2) != 0 ? ((AnimationVector1D) animationState.f2036c).f2039a : f3), (i2 & 4) != 0 ? animationState.d : 0L, (i2 & 8) != 0 ? animationState.f2037f : 0L, (i2 & 16) != 0 ? animationState.f2038g : false);
    }
}
