package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@StabilityInferred
/* loaded from: classes2.dex */
public final class FloatSpringSpec implements FloatAnimationSpec {

    /* renamed from: a, reason: collision with root package name */
    public final float f2088a;

    /* renamed from: b, reason: collision with root package name */
    public final SpringSimulation f2089b;

    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.animation.core.SpringSimulation, java.lang.Object] */
    public FloatSpringSpec(float f2, float f3, float f4) {
        this.f2088a = f4;
        ?? obj = new Object();
        obj.f2226a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        obj.f2227b = sqrt;
        obj.f2230g = 1.0f;
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        obj.f2230g = f2;
        obj.f2228c = false;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        obj.f2227b = Math.sqrt(f3);
        obj.f2228c = false;
        this.f2089b = obj;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float c(float f2, float f3, float f4) {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float d(long j2, float f2, float f3, float f4) {
        SpringSimulation springSimulation = this.f2089b;
        springSimulation.f2226a = f3;
        return Float.intBitsToFloat((int) (springSimulation.a(j2 / 1000000, f2, f4) >> 32));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float e(long j2, float f2, float f3, float f4) {
        SpringSimulation springSimulation = this.f2089b;
        springSimulation.f2226a = f3;
        return Float.intBitsToFloat((int) (springSimulation.a(j2 / 1000000, f2, f4) & 4294967295L));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final long f(float f2, float f3, float f4) {
        double d;
        ComplexDouble complexDouble;
        ComplexDouble complexDouble2;
        ComplexDouble complexDouble3;
        boolean z2;
        boolean z3;
        double d2;
        double d3;
        long j2;
        double d4;
        double d5;
        double d6;
        long j3;
        SpringSimulation springSimulation = this.f2089b;
        double d7 = springSimulation.f2227b;
        float f5 = (float) (d7 * d7);
        float f6 = springSimulation.f2230g;
        float f7 = this.f2088a;
        float f8 = (f2 - f3) / f7;
        float f9 = f4 / f7;
        if (f6 == 0.0f) {
            j3 = 9223372036854L;
        } else {
            double d8 = f5;
            double d9 = f6;
            double d10 = f9;
            double d11 = f8;
            double d12 = 1.0f;
            double sqrt = d9 * 2.0d * Math.sqrt(d8);
            double d13 = (sqrt * sqrt) - (d8 * 4.0d);
            double d14 = -sqrt;
            if (d13 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                d = d12;
                complexDouble = new ComplexDouble(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.sqrt(Math.abs(d13)));
            } else {
                d = d12;
                complexDouble = new ComplexDouble(Math.sqrt(d13), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }
            complexDouble.f2066a = (complexDouble.f2066a + d14) * 0.5d;
            complexDouble.f2067b *= 0.5d;
            if (d13 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                complexDouble2 = complexDouble;
                complexDouble3 = new ComplexDouble(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.sqrt(Math.abs(d13)));
            } else {
                complexDouble2 = complexDouble;
                complexDouble3 = new ComplexDouble(Math.sqrt(d13), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }
            double d15 = -1;
            double d16 = complexDouble3.f2066a * d15;
            double d17 = complexDouble3.f2067b * d15;
            complexDouble3.f2066a = (d16 + d14) * 0.5d;
            complexDouble3.f2067b = d17 * 0.5d;
            if (d11 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d10 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                j2 = 0;
            } else {
                if (d11 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    d10 = -d10;
                }
                double abs = Math.abs(d11);
                int i2 = 0;
                if (d9 > 1.0d) {
                    double d18 = complexDouble2.f2066a;
                    double d19 = complexDouble3.f2066a;
                    double d20 = (d18 * abs) - d10;
                    double d21 = d18 - d19;
                    double d22 = d20 / d21;
                    double d23 = abs - d22;
                    d3 = Math.log(Math.abs(d / d23)) / d18;
                    double log = Math.log(Math.abs(d / d22)) / d19;
                    if (!((Double.isInfinite(d3) || Double.isNaN(d3)) ? false : true)) {
                        d3 = log;
                    } else if (!(!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true))) {
                        d3 = Math.max(d3, log);
                    }
                    double d24 = d23 * d18;
                    double log2 = Math.log(d24 / ((-d22) * d19)) / (d19 - d18);
                    if (Double.isNaN(log2) || log2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        d4 = -d;
                    } else {
                        if (log2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            if ((-((Math.exp(log2 * d19) * d22) + (Math.exp(d18 * log2) * d23))) < d) {
                                if (d22 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d23 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                    d5 = d3;
                                    d6 = d;
                                } else {
                                    d6 = d;
                                    d5 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                                }
                                d4 = -d6;
                                d3 = d5;
                            }
                        }
                        d4 = d;
                        d3 = Math.log((-((d22 * d19) * d19)) / (d24 * d18)) / d21;
                    }
                    double d25 = d22 * d19;
                    if (Math.abs((Math.exp(d19 * d3) * d25) + (Math.exp(d18 * d3) * d24)) >= 1.0E-4d) {
                        double d26 = Double.MAX_VALUE;
                        for (double d27 = 0.001d; d26 > d27 && i2 < 100; d27 = 0.001d) {
                            i2++;
                            double d28 = d18 * d3;
                            double d29 = d19 * d3;
                            double exp = d3 - ((((Math.exp(d29) * d22) + (Math.exp(d28) * d23)) + d4) / ((Math.exp(d29) * d25) + (Math.exp(d28) * d24)));
                            d26 = Math.abs(d3 - exp);
                            d3 = exp;
                        }
                    }
                } else {
                    ComplexDouble complexDouble4 = complexDouble2;
                    double d30 = d;
                    if (d9 < 1.0d) {
                        double d31 = complexDouble4.f2066a;
                        double d32 = (d10 - (d31 * abs)) / complexDouble4.f2067b;
                        d3 = Math.log(d30 / Math.sqrt((d32 * d32) + (abs * abs))) / d31;
                    } else {
                        double d33 = complexDouble4.f2066a;
                        double d34 = d33 * abs;
                        double d35 = d10 - d34;
                        double log3 = Math.log(Math.abs(d30 / abs)) / d33;
                        double log4 = Math.log(Math.abs(d30 / d35));
                        double d36 = log4;
                        for (int i3 = 0; i3 < 6; i3++) {
                            d36 = log4 - Math.log(Math.abs(d36 / d33));
                        }
                        double d37 = d36 / d33;
                        if (Double.isInfinite(log3) || Double.isNaN(log3)) {
                            z2 = false;
                            z3 = true;
                        } else {
                            z3 = true;
                            z2 = true;
                        }
                        if (!z2) {
                            log3 = d37;
                        } else if (!(!((Double.isInfinite(d37) || Double.isNaN(d37)) ? false : z3))) {
                            log3 = Math.max(log3, d37);
                        }
                        double d38 = (-(d34 + d35)) / (d33 * d35);
                        double d39 = d33 * d38;
                        double d40 = log3;
                        double exp2 = (Math.exp(d39) * d35 * d38) + (Math.exp(d39) * abs);
                        if (Double.isNaN(d38) || d38 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            d30 = -d30;
                            d2 = d40;
                        } else if (d38 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || (-exp2) >= d30) {
                            d2 = (-(2.0d / d33)) - (abs / d35);
                        } else {
                            d2 = (d35 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || abs <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? d40 : 0.0d;
                            d30 = -d30;
                        }
                        double d41 = Double.MAX_VALUE;
                        for (double d42 = 0.001d; d41 > d42 && i2 < 100; d42 = 0.001d) {
                            i2++;
                            double d43 = d33 * d2;
                            double exp3 = d2 - (((Math.exp(d43) * ((d35 * d2) + abs)) + d30) / (Math.exp(d43) * (((d43 + 1) * d35) + d34)));
                            d41 = Math.abs(d2 - exp3);
                            d2 = exp3;
                        }
                        d3 = d2;
                    }
                }
                j2 = (long) (d3 * 1000.0d);
            }
            j3 = j2;
        }
        return j3 * 1000000;
    }
}
