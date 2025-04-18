package androidx.core.content.res;

import android.graphics.Color;
import android.support.v4.media.d;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@RestrictTo
/* loaded from: classes3.dex */
public class CamColor {

    /* renamed from: a, reason: collision with root package name */
    public final float f18482a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18483b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18484c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18485f;

    public CamColor(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f18482a = f2;
        this.f18483b = f3;
        this.f18484c = f4;
        this.d = f5;
        this.e = f6;
        this.f18485f = f7;
    }

    public static CamColor a(int i2) {
        ViewingConditions viewingConditions = ViewingConditions.f18514k;
        float b2 = CamUtils.b(Color.red(i2));
        float b3 = CamUtils.b(Color.green(i2));
        float b4 = CamUtils.b(Color.blue(i2));
        float[][] fArr = CamUtils.d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * b4) + (fArr2[1] * b3) + (fArr2[0] * b2);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * b4) + (fArr3[1] * b3) + (fArr3[0] * b2);
        float[] fArr4 = fArr[2];
        float f4 = (b4 * fArr4[2]) + (b3 * fArr4[1]) + (b2 * fArr4[0]);
        float[][] fArr5 = CamUtils.f18486a;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f6 = (fArr7[2] * f4) + (fArr7[1] * f3) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f7 = (f4 * fArr8[2]) + (f3 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = viewingConditions.f18519g;
        float f8 = fArr9[0] * f5;
        float f9 = fArr9[1] * f6;
        float f10 = fArr9[2] * f7;
        float abs = Math.abs(f8);
        float f11 = viewingConditions.f18520h;
        float pow = (float) Math.pow((abs * f11) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f9) * f11) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f10) * f11) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f12 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f13 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f14 = signum2 * 20.0f;
        float f15 = ((21.0f * signum3) + ((signum * 20.0f) + f14)) / 20.0f;
        float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f17 = atan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float f19 = f16 * viewingConditions.f18516b;
        float f20 = viewingConditions.f18515a;
        float f21 = viewingConditions.d;
        float pow4 = ((float) Math.pow(f19 / f20, viewingConditions.f18522j * f21)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f22 = f20 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.f18518f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f17) < 20.14d ? 360.0f + f17 : f17) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.e) * viewingConditions.f18517c) * ((float) Math.sqrt((f13 * f13) + (f12 * f12)))) / (f15 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f23 = viewingConditions.f18521i * pow5;
        Math.sqrt((r3 * f21) / f22);
        float f24 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f18;
        return new CamColor(f17, pow5, pow4, f24, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static CamColor b(float f2, float f3, float f4) {
        ViewingConditions viewingConditions = ViewingConditions.f18514k;
        float f5 = viewingConditions.d;
        Math.sqrt(f2 / 100.0d);
        float f6 = viewingConditions.f18515a + 4.0f;
        float f7 = viewingConditions.f18521i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(r1))) * viewingConditions.d) / f6);
        float f8 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((f7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f4) / 180.0f;
        return new CamColor(f4, f3, f2, f8, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public final int c(ViewingConditions viewingConditions) {
        float f2;
        float f3 = this.f18483b;
        double d = f3;
        float f4 = this.f18484c;
        if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            double d2 = f4;
            if (d2 != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                f2 = f3 / ((float) Math.sqrt(d2 / 100.0d));
                float pow = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.f18518f), 0.73d), 1.1111111111111112d);
                double d3 = (this.f18482a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
                float pow2 = viewingConditions.f18515a * ((float) Math.pow(f4 / 100.0d, (1.0d / viewingConditions.d) / viewingConditions.f18522j));
                float f5 = cos * 3846.1538f * viewingConditions.e * viewingConditions.f18517c;
                float f6 = pow2 / viewingConditions.f18516b;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float D = (((0.305f + f6) * 23.0f) * pow) / (((pow * 108.0f) * sin) + d.D(pow, 11.0f, cos2, f5 * 23.0f));
                float f7 = cos2 * D;
                float f8 = D * sin;
                float f9 = f6 * 460.0f;
                float f10 = ((288.0f * f8) + ((451.0f * f7) + f9)) / 1403.0f;
                float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
                float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10)));
                float signum = Math.signum(f10);
                float f13 = 100.0f / viewingConditions.f18520h;
                float pow3 = signum * f13 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f11) * f13 * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
                float signum3 = Math.signum(f12) * f13 * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
                float[] fArr = viewingConditions.f18519g;
                float f14 = pow3 / fArr[0];
                float f15 = signum2 / fArr[1];
                float f16 = signum3 / fArr[2];
                float[][] fArr2 = CamUtils.f18487b;
                float[] fArr3 = fArr2[0];
                float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
                float[] fArr4 = fArr2[1];
                float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
                float[] fArr5 = fArr2[2];
                return ColorUtils.b(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
            }
        }
        f2 = 0.0f;
        float pow4 = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.f18518f), 0.73d), 1.1111111111111112d);
        double d32 = (this.f18482a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f;
        float pow22 = viewingConditions.f18515a * ((float) Math.pow(f4 / 100.0d, (1.0d / viewingConditions.d) / viewingConditions.f18522j));
        float f52 = cos3 * 3846.1538f * viewingConditions.e * viewingConditions.f18517c;
        float f62 = pow22 / viewingConditions.f18516b;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float D2 = (((0.305f + f62) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + d.D(pow4, 11.0f, cos22, f52 * 23.0f));
        float f72 = cos22 * D2;
        float f82 = D2 * sin2;
        float f92 = f62 * 460.0f;
        float f102 = ((288.0f * f82) + ((451.0f * f72) + f92)) / 1403.0f;
        float f112 = ((f92 - (891.0f * f72)) - (261.0f * f82)) / 1403.0f;
        float f122 = ((f92 - (f72 * 220.0f)) - (f82 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f102) * 27.13d) / (400.0d - Math.abs(f102)));
        float signum4 = Math.signum(f102);
        float f132 = 100.0f / viewingConditions.f18520h;
        float pow32 = signum4 * f132 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f112) * f132 * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f112) * 27.13d) / (400.0d - Math.abs(f112))), 2.380952380952381d));
        float signum32 = Math.signum(f122) * f132 * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122))), 2.380952380952381d));
        float[] fArr6 = viewingConditions.f18519g;
        float f142 = pow32 / fArr6[0];
        float f152 = signum22 / fArr6[1];
        float f162 = signum32 / fArr6[2];
        float[][] fArr22 = CamUtils.f18487b;
        float[] fArr32 = fArr22[0];
        float f172 = (fArr32[2] * f162) + (fArr32[1] * f152) + (fArr32[0] * f142);
        float[] fArr42 = fArr22[1];
        float f182 = (fArr42[2] * f162) + (fArr42[1] * f152) + (fArr42[0] * f142);
        float[] fArr52 = fArr22[2];
        return ColorUtils.b(f172, f182, (f162 * fArr52[2]) + (f152 * fArr52[1]) + (f142 * fArr52[0]));
    }
}
