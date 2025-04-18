package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@RestrictTo
/* loaded from: classes4.dex */
public final class Cam16 {
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;

    /* renamed from: j, reason: collision with root package name */
    private final double f28663j;
    private final double jstar;

    /* renamed from: m, reason: collision with root package name */
    private final double f28664m;

    /* renamed from: q, reason: collision with root package name */
    private final double f28665q;

    /* renamed from: s, reason: collision with root package name */
    private final double f28666s;
    private final double[] tempArray = {FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE};
    static final double[][] XYZ_TO_CAM16RGB = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    static final double[][] CAM16RGB_TO_XYZ = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    private Cam16(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.hue = d;
        this.chroma = d2;
        this.f28663j = d3;
        this.f28665q = d4;
        this.f28664m = d5;
        this.f28666s = d6;
        this.jstar = d7;
        this.astar = d8;
        this.bstar = d9;
    }

    public static Cam16 fromInt(int i2) {
        return fromIntInViewingConditions(i2, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromIntInViewingConditions(int i2, ViewingConditions viewingConditions) {
        double linearized = ColorUtils.linearized((16711680 & i2) >> 16);
        double linearized2 = ColorUtils.linearized((65280 & i2) >> 8);
        double linearized3 = ColorUtils.linearized(i2 & 255);
        return fromXyzInViewingConditions((0.18051042d * linearized3) + (0.35762064d * linearized2) + (0.41233895d * linearized), (0.0722d * linearized3) + (0.7152d * linearized2) + (0.2126d * linearized), (linearized3 * 0.95034478d) + (linearized2 * 0.11916382d) + (linearized * 0.01932141d), viewingConditions);
    }

    public static Cam16 fromJch(double d, double d2, double d3) {
        return fromJchInViewingConditions(d, d2, d3, ViewingConditions.DEFAULT);
    }

    private static Cam16 fromJchInViewingConditions(double d, double d2, double d3, ViewingConditions viewingConditions) {
        double d4 = d / 100.0d;
        double aw = (viewingConditions.getAw() + 4.0d) * Math.sqrt(d4) * (4.0d / viewingConditions.getC()) * viewingConditions.getFlRoot();
        double flRoot = viewingConditions.getFlRoot() * d2;
        double sqrt = Math.sqrt((viewingConditions.getC() * (d2 / Math.sqrt(d4))) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d3);
        double d5 = (1.7000000000000002d * d) / ((0.007d * d) + 1.0d);
        double log1p = 43.859649122807014d * Math.log1p(flRoot * 0.0228d);
        return new Cam16(d3, d2, d, aw, flRoot, sqrt, d5, Math.cos(radians) * log1p, Math.sin(radians) * log1p);
    }

    public static Cam16 fromUcs(double d, double d2, double d3) {
        return fromUcsInViewingConditions(d, d2, d3, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(double d, double d2, double d3, ViewingConditions viewingConditions) {
        double expm1 = (Math.expm1(Math.hypot(d2, d3) * 0.0228d) / 0.0228d) / viewingConditions.getFlRoot();
        double atan2 = Math.atan2(d3, d2) * 57.29577951308232d;
        if (atan2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            atan2 += 360.0d;
        }
        return fromJchInViewingConditions(d / (1.0d - ((d - 100.0d) * 0.007d)), expm1, atan2, viewingConditions);
    }

    public static Cam16 fromXyzInViewingConditions(double d, double d2, double d3, ViewingConditions viewingConditions) {
        double[][] dArr = XYZ_TO_CAM16RGB;
        double[] dArr2 = dArr[0];
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        double d6 = (dArr4[2] * d3) + (dArr4[1] * d2) + (dArr4[0] * d);
        double d7 = viewingConditions.getRgbD()[0] * d4;
        double d8 = viewingConditions.getRgbD()[1] * d5;
        double d9 = viewingConditions.getRgbD()[2] * d6;
        double pow = Math.pow((Math.abs(d7) * viewingConditions.getFl()) / 100.0d, 0.42d);
        double pow2 = Math.pow((Math.abs(d8) * viewingConditions.getFl()) / 100.0d, 0.42d);
        double pow3 = Math.pow((Math.abs(d9) * viewingConditions.getFl()) / 100.0d, 0.42d);
        double signum = ((Math.signum(d7) * 400.0d) * pow) / (pow + 27.13d);
        double signum2 = ((Math.signum(d8) * 400.0d) * pow2) / (pow2 + 27.13d);
        double signum3 = ((Math.signum(d9) * 400.0d) * pow3) / (pow3 + 27.13d);
        double d10 = ((((-12.0d) * signum2) + (signum * 11.0d)) + signum3) / 11.0d;
        double d11 = ((signum + signum2) - (signum3 * 2.0d)) / 9.0d;
        double d12 = signum2 * 20.0d;
        double d13 = ((21.0d * signum3) + ((signum * 20.0d) + d12)) / 20.0d;
        double d14 = (((signum * 40.0d) + d12) + signum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d11, d10));
        if (degrees < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d15 = degrees;
        double radians = Math.toRadians(d15);
        double pow4 = Math.pow((viewingConditions.getNbb() * d14) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ()) * 100.0d;
        double d16 = pow4 / 100.0d;
        double flRoot = viewingConditions.getFlRoot() * (viewingConditions.getAw() + 4.0d) * Math.sqrt(d16) * (4.0d / viewingConditions.getC());
        double pow5 = Math.pow((Math.hypot(d10, d11) * (viewingConditions.getNcb() * (viewingConditions.getNc() * (((Math.cos(Math.toRadians(d15 < 20.14d ? d15 + 360.0d : d15) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d)))) / (d13 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d);
        double sqrt = Math.sqrt(d16) * pow5;
        double flRoot2 = viewingConditions.getFlRoot() * sqrt;
        double sqrt2 = Math.sqrt((viewingConditions.getC() * pow5) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double d17 = (1.7000000000000002d * pow4) / ((0.007d * pow4) + 1.0d);
        double log1p = Math.log1p(flRoot2 * 0.0228d) * 43.859649122807014d;
        return new Cam16(d15, sqrt, pow4, flRoot, flRoot2, sqrt2, d17, Math.cos(radians) * log1p, Math.sin(radians) * log1p);
    }

    public double distance(Cam16 cam16) {
        double jstar = getJstar() - cam16.getJstar();
        double astar = getAstar() - cam16.getAstar();
        double bstar = getBstar() - cam16.getBstar();
        return Math.pow(Math.sqrt((bstar * bstar) + (astar * astar) + (jstar * jstar)), 0.63d) * 1.41d;
    }

    public double getAstar() {
        return this.astar;
    }

    public double getBstar() {
        return this.bstar;
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getJ() {
        return this.f28663j;
    }

    public double getJstar() {
        return this.jstar;
    }

    public double getM() {
        return this.f28664m;
    }

    public double getQ() {
        return this.f28665q;
    }

    public double getS() {
        return this.f28666s;
    }

    public int toInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public int viewed(ViewingConditions viewingConditions) {
        double[] xyzInViewingConditions = xyzInViewingConditions(viewingConditions, this.tempArray);
        return ColorUtils.argbFromXyz(xyzInViewingConditions[0], xyzInViewingConditions[1], xyzInViewingConditions[2]);
    }

    public double[] xyzInViewingConditions(ViewingConditions viewingConditions, double[] dArr) {
        double pow = Math.pow(((getChroma() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || getJ() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? 0.0d : getChroma() / Math.sqrt(getJ() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double cos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double pow2 = Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()) * viewingConditions.getAw();
        double ncb = viewingConditions.getNcb() * viewingConditions.getNc() * cos * 3846.153846153846d;
        double nbb = pow2 / viewingConditions.getNbb();
        double sin = Math.sin(radians);
        double cos2 = Math.cos(radians);
        double d = (((0.305d + nbb) * 23.0d) * pow) / (((pow * 108.0d) * sin) + (((11.0d * pow) * cos2) + (ncb * 23.0d)));
        double d2 = cos2 * d;
        double d3 = d * sin;
        double d4 = nbb * 460.0d;
        double d5 = ((288.0d * d3) + ((451.0d * d2) + d4)) / 1403.0d;
        double d6 = ((d4 - (891.0d * d2)) - (261.0d * d3)) / 1403.0d;
        double d7 = ((d4 - (d2 * 220.0d)) - (d3 * 6300.0d)) / 1403.0d;
        double pow3 = Math.pow(Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(d5) * 27.13d) / (400.0d - Math.abs(d5))), 2.380952380952381d) * (100.0d / viewingConditions.getFl()) * Math.signum(d5);
        double pow4 = Math.pow(Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(d6) * 27.13d) / (400.0d - Math.abs(d6))), 2.380952380952381d) * (100.0d / viewingConditions.getFl()) * Math.signum(d6);
        double pow5 = Math.pow(Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (Math.abs(d7) * 27.13d) / (400.0d - Math.abs(d7))), 2.380952380952381d) * (100.0d / viewingConditions.getFl()) * Math.signum(d7);
        double d8 = pow3 / viewingConditions.getRgbD()[0];
        double d9 = pow4 / viewingConditions.getRgbD()[1];
        double d10 = pow5 / viewingConditions.getRgbD()[2];
        double[][] dArr2 = CAM16RGB_TO_XYZ;
        double[] dArr3 = dArr2[0];
        double d11 = (dArr3[2] * d10) + (dArr3[1] * d9) + (dArr3[0] * d8);
        double[] dArr4 = dArr2[1];
        double d12 = (dArr4[2] * d10) + (dArr4[1] * d9) + (dArr4[0] * d8);
        double[] dArr5 = dArr2[2];
        double d13 = (d10 * dArr5[2]) + (d9 * dArr5[1]) + (d8 * dArr5[0]);
        if (dArr == null) {
            return new double[]{d11, d12, d13};
        }
        dArr[0] = d11;
        dArr[1] = d12;
        dArr[2] = d13;
        return dArr;
    }
}
