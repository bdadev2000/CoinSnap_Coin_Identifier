package androidx.core.content.res;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes.dex */
final class ViewingConditions {

    /* renamed from: k, reason: collision with root package name */
    public static final ViewingConditions f18514k;

    /* renamed from: a, reason: collision with root package name */
    public final float f18515a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18516b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18517c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18518f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f18519g;

    /* renamed from: h, reason: collision with root package name */
    public final float f18520h;

    /* renamed from: i, reason: collision with root package name */
    public final float f18521i;

    /* renamed from: j, reason: collision with root package name */
    public final float f18522j;

    static {
        float[] fArr = CamUtils.f18488c;
        float c2 = (float) ((CamUtils.c() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = CamUtils.f18486a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float f10 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-c2) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f11 = 1.0f / ((5.0f * c2) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float cbrt = (0.1f * f13 * f13 * ((float) Math.cbrt(c2 * 5.0d))) + (f12 * c2);
        float c3 = CamUtils.c() / fArr[1];
        double d2 = c3;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f9) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f8) / 100.0d, 0.42d), pow2};
        float f14 = fArr7[0];
        float f15 = fArr7[1];
        f18514k = new ViewingConditions(c3, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f14 * 400.0f) / (f14 + 27.13f)) * 2.0f) + ((f15 * 400.0f) / (f15 + 27.13f))) * pow, pow, pow, f10, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public ViewingConditions(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f18518f = f2;
        this.f18515a = f3;
        this.f18516b = f4;
        this.f18517c = f5;
        this.d = f6;
        this.e = f7;
        this.f18519g = fArr;
        this.f18520h = f8;
        this.f18521i = f9;
        this.f18522j = f10;
    }
}
