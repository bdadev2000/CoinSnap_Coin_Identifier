package i7;

import androidx.recyclerview.widget.s0;

/* loaded from: classes3.dex */
public final class c implements vb.d {
    public static final c a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f19161b;

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f19162c;

    static {
        l9.n nVar = new l9.n("eventsDroppedCount");
        s0 g10 = s0.g();
        g10.f2031b = 1;
        f19161b = eb.j.t(g10, nVar);
        l9.n nVar2 = new l9.n("reason");
        s0 g11 = s0.g();
        g11.f2031b = 3;
        f19162c = eb.j.t(g11, nVar2);
    }

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        l7.d dVar = (l7.d) obj;
        vb.e eVar = (vb.e) obj2;
        eVar.c(f19161b, dVar.a);
        eVar.a(f19162c, dVar.f21153b);
    }
}
