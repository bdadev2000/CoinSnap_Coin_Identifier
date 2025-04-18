package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.ui.unit.Density;

/* loaded from: classes3.dex */
final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {

    /* renamed from: a, reason: collision with root package name */
    public final float f4120a;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.f4120a = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float a() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long b(float f2) {
        float[] fArr = AndroidFlingSpline.f3767a;
        return (long) (Math.exp(Math.log((Math.abs(f2) * 0.35f) / (WindowInsetsConnection_androidKt.f4132a * this.f4120a)) / WindowInsetsConnection_androidKt.f4134c) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float c(float f2, float f3) {
        return f2 + f(f3);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float d(long j2, float f2) {
        long b2 = b(f2);
        return ((Float.intBitsToFloat((int) (AndroidFlingSpline.a(b2 > 0 ? ((float) j2) / ((float) b2) : 1.0f) & 4294967295L)) * f(f2)) / ((float) b2)) * 1.0E9f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float e(long j2, float f2, float f3) {
        long b2 = b(f3);
        return (Float.intBitsToFloat((int) (AndroidFlingSpline.a(b2 > 0 ? ((float) j2) / ((float) b2) : 1.0f) >> 32)) * f(f3)) + f2;
    }

    public final float f(float f2) {
        float[] fArr = AndroidFlingSpline.f3767a;
        float f3 = WindowInsetsConnection_androidKt.f4132a;
        float f4 = this.f4120a;
        return Math.signum(f2) * ((float) (Math.exp((WindowInsetsConnection_androidKt.f4133b / WindowInsetsConnection_androidKt.f4134c) * Math.log((Math.abs(f2) * 0.35f) / (f3 * f4))) * f3 * f4));
    }
}
