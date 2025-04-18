package com.applovin.impl;

/* loaded from: classes.dex */
final class zh {
    public final a a;

    /* renamed from: b, reason: collision with root package name */
    public final a f9398b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9399c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9400d;

    /* loaded from: classes.dex */
    public static final class a {
        private final b[] a;

        public a(b... bVarArr) {
            this.a = bVarArr;
        }

        public b a(int i10) {
            return this.a[i10];
        }

        public int a() {
            return this.a.length;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9401b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f9402c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f9403d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            boolean z10;
            this.a = i10;
            if (fArr.length * 2 == fArr2.length * 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            a1.a(z10);
            this.f9402c = fArr;
            this.f9403d = fArr2;
            this.f9401b = i11;
        }

        public int a() {
            return this.f9402c.length / 3;
        }
    }

    public zh(a aVar, int i10) {
        this(aVar, aVar, i10);
    }

    public static zh a(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        float f13;
        int i14;
        int i15;
        int i16;
        float[] fArr;
        int i17;
        int i18 = i10;
        int i19 = i11;
        a1.a(f10 > 0.0f);
        a1.a(i18 >= 1);
        a1.a(i19 >= 1);
        a1.a(f11 > 0.0f && f11 <= 180.0f);
        a1.a(f12 > 0.0f && f12 <= 360.0f);
        float radians = (float) Math.toRadians(f11);
        float radians2 = (float) Math.toRadians(f12);
        float f14 = radians / i18;
        float f15 = radians2 / i19;
        int i20 = i19 + 1;
        int i21 = ((i20 * 2) + 2) * i18;
        float[] fArr2 = new float[i21 * 3];
        float[] fArr3 = new float[i21 * 2];
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i22 < i18) {
            float f16 = radians / 2.0f;
            float f17 = (i22 * f14) - f16;
            int i25 = i22 + 1;
            float f18 = (i25 * f14) - f16;
            int i26 = 0;
            while (i26 < i20) {
                float f19 = f17;
                int i27 = i25;
                int i28 = 0;
                int i29 = 2;
                while (i28 < i29) {
                    if (i28 == 0) {
                        f13 = f19;
                        i13 = i20;
                    } else {
                        i13 = i20;
                        f13 = f18;
                    }
                    float f20 = i26 * f15;
                    float f21 = f15;
                    int i30 = i26;
                    double d10 = f10;
                    float f22 = f14;
                    double d11 = (f20 + 3.1415927f) - (radians2 / 2.0f);
                    int i31 = i28;
                    double d12 = f13;
                    float[] fArr4 = fArr3;
                    float f23 = f18;
                    fArr2[i23] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                    float f24 = radians;
                    float f25 = radians2;
                    fArr2[i23 + 1] = (float) (Math.sin(d12) * d10);
                    int i32 = i23 + 3;
                    fArr2[i23 + 2] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                    fArr4[i24] = f20 / f25;
                    int i33 = i24 + 2;
                    fArr4[i24 + 1] = ((i22 + i31) * f22) / f24;
                    if (i30 == 0 && i31 == 0) {
                        i14 = i11;
                        i15 = i30;
                        i16 = i31;
                    } else {
                        i14 = i11;
                        i15 = i30;
                        i16 = i31;
                        if (i15 != i14 || i16 != 1) {
                            fArr = fArr4;
                            i17 = 2;
                            i24 = i33;
                            i23 = i32;
                            int i34 = i16 + 1;
                            fArr3 = fArr;
                            i29 = i17;
                            radians = f24;
                            i20 = i13;
                            f15 = f21;
                            f14 = f22;
                            f18 = f23;
                            i28 = i34;
                            i19 = i14;
                            i26 = i15;
                            radians2 = f25;
                        }
                    }
                    System.arraycopy(fArr2, i23, fArr2, i32, 3);
                    i23 += 6;
                    fArr = fArr4;
                    i17 = 2;
                    System.arraycopy(fArr, i24, fArr, i33, 2);
                    i24 += 4;
                    int i342 = i16 + 1;
                    fArr3 = fArr;
                    i29 = i17;
                    radians = f24;
                    i20 = i13;
                    f15 = f21;
                    f14 = f22;
                    f18 = f23;
                    i28 = i342;
                    i19 = i14;
                    i26 = i15;
                    radians2 = f25;
                }
                float f26 = radians2;
                int i35 = i26;
                int i36 = i19;
                int i37 = i35 + 1;
                f17 = f19;
                i25 = i27;
                f15 = f15;
                radians2 = f26;
                f18 = f18;
                i19 = i36;
                i26 = i37;
            }
            i18 = i10;
            i22 = i25;
        }
        return new zh(new a(new b(0, fArr2, fArr3, 1)), i12);
    }

    public zh(a aVar, a aVar2, int i10) {
        this.a = aVar;
        this.f9398b = aVar2;
        this.f9399c = i10;
        this.f9400d = aVar == aVar2;
    }

    public static zh a(int i10) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }
}
