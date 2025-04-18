package n1;

/* loaded from: classes4.dex */
public final class v extends x0 {

    /* renamed from: l, reason: collision with root package name */
    public final l1.k f31140l;

    /* renamed from: m, reason: collision with root package name */
    public final d0.p f31141m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, int i2) {
        super(str, null, i2);
        p0.a.s(str, "name");
        this.f31140l = l1.k.f31046b;
        this.f31141m = b1.f0.t(new u(i2, str, this));
    }

    @Override // n1.x0, l1.f
    public final l1.l c() {
        return this.f31140l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l1.f)) {
            return false;
        }
        l1.f fVar = (l1.f) obj;
        if (fVar.c() != l1.k.f31046b) {
            return false;
        }
        return p0.a.g(this.f31150a, fVar.g()) && p0.a.g(v0.a(this), v0.a(fVar));
    }

    @Override // n1.x0, l1.f
    public final l1.f f(int i2) {
        return ((l1.f[]) this.f31141m.getValue())[i2];
    }

    @Override // n1.x0
    public final int hashCode() {
        int hashCode = this.f31150a.hashCode();
        int i2 = 1;
        l1.h hVar = new l1.h(this, 1);
        while (hVar.hasNext()) {
            int i3 = i2 * 31;
            String str = (String) hVar.next();
            i2 = i3 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i2;
    }

    @Override // n1.x0
    public final String toString() {
        return e0.u.K0(new l1.i(this, 1), ", ", android.support.v4.media.d.q(new StringBuilder(), this.f31150a, '('), ")", null, 56);
    }
}
