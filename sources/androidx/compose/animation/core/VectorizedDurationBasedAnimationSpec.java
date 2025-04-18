package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public interface VectorizedDurationBasedAnimationSpec<V extends AnimationVector> extends VectorizedFiniteAnimationSpec<V> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    default long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return (e() + c()) * 1000000;
    }

    int c();

    int e();
}
