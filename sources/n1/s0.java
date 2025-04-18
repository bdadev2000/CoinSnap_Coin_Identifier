package n1;

/* loaded from: classes2.dex */
public final class s0 implements k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final k1.a f31130a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f31131b;

    public s0(k1.a aVar) {
        this.f31130a = aVar;
        this.f31131b = new d1(aVar.b());
    }

    @Override // k1.a
    public final void a(p0.a aVar, Object obj) {
        p0.a.s(aVar, "encoder");
        if (obj != null) {
            aVar.Z(this.f31130a, obj);
        } else {
            aVar.X();
        }
    }

    @Override // k1.a
    public final l1.f b() {
        return this.f31131b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && s0.class == obj.getClass() && p0.a.g(this.f31130a, ((s0) obj).f31130a);
    }

    public final int hashCode() {
        return this.f31130a.hashCode();
    }
}
