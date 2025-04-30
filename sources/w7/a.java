package w7;

import F7.p;
import g4.AbstractC2292b;

/* loaded from: classes3.dex */
public abstract class a implements i {
    public final j b;

    public a(j jVar) {
        this.b = jVar;
    }

    @Override // w7.k
    public final Object b(Object obj, p pVar) {
        return pVar.g(obj, this);
    }

    @Override // w7.i
    public final j getKey() {
        return this.b;
    }

    @Override // w7.k
    public i h(j jVar) {
        return AbstractC2292b.d(this, jVar);
    }

    @Override // w7.k
    public k i(j jVar) {
        return AbstractC2292b.g(this, jVar);
    }

    @Override // w7.k
    public final k n(k kVar) {
        G7.j.e(kVar, "context");
        if (kVar == l.b) {
            return this;
        }
        return (k) kVar.b(this, c.f23996d);
    }
}
