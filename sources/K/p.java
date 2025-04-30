package K;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: k, reason: collision with root package name */
    public static final p f1634k;

    /* renamed from: a, reason: collision with root package name */
    public final float f1635a;
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1636c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1637d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1638e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1639f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f1640g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1641h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1642i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1643j;

    static {
        float f9;
        float[] fArr = b.f1612c;
        float l = (float) ((b.l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f1611a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f9 = 0.69f;
        } else {
            f9 = 0.655f;
        }
        float f18 = f9;
        float exp = (1.0f - (((float) Math.exp(((-l) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp};
        float f19 = 1.0f / ((5.0f * l) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float cbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(l * 5.0d))) + (f20 * l);
        float l2 = b.l() / fArr[1];
        double d9 = l2;
        float sqrt = ((float) Math.sqrt(d9)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d9, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f17) / 100.0d, 0.42d)};
        float f22 = fArr7[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[2];
        float[] fArr8 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        f1634k = new p(l2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f18, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public p(float f9, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f1639f = f9;
        this.f1635a = f10;
        this.b = f11;
        this.f1636c = f12;
        this.f1637d = f13;
        this.f1638e = f14;
        this.f1640g = fArr;
        this.f1641h = f15;
        this.f1642i = f16;
        this.f1643j = f17;
    }
}
