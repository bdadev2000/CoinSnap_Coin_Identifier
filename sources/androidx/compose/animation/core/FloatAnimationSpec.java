package androidx.compose.animation.core;

/* loaded from: classes.dex */
public interface FloatAnimationSpec extends AnimationSpec<Float> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    /* bridge */ /* synthetic */ default VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return b();
    }

    default VectorizedFloatAnimationSpec b() {
        return new VectorizedFloatAnimationSpec(this);
    }

    default float c(float f2, float f3, float f4) {
        return e(f(f2, f3, f4), f2, f3, f4);
    }

    float d(long j2, float f2, float f3, float f4);

    float e(long j2, float f2, float f3, float f4);

    long f(float f2, float f3, float f4);
}
