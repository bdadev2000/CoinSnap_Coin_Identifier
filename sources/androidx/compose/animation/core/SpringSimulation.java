package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes.dex */
public final class SpringSimulation {

    /* renamed from: a, reason: collision with root package name */
    public float f2226a;

    /* renamed from: b, reason: collision with root package name */
    public double f2227b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2228c;
    public double d;
    public double e;

    /* renamed from: f, reason: collision with root package name */
    public double f2229f;

    /* renamed from: g, reason: collision with root package name */
    public float f2230g;

    public final long a(long j2, float f2, float f3) {
        double cos;
        double d;
        if (!this.f2228c) {
            if (this.f2226a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f4 = this.f2230g;
            double d2 = f4;
            double d3 = d2 * d2;
            if (f4 > 1.0f) {
                double d4 = this.f2227b;
                double d5 = d3 - 1;
                this.d = (Math.sqrt(d5) * d4) + ((-f4) * d4);
                double d6 = -this.f2230g;
                double d7 = this.f2227b;
                this.e = (d6 * d7) - (Math.sqrt(d5) * d7);
            } else if (f4 >= 0.0f && f4 < 1.0f) {
                this.f2229f = Math.sqrt(1 - d3) * this.f2227b;
            }
            this.f2228c = true;
        }
        float f5 = f2 - this.f2226a;
        double d8 = j2 / 1000.0d;
        float f6 = this.f2230g;
        if (f6 > 1.0f) {
            double d9 = f5;
            double d10 = this.e;
            double d11 = f3;
            double d12 = this.d;
            double d13 = d9 - (((d10 * d9) - d11) / (d10 - d12));
            double d14 = ((d9 * d10) - d11) / (d10 - d12);
            d = (Math.exp(this.d * d8) * d14) + (Math.exp(d10 * d8) * d13);
            double d15 = this.e;
            double exp = Math.exp(d15 * d8) * d13 * d15;
            double d16 = this.d;
            cos = (Math.exp(d16 * d8) * d14 * d16) + exp;
        } else if (f6 == 1.0f) {
            double d17 = this.f2227b;
            double d18 = f5;
            double d19 = (d17 * d18) + f3;
            double d20 = (d19 * d8) + d18;
            d = Math.exp((-d17) * d8) * d20;
            double exp2 = Math.exp((-this.f2227b) * d8) * d20;
            double d21 = this.f2227b;
            cos = (Math.exp((-d21) * d8) * d19) + (exp2 * (-d21));
        } else {
            double d22 = 1 / this.f2229f;
            double d23 = this.f2227b;
            double d24 = f5;
            double d25 = ((f6 * d23 * d24) + f3) * d22;
            double exp3 = Math.exp((-f6) * d23 * d8) * ((Math.sin(this.f2229f * d8) * d25) + (Math.cos(this.f2229f * d8) * d24));
            double d26 = this.f2227b;
            double d27 = (-d26) * exp3 * this.f2230g;
            double exp4 = Math.exp((-r7) * d26 * d8);
            double d28 = this.f2229f;
            double sin = Math.sin(d28 * d8) * (-d28) * d24;
            double d29 = this.f2229f;
            cos = (((Math.cos(d29 * d8) * d25 * d29) + sin) * exp4) + d27;
            d = exp3;
        }
        return (Float.floatToRawIntBits((float) cos) & 4294967295L) | (Float.floatToRawIntBits((float) (d + this.f2226a)) << 32);
    }
}
