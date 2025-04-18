package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes3.dex */
public final class Oklab extends ColorSpace {
    public static final float[] d;
    public static final float[] e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f15101f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f15102g;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    static {
        Adaptation$Companion$Bradford$1 adaptation$Companion$Bradford$1 = Adaptation.f15065b;
        float[] f2 = ColorSpaceKt.f(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.b(adaptation$Companion$Bradford$1.f15066a, Illuminant.f15099b.a(), Illuminant.d.a()));
        d = f2;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr;
        f15101f = ColorSpaceKt.e(f2);
        f15102g = ColorSpaceKt.e(fArr);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] a(float[] fArr) {
        ColorSpaceKt.h(d, fArr);
        fArr[0] = MathHelpersKt.a(fArr[0]);
        fArr[1] = MathHelpersKt.a(fArr[1]);
        fArr[2] = MathHelpersKt.a(fArr[2]);
        ColorSpaceKt.h(e, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float b(int i2) {
        return i2 == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float c(int i2) {
        return i2 == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long e(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float[] fArr = f15102g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f7 * f7 * f7;
        float f10 = f8 * f8 * f8;
        float[] fArr2 = f15101f;
        float f11 = (fArr2[6] * f10) + (fArr2[3] * f9) + (fArr2[0] * f6 * f6 * f6);
        return (Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] f(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        fArr[1] = f3;
        float f4 = fArr[2];
        float f5 = f4 >= -0.5f ? f4 : -0.5f;
        fArr[2] = f5 <= 0.5f ? f5 : 0.5f;
        ColorSpaceKt.h(f15102g, fArr);
        float f6 = fArr[0];
        fArr[0] = f6 * f6 * f6;
        float f7 = fArr[1];
        fArr[1] = f7 * f7 * f7;
        float f8 = fArr[2];
        fArr[2] = f8 * f8 * f8;
        ColorSpaceKt.h(f15101f, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float g(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float[] fArr = f15102g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f15101f;
        return (fArr2[8] * f11) + (fArr2[5] * f10) + (fArr2[2] * f9);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long h(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float[] fArr = d;
        float f6 = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        float a2 = MathHelpersKt.a(f6);
        float a3 = MathHelpersKt.a(f7);
        float a4 = MathHelpersKt.a(f8);
        float[] fArr2 = e;
        return ColorKt.a((fArr2[6] * a4) + (fArr2[3] * a3) + (fArr2[0] * a2), (fArr2[7] * a4) + (fArr2[4] * a3) + (fArr2[1] * a2), (fArr2[8] * a4) + (fArr2[5] * a3) + (fArr2[2] * a2), f5, colorSpace);
    }
}
