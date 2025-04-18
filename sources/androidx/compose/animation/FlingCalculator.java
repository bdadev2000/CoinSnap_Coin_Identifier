package androidx.compose.animation;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;

@StabilityInferred
/* loaded from: classes.dex */
public final class FlingCalculator {

    /* renamed from: a, reason: collision with root package name */
    public final float f1882a;

    /* renamed from: b, reason: collision with root package name */
    public final Density f1883b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1884c;

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class FlingInfo {

        /* renamed from: a, reason: collision with root package name */
        public final float f1885a;

        /* renamed from: b, reason: collision with root package name */
        public final float f1886b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1887c;

        public FlingInfo(long j2, float f2, float f3) {
            this.f1885a = f2;
            this.f1886b = f3;
            this.f1887c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.compare(this.f1885a, flingInfo.f1885a) == 0 && Float.compare(this.f1886b, flingInfo.f1886b) == 0 && this.f1887c == flingInfo.f1887c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f1887c) + d.b(this.f1886b, Float.hashCode(this.f1885a) * 31, 31);
        }

        public final String toString() {
            return "FlingInfo(initialVelocity=" + this.f1885a + ", distance=" + this.f1886b + ", duration=" + this.f1887c + ')';
        }
    }

    public FlingCalculator(float f2, Density density) {
        this.f1882a = f2;
        this.f1883b = density;
        float density2 = density.getDensity();
        float f3 = FlingCalculatorKt.f1888a;
        this.f1884c = density2 * 386.0878f * 160.0f * 0.84f;
    }

    public final FlingInfo a(float f2) {
        double b2 = b(f2);
        double d = FlingCalculatorKt.f1888a;
        double d2 = d - 1.0d;
        return new FlingInfo((long) (Math.exp(b2 / d2) * 1000.0d), f2, (float) (Math.exp((d / d2) * b2) * this.f1882a * this.f1884c));
    }

    public final double b(float f2) {
        float[] fArr = AndroidFlingSpline.f1621a;
        return Math.log((Math.abs(f2) * 0.35f) / (this.f1882a * this.f1884c));
    }
}
