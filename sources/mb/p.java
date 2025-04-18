package mb;

/* loaded from: classes3.dex */
public final class p implements vb.d {
    public static final p a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f22039b = vb.c.a("name");

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f22040c = vb.c.a("importance");

    /* renamed from: d, reason: collision with root package name */
    public static final vb.c f22041d = vb.c.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        vb.e eVar = (vb.e) obj2;
        a1 a1Var = (a1) ((f2) obj);
        eVar.a(f22039b, a1Var.a);
        eVar.b(f22040c, a1Var.f21831b);
        eVar.a(f22041d, a1Var.f21832c);
    }
}
