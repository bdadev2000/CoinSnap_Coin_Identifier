package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes2.dex */
public interface VectorizedFiniteAnimationSpec<V extends AnimationVector> extends VectorizedAnimationSpec<V> {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    default boolean a() {
        return false;
    }
}
