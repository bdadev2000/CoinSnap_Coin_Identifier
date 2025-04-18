package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;

/* loaded from: classes4.dex */
public final class Xyz extends ColorSpace {
    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] a(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            f3 = 2.0f;
        }
        fArr[1] = f3;
        float f4 = fArr[2];
        float f5 = f4 >= -2.0f ? f4 : -2.0f;
        fArr[2] = f5 <= 2.0f ? f5 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float b(int i2) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float c(int i2) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long e(float f2, float f3, float f4) {
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3 <= 2.0f ? f3 : 2.0f) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] f(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            f3 = 2.0f;
        }
        fArr[1] = f3;
        float f4 = fArr[2];
        float f5 = f4 >= -2.0f ? f4 : -2.0f;
        fArr[2] = f5 <= 2.0f ? f5 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float g(float f2, float f3, float f4) {
        if (f4 < -2.0f) {
            f4 = -2.0f;
        }
        if (f4 > 2.0f) {
            return 2.0f;
        }
        return f4;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long h(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            f3 = 2.0f;
        }
        if (f4 < -2.0f) {
            f4 = -2.0f;
        }
        return ColorKt.a(f2, f3, f4 <= 2.0f ? f4 : 2.0f, f5, colorSpace);
    }
}
