package com.applovin.impl;

/* loaded from: classes.dex */
final class zh {

    /* renamed from: a, reason: collision with root package name */
    public final a f12581a;
    public final a b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12582c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12583d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b[] f12584a;

        public a(b... bVarArr) {
            this.f12584a = bVarArr;
        }

        public b a(int i9) {
            return this.f12584a[i9];
        }

        public int a() {
            return this.f12584a.length;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f12585a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f12586c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f12587d;

        public b(int i9, float[] fArr, float[] fArr2, int i10) {
            boolean z8;
            this.f12585a = i9;
            if (fArr.length * 2 == fArr2.length * 3) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC0669a1.a(z8);
            this.f12586c = fArr;
            this.f12587d = fArr2;
            this.b = i10;
        }

        public int a() {
            return this.f12586c.length / 3;
        }
    }

    public zh(a aVar, int i9) {
        this(aVar, aVar, i9);
    }

    public static zh a(float f9, int i9, int i10, float f10, float f11, int i11) {
        int i12;
        float f12;
        int i13;
        int i14;
        int i15;
        float[] fArr;
        int i16;
        int i17 = i9;
        int i18 = i10;
        AbstractC0669a1.a(f9 > 0.0f);
        AbstractC0669a1.a(i17 >= 1);
        AbstractC0669a1.a(i18 >= 1);
        AbstractC0669a1.a(f10 > 0.0f && f10 <= 180.0f);
        AbstractC0669a1.a(f11 > 0.0f && f11 <= 360.0f);
        float radians = (float) Math.toRadians(f10);
        float radians2 = (float) Math.toRadians(f11);
        float f13 = radians / i17;
        float f14 = radians2 / i18;
        int i19 = i18 + 1;
        int i20 = ((i19 * 2) + 2) * i17;
        float[] fArr2 = new float[i20 * 3];
        float[] fArr3 = new float[i20 * 2];
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < i17) {
            float f15 = radians / 2.0f;
            float f16 = (i21 * f13) - f15;
            int i24 = i21 + 1;
            float f17 = (i24 * f13) - f15;
            int i25 = 0;
            while (i25 < i19) {
                float f18 = f16;
                int i26 = i24;
                int i27 = 2;
                int i28 = 0;
                while (i28 < i27) {
                    if (i28 == 0) {
                        f12 = f18;
                        i12 = i19;
                    } else {
                        i12 = i19;
                        f12 = f17;
                    }
                    float f19 = i25 * f14;
                    float f20 = f14;
                    int i29 = i25;
                    double d2 = f9;
                    float f21 = f13;
                    double d9 = (f19 + 3.1415927f) - (radians2 / 2.0f);
                    int i30 = i28;
                    double d10 = f12;
                    float[] fArr4 = fArr3;
                    float f22 = f17;
                    fArr2[i22] = -((float) (Math.cos(d10) * Math.sin(d9) * d2));
                    float f23 = radians;
                    float f24 = radians2;
                    fArr2[i22 + 1] = (float) (Math.sin(d10) * d2);
                    int i31 = i22 + 3;
                    fArr2[i22 + 2] = (float) (Math.cos(d10) * Math.cos(d9) * d2);
                    fArr4[i23] = f19 / f24;
                    int i32 = i23 + 2;
                    fArr4[i23 + 1] = ((i21 + i30) * f21) / f23;
                    if (i29 == 0 && i30 == 0) {
                        i13 = i10;
                        i14 = i29;
                        i15 = i30;
                    } else {
                        i13 = i10;
                        i14 = i29;
                        i15 = i30;
                        if (i14 != i13 || i15 != 1) {
                            fArr = fArr4;
                            i16 = 2;
                            i23 = i32;
                            i22 = i31;
                            i28 = i15 + 1;
                            i18 = i13;
                            i25 = i14;
                            fArr3 = fArr;
                            radians = f23;
                            i19 = i12;
                            f14 = f20;
                            radians2 = f24;
                            f17 = f22;
                            i27 = i16;
                            f13 = f21;
                        }
                    }
                    System.arraycopy(fArr2, i22, fArr2, i31, 3);
                    i22 += 6;
                    fArr = fArr4;
                    i16 = 2;
                    System.arraycopy(fArr, i23, fArr, i32, 2);
                    i23 += 4;
                    i28 = i15 + 1;
                    i18 = i13;
                    i25 = i14;
                    fArr3 = fArr;
                    radians = f23;
                    i19 = i12;
                    f14 = f20;
                    radians2 = f24;
                    f17 = f22;
                    i27 = i16;
                    f13 = f21;
                }
                float f25 = radians2;
                int i33 = i25;
                int i34 = i18;
                int i35 = i33 + 1;
                i24 = i26;
                f13 = f13;
                radians2 = f25;
                f17 = f17;
                f16 = f18;
                i18 = i34;
                i25 = i35;
            }
            i17 = i9;
            i21 = i24;
        }
        return new zh(new a(new b(0, fArr2, fArr3, 1)), i11);
    }

    public zh(a aVar, a aVar2, int i9) {
        this.f12581a = aVar;
        this.b = aVar2;
        this.f12582c = i9;
        this.f12583d = aVar == aVar2;
    }

    public static zh a(int i9) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i9);
    }
}
