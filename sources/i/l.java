package i;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final d f30802a;

    public l(d dVar) {
        this.f30802a = dVar;
    }

    public final m a() {
        f h2;
        d dVar = this.f30802a;
        j jVar = dVar.d;
        synchronized (jVar) {
            dVar.a(true);
            h2 = jVar.h(dVar.f30768a.f30771a);
        }
        if (h2 != null) {
            return new m(h2);
        }
        return null;
    }
}
