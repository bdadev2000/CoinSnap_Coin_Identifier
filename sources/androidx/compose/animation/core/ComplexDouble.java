package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ComplexDouble {

    /* renamed from: a, reason: collision with root package name */
    public double f2066a;

    /* renamed from: b, reason: collision with root package name */
    public double f2067b;

    public ComplexDouble(double d, double d2) {
        this.f2066a = d;
        this.f2067b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplexDouble)) {
            return false;
        }
        ComplexDouble complexDouble = (ComplexDouble) obj;
        return Double.compare(this.f2066a, complexDouble.f2066a) == 0 && Double.compare(this.f2067b, complexDouble.f2067b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f2067b) + (Double.hashCode(this.f2066a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f2066a + ", _imaginary=" + this.f2067b + ')';
    }
}
