package g1;

import b1.c2;

/* loaded from: classes3.dex */
public final class d0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30600a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f30601b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f30602c;

    public d0(Integer num, ThreadLocal threadLocal) {
        this.f30600a = num;
        this.f30601b = threadLocal;
        this.f30602c = new e0(threadLocal);
    }

    @Override // b1.c2
    public final void D(Object obj) {
        this.f30601b.set(obj);
    }

    @Override // h0.l
    public final Object H(Object obj, q0.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // h0.j
    public final h0.k getKey() {
        return this.f30602c;
    }

    @Override // b1.c2
    public final Object h(h0.l lVar) {
        ThreadLocal threadLocal = this.f30601b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f30600a);
        return obj;
    }

    @Override // h0.l
    public final h0.j i(h0.k kVar) {
        if (p0.a.g(this.f30602c, kVar)) {
            return this;
        }
        return null;
    }

    @Override // h0.l
    public final h0.l s(h0.k kVar) {
        return p0.a.g(this.f30602c, kVar) ? h0.m.f30726a : this;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f30600a + ", threadLocal = " + this.f30601b + ')';
    }

    @Override // h0.l
    public final h0.l u(h0.l lVar) {
        p0.a.s(lVar, "context");
        return b1.f0.y(this, lVar);
    }
}
