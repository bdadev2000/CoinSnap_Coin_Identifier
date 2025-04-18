package r;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f31349c;

    /* renamed from: a, reason: collision with root package name */
    public final p0.a f31350a;

    /* renamed from: b, reason: collision with root package name */
    public final p0.a f31351b;

    static {
        b bVar = b.f31340a;
        f31349c = new g(bVar, bVar);
    }

    public g(p0.a aVar, p0.a aVar2) {
        this.f31350a = aVar;
        this.f31351b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p0.a.g(this.f31350a, gVar.f31350a) && p0.a.g(this.f31351b, gVar.f31351b);
    }

    public final int hashCode() {
        return this.f31351b.hashCode() + (this.f31350a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f31350a + ", height=" + this.f31351b + ')';
    }
}
