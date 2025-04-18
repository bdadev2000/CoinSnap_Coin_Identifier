package z0;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f31469a;

    /* renamed from: b, reason: collision with root package name */
    public final w0.g f31470b;

    public d(String str, w0.g gVar) {
        this.f31469a = str;
        this.f31470b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p0.a.g(this.f31469a, dVar.f31469a) && p0.a.g(this.f31470b, dVar.f31470b);
    }

    public final int hashCode() {
        return this.f31470b.hashCode() + (this.f31469a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f31469a + ", range=" + this.f31470b + ')';
    }
}
