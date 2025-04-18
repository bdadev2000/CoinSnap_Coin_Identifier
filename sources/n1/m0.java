package n1;

/* loaded from: classes2.dex */
public abstract class m0 implements l1.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f31106a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.f f31107b;

    /* renamed from: c, reason: collision with root package name */
    public final l1.f f31108c;
    public final int d = 2;

    public m0(String str, l1.f fVar, l1.f fVar2) {
        this.f31106a = str;
        this.f31107b = fVar;
        this.f31108c = fVar2;
    }

    @Override // l1.f
    public final boolean b() {
        return false;
    }

    @Override // l1.f
    public final l1.l c() {
        return l1.c.d;
    }

    @Override // l1.f
    public final int d() {
        return this.d;
    }

    @Override // l1.f
    public final String e(int i2) {
        return String.valueOf(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return p0.a.g(this.f31106a, m0Var.f31106a) && p0.a.g(this.f31107b, m0Var.f31107b) && p0.a.g(this.f31108c, m0Var.f31108c);
    }

    @Override // l1.f
    public final l1.f f(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.r(android.support.v4.media.d.t("Illegal index ", i2, ", "), this.f31106a, " expects only non-negative indices").toString());
        }
        int i3 = i2 % 2;
        if (i3 == 0) {
            return this.f31107b;
        }
        if (i3 == 1) {
            return this.f31108c;
        }
        throw new IllegalStateException("Unreached".toString());
    }

    @Override // l1.f
    public final String g() {
        return this.f31106a;
    }

    @Override // l1.f
    public final boolean h(int i2) {
        if (i2 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(android.support.v4.media.d.r(android.support.v4.media.d.t("Illegal index ", i2, ", "), this.f31106a, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f31108c.hashCode() + ((this.f31107b.hashCode() + (this.f31106a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return this.f31106a + '(' + this.f31107b + ", " + this.f31108c + ')';
    }
}
