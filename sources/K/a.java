package K;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1606a;
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1607c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1608d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1609e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1610f;

    public a(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f1606a = f9;
        this.b = f10;
        this.f1607c = f11;
        this.f1608d = f12;
        this.f1609e = f13;
        this.f1610f = f14;
    }

    public static a a(int i9) {
        float f9;
        p pVar = p.f1634k;
        float e4 = b.e(Color.red(i9));
        float e9 = b.e(Color.green(i9));
        float e10 = b.e(Color.blue(i9));
        float[][] fArr = b.f1613d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * e10) + (fArr2[1] * e9) + (fArr2[0] * e4);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * e10) + (fArr3[1] * e9) + (fArr3[0] * e4);
        float[] fArr4 = fArr[2];
        float f12 = (e10 * fArr4[2]) + (e9 * fArr4[1]) + (e4 * fArr4[0]);
        float[][] fArr5 = b.f1611a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = pVar.f1640g;
        float f16 = fArr9[0] * f13;
        float f17 = fArr9[1] * f14;
        float f18 = fArr9[2] * f15;
        float abs = Math.abs(f16);
        float f19 = pVar.f1641h;
        float pow = (float) Math.pow((abs * f19) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f17) * f19) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f18) * f19) / 100.0d, 0.42d);
        float signum = ((Math.signum(f16) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = signum3;
        float f20 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d2)) / 11.0f;
        float f21 = ((float) ((signum + signum2) - (d2 * 2.0d))) / 9.0f;
        float f22 = signum2 * 20.0f;
        float f23 = ((21.0f * signum3) + ((signum * 20.0f) + f22)) / 20.0f;
        float f24 = (((signum * 40.0f) + f22) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f25 = atan2;
        float f26 = (3.1415927f * f25) / 180.0f;
        float f27 = f24 * pVar.b;
        float f28 = pVar.f1635a;
        float f29 = pVar.f1637d;
        float pow4 = ((float) Math.pow(f27 / f28, pVar.f1643j * f29)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f30 = f28 + 4.0f;
        if (f25 < 20.14d) {
            f9 = 360.0f + f25;
        } else {
            f9 = f25;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, pVar.f1639f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f9 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * pVar.f1638e) * pVar.f1636c) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f31 = pVar.f1642i * pow5;
        Math.sqrt((r3 * f29) / f30);
        float f32 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f31 * 0.0228f) + 1.0f)) * 43.85965f;
        double d9 = f26;
        return new a(f25, pow5, pow4, f32, log * ((float) Math.cos(d9)), log * ((float) Math.sin(d9)));
    }

    public static a b(float f9, float f10, float f11) {
        p pVar = p.f1634k;
        float f12 = pVar.f1637d;
        Math.sqrt(f9 / 100.0d);
        float f13 = pVar.f1635a + 4.0f;
        float f14 = pVar.f1642i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(r1))) * pVar.f1637d) / f13);
        float f15 = (1.7f * f9) / ((0.007f * f9) + 1.0f);
        float log = ((float) Math.log((f14 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f9, f15, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public final int c(p pVar) {
        float f9;
        float f10 = this.b;
        double d2 = f10;
        float f11 = this.f1607c;
        if (d2 != 0.0d) {
            double d9 = f11;
            if (d9 != 0.0d) {
                f9 = f10 / ((float) Math.sqrt(d9 / 100.0d));
                float pow = (float) Math.pow(f9 / Math.pow(1.64d - Math.pow(0.29d, pVar.f1639f), 0.73d), 1.1111111111111112d);
                double d10 = (this.f1606a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d10) + 3.8d)) * 0.25f;
                float pow2 = pVar.f1635a * ((float) Math.pow(f11 / 100.0d, (1.0d / pVar.f1637d) / pVar.f1643j));
                float f12 = cos * 3846.1538f * pVar.f1638e * pVar.f1636c;
                float f13 = pow2 / pVar.b;
                float sin = (float) Math.sin(d10);
                float cos2 = (float) Math.cos(d10);
                float f14 = (((0.305f + f13) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f12 * 23.0f)));
                float f15 = cos2 * f14;
                float f16 = f14 * sin;
                float f17 = f13 * 460.0f;
                float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
                float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
                float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18)));
                float signum = Math.signum(f18);
                float f21 = 100.0f / pVar.f1641h;
                float pow3 = signum * f21 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f19) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float signum3 = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float[] fArr = pVar.f1640g;
                float f22 = pow3 / fArr[0];
                float f23 = signum2 / fArr[1];
                float f24 = signum3 / fArr[2];
                float[][] fArr2 = b.b;
                float[] fArr3 = fArr2[0];
                float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
                float[] fArr4 = fArr2[1];
                float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
                float[] fArr5 = fArr2[2];
                return L.c.a(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
            }
        }
        f9 = 0.0f;
        float pow4 = (float) Math.pow(f9 / Math.pow(1.64d - Math.pow(0.29d, pVar.f1639f), 0.73d), 1.1111111111111112d);
        double d102 = (this.f1606a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d102) + 3.8d)) * 0.25f;
        float pow22 = pVar.f1635a * ((float) Math.pow(f11 / 100.0d, (1.0d / pVar.f1637d) / pVar.f1643j));
        float f122 = cos3 * 3846.1538f * pVar.f1638e * pVar.f1636c;
        float f132 = pow22 / pVar.b;
        float sin2 = (float) Math.sin(d102);
        float cos22 = (float) Math.cos(d102);
        float f142 = (((0.305f + f132) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f122 * 23.0f)));
        float f152 = cos22 * f142;
        float f162 = f142 * sin2;
        float f172 = f132 * 460.0f;
        float f182 = ((288.0f * f162) + ((451.0f * f152) + f172)) / 1403.0f;
        float f192 = ((f172 - (891.0f * f152)) - (261.0f * f162)) / 1403.0f;
        float f202 = ((f172 - (f152 * 220.0f)) - (f162 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182)));
        float signum4 = Math.signum(f182);
        float f212 = 100.0f / pVar.f1641h;
        float pow32 = signum4 * f212 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f192) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float signum32 = Math.signum(f202) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float[] fArr6 = pVar.f1640g;
        float f222 = pow32 / fArr6[0];
        float f232 = signum22 / fArr6[1];
        float f242 = signum32 / fArr6[2];
        float[][] fArr22 = b.b;
        float[] fArr32 = fArr22[0];
        float f252 = (fArr32[2] * f242) + (fArr32[1] * f232) + (fArr32[0] * f222);
        float[] fArr42 = fArr22[1];
        float f262 = (fArr42[2] * f242) + (fArr42[1] * f232) + (fArr42[0] * f222);
        float[] fArr52 = fArr22[2];
        return L.c.a(f252, f262, (f242 * fArr52[2]) + (f232 * fArr52[1]) + (f222 * fArr52[0]));
    }
}
