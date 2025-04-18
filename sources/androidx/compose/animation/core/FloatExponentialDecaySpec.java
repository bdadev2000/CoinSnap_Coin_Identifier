package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {

    /* renamed from: a, reason: collision with root package name */
    public final float f2086a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2087b;

    public FloatExponentialDecaySpec(float f2, float f3) {
        this.f2086a = Math.max(1.0E-7f, Math.abs(f3));
        this.f2087b = Math.max(1.0E-4f, f2) * (-4.2f);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float a() {
        return this.f2086a;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long b(float f2) {
        return ((((float) Math.log(this.f2086a / Math.abs(f2))) * 1000.0f) / this.f2087b) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float c(float f2, float f3) {
        if (Math.abs(f3) <= this.f2086a) {
            return f2;
        }
        double log = Math.log(Math.abs(r1 / f3));
        float f4 = this.f2087b;
        double d = f4;
        float f5 = f3 / f4;
        return (f5 * ((float) Math.exp((d * ((log / d) * 1000)) / 1000.0f))) + (f2 - f5);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float d(long j2, float f2) {
        return f2 * ((float) Math.exp((((float) (j2 / 1000000)) / 1000.0f) * this.f2087b));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float e(long j2, float f2, float f3) {
        float f4 = f3 / this.f2087b;
        return (f4 * ((float) Math.exp((r0 * ((float) (j2 / 1000000))) / 1000.0f))) + (f2 - f4);
    }
}
