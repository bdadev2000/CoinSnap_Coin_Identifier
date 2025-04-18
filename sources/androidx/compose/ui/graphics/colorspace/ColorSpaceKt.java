package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.Connector;

/* loaded from: classes3.dex */
public final class ColorSpaceKt {
    public static ColorSpace a(ColorSpace colorSpace) {
        WhitePoint whitePoint = Illuminant.f15099b;
        Adaptation$Companion$Bradford$1 adaptation$Companion$Bradford$1 = Adaptation.f15065b;
        if (!ColorModel.a(colorSpace.f15071b, ColorModel.f15067a)) {
            return colorSpace;
        }
        Rgb rgb = (Rgb) colorSpace;
        WhitePoint whitePoint2 = rgb.d;
        if (c(whitePoint2, whitePoint)) {
            return colorSpace;
        }
        float[] a2 = whitePoint.a();
        return new Rgb(rgb.f15070a, rgb.f15106h, whitePoint, f(b(adaptation$Companion$Bradford$1.f15066a, whitePoint2.a(), a2), rgb.f15107i), rgb.f15109k, rgb.f15112n, rgb.e, rgb.f15104f, rgb.f15105g, -1);
    }

    public static final float[] b(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        return f(e(fArr), g(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final boolean c(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.f15123a - whitePoint2.f15123a) < 0.001f && Math.abs(whitePoint.f15124b - whitePoint2.f15124b) < 0.001f;
    }

    public static final Connector d(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        if (colorSpace == colorSpace2) {
            return new Connector(colorSpace, colorSpace, 1);
        }
        long j2 = ColorModel.f15067a;
        return (ColorModel.a(colorSpace.f15071b, j2) && ColorModel.a(colorSpace2.f15071b, j2)) ? new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i2) : new Connector(colorSpace, colorSpace2, i2);
    }

    public static final float[] e(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final float[] f(float[] fArr, float[] fArr2) {
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = f5 * f6;
        float f8 = fArr[1];
        float f9 = fArr2[0];
        float f10 = fArr[4];
        float f11 = f4 * f10;
        float f12 = fArr[7];
        float f13 = f12 * f6;
        float f14 = fArr[2] * f9;
        float f15 = fArr[5];
        float f16 = (fArr2[1] * f15) + f14;
        float f17 = fArr[8];
        float f18 = fArr[0];
        float f19 = fArr2[3] * f18;
        float f20 = fArr2[4];
        float f21 = (f3 * f20) + f19;
        float f22 = fArr2[5];
        float f23 = fArr[1];
        float f24 = fArr2[3];
        float f25 = f10 * f20;
        float f26 = fArr[2];
        float f27 = f15 * fArr2[4];
        float f28 = f18 * fArr2[6];
        float f29 = fArr[3];
        float f30 = fArr2[7];
        float f31 = (f29 * f30) + f28;
        float f32 = fArr2[8];
        float f33 = fArr2[6];
        return new float[]{f7 + (f3 * f4) + f2, f13 + f11 + (f8 * f9), (f6 * f17) + f16, (f5 * f22) + f21, (f12 * f22) + f25 + (f23 * f24), (f22 * f17) + f27 + (f24 * f26), (f5 * f32) + f31, (f12 * f32) + (fArr[4] * f30) + (f23 * f33), (f17 * f32) + (fArr[5] * fArr2[7]) + (f26 * f33)};
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f2, fArr2[4] * f3, fArr2[5] * f4, f2 * fArr2[6], f3 * fArr2[7], f4 * fArr2[8]};
    }

    public static final void h(float[] fArr, float[] fArr2) {
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
    }
}
