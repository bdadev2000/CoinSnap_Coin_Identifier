package androidx.compose.ui.graphics.colorspace;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes4.dex */
public final class TransferParameters {

    /* renamed from: a, reason: collision with root package name */
    public final double f15118a;

    /* renamed from: b, reason: collision with root package name */
    public final double f15119b;

    /* renamed from: c, reason: collision with root package name */
    public final double f15120c;
    public final double d;
    public final double e;

    /* renamed from: f, reason: collision with root package name */
    public final double f15121f;

    /* renamed from: g, reason: collision with root package name */
    public final double f15122g;

    public /* synthetic */ TransferParameters(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.compare(this.f15118a, transferParameters.f15118a) == 0 && Double.compare(this.f15119b, transferParameters.f15119b) == 0 && Double.compare(this.f15120c, transferParameters.f15120c) == 0 && Double.compare(this.d, transferParameters.d) == 0 && Double.compare(this.e, transferParameters.e) == 0 && Double.compare(this.f15121f, transferParameters.f15121f) == 0 && Double.compare(this.f15122g, transferParameters.f15122g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f15122g) + ((Double.hashCode(this.f15121f) + ((Double.hashCode(this.e) + ((Double.hashCode(this.d) + ((Double.hashCode(this.f15120c) + ((Double.hashCode(this.f15119b) + (Double.hashCode(this.f15118a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f15118a + ", a=" + this.f15119b + ", b=" + this.f15120c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f15121f + ", f=" + this.f15122g + ')';
    }

    public TransferParameters(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f15118a = d;
        this.f15119b = d2;
        this.f15120c = d3;
        this.d = d4;
        this.e = d5;
        this.f15121f = d6;
        this.f15122g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && (d2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) && d4 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
