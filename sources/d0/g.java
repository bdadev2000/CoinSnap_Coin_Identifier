package d0;

/* loaded from: classes3.dex */
public final class g implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final g f30129b = new g();

    /* renamed from: a, reason: collision with root package name */
    public final int f30130a;

    /* JADX WARN: Type inference failed for: r0v0, types: [w0.g, w0.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [w0.g, w0.e] */
    /* JADX WARN: Type inference failed for: r0v5, types: [w0.g, w0.e] */
    public g() {
        if (!new w0.e(0, 255, 1).c(1) || !new w0.e(0, 255, 1).c(9) || !new w0.e(0, 255, 1).c(25)) {
            throw new IllegalArgumentException("Version components are out of range: 1.9.25".toString());
        }
        this.f30130a = 67865;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        p0.a.s(gVar, "other");
        return this.f30130a - gVar.f30130a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.f30130a == gVar.f30130a;
    }

    public final int hashCode() {
        return this.f30130a;
    }

    public final String toString() {
        return "1.9.25";
    }
}
