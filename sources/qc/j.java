package qc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j {
    public final i a;

    /* renamed from: b, reason: collision with root package name */
    public final i f23823b;

    /* renamed from: c, reason: collision with root package name */
    public final double f23824c;

    public j(i performance, i crashlytics, double d10) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.a = performance;
        this.f23823b = crashlytics;
        this.f23824c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.f23823b == jVar.f23823b && Double.compare(this.f23824c, jVar.f23824c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f23824c) + ((this.f23823b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.f23823b + ", sessionSamplingRate=" + this.f23824c + ')';
    }
}
