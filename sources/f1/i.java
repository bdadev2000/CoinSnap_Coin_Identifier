package f1;

import e1.t0;

/* loaded from: classes2.dex */
public abstract class i extends g {
    public final e1.h d;

    public i(int i2, h0.l lVar, int i3, e1.h hVar) {
        super(lVar, i2, i3);
        this.d = hVar;
    }

    @Override // f1.g
    public final Object c(d1.q qVar, h0.g gVar) {
        Object g2 = g(new a0(qVar), gVar);
        return g2 == i0.a.f30806a ? g2 : d0.b0.f30125a;
    }

    @Override // f1.g, e1.h
    public final Object collect(e1.i iVar, h0.g gVar) {
        Object collect;
        d0.b0 b0Var = d0.b0.f30125a;
        if (this.f30469b == -3) {
            h0.l context = gVar.getContext();
            Boolean bool = Boolean.FALSE;
            b1.w wVar = b1.w.f22385c;
            h0.l lVar = this.f30468a;
            h0.l u2 = !((Boolean) lVar.H(bool, wVar)).booleanValue() ? context.u(lVar) : p0.a.g0(context, lVar, false);
            if (p0.a.g(u2, context)) {
                collect = g(iVar, gVar);
                if (collect != i0.a.f30806a) {
                    return b0Var;
                }
            } else {
                h0.h hVar = h0.h.f30725a;
                if (p0.a.g(u2.i(hVar), context.i(hVar))) {
                    h0.l context2 = gVar.getContext();
                    if (!(iVar instanceof a0) && !(iVar instanceof u)) {
                        iVar = new e1.f(iVar, context2);
                    }
                    collect = t0.E(u2, iVar, g1.a.d(u2), new h(this, null), gVar);
                    i0.a aVar = i0.a.f30806a;
                    if (collect != aVar) {
                        collect = b0Var;
                    }
                    if (collect != aVar) {
                        return b0Var;
                    }
                }
            }
            return collect;
        }
        collect = super.collect(iVar, gVar);
        if (collect != i0.a.f30806a) {
            return b0Var;
        }
        return collect;
    }

    public abstract Object g(e1.i iVar, h0.g gVar);

    @Override // f1.g
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
