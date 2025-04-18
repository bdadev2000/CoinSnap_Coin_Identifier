package r;

/* loaded from: classes3.dex */
public final class a extends p0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f31339a;

    public a(int i2) {
        this.f31339a = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException("px must be > 0.".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (this.f31339a == ((a) obj).f31339a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31339a;
    }

    public final String toString() {
        return String.valueOf(this.f31339a);
    }
}
