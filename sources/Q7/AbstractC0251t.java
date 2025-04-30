package Q7;

/* renamed from: Q7.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0251t extends w7.a implements w7.h {

    /* renamed from: c, reason: collision with root package name */
    public static final C0250s f2583c = new C0250s(w7.g.b, r.b);

    public AbstractC0251t() {
        super(w7.g.b);
    }

    @Override // w7.a, w7.k
    public final w7.i h(w7.j jVar) {
        G7.j.e(jVar, "key");
        if (jVar instanceof C0250s) {
            C0250s c0250s = (C0250s) jVar;
            w7.j jVar2 = this.b;
            G7.j.e(jVar2, "key");
            if (jVar2 != c0250s && c0250s.f2581c != jVar2) {
                return null;
            }
            w7.i iVar = (w7.i) c0250s.b.invoke(this);
            if (!(iVar instanceof w7.i)) {
                return null;
            }
            return iVar;
        }
        if (w7.g.b != jVar) {
            return null;
        }
        return this;
    }

    @Override // w7.a, w7.k
    public final w7.k i(w7.j jVar) {
        G7.j.e(jVar, "key");
        boolean z8 = jVar instanceof C0250s;
        w7.l lVar = w7.l.b;
        if (z8) {
            C0250s c0250s = (C0250s) jVar;
            w7.j jVar2 = this.b;
            G7.j.e(jVar2, "key");
            if ((jVar2 == c0250s || c0250s.f2581c == jVar2) && ((w7.i) c0250s.b.invoke(this)) != null) {
                return lVar;
            }
        } else if (w7.g.b == jVar) {
            return lVar;
        }
        return this;
    }

    public abstract void j(w7.k kVar, Runnable runnable);

    public boolean k() {
        return !(this instanceof o0);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0255x.g(this);
    }
}
