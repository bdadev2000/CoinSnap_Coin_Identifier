package mb;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public final class b implements vb.d {
    public static final b a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f21833b = vb.c.a("pid");

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f21834c = vb.c.a("processName");

    /* renamed from: d, reason: collision with root package name */
    public static final vb.c f21835d = vb.c.a("reasonCode");

    /* renamed from: e, reason: collision with root package name */
    public static final vb.c f21836e = vb.c.a("importance");

    /* renamed from: f, reason: collision with root package name */
    public static final vb.c f21837f = vb.c.a("pss");

    /* renamed from: g, reason: collision with root package name */
    public static final vb.c f21838g = vb.c.a("rss");

    /* renamed from: h, reason: collision with root package name */
    public static final vb.c f21839h = vb.c.a(CampaignEx.JSON_KEY_TIMESTAMP);

    /* renamed from: i, reason: collision with root package name */
    public static final vb.c f21840i = vb.c.a("traceFile");

    /* renamed from: j, reason: collision with root package name */
    public static final vb.c f21841j = vb.c.a("buildIdMappingForArch");

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        vb.e eVar = (vb.e) obj2;
        d0 d0Var = (d0) ((u1) obj);
        eVar.b(f21833b, d0Var.a);
        eVar.a(f21834c, d0Var.f21886b);
        eVar.b(f21835d, d0Var.f21887c);
        eVar.b(f21836e, d0Var.f21888d);
        eVar.c(f21837f, d0Var.f21889e);
        eVar.c(f21838g, d0Var.f21890f);
        eVar.c(f21839h, d0Var.f21891g);
        eVar.a(f21840i, d0Var.f21892h);
        eVar.a(f21841j, d0Var.f21893i);
    }
}
