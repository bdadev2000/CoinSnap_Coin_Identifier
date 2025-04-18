package mb;

import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes3.dex */
public final class j implements vb.d {
    public static final j a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f21953b = vb.c.a("generator");

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f21954c = vb.c.a("identifier");

    /* renamed from: d, reason: collision with root package name */
    public static final vb.c f21955d = vb.c.a("appQualitySessionId");

    /* renamed from: e, reason: collision with root package name */
    public static final vb.c f21956e = vb.c.a("startedAt");

    /* renamed from: f, reason: collision with root package name */
    public static final vb.c f21957f = vb.c.a("endedAt");

    /* renamed from: g, reason: collision with root package name */
    public static final vb.c f21958g = vb.c.a("crashed");

    /* renamed from: h, reason: collision with root package name */
    public static final vb.c f21959h = vb.c.a(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

    /* renamed from: i, reason: collision with root package name */
    public static final vb.c f21960i = vb.c.a("user");

    /* renamed from: j, reason: collision with root package name */
    public static final vb.c f21961j = vb.c.a("os");

    /* renamed from: k, reason: collision with root package name */
    public static final vb.c f21962k = vb.c.a("device");

    /* renamed from: l, reason: collision with root package name */
    public static final vb.c f21963l = vb.c.a("events");

    /* renamed from: m, reason: collision with root package name */
    public static final vb.c f21964m = vb.c.a("generatorType");

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        vb.e eVar = (vb.e) obj2;
        j0 j0Var = (j0) ((r2) obj);
        eVar.a(f21953b, j0Var.a);
        eVar.a(f21954c, j0Var.f21965b.getBytes(s2.a));
        eVar.a(f21955d, j0Var.f21966c);
        eVar.c(f21956e, j0Var.f21967d);
        eVar.a(f21957f, j0Var.f21968e);
        eVar.e(f21958g, j0Var.f21969f);
        eVar.a(f21959h, j0Var.f21970g);
        eVar.a(f21960i, j0Var.f21971h);
        eVar.a(f21961j, j0Var.f21972i);
        eVar.a(f21962k, j0Var.f21973j);
        eVar.a(f21963l, j0Var.f21974k);
        eVar.b(f21964m, j0Var.f21975l);
    }
}
