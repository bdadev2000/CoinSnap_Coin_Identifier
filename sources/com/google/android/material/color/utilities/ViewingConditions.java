package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@RestrictTo
/* loaded from: classes3.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);
    private final double aw;

    /* renamed from: c, reason: collision with root package name */
    private final double f28674c;
    private final double fl;
    private final double flRoot;

    /* renamed from: n, reason: collision with root package name */
    private final double f28675n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;

    /* renamed from: z, reason: collision with root package name */
    private final double f28676z;

    private ViewingConditions(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.f28675n = d;
        this.aw = d2;
        this.nbb = d3;
        this.ncb = d4;
        this.f28674c = d5;
        this.nc = d6;
        this.rgbD = dArr;
        this.fl = d7;
        this.flRoot = d8;
        this.f28676z = d9;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d, double d2, double d3, boolean z2) {
        double max = Math.max(0.1d, d2);
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d4 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d5 = dArr3[0] * d4;
        double d6 = dArr[1];
        double d7 = (dArr3[1] * d6) + d5;
        double d8 = dArr[2];
        double d9 = (dArr3[2] * d8) + d7;
        double[] dArr4 = dArr2[1];
        double d10 = (dArr4[2] * d8) + (dArr4[1] * d6) + (dArr4[0] * d4);
        double[] dArr5 = dArr2[2];
        double d11 = (d8 * dArr5[2]) + (d6 * dArr5[1]) + (d4 * dArr5[0]);
        double d12 = (d3 / 10.0d) + 0.8d;
        double lerp = d12 >= 0.9d ? MathUtils.lerp(0.59d, 0.69d, (d12 - 0.9d) * 10.0d) : MathUtils.lerp(0.525d, 0.59d, (d12 - 0.8d) * 10.0d);
        double clampDouble = MathUtils.clampDouble(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, z2 ? 1.0d : (1.0d - (Math.exp(((-d) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d12);
        double[] dArr6 = {(((100.0d / d9) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d10) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d11) * clampDouble) + 1.0d) - clampDouble};
        double d13 = 5.0d * d;
        double d14 = 1.0d / (d13 + 1.0d);
        double d15 = d14 * d14 * d14 * d14;
        double d16 = 1.0d - d15;
        double cbrt = (Math.cbrt(d13) * 0.1d * d16 * d16) + (d15 * d);
        double yFromLstar = ColorUtils.yFromLstar(max) / dArr[1];
        double sqrt = Math.sqrt(yFromLstar) + 1.48d;
        double pow = 0.725d / Math.pow(yFromLstar, 0.2d);
        double pow2 = Math.pow(((dArr6[2] * cbrt) * d11) / 100.0d, 0.42d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d9) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d10) / 100.0d, 0.42d), pow2};
        double d17 = dArr7[0];
        double d18 = (d17 * 400.0d) / (d17 + 27.13d);
        double d19 = dArr7[1];
        return new ViewingConditions(yFromLstar, ((((400.0d * pow2) / (pow2 + 27.13d)) * 0.05d) + (d18 * 2.0d) + ((d19 * 400.0d) / (d19 + 27.13d))) * pow, pow, pow, lerp, d12, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    public double getAw() {
        return this.aw;
    }

    public double getC() {
        return this.f28674c;
    }

    public double getFl() {
        return this.fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f28675n;
    }

    public double getNbb() {
        return this.nbb;
    }

    public double getNc() {
        return this.nc;
    }

    public double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    public double getZ() {
        return this.f28676z;
    }
}
