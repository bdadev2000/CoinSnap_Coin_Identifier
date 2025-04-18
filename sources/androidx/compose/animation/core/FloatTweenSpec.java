package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {

    /* renamed from: a, reason: collision with root package name */
    public final int f2090a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2091b;

    /* renamed from: c, reason: collision with root package name */
    public final Easing f2092c;
    public final long d;
    public final long e;

    public FloatTweenSpec(int i2, int i3, Easing easing) {
        this.f2090a = i2;
        this.f2091b = i3;
        this.f2092c = easing;
        this.d = i2 * 1000000;
        this.e = i3 * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float d(long j2, float f2, float f3, float f4) {
        float B = this.f2090a == 0 ? 1.0f : ((float) p0.a.B(j2 - this.e, 0L, this.d)) / ((float) this.d);
        if (B < 0.0f) {
            B = 0.0f;
        }
        float b2 = this.f2092c.b(B <= 1.0f ? B : 1.0f);
        TwoWayConverter twoWayConverter = VectorConvertersKt.f2340a;
        return (f3 * b2) + ((1 - b2) * f2);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float e(long j2, float f2, float f3, float f4) {
        long B = p0.a.B(j2 - this.e, 0L, this.d);
        if (B < 0) {
            return 0.0f;
        }
        if (B == 0) {
            return f4;
        }
        return (d(B, f2, f3, f4) - d(B - 1000000, f2, f3, f4)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final long f(float f2, float f3, float f4) {
        return (this.f2091b + this.f2090a) * 1000000;
    }
}
