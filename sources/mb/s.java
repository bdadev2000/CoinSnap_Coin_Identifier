package mb;

/* loaded from: classes3.dex */
public final class s implements vb.d {
    public static final s a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f22084b = vb.c.a("batteryLevel");

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f22085c = vb.c.a("batteryVelocity");

    /* renamed from: d, reason: collision with root package name */
    public static final vb.c f22086d = vb.c.a("proximityOn");

    /* renamed from: e, reason: collision with root package name */
    public static final vb.c f22087e = vb.c.a("orientation");

    /* renamed from: f, reason: collision with root package name */
    public static final vb.c f22088f = vb.c.a("ramUsed");

    /* renamed from: g, reason: collision with root package name */
    public static final vb.c f22089g = vb.c.a("diskUsed");

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        vb.e eVar = (vb.e) obj2;
        g1 g1Var = (g1) ((j2) obj);
        eVar.a(f22084b, g1Var.a);
        eVar.b(f22085c, g1Var.f21922b);
        eVar.e(f22086d, g1Var.f21923c);
        eVar.b(f22087e, g1Var.f21924d);
        eVar.c(f22088f, g1Var.f21925e);
        eVar.c(f22089g, g1Var.f21926f);
    }
}
