package e0;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f30221a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30222b;

    public z(int i2, Object obj) {
        this.f30221a = i2;
        this.f30222b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f30221a == zVar.f30221a && p0.a.g(this.f30222b, zVar.f30222b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f30221a) * 31;
        Object obj = this.f30222b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f30221a + ", value=" + this.f30222b + ')';
    }
}
