package b1;

/* loaded from: classes4.dex */
public abstract class a extends r1 implements h0.g, d0 {

    /* renamed from: c, reason: collision with root package name */
    public final h0.l f22283c;

    public a(h0.l lVar, boolean z2) {
        super(z2);
        W((h1) lVar.i(a0.f22285b));
        this.f22283c = lVar.u(this);
    }

    @Override // b1.r1
    public final String I() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // b1.r1
    public final void V(d0.e eVar) {
        kotlin.jvm.internal.e.o(this.f22283c, eVar);
    }

    @Override // b1.r1
    public String c0() {
        return super.c0();
    }

    @Override // b1.r1
    public final void f0(Object obj) {
        if (!(obj instanceof u)) {
            n0(obj);
            return;
        }
        u uVar = (u) obj;
        Throwable th = uVar.f22378a;
        uVar.getClass();
        m0(u.f22377b.get(uVar) != 0, th);
    }

    @Override // h0.g
    public final h0.l getContext() {
        return this.f22283c;
    }

    @Override // b1.d0
    public final h0.l getCoroutineContext() {
        return this.f22283c;
    }

    @Override // b1.r1, b1.h1
    public boolean isActive() {
        return super.isActive();
    }

    public void m0(boolean z2, Throwable th) {
    }

    public void n0(Object obj) {
    }

    public final void o0(int i2, a aVar, q0.p pVar) {
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            e1.t0.z(pVar, aVar, this);
            return;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                p0.a.s(pVar, "<this>");
                f0.r(f0.j(aVar, this, pVar)).resumeWith(d0.b0.f30125a);
                return;
            }
            if (i3 != 3) {
                throw new RuntimeException();
            }
            try {
                h0.l lVar = this.f22283c;
                Object e = g1.a.e(lVar, null);
                try {
                    kotlin.jvm.internal.e.g(2, pVar);
                    Object invoke = pVar.invoke(aVar, this);
                    if (invoke != i0.a.f30806a) {
                        resumeWith(invoke);
                    }
                } finally {
                    g1.a.b(lVar, e);
                }
            } catch (Throwable th) {
                resumeWith(kotlin.jvm.internal.q.d(th));
            }
        }
    }

    @Override // h0.g
    public final void resumeWith(Object obj) {
        Throwable a2 = d0.n.a(obj);
        if (a2 != null) {
            obj = new u(false, a2);
        }
        Object a02 = a0(obj);
        if (a02 == f0.e) {
            return;
        }
        r(a02);
    }
}
