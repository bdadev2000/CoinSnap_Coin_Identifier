package i7;

import androidx.recyclerview.widget.s0;

/* loaded from: classes3.dex */
public final class g implements vb.d {
    public static final g a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f19167b;

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f19168c;

    static {
        l9.n nVar = new l9.n("startMs");
        s0 g10 = s0.g();
        g10.f2031b = 1;
        f19167b = eb.j.t(g10, nVar);
        l9.n nVar2 = new l9.n("endMs");
        s0 g11 = s0.g();
        g11.f2031b = 2;
        f19168c = eb.j.t(g11, nVar2);
    }

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        l7.h hVar = (l7.h) obj;
        vb.e eVar = (vb.e) obj2;
        eVar.c(f19167b, hVar.a);
        eVar.c(f19168c, hVar.f21158b);
    }
}
