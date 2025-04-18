package qc;

/* loaded from: classes3.dex */
public final class h implements vb.d {
    public static final h a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f23806b = vb.c.a("sessionId");

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f23807c = vb.c.a("firstSessionId");

    /* renamed from: d, reason: collision with root package name */
    public static final vb.c f23808d = vb.c.a("sessionIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final vb.c f23809e = vb.c.a("eventTimestampUs");

    /* renamed from: f, reason: collision with root package name */
    public static final vb.c f23810f = vb.c.a("dataCollectionStatus");

    /* renamed from: g, reason: collision with root package name */
    public static final vb.c f23811g = vb.c.a("firebaseInstallationId");

    /* renamed from: h, reason: collision with root package name */
    public static final vb.c f23812h = vb.c.a("firebaseAuthenticationToken");

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        q0 q0Var = (q0) obj;
        vb.e eVar = (vb.e) obj2;
        eVar.a(f23806b, q0Var.a);
        eVar.a(f23807c, q0Var.f23858b);
        eVar.b(f23808d, q0Var.f23859c);
        eVar.c(f23809e, q0Var.f23860d);
        eVar.a(f23810f, q0Var.f23861e);
        eVar.a(f23811g, q0Var.f23862f);
        eVar.a(f23812h, q0Var.f23863g);
    }
}
