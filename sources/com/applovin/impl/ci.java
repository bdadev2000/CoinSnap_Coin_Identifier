package com.applovin.impl;

/* loaded from: classes2.dex */
final class ci {

    /* renamed from: a, reason: collision with root package name */
    public final a f23279a;

    /* renamed from: b, reason: collision with root package name */
    public final a f23280b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23281c;
    public final boolean d;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b[] f23282a;

        public a(b... bVarArr) {
            this.f23282a = bVarArr;
        }

        public b a(int i2) {
            return this.f23282a[i2];
        }

        public int a() {
            return this.f23282a.length;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f23283a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23284b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f23285c;
        public final float[] d;

        public b(int i2, float[] fArr, float[] fArr2, int i3) {
            this.f23283a = i2;
            b1.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f23285c = fArr;
            this.d = fArr2;
            this.f23284b = i3;
        }

        public int a() {
            return this.f23285c.length / 3;
        }
    }

    public ci(a aVar, int i2) {
        this(aVar, aVar, i2);
    }

    public static ci a(float f2, int i2, int i3, float f3, float f4, int i4) {
        int i5;
        float f5;
        int i6;
        int i7;
        int i8;
        float[] fArr;
        int i9;
        int i10 = i2;
        int i11 = i3;
        b1.a(f2 > 0.0f);
        b1.a(i10 >= 1);
        b1.a(i11 >= 1);
        b1.a(f3 > 0.0f && f3 <= 180.0f);
        b1.a(f4 > 0.0f && f4 <= 360.0f);
        float radians = (float) Math.toRadians(f3);
        float radians2 = (float) Math.toRadians(f4);
        float f6 = radians / i10;
        float f7 = radians2 / i11;
        int i12 = i11 + 1;
        int i13 = ((i12 * 2) + 2) * i10;
        float[] fArr2 = new float[i13 * 3];
        float[] fArr3 = new float[i13 * 2];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i10) {
            float f8 = radians / 2.0f;
            float f9 = (i14 * f6) - f8;
            int i17 = i14 + 1;
            float f10 = (i17 * f6) - f8;
            int i18 = 0;
            while (i18 < i12) {
                float f11 = f9;
                int i19 = i17;
                int i20 = 2;
                int i21 = 0;
                while (i21 < i20) {
                    if (i21 == 0) {
                        f5 = f11;
                        i5 = i12;
                    } else {
                        i5 = i12;
                        f5 = f10;
                    }
                    float f12 = i18 * f7;
                    float f13 = f7;
                    int i22 = i18;
                    double d = f2;
                    float f14 = f6;
                    double d2 = (f12 + 3.1415927f) - (radians2 / 2.0f);
                    int i23 = i21;
                    double d3 = f5;
                    float[] fArr4 = fArr3;
                    float f15 = f10;
                    fArr2[i15] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                    float f16 = radians;
                    float f17 = radians2;
                    fArr2[i15 + 1] = (float) (Math.sin(d3) * d);
                    int i24 = i15 + 3;
                    fArr2[i15 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                    fArr4[i16] = f12 / f17;
                    int i25 = i16 + 2;
                    fArr4[i16 + 1] = ((i14 + i23) * f14) / f16;
                    if (i22 == 0 && i23 == 0) {
                        i6 = i3;
                        i7 = i22;
                        i8 = i23;
                    } else {
                        i6 = i3;
                        i7 = i22;
                        i8 = i23;
                        if (i7 != i6 || i8 != 1) {
                            fArr = fArr4;
                            i9 = 2;
                            i16 = i25;
                            i15 = i24;
                            i21 = i8 + 1;
                            i11 = i6;
                            i18 = i7;
                            fArr3 = fArr;
                            radians = f16;
                            i12 = i5;
                            f7 = f13;
                            radians2 = f17;
                            f10 = f15;
                            i20 = i9;
                            f6 = f14;
                        }
                    }
                    System.arraycopy(fArr2, i15, fArr2, i24, 3);
                    i15 += 6;
                    fArr = fArr4;
                    i9 = 2;
                    System.arraycopy(fArr, i16, fArr, i25, 2);
                    i16 += 4;
                    i21 = i8 + 1;
                    i11 = i6;
                    i18 = i7;
                    fArr3 = fArr;
                    radians = f16;
                    i12 = i5;
                    f7 = f13;
                    radians2 = f17;
                    f10 = f15;
                    i20 = i9;
                    f6 = f14;
                }
                float f18 = radians2;
                int i26 = i18;
                int i27 = i11;
                int i28 = i26 + 1;
                i17 = i19;
                f6 = f6;
                radians2 = f18;
                f10 = f10;
                f9 = f11;
                i11 = i27;
                i18 = i28;
            }
            i10 = i2;
            i14 = i17;
        }
        return new ci(new a(new b(0, fArr2, fArr3, 1)), i4);
    }

    public ci(a aVar, a aVar2, int i2) {
        this.f23279a = aVar;
        this.f23280b = aVar2;
        this.f23281c = i2;
        this.d = aVar == aVar2;
    }

    public static ci a(int i2) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i2);
    }
}
