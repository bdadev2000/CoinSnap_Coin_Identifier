package androidx.compose.animation.core;

/* loaded from: classes2.dex */
public final class AnimationVectorsKt {
    public static final AnimationVector a(AnimationVector animationVector) {
        AnimationVector c2 = animationVector.c();
        p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        int b2 = c2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            c2.e(animationVector.a(i2), i2);
        }
        return c2;
    }
}
