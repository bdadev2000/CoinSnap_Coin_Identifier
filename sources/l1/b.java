package l1;

/* loaded from: classes4.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f31016a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.c f31017b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31018c;

    public b(g gVar, x0.c cVar) {
        this.f31016a = gVar;
        this.f31017b = cVar;
        this.f31018c = gVar.f31029a + '<' + ((kotlin.jvm.internal.j) cVar).c() + '>';
    }

    @Override // l1.f
    public final boolean b() {
        return this.f31016a.b();
    }

    @Override // l1.f
    public final l c() {
        return this.f31016a.c();
    }

    @Override // l1.f
    public final int d() {
        return this.f31016a.d();
    }

    @Override // l1.f
    public final String e(int i2) {
        return this.f31016a.e(i2);
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && p0.a.g(this.f31016a, bVar.f31016a) && p0.a.g(bVar.f31017b, this.f31017b);
    }

    @Override // l1.f
    public final f f(int i2) {
        return this.f31016a.f(i2);
    }

    @Override // l1.f
    public final String g() {
        return this.f31018c;
    }

    @Override // l1.f
    public final boolean h(int i2) {
        return this.f31016a.h(i2);
    }

    public final int hashCode() {
        return this.f31018c.hashCode() + (this.f31017b.hashCode() * 31);
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f31017b + ", original: " + this.f31016a + ')';
    }
}
