package n1;

/* loaded from: classes3.dex */
public abstract class h0 implements l1.f {

    /* renamed from: a, reason: collision with root package name */
    public final l1.f f31081a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31082b = 1;

    public h0(l1.f fVar) {
        this.f31081a = fVar;
    }

    @Override // l1.f
    public final boolean b() {
        return false;
    }

    @Override // l1.f
    public final l1.l c() {
        return l1.c.f31021c;
    }

    @Override // l1.f
    public final int d() {
        return this.f31082b;
    }

    @Override // l1.f
    public final String e(int i2) {
        return String.valueOf(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return p0.a.g(this.f31081a, h0Var.f31081a) && p0.a.g(g(), h0Var.g());
    }

    @Override // l1.f
    public final l1.f f(int i2) {
        if (i2 >= 0) {
            return this.f31081a;
        }
        StringBuilder t2 = android.support.v4.media.d.t("Illegal index ", i2, ", ");
        t2.append(g());
        t2.append(" expects only non-negative indices");
        throw new IllegalArgumentException(t2.toString().toString());
    }

    @Override // l1.f
    public final boolean h(int i2) {
        if (i2 >= 0) {
            return false;
        }
        StringBuilder t2 = android.support.v4.media.d.t("Illegal index ", i2, ", ");
        t2.append(g());
        t2.append(" expects only non-negative indices");
        throw new IllegalArgumentException(t2.toString().toString());
    }

    public final int hashCode() {
        return g().hashCode() + (this.f31081a.hashCode() * 31);
    }

    public final String toString() {
        return g() + '(' + this.f31081a + ')';
    }
}
