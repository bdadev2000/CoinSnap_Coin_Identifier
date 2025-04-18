package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class Connector {

    /* renamed from: a, reason: collision with root package name */
    public final ColorSpace f15092a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorSpace f15093b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f15094c;
    public final float[] d;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* loaded from: classes2.dex */
    public static final class RgbConnector extends Connector {
        public final Rgb e;

        /* renamed from: f, reason: collision with root package name */
        public final Rgb f15095f;

        /* renamed from: g, reason: collision with root package name */
        public final float[] f15096g;

        public RgbConnector(Rgb rgb, Rgb rgb2, int i2) {
            super(rgb2, rgb, rgb2, null);
            float[] f2;
            this.e = rgb;
            this.f15095f = rgb2;
            WhitePoint whitePoint = rgb2.d;
            WhitePoint whitePoint2 = rgb.d;
            boolean c2 = ColorSpaceKt.c(whitePoint2, whitePoint);
            float[] fArr = rgb.f15107i;
            float[] fArr2 = rgb2.f15108j;
            if (c2) {
                f2 = ColorSpaceKt.f(fArr2, fArr);
            } else {
                float[] a2 = whitePoint2.a();
                WhitePoint whitePoint3 = rgb2.d;
                float[] a3 = whitePoint3.a();
                WhitePoint whitePoint4 = Illuminant.f15099b;
                boolean c3 = ColorSpaceKt.c(whitePoint2, whitePoint4);
                float[] fArr3 = Illuminant.e;
                float[] fArr4 = Adaptation.f15065b.f15066a;
                if (!c3) {
                    float[] copyOf = Arrays.copyOf(fArr3, 3);
                    p0.a.r(copyOf, "copyOf(this, size)");
                    fArr = ColorSpaceKt.f(ColorSpaceKt.b(fArr4, a2, copyOf), fArr);
                }
                if (!ColorSpaceKt.c(whitePoint3, whitePoint4)) {
                    float[] copyOf2 = Arrays.copyOf(fArr3, 3);
                    p0.a.r(copyOf2, "copyOf(this, size)");
                    fArr2 = ColorSpaceKt.e(ColorSpaceKt.f(ColorSpaceKt.b(fArr4, a3, copyOf2), rgb2.f15107i));
                }
                f2 = ColorSpaceKt.f(fArr2, RenderIntent.a(i2, 3) ? ColorSpaceKt.g(new float[]{a2[0] / a3[0], a2[1] / a3[1], a2[2] / a3[2]}, fArr) : fArr);
            }
            this.f15096g = f2;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public final long a(long j2) {
            float h2 = Color.h(j2);
            float g2 = Color.g(j2);
            float e = Color.e(j2);
            float d = Color.d(j2);
            Rgb rgb = this.e;
            float c2 = (float) rgb.f15114p.c(h2);
            a aVar = rgb.f15114p;
            float c3 = (float) aVar.c(g2);
            float c4 = (float) aVar.c(e);
            float[] fArr = this.f15096g;
            float f2 = (fArr[6] * c4) + (fArr[3] * c3) + (fArr[0] * c2);
            float f3 = (fArr[7] * c4) + (fArr[4] * c3) + (fArr[1] * c2);
            float f4 = (fArr[8] * c4) + (fArr[5] * c3) + (fArr[2] * c2);
            Rgb rgb2 = this.f15095f;
            float c5 = (float) rgb2.f15111m.c(f2);
            double d2 = f3;
            a aVar2 = rgb2.f15111m;
            return ColorKt.a(c5, (float) aVar2.c(d2), (float) aVar2.c(f4), d, rgb2);
        }
    }

    public Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, float[] fArr) {
        this.f15092a = colorSpace;
        this.f15093b = colorSpace2;
        this.f15094c = colorSpace3;
        this.d = fArr;
    }

    public long a(long j2) {
        float h2 = Color.h(j2);
        float g2 = Color.g(j2);
        float e = Color.e(j2);
        float d = Color.d(j2);
        ColorSpace colorSpace = this.f15093b;
        long e2 = colorSpace.e(h2, g2, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (e2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (e2 & 4294967295L));
        float g3 = colorSpace.g(h2, g2, e);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            g3 *= fArr[2];
        }
        float f2 = intBitsToFloat;
        float f3 = intBitsToFloat2;
        return this.f15094c.h(f2, f3, g3, d, this.f15092a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Connector(androidx.compose.ui.graphics.colorspace.ColorSpace r9, androidx.compose.ui.graphics.colorspace.ColorSpace r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.f15071b
            long r2 = androidx.compose.ui.graphics.colorspace.ColorModel.f15067a
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.a(r0, r2)
            if (r0 == 0) goto Lf
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.a(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.f15071b
            boolean r1 = androidx.compose.ui.graphics.colorspace.ColorModel.a(r4, r2)
            if (r1 == 0) goto L1d
            androidx.compose.ui.graphics.colorspace.ColorSpace r1 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.a(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            boolean r11 = androidx.compose.ui.graphics.colorspace.RenderIntent.a(r11, r4)
            r5 = 0
            if (r11 != 0) goto L27
            goto L6e
        L27:
            long r6 = r9.f15071b
            boolean r11 = androidx.compose.ui.graphics.colorspace.ColorModel.a(r6, r2)
            long r6 = r10.f15071b
            boolean r2 = androidx.compose.ui.graphics.colorspace.ColorModel.a(r6, r2)
            if (r11 == 0) goto L38
            if (r2 == 0) goto L38
            goto L6e
        L38:
            if (r11 != 0) goto L3c
            if (r2 == 0) goto L6e
        L3c:
            if (r11 == 0) goto L3f
            goto L40
        L3f:
            r9 = r10
        L40:
            androidx.compose.ui.graphics.colorspace.Rgb r9 = (androidx.compose.ui.graphics.colorspace.Rgb) r9
            float[] r3 = androidx.compose.ui.graphics.colorspace.Illuminant.e
            androidx.compose.ui.graphics.colorspace.WhitePoint r9 = r9.d
            if (r11 == 0) goto L4d
            float[] r11 = r9.a()
            goto L4e
        L4d:
            r11 = r3
        L4e:
            if (r2 == 0) goto L54
            float[] r3 = r9.a()
        L54:
            float[] r5 = new float[r4]
            r9 = 0
            r2 = r11[r9]
            r4 = r3[r9]
            float r2 = r2 / r4
            r5[r9] = r2
            r9 = 1
            r2 = r11[r9]
            r4 = r3[r9]
            float r2 = r2 / r4
            r5[r9] = r2
            r9 = 2
            r11 = r11[r9]
            r2 = r3[r9]
            float r11 = r11 / r2
            r5[r9] = r11
        L6e:
            r8.<init>(r10, r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Connector.<init>(androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace, int):void");
    }
}
