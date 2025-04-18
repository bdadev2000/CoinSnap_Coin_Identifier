package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Oklab;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes3.dex */
public final class ColorKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(float r21, float r22, float r23, float r24, androidx.compose.ui.graphics.colorspace.ColorSpace r25) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.a(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static final long b(int i2) {
        long j2 = i2 << 32;
        int i3 = Color.f14963j;
        return j2;
    }

    public static final long c(int i2, int i3, int i4, int i5) {
        return b(((i2 & 255) << 16) | ((i5 & 255) << 24) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final long d(long j2) {
        long j3 = j2 << 32;
        int i2 = Color.f14963j;
        return j3;
    }

    public static /* synthetic */ long e(int i2, int i3, int i4) {
        return c(i2, i3, i4, 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long f(float r17, float r18, float r19, float r20, androidx.compose.ui.graphics.colorspace.ColorSpace r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.f(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static final long g(long j2, long j3) {
        float f2;
        float f3;
        long a2 = Color.a(j2, Color.f(j3));
        float d = Color.d(j3);
        float d2 = Color.d(a2);
        float f4 = 1.0f - d2;
        float f5 = (d * f4) + d2;
        float h2 = Color.h(a2);
        float h3 = Color.h(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((h3 * d) * f4) + (h2 * d2)) / f5;
        }
        float g2 = Color.g(a2);
        float g3 = Color.g(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((g3 * d) * f4) + (g2 * d2)) / f5;
        }
        float e = Color.e(a2);
        float e2 = Color.e(j3);
        if (f5 != 0.0f) {
            f6 = (((e2 * d) * f4) + (e * d2)) / f5;
        }
        return f(f2, f3, f6, f5, Color.f(j3));
    }

    public static final long h(long j2, long j3, float f2) {
        Oklab oklab = ColorSpaces.f15090t;
        long a2 = Color.a(j2, oklab);
        long a3 = Color.a(j3, oklab);
        float d = Color.d(a2);
        float h2 = Color.h(a2);
        float g2 = Color.g(a2);
        float e = Color.e(a2);
        float d2 = Color.d(a3);
        float h3 = Color.h(a3);
        float g3 = Color.g(a3);
        float e2 = Color.e(a3);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return Color.a(f(MathHelpersKt.b(h2, h3, f2), MathHelpersKt.b(g2, g3, f2), MathHelpersKt.b(e, e2, f2), MathHelpersKt.b(d, d2, f2), oklab), Color.f(j3));
    }

    public static final float i(long j2) {
        ColorSpace f2 = Color.f(j2);
        if (!ColorModel.a(f2.f15071b, ColorModel.f15067a)) {
            throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.b(f2.f15071b)));
        }
        double h2 = Color.h(j2);
        androidx.compose.ui.graphics.colorspace.a aVar = ((Rgb) f2).f15114p;
        double c2 = aVar.c(h2);
        float c3 = (float) ((aVar.c(Color.e(j2)) * 0.0722d) + (aVar.c(Color.g(j2)) * 0.7152d) + (c2 * 0.2126d));
        if (c3 < 0.0f) {
            c3 = 0.0f;
        }
        if (c3 > 1.0f) {
            return 1.0f;
        }
        return c3;
    }

    public static final int j(long j2) {
        float[] fArr = ColorSpaces.f15073a;
        return (int) (Color.a(j2, ColorSpaces.f15075c) >>> 32);
    }
}
