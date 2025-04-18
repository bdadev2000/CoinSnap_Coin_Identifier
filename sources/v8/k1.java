package v8;

import s7.x2;

/* loaded from: classes3.dex */
public abstract class k1 extends j {

    /* renamed from: k, reason: collision with root package name */
    public final a f26189k;

    public k1(a aVar) {
        this.f26189k = aVar;
    }

    @Override // v8.a
    public final x2 f() {
        return this.f26189k.f();
    }

    @Override // v8.a
    public final s7.j1 g() {
        return this.f26189k.g();
    }

    @Override // v8.a
    public final boolean h() {
        return this.f26189k.h();
    }

    @Override // v8.a
    public final void k(m9.w0 w0Var) {
        this.f26170j = w0Var;
        this.f26169i = n9.h0.j(null);
        y();
    }

    @Override // v8.j
    public final z r(Object obj, z zVar) {
        return w(zVar);
    }

    @Override // v8.j
    public final long s(Object obj, long j3) {
        return j3;
    }

    @Override // v8.j
    public final int t(Object obj, int i10) {
        return i10;
    }

    @Override // v8.j
    public final void u(Object obj, a aVar, x2 x2Var) {
        x(x2Var);
    }

    public z w(z zVar) {
        return zVar;
    }

    public abstract void x(x2 x2Var);

    public void y() {
        v(null, this.f26189k);
    }
}
