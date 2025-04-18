package b1;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* loaded from: classes4.dex */
public abstract class z extends h0.a implements h0.i {

    /* renamed from: b, reason: collision with root package name */
    public static final y f22399b = new y(0);

    public z() {
        super(h0.h.f30725a);
    }

    public abstract void h0(h0.l lVar, Runnable runnable);

    @Override // h0.a, h0.l
    public final h0.j i(h0.k kVar) {
        p0.a.s(kVar, SDKConstants.PARAM_KEY);
        if (!(kVar instanceof h0.b)) {
            if (h0.h.f30725a == kVar) {
                return this;
            }
            return null;
        }
        h0.b bVar = (h0.b) kVar;
        h0.k kVar2 = this.f30714a;
        p0.a.s(kVar2, SDKConstants.PARAM_KEY);
        if (kVar2 != bVar && bVar.f30716b != kVar2) {
            return null;
        }
        h0.j jVar = (h0.j) bVar.f30715a.invoke(this);
        if (jVar instanceof h0.j) {
            return jVar;
        }
        return null;
    }

    public void i0(h0.l lVar, Runnable runnable) {
        h0(lVar, runnable);
    }

    public boolean j0(h0.l lVar) {
        return !(this instanceof j2);
    }

    public z k0(int i2) {
        e1.t0.j(i2);
        return new g1.n(this, i2);
    }

    @Override // h0.a, h0.l
    public final h0.l s(h0.k kVar) {
        p0.a.s(kVar, SDKConstants.PARAM_KEY);
        boolean z2 = kVar instanceof h0.b;
        h0.m mVar = h0.m.f30726a;
        if (z2) {
            h0.b bVar = (h0.b) kVar;
            h0.k kVar2 = this.f30714a;
            p0.a.s(kVar2, SDKConstants.PARAM_KEY);
            if ((kVar2 == bVar || bVar.f30716b == kVar2) && ((h0.j) bVar.f30715a.invoke(this)) != null) {
                return mVar;
            }
        } else if (h0.h.f30725a == kVar) {
            return mVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f0.o(this);
    }
}
