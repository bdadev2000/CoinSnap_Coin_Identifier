package i7;

import androidx.recyclerview.widget.s0;

/* loaded from: classes3.dex */
public final class a implements vb.d {
    public static final a a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f19156b;

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f19157c;

    /* renamed from: d, reason: collision with root package name */
    public static final vb.c f19158d;

    /* renamed from: e, reason: collision with root package name */
    public static final vb.c f19159e;

    static {
        l9.n nVar = new l9.n("window");
        s0 g10 = s0.g();
        g10.f2031b = 1;
        f19156b = eb.j.t(g10, nVar);
        l9.n nVar2 = new l9.n("logSourceMetrics");
        s0 g11 = s0.g();
        g11.f2031b = 2;
        f19157c = eb.j.t(g11, nVar2);
        l9.n nVar3 = new l9.n("globalMetrics");
        s0 g12 = s0.g();
        g12.f2031b = 3;
        f19158d = eb.j.t(g12, nVar3);
        l9.n nVar4 = new l9.n("appNamespace");
        s0 g13 = s0.g();
        g13.f2031b = 4;
        f19159e = eb.j.t(g13, nVar4);
    }

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        l7.a aVar = (l7.a) obj;
        vb.e eVar = (vb.e) obj2;
        eVar.a(f19156b, aVar.a);
        eVar.a(f19157c, aVar.f21141b);
        eVar.a(f19158d, aVar.f21142c);
        eVar.a(f19159e, aVar.f21143d);
    }
}
