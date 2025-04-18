package androidx.compose.animation;

import androidx.compose.animation.FlingCalculator;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {

    /* renamed from: a, reason: collision with root package name */
    public final FlingCalculator f1971a;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.f1971a = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.f1972a, density);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float a() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long b(float f2) {
        return ((long) (Math.exp(this.f1971a.b(f2) / (FlingCalculatorKt.f1888a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float c(float f2, float f3) {
        double b2 = this.f1971a.b(f3);
        double d = FlingCalculatorKt.f1888a;
        return (Math.signum(f3) * ((float) (Math.exp((d / (d - 1.0d)) * b2) * r0.f1882a * r0.f1884c))) + f2;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float d(long j2, float f2) {
        long j3 = j2 / 1000000;
        FlingCalculator.FlingInfo a2 = this.f1971a.a(f2);
        long j4 = a2.f1887c;
        return (((Math.signum(a2.f1885a) * AndroidFlingSpline.a(j4 > 0 ? ((float) j3) / ((float) j4) : 1.0f).f1623b) * a2.f1886b) / ((float) j4)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float e(long j2, float f2, float f3) {
        long j3 = j2 / 1000000;
        FlingCalculator.FlingInfo a2 = this.f1971a.a(f3);
        long j4 = a2.f1887c;
        return (Math.signum(a2.f1885a) * a2.f1886b * AndroidFlingSpline.a(j4 > 0 ? ((float) j3) / ((float) j4) : 1.0f).f1622a) + f2;
    }
}
