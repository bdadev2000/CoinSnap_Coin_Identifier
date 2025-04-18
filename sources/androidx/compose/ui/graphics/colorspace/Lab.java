package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;

/* loaded from: classes3.dex */
public final class Lab extends ColorSpace {

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] a(float[] fArr) {
        float f2 = fArr[0];
        float[] fArr2 = Illuminant.e;
        float f3 = f2 / fArr2[0];
        float f4 = fArr[1] / fArr2[1];
        float f5 = fArr[2] / fArr2[2];
        float cbrt = f3 > 0.008856452f ? (float) Math.cbrt(f3) : (f3 * 7.787037f) + 0.13793103f;
        float cbrt2 = f4 > 0.008856452f ? (float) Math.cbrt(f4) : (f4 * 7.787037f) + 0.13793103f;
        float cbrt3 = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
        float f6 = (116.0f * cbrt2) - 16.0f;
        float f7 = (cbrt - cbrt2) * 500.0f;
        float f8 = (cbrt2 - cbrt3) * 200.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 100.0f) {
            f6 = 100.0f;
        }
        fArr[0] = f6;
        if (f7 < -128.0f) {
            f7 = -128.0f;
        }
        if (f7 > 128.0f) {
            f7 = 128.0f;
        }
        fArr[1] = f7;
        if (f8 < -128.0f) {
            f8 = -128.0f;
        }
        fArr[2] = f8 <= 128.0f ? f8 : 128.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float b(int i2) {
        return i2 == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float c(int i2) {
        return i2 == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long e(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        float f6 = (f3 * 0.002f) + f5;
        float f7 = f6 > 0.20689656f ? f6 * f6 * f6 : (f6 - 0.13793103f) * 0.12841855f;
        float f8 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
        float f9 = f7 * Illuminant.e[0];
        return (Float.floatToRawIntBits(f8 * r5[1]) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] f(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        fArr[1] = f3;
        float f4 = fArr[2];
        float f5 = f4 >= -128.0f ? f4 : -128.0f;
        float f6 = f5 <= 128.0f ? f5 : 128.0f;
        fArr[2] = f6;
        float f7 = (f2 + 16.0f) / 116.0f;
        float f8 = (f3 * 0.002f) + f7;
        float f9 = f7 - (f6 * 0.005f);
        float f10 = f8 > 0.20689656f ? f8 * f8 * f8 : (f8 - 0.13793103f) * 0.12841855f;
        float f11 = f7 > 0.20689656f ? f7 * f7 * f7 : (f7 - 0.13793103f) * 0.12841855f;
        float f12 = f9 > 0.20689656f ? f9 * f9 * f9 : (f9 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = Illuminant.e;
        fArr[0] = f10 * fArr2[0];
        fArr[1] = f11 * fArr2[1];
        fArr[2] = f12 * fArr2[2];
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float g(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        if (f4 < -128.0f) {
            f4 = -128.0f;
        }
        if (f4 > 128.0f) {
            f4 = 128.0f;
        }
        float f5 = ((f2 + 16.0f) / 116.0f) - (f4 * 0.005f);
        return (f5 > 0.20689656f ? f5 * f5 * f5 : 0.12841855f * (f5 - 0.13793103f)) * Illuminant.e[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long h(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float[] fArr = Illuminant.e;
        float f6 = f2 / fArr[0];
        float f7 = f3 / fArr[1];
        float f8 = f4 / fArr[2];
        float cbrt = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
        float cbrt2 = f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
        float f9 = (116.0f * cbrt2) - 16.0f;
        float f10 = (cbrt - cbrt2) * 500.0f;
        float cbrt3 = (cbrt2 - (f8 > 0.008856452f ? (float) Math.cbrt(f8) : (f8 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 > 100.0f) {
            f9 = 100.0f;
        }
        if (f10 < -128.0f) {
            f10 = -128.0f;
        }
        if (f10 > 128.0f) {
            f10 = 128.0f;
        }
        if (cbrt3 < -128.0f) {
            cbrt3 = -128.0f;
        }
        return ColorKt.a(f9, f10, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f5, colorSpace);
    }
}
