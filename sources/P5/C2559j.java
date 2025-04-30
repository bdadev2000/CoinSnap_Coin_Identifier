package p5;

/* renamed from: p5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2559j {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC2558i f22343a;
    public final EnumC2558i b;

    /* renamed from: c, reason: collision with root package name */
    public final double f22344c;

    public C2559j(EnumC2558i enumC2558i, EnumC2558i enumC2558i2, double d2) {
        this.f22343a = enumC2558i;
        this.b = enumC2558i2;
        this.f22344c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2559j)) {
            return false;
        }
        C2559j c2559j = (C2559j) obj;
        if (this.f22343a == c2559j.f22343a && this.b == c2559j.b && Double.compare(this.f22344c, c2559j.f22344c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f22344c) + ((this.b.hashCode() + (this.f22343a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f22343a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.f22344c + ')';
    }
}
