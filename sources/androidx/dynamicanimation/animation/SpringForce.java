package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.DynamicAnimation;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public final class SpringForce implements Force {

    /* renamed from: a, reason: collision with root package name */
    public double f19492a;

    /* renamed from: b, reason: collision with root package name */
    public double f19493b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19494c;
    public double d;
    public double e;

    /* renamed from: f, reason: collision with root package name */
    public double f19495f;

    /* renamed from: g, reason: collision with root package name */
    public double f19496g;

    /* renamed from: h, reason: collision with root package name */
    public double f19497h;

    /* renamed from: i, reason: collision with root package name */
    public double f19498i;

    /* renamed from: j, reason: collision with root package name */
    public final DynamicAnimation.MassState f19499j;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, androidx.dynamicanimation.animation.DynamicAnimation$MassState] */
    public SpringForce() {
        this.f19492a = Math.sqrt(1500.0d);
        this.f19493b = 0.5d;
        this.f19494c = false;
        this.f19498i = Double.MAX_VALUE;
        this.f19499j = new Object();
    }

    public final DynamicAnimation.MassState a(double d, double d2, long j2) {
        double cos;
        double d3;
        if (!this.f19494c) {
            if (this.f19498i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d4 = this.f19493b;
            if (d4 > 1.0d) {
                double d5 = this.f19492a;
                this.f19495f = (Math.sqrt((d4 * d4) - 1.0d) * d5) + ((-d4) * d5);
                double d6 = this.f19493b;
                double d7 = this.f19492a;
                this.f19496g = ((-d6) * d7) - (Math.sqrt((d6 * d6) - 1.0d) * d7);
            } else if (d4 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d4 < 1.0d) {
                this.f19497h = Math.sqrt(1.0d - (d4 * d4)) * this.f19492a;
            }
            this.f19494c = true;
        }
        double d8 = j2 / 1000.0d;
        double d9 = d - this.f19498i;
        double d10 = this.f19493b;
        if (d10 > 1.0d) {
            double d11 = this.f19496g;
            double d12 = this.f19495f;
            double d13 = d9 - (((d11 * d9) - d2) / (d11 - d12));
            double d14 = ((d9 * d11) - d2) / (d11 - d12);
            d3 = (Math.pow(2.718281828459045d, this.f19495f * d8) * d14) + (Math.pow(2.718281828459045d, d11 * d8) * d13);
            double d15 = this.f19496g;
            double pow = Math.pow(2.718281828459045d, d15 * d8) * d13 * d15;
            double d16 = this.f19495f;
            cos = (Math.pow(2.718281828459045d, d16 * d8) * d14 * d16) + pow;
        } else if (d10 == 1.0d) {
            double d17 = this.f19492a;
            double d18 = (d17 * d9) + d2;
            double d19 = (d18 * d8) + d9;
            double pow2 = Math.pow(2.718281828459045d, (-d17) * d8) * d19;
            double pow3 = Math.pow(2.718281828459045d, (-this.f19492a) * d8) * d19;
            double d20 = this.f19492a;
            cos = (Math.pow(2.718281828459045d, (-d20) * d8) * d18) + (pow3 * (-d20));
            d3 = pow2;
        } else {
            double d21 = 1.0d / this.f19497h;
            double d22 = this.f19492a;
            double d23 = ((d10 * d22 * d9) + d2) * d21;
            double sin = ((Math.sin(this.f19497h * d8) * d23) + (Math.cos(this.f19497h * d8) * d9)) * Math.pow(2.718281828459045d, (-d10) * d22 * d8);
            double d24 = this.f19492a;
            double d25 = this.f19493b;
            double d26 = (-d24) * sin * d25;
            double pow4 = Math.pow(2.718281828459045d, (-d25) * d24 * d8);
            double d27 = this.f19497h;
            double sin2 = Math.sin(d27 * d8) * (-d27) * d9;
            double d28 = this.f19497h;
            cos = (((Math.cos(d28 * d8) * d23 * d28) + sin2) * pow4) + d26;
            d3 = sin;
        }
        float f2 = (float) (d3 + this.f19498i);
        DynamicAnimation.MassState massState = this.f19499j;
        massState.f19486a = f2;
        massState.f19487b = (float) cos;
        return massState;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, androidx.dynamicanimation.animation.DynamicAnimation$MassState] */
    public SpringForce(float f2) {
        this.f19492a = Math.sqrt(1500.0d);
        this.f19493b = 0.5d;
        this.f19494c = false;
        this.f19499j = new Object();
        this.f19498i = f2;
    }
}
