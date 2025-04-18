package qc;

/* loaded from: classes3.dex */
public final class d implements vb.d {
    public static final d a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f23778b = vb.c.a("appId");

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f23779c = vb.c.a("deviceModel");

    /* renamed from: d, reason: collision with root package name */
    public static final vb.c f23780d = vb.c.a("sessionSdkVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final vb.c f23781e = vb.c.a("osVersion");

    /* renamed from: f, reason: collision with root package name */
    public static final vb.c f23782f = vb.c.a("logEnvironment");

    /* renamed from: g, reason: collision with root package name */
    public static final vb.c f23783g = vb.c.a("androidAppInfo");

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        vb.e eVar = (vb.e) obj2;
        eVar.a(f23778b, bVar.a);
        eVar.a(f23779c, bVar.f23761b);
        eVar.a(f23780d, bVar.f23762c);
        eVar.a(f23781e, bVar.f23763d);
        eVar.a(f23782f, bVar.f23764e);
        eVar.a(f23783g, bVar.f23765f);
    }
}
