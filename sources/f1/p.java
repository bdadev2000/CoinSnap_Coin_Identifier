package f1;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class p extends g {
    public final Iterable d;

    public p(Iterable iterable, h0.l lVar, int i2, int i3) {
        super(lVar, i2, i3);
        this.d = iterable;
    }

    @Override // f1.g
    public final Object c(d1.q qVar, h0.g gVar) {
        a0 a0Var = new a0(qVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            kotlin.jvm.internal.e.v(qVar, null, 0, new o((e1.h) it.next(), a0Var, null), 3);
        }
        return d0.b0.f30125a;
    }

    @Override // f1.g
    public final g d(h0.l lVar, int i2, int i3) {
        return new p(this.d, lVar, i2, i3);
    }

    @Override // f1.g
    public final d1.r f(b1.d0 d0Var) {
        q0.p fVar = new f(this, null);
        d1.p pVar = new d1.p(p0.a.q0(d0Var, this.f30468a), p0.a.a(this.f30469b, 1, 4));
        pVar.o0(1, pVar, fVar);
        return pVar;
    }
}
