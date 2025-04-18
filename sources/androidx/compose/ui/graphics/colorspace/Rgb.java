package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;
import q0.l;

/* loaded from: classes3.dex */
public final class Rgb extends ColorSpace {

    /* renamed from: r, reason: collision with root package name */
    public static final androidx.compose.animation.core.a f15103r = new androidx.compose.animation.core.a(2);
    public final WhitePoint d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15104f;

    /* renamed from: g, reason: collision with root package name */
    public final TransferParameters f15105g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f15106h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f15107i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f15108j;

    /* renamed from: k, reason: collision with root package name */
    public final DoubleFunction f15109k;

    /* renamed from: l, reason: collision with root package name */
    public final l f15110l;

    /* renamed from: m, reason: collision with root package name */
    public final a f15111m;

    /* renamed from: n, reason: collision with root package name */
    public final DoubleFunction f15112n;

    /* renamed from: o, reason: collision with root package name */
    public final l f15113o;

    /* renamed from: p, reason: collision with root package name */
    public final a f15114p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f15115q;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public static float a(float[] fArr) {
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            float f5 = fArr[3];
            float f6 = fArr[4];
            float f7 = fArr[5];
            float f8 = (((((f4 * f7) + ((f3 * f6) + (f2 * f5))) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
            return f8 < 0.0f ? -f8 : f8;
        }

        public static float b(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x020d, code lost:
    
        if (androidx.compose.ui.graphics.colorspace.Rgb.Companion.b(r3[4] - r3[0], r3[5] - r3[1], r13[4], r13[5]) >= 0.0f) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(java.lang.String r33, float[] r34, androidx.compose.ui.graphics.colorspace.WhitePoint r35, float[] r36, androidx.compose.ui.graphics.colorspace.DoubleFunction r37, androidx.compose.ui.graphics.colorspace.DoubleFunction r38, float r39, float r40, androidx.compose.ui.graphics.colorspace.TransferParameters r41, int r42) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, float[], androidx.compose.ui.graphics.colorspace.DoubleFunction, androidx.compose.ui.graphics.colorspace.DoubleFunction, float, float, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] a(float[] fArr) {
        ColorSpaceKt.h(this.f15108j, fArr);
        double d = fArr[0];
        a aVar = this.f15111m;
        fArr[0] = (float) aVar.c(d);
        fArr[1] = (float) aVar.c(fArr[1]);
        fArr[2] = (float) aVar.c(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float b(int i2) {
        return this.f15104f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float c(int i2) {
        return this.e;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final boolean d() {
        return this.f15115q;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long e(float f2, float f3, float f4) {
        double d = f2;
        a aVar = this.f15114p;
        float c2 = (float) aVar.c(d);
        float c3 = (float) aVar.c(f3);
        float c4 = (float) aVar.c(f4);
        float[] fArr = this.f15107i;
        float f5 = (fArr[6] * c4) + (fArr[3] * c3) + (fArr[0] * c2);
        float f6 = (fArr[7] * c4) + (fArr[4] * c3) + (fArr[1] * c2);
        return (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.e, this.e) != 0 || Float.compare(rgb.f15104f, this.f15104f) != 0 || !p0.a.g(this.d, rgb.d) || !Arrays.equals(this.f15106h, rgb.f15106h)) {
            return false;
        }
        TransferParameters transferParameters = rgb.f15105g;
        TransferParameters transferParameters2 = this.f15105g;
        if (transferParameters2 != null) {
            return p0.a.g(transferParameters2, transferParameters);
        }
        if (transferParameters == null) {
            return true;
        }
        if (p0.a.g(this.f15109k, rgb.f15109k)) {
            return p0.a.g(this.f15112n, rgb.f15112n);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] f(float[] fArr) {
        double d = fArr[0];
        a aVar = this.f15114p;
        fArr[0] = (float) aVar.c(d);
        fArr[1] = (float) aVar.c(fArr[1]);
        fArr[2] = (float) aVar.c(fArr[2]);
        ColorSpaceKt.h(this.f15107i, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float g(float f2, float f3, float f4) {
        double d = f2;
        a aVar = this.f15114p;
        float c2 = (float) aVar.c(d);
        float c3 = (float) aVar.c(f3);
        float c4 = (float) aVar.c(f4);
        float[] fArr = this.f15107i;
        return (fArr[8] * c4) + (fArr[5] * c3) + (fArr[2] * c2);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long h(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float[] fArr = this.f15108j;
        float f6 = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        a aVar = this.f15111m;
        return ColorKt.a((float) aVar.c(f6), (float) aVar.c(f7), (float) aVar.c(f8), f5, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f15106h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f2 = this.e;
        int floatToIntBits = (hashCode + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        float f3 = this.f15104f;
        int floatToIntBits2 = (floatToIntBits + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        TransferParameters transferParameters = this.f15105g;
        int hashCode2 = floatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (transferParameters == null) {
            return this.f15112n.hashCode() + ((this.f15109k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(java.lang.String r12, float[] r13, androidx.compose.ui.graphics.colorspace.WhitePoint r14, final androidx.compose.ui.graphics.colorspace.TransferParameters r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            r4 = 0
            double r0 = r9.f15121f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            double r5 = r9.f15122g
            if (r0 != 0) goto L18
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 != 0) goto L18
            androidx.compose.ui.graphics.colorspace.b r1 = new androidx.compose.ui.graphics.colorspace.b
            r7 = 0
            r1.<init>()
        L16:
            r7 = r1
            goto L1f
        L18:
            androidx.compose.ui.graphics.colorspace.b r1 = new androidx.compose.ui.graphics.colorspace.b
            r7 = 1
            r1.<init>()
            goto L16
        L1f:
            if (r0 != 0) goto L2d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L2d
            androidx.compose.ui.graphics.colorspace.b r0 = new androidx.compose.ui.graphics.colorspace.b
            r1 = 2
            r0.<init>()
        L2b:
            r6 = r0
            goto L34
        L2d:
            androidx.compose.ui.graphics.colorspace.b r0 = new androidx.compose.ui.graphics.colorspace.b
            r1 = 3
            r0.<init>()
            goto L2b
        L34:
            r8 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r7
            r7 = r8
            r8 = r10
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.graphics.colorspace.c] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.graphics.colorspace.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(java.lang.String r16, float[] r17, androidx.compose.ui.graphics.colorspace.WhitePoint r18, final double r19, float r21, float r22, int r23) {
        /*
            r15 = this;
            r1 = r19
            r11 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            androidx.compose.animation.core.a r3 = androidx.compose.ui.graphics.colorspace.Rgb.f15103r
            if (r0 != 0) goto Ld
            r12 = r3
            goto L14
        Ld:
            androidx.compose.ui.graphics.colorspace.c r4 = new androidx.compose.ui.graphics.colorspace.c
            r5 = 0
            r4.<init>()
            r12 = r4
        L14:
            if (r0 != 0) goto L18
            r13 = r3
            goto L1f
        L18:
            androidx.compose.ui.graphics.colorspace.c r0 = new androidx.compose.ui.graphics.colorspace.c
            r3 = 1
            r0.<init>()
            r13 = r0
        L1f:
            androidx.compose.ui.graphics.colorspace.TransferParameters r14 = new androidx.compose.ui.graphics.colorspace.TransferParameters
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r0 = r14
            r1 = r19
            r0.<init>(r1, r3, r5, r7, r9)
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r21
            r8 = r22
            r9 = r14
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, double, float, float, int):void");
    }
}
