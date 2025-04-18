package n1;

/* loaded from: classes3.dex */
public final class h1 implements k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final k1.a f31083a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.a f31084b;

    /* renamed from: c, reason: collision with root package name */
    public final k1.a f31085c;
    public final l1.g d = e1.t0.g("kotlin.Triple", new l1.f[0], new t0(this, 2));

    public h1(k1.a aVar, k1.a aVar2, k1.a aVar3) {
        this.f31083a = aVar;
        this.f31084b = aVar2;
        this.f31085c = aVar3;
    }

    @Override // k1.a
    public final void a(p0.a aVar, Object obj) {
        d0.q qVar = (d0.q) obj;
        p0.a.s(aVar, "encoder");
        p0.a.s(qVar, "value");
        l1.g gVar = this.d;
        p0.a.s(gVar, "descriptor");
        qVar.getClass();
        aVar.Y(gVar, 0, this.f31083a, null);
        qVar.getClass();
        aVar.Y(gVar, 1, this.f31084b, null);
        qVar.getClass();
        aVar.Y(gVar, 2, this.f31085c, null);
    }

    @Override // k1.a
    public final l1.f b() {
        return this.d;
    }
}
