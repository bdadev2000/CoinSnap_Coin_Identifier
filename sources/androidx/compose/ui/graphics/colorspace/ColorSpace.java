package androidx.compose.ui.graphics.colorspace;

import android.support.v4.media.d;
import androidx.compose.ui.graphics.ColorKt;

/* loaded from: classes4.dex */
public abstract class ColorSpace {

    /* renamed from: a, reason: collision with root package name */
    public final String f15070a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15072c;

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    public ColorSpace(String str, long j2, int i2) {
        this.f15070a = str;
        this.f15071b = j2;
        this.f15072c = i2;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i2 < -1 || i2 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i2);

    public abstract float c(int i2);

    public boolean d() {
        return false;
    }

    public long e(float f2, float f3, float f4) {
        float[] f5 = f(new float[]{f2, f3, f4});
        return (Float.floatToRawIntBits(f5[0]) << 32) | (Float.floatToRawIntBits(f5[1]) & 4294967295L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.f15072c == colorSpace.f15072c && p0.a.g(this.f15070a, colorSpace.f15070a)) {
            return ColorModel.a(this.f15071b, colorSpace.f15071b);
        }
        return false;
    }

    public abstract float[] f(float[] fArr);

    public float g(float f2, float f3, float f4) {
        return f(new float[]{f2, f3, f4})[2];
    }

    public long h(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        int i2 = ColorModel.e;
        float[] fArr = new float[(int) (this.f15071b >> 32)];
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        float[] a2 = a(fArr);
        return ColorKt.a(a2[0], a2[1], a2[2], f5, colorSpace);
    }

    public int hashCode() {
        int hashCode = this.f15070a.hashCode() * 31;
        int i2 = ColorModel.e;
        return d.d(this.f15071b, hashCode, 31) + this.f15072c;
    }

    public final String toString() {
        return this.f15070a + " (id=" + this.f15072c + ", model=" + ((Object) ColorModel.b(this.f15071b)) + ')';
    }
}
