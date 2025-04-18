package androidx.compose.animation;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AndroidFlingSpline {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f1621a;

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class FlingResult {

        /* renamed from: a, reason: collision with root package name */
        public final float f1622a;

        /* renamed from: b, reason: collision with root package name */
        public final float f1623b;

        public FlingResult(float f2, float f3) {
            this.f1622a = f2;
            this.f1623b = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) obj;
            return Float.compare(this.f1622a, flingResult.f1622a) == 0 && Float.compare(this.f1623b, flingResult.f1623b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f1623b) + (Float.hashCode(this.f1622a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.f1622a);
            sb.append(", velocityCoefficient=");
            return d.n(sb, this.f1623b, ')');
        }
    }

    static {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float[] fArr = new float[101];
        f1621a = fArr;
        float[] fArr2 = new float[101];
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i2 = 0; i2 < 100; i2++) {
            float f12 = i2 / 100;
            float f13 = 1.0f;
            while (true) {
                f2 = ((f13 - f10) / 2.0f) + f10;
                f3 = 1.0f - f2;
                f4 = f2 * 3.0f * f3;
                f5 = f2 * f2 * f2;
                float f14 = (((f2 * 0.35000002f) + (f3 * 0.175f)) * f4) + f5;
                if (Math.abs(f14 - f12) < 1.0E-5d) {
                    break;
                } else if (f14 > f12) {
                    f13 = f2;
                } else {
                    f10 = f2;
                }
            }
            float f15 = 0.5f;
            fArr[i2] = (((f3 * 0.5f) + f2) * f4) + f5;
            float f16 = 1.0f;
            while (true) {
                f6 = ((f16 - f11) / 2.0f) + f11;
                f7 = 1.0f - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f17 = (((f7 * f15) + f6) * f8) + f9;
                if (Math.abs(f17 - f12) >= 1.0E-5d) {
                    if (f17 > f12) {
                        f16 = f6;
                    } else {
                        f11 = f6;
                    }
                    f15 = 0.5f;
                }
            }
            fArr2[i2] = (((f6 * 0.35000002f) + (f7 * 0.175f)) * f8) + f9;
        }
        fArr2[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public static FlingResult a(float f2) {
        float f3 = 0.0f;
        float f4 = 1.0f;
        float z2 = p0.a.z(f2, 0.0f, 1.0f);
        float f5 = 100;
        int i2 = (int) (f5 * z2);
        if (i2 < 100) {
            float f6 = i2 / f5;
            int i3 = i2 + 1;
            float f7 = i3 / f5;
            float[] fArr = f1621a;
            float f8 = fArr[i2];
            float f9 = (fArr[i3] - f8) / (f7 - f6);
            float a2 = d.a(z2, f6, f9, f8);
            f3 = f9;
            f4 = a2;
        }
        return new FlingResult(f4, f3);
    }
}
