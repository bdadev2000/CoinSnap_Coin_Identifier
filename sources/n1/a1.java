package n1;

/* loaded from: classes3.dex */
public final class a1 implements l1.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f31052a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.d f31053b;

    public a1(String str, l1.d dVar) {
        this.f31052a = str;
        this.f31053b = dVar;
    }

    @Override // l1.f
    public final boolean b() {
        return false;
    }

    @Override // l1.f
    public final l1.l c() {
        return this.f31053b;
    }

    @Override // l1.f
    public final int d() {
        return 0;
    }

    @Override // l1.f
    public final String e(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (p0.a.g(this.f31052a, a1Var.f31052a)) {
            if (p0.a.g(this.f31053b, a1Var.f31053b)) {
                return true;
            }
        }
        return false;
    }

    @Override // l1.f
    public final l1.f f(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // l1.f
    public final String g() {
        return this.f31052a;
    }

    @Override // l1.f
    public final boolean h(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f31053b.hashCode() * 31) + this.f31052a.hashCode();
    }

    public final String toString() {
        return android.support.v4.media.d.q(new StringBuilder("PrimitiveDescriptor("), this.f31052a, ')');
    }
}
