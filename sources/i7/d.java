package i7;

import androidx.recyclerview.widget.s0;

/* loaded from: classes3.dex */
public final class d implements vb.d {
    public static final d a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f19163b;

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f19164c;

    static {
        l9.n nVar = new l9.n("logSource");
        s0 g10 = s0.g();
        g10.f2031b = 1;
        f19163b = eb.j.t(g10, nVar);
        l9.n nVar2 = new l9.n("logEventDropped");
        s0 g11 = s0.g();
        g11.f2031b = 2;
        f19164c = eb.j.t(g11, nVar2);
    }

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        l7.f fVar = (l7.f) obj;
        vb.e eVar = (vb.e) obj2;
        eVar.a(f19163b, fVar.a);
        eVar.a(f19164c, fVar.f21156b);
    }
}
