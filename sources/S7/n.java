package S7;

import Q7.n0;
import Q7.r0;
import t7.AbstractC2712a;
import t7.y;

/* loaded from: classes3.dex */
public final class n extends c {

    /* renamed from: n, reason: collision with root package name */
    public final a f2845n;

    public n(int i9, a aVar, F7.l lVar) {
        super(i9, lVar);
        this.f2845n = aVar;
        if (aVar != a.b) {
            if (i9 >= 1) {
            } else {
                throw new IllegalArgumentException(n0.f(i9, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + G7.s.a(c.class).b() + " instead").toString());
        }
    }

    public final Object G(Object obj, boolean z8) {
        k kVar;
        r0 r0Var;
        F7.l lVar;
        G1.a a6;
        a aVar = a.f2810d;
        y yVar = y.f23029a;
        if (this.f2845n == aVar) {
            Object m = super.m(obj);
            if (!(!(m instanceof i)) && !(m instanceof h)) {
                if (z8 && (lVar = this.f2821c) != null && (a6 = V7.a.a(lVar, obj, null)) != null) {
                    throw a6;
                }
                return yVar;
            }
            return m;
        }
        Object obj2 = e.f2825d;
        k kVar2 = (k) c.f2818i.get(this);
        while (true) {
            long andIncrement = c.f2814d.getAndIncrement(this);
            long j7 = andIncrement & 1152921504606846975L;
            boolean t9 = t(andIncrement, false);
            int i9 = e.b;
            long j9 = i9;
            long j10 = j7 / j9;
            int i10 = (int) (j7 % j9);
            if (kVar2.f3540d != j10) {
                k b = c.b(this, j10, kVar2);
                if (b == null) {
                    if (t9) {
                        return new h(q());
                    }
                } else {
                    kVar = b;
                }
            } else {
                kVar = kVar2;
            }
            int d2 = c.d(this, kVar, i10, obj, j7, obj2, t9);
            if (d2 != 0) {
                if (d2 != 1) {
                    if (d2 != 2) {
                        if (d2 != 3) {
                            if (d2 != 4) {
                                if (d2 == 5) {
                                    kVar.a();
                                }
                                kVar2 = kVar;
                            } else {
                                if (j7 < c.f2815f.get(this)) {
                                    kVar.a();
                                }
                                return new h(q());
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else {
                        if (t9) {
                            kVar.h();
                            return new h(q());
                        }
                        if (obj2 instanceof r0) {
                            r0Var = (r0) obj2;
                        } else {
                            r0Var = null;
                        }
                        if (r0Var != null) {
                            r0Var.a(kVar, i10 + i9);
                        }
                        k((kVar.f3540d * j9) + i10);
                        return yVar;
                    }
                } else {
                    return yVar;
                }
            } else {
                kVar.a();
                return yVar;
            }
        }
    }

    @Override // S7.c, S7.r
    public final Object g(Object obj, w7.f fVar) {
        G1.a a6;
        if (G(obj, true) instanceof h) {
            F7.l lVar = this.f2821c;
            if (lVar != null && (a6 = V7.a.a(lVar, obj, null)) != null) {
                AbstractC2712a.a(a6, q());
                throw a6;
            }
            throw q();
        }
        return y.f23029a;
    }

    @Override // S7.c, S7.r
    public final Object m(Object obj) {
        return G(obj, false);
    }

    @Override // S7.c
    public final boolean u() {
        if (this.f2845n == a.f2809c) {
            return true;
        }
        return false;
    }
}
