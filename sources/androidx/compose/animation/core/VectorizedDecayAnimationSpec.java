package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes2.dex */
public interface VectorizedDecayAnimationSpec<V extends AnimationVector> {
    float a();

    AnimationVector b(long j2, AnimationVector animationVector, AnimationVector animationVector2);

    long c(AnimationVector animationVector, AnimationVector animationVector2);

    AnimationVector d(AnimationVector animationVector, AnimationVector animationVector2);

    AnimationVector e(long j2, AnimationVector animationVector, AnimationVector animationVector2);
}
