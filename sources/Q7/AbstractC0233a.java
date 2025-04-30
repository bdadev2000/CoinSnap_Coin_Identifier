package Q7;

import t7.AbstractC2712a;
import t7.C2722k;
import x7.EnumC2928a;
import y7.AbstractC2952a;

/* renamed from: Q7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0233a extends d0 implements w7.f, InterfaceC0253v {

    /* renamed from: d, reason: collision with root package name */
    public final w7.k f2547d;

    public AbstractC0233a(w7.k kVar, boolean z8) {
        super(z8);
        I((U) kVar.h(C0252u.f2584c));
        this.f2547d = kVar.n(this);
    }

    @Override // Q7.d0
    public final void H(G1.a aVar) {
        AbstractC0255x.i(aVar, this.f2547d);
    }

    @Override // Q7.d0
    public final void P(Object obj) {
        boolean z8;
        if (obj instanceof C0247o) {
            C0247o c0247o = (C0247o) obj;
            Throwable th = c0247o.f2575a;
            c0247o.getClass();
            if (C0247o.b.get(c0247o) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            V(z8, th);
            return;
        }
        W(obj);
    }

    public final void X(EnumC0254w enumC0254w, AbstractC0233a abstractC0233a, F7.p pVar) {
        Object g9;
        int ordinal = enumC0254w.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            w7.k kVar = this.f2547d;
                            Object l = V7.a.l(kVar, null);
                            try {
                                if (!(pVar instanceof AbstractC2952a)) {
                                    g9 = F2.h.a0(pVar, abstractC0233a, this);
                                } else {
                                    G7.v.b(2, pVar);
                                    g9 = pVar.g(abstractC0233a, this);
                                }
                                V7.a.g(kVar, l);
                                if (g9 != EnumC2928a.b) {
                                    e(g9);
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                V7.a.g(kVar, l);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            e(AbstractC2712a.b(th2));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                G7.j.e(pVar, "<this>");
                F2.h.x(F2.h.i(pVar, abstractC0233a, this)).e(t7.y.f23029a);
                return;
            }
            return;
        }
        com.bumptech.glide.d.Z(pVar, abstractC0233a, this);
    }

    @Override // w7.f
    public final void e(Object obj) {
        Throwable a6 = C2722k.a(obj);
        if (a6 != null) {
            obj = new C0247o(false, a6);
        }
        Object L8 = L(obj);
        if (L8 == AbstractC0255x.f2591d) {
            return;
        }
        r(L8);
    }

    @Override // w7.f
    public final w7.k getContext() {
        return this.f2547d;
    }

    @Override // Q7.InterfaceC0253v
    public final w7.k k() {
        return this.f2547d;
    }

    @Override // Q7.d0
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void W(Object obj) {
    }

    public void V(boolean z8, Throwable th) {
    }
}
