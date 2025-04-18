package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public interface Animation<T, V extends AnimationVector> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    boolean a();

    AnimationVector b(long j2);

    default boolean c(long j2) {
        return j2 >= d();
    }

    long d();

    TwoWayConverter e();

    Object f(long j2);

    Object g();
}
