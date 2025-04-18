package i7;

import androidx.recyclerview.widget.s0;

/* loaded from: classes3.dex */
public final class f implements vb.d {
    public static final f a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f19165b;

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f19166c;

    static {
        l9.n nVar = new l9.n("currentCacheSizeBytes");
        s0 g10 = s0.g();
        g10.f2031b = 1;
        f19165b = eb.j.t(g10, nVar);
        l9.n nVar2 = new l9.n("maxCacheSizeBytes");
        s0 g11 = s0.g();
        g11.f2031b = 2;
        f19166c = eb.j.t(g11, nVar2);
    }

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        l7.g gVar = (l7.g) obj;
        vb.e eVar = (vb.e) obj2;
        eVar.c(f19165b, gVar.a);
        eVar.c(f19166c, gVar.f21157b);
    }
}
