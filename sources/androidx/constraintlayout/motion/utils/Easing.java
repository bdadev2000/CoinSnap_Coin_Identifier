package androidx.constraintlayout.motion.utils;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class Easing {

    /* renamed from: b, reason: collision with root package name */
    public static final Easing f17750b = new Easing();

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f17751c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a, reason: collision with root package name */
    public String f17752a = "identity";

    /* loaded from: classes2.dex */
    public static class CubicEasing extends Easing {
        public final double d;
        public final double e;

        /* renamed from: f, reason: collision with root package name */
        public final double f17753f;

        /* renamed from: g, reason: collision with root package name */
        public final double f17754g;

        public CubicEasing(String str) {
            this.f17752a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i2 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i2);
            this.e = Double.parseDouble(str.substring(i2, indexOf3).trim());
            int i3 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i3);
            this.f17753f = Double.parseDouble(str.substring(i3, indexOf4).trim());
            int i4 = indexOf4 + 1;
            this.f17754g = Double.parseDouble(str.substring(i4, str.indexOf(41, i4)).trim());
        }

        @Override // androidx.constraintlayout.motion.utils.Easing
        public final double a(double d) {
            if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = c(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double c2 = c(d4);
            double d5 = d3 + d2;
            double c3 = c(d5);
            double d6 = d(d4);
            return (((d - c2) * (d(d5) - d6)) / (c3 - c2)) + d6;
        }

        public final double c(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f17753f * d5) + (this.d * d4) + (d * d * d);
        }

        public final double d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f17754g * d5) + (this.e * d4) + (d * d * d);
        }
    }

    public static Easing b(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new CubicEasing(str);
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new CubicEasing("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new CubicEasing("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new CubicEasing("cubic(1, 1, 0, 0)");
            case 3:
                return new CubicEasing("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Log.e("ConstraintSet", "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f17751c));
                return f17750b;
        }
    }

    public double a(double d) {
        return d;
    }

    public final String toString() {
        return this.f17752a;
    }
}
