package androidx.compose.foundation.layout;

import android.support.v4.media.d;

/* loaded from: classes3.dex */
final class AndroidFlingSpline {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f3767a = new float[101];

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f3768b = new float[101];

    /* loaded from: classes3.dex */
    public static final class FlingResult {
        public final boolean equals(Object obj) {
            if (!(obj instanceof FlingResult)) {
                return false;
            }
            ((FlingResult) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Long.hashCode(0L);
        }

        public final String toString() {
            return "FlingResult(packedValue=0)";
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
            f3767a[i2] = (((f3 * 0.5f) + f2) * f4) + f5;
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
            f3768b[i2] = (((f6 * 0.35000002f) + (f7 * 0.175f)) * f8) + f9;
        }
        f3768b[100] = 1.0f;
        f3767a[100] = 1.0f;
    }

    public static long a(float f2) {
        float f3;
        float f4;
        float f5 = 100;
        int i2 = (int) (f5 * f2);
        if (i2 < 100) {
            float f6 = i2 / f5;
            int i3 = i2 + 1;
            float f7 = i3 / f5;
            float[] fArr = f3767a;
            float f8 = fArr[i2];
            f4 = (fArr[i3] - f8) / (f7 - f6);
            f3 = d.a(f2, f6, f4, f8);
        } else {
            f3 = 1.0f;
            f4 = 0.0f;
        }
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }
}
