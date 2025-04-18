package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import p0.a;

@StabilityInferred
@RestrictTo
/* loaded from: classes.dex */
public final class FontScaleConverterTable implements FontScaleConverter {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f17506a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f17507b;

    /* loaded from: classes.dex */
    public static final class Companion {
        public static final float a(float f2, float[] fArr, float[] fArr2) {
            float f3;
            float f4;
            float f5;
            float f6;
            float max;
            float abs = Math.abs(f2);
            float signum = Math.signum(f2);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                max = signum * fArr2[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                int i3 = i2 - 1;
                if (i3 >= fArr.length - 1) {
                    float f7 = fArr[fArr.length - 1];
                    float f8 = fArr2[fArr.length - 1];
                    if (f7 == 0.0f) {
                        return 0.0f;
                    }
                    return (f8 / f7) * f2;
                }
                if (i3 == -1) {
                    float f9 = fArr[0];
                    f5 = fArr2[0];
                    f6 = f9;
                    f4 = 0.0f;
                    f3 = 0.0f;
                } else {
                    float f10 = fArr[i3];
                    float f11 = fArr[i2];
                    f3 = fArr2[i3];
                    f4 = f10;
                    f5 = fArr2[i2];
                    f6 = f11;
                }
                max = signum * (((f5 - f3) * Math.max(0.0f, Math.min(1.0f, f4 == f6 ? 0.0f : (abs - f4) / (f6 - f4)))) + f3);
            }
            return max;
        }
    }

    public FontScaleConverterTable(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero".toString());
        }
        this.f17506a = fArr;
        this.f17507b = fArr2;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float a(float f2) {
        return Companion.a(f2, this.f17507b, this.f17506a);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float b(float f2) {
        return Companion.a(f2, this.f17506a, this.f17507b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) obj;
        return Arrays.equals(this.f17506a, fontScaleConverterTable.f17506a) && Arrays.equals(this.f17507b, fontScaleConverterTable.f17507b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17507b) + (Arrays.hashCode(this.f17506a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f17506a);
        a.r(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f17507b);
        a.r(arrays2, "toString(this)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
