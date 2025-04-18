package f0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: k, reason: collision with root package name */
    public static final r f17536k;
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17537b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17538c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17539d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17540e;

    /* renamed from: f, reason: collision with root package name */
    public final float f17541f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f17542g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17543h;

    /* renamed from: i, reason: collision with root package name */
    public final float f17544i;

    /* renamed from: j, reason: collision with root package name */
    public final float f17545j;

    static {
        float f10;
        float f11;
        float[] fArr = com.facebook.appevents.g.f10938c;
        float O = (float) ((com.facebook.appevents.g.O() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = com.facebook.appevents.g.a;
        float f12 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f13 = fArr3[0] * f12;
        float f14 = fArr[1];
        float f15 = (fArr3[1] * f14) + f13;
        float f16 = fArr[2];
        float f17 = (fArr3[2] * f16) + f15;
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f14) + (fArr4[0] * f12);
        float[] fArr5 = fArr2[2];
        float f19 = (f16 * fArr5[2]) + (f14 * fArr5[1]) + (f12 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f10 = 0.100000046f;
            f11 = 0.59f;
        } else {
            f10 = 0.12999998f;
            f11 = 0.525f;
        }
        float f20 = f10 + f11;
        float exp = (1.0f - (((float) Math.exp(((-O) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f17) * exp) + 1.0f) - exp, (((100.0f / f18) * exp) + 1.0f) - exp, (((100.0f / f19) * exp) + 1.0f) - exp};
        float f21 = 1.0f / ((5.0f * O) + 1.0f);
        float f22 = f21 * f21 * f21 * f21;
        float f23 = 1.0f - f22;
        float cbrt = (0.1f * f23 * f23 * ((float) Math.cbrt(O * 5.0d))) + (f22 * O);
        float O2 = com.facebook.appevents.g.O() / fArr[1];
        double d11 = O2;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f19) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f17) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f18) / 100.0d, 0.42d), pow2};
        float f24 = fArr7[0];
        float f25 = fArr7[1];
        f17536k = new r(O2, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f24 * 400.0f) / (f24 + 27.13f)) * 2.0f) + ((f25 * 400.0f) / (f25 + 27.13f))) * pow, pow, pow, f20, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public r(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f17541f = f10;
        this.a = f11;
        this.f17537b = f12;
        this.f17538c = f13;
        this.f17539d = f14;
        this.f17540e = f15;
        this.f17542g = fArr;
        this.f17543h = f16;
        this.f17544i = f17;
        this.f17545j = f18;
    }
}
