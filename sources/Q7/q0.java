package Q7;

import g4.AbstractC2292b;

/* loaded from: classes3.dex */
public final class q0 implements w7.i, w7.j {
    public static final q0 b = new Object();

    @Override // w7.k
    public final Object b(Object obj, F7.p pVar) {
        return pVar.g(obj, this);
    }

    @Override // w7.k
    public final w7.i h(w7.j jVar) {
        return AbstractC2292b.d(this, jVar);
    }

    @Override // w7.k
    public final w7.k i(w7.j jVar) {
        return AbstractC2292b.g(this, jVar);
    }

    @Override // w7.k
    public final w7.k n(w7.k kVar) {
        G7.j.e(kVar, "context");
        if (kVar == w7.l.b) {
            return this;
        }
        return (w7.k) kVar.b(this, w7.c.f23996d);
    }

    @Override // w7.i
    public final w7.j getKey() {
        return this;
    }
}
