package d1;

import b1.m2;
import d0.b0;
import e1.t0;
import kotlin.jvm.internal.g0;

/* loaded from: classes.dex */
public final class n extends b {

    /* renamed from: m, reason: collision with root package name */
    public final int f30186m;

    public n(int i2, int i3, q0.l lVar) {
        super(i2, lVar);
        this.f30186m = i3;
        if (i3 != 1) {
            if (i2 < 1) {
                throw new IllegalArgumentException(android.support.v4.media.d.j("Buffered channel capacity must be at least 1, but ", i2, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + g0.a(b.class).c() + " instead").toString());
        }
    }

    public final Object H(Object obj, boolean z2) {
        j jVar;
        q0.l lVar;
        d0.e i2;
        b0 b0Var = b0.f30125a;
        if (this.f30186m == 3) {
            Object b2 = super.b(obj);
            if ((!(b2 instanceof h)) || (b2 instanceof g)) {
                return b2;
            }
            if (!z2 || (lVar = this.f30157b) == null || (i2 = t0.i(lVar, obj, null)) == null) {
                return b0Var;
            }
            throw i2;
        }
        Object obj2 = d.d;
        j jVar2 = (j) b.f30151h.get(this);
        while (true) {
            long andIncrement = b.f30148c.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean w = w(andIncrement, false);
            int i3 = d.f30160b;
            long j3 = i3;
            long j4 = j2 / j3;
            int i4 = (int) (j2 % j3);
            if (jVar2.f30641c != j4) {
                j e = b.e(this, j4, jVar2);
                if (e != null) {
                    jVar = e;
                } else if (w) {
                    return new g(t());
                }
            } else {
                jVar = jVar2;
            }
            int i5 = b.i(this, jVar, i4, obj, j2, obj2, w);
            if (i5 == 0) {
                jVar.a();
                return b0Var;
            }
            if (i5 == 1) {
                return b0Var;
            }
            if (i5 == 2) {
                if (w) {
                    jVar.h();
                    return new g(t());
                }
                m2 m2Var = obj2 instanceof m2 ? (m2) obj2 : null;
                if (m2Var != null) {
                    m2Var.a(jVar, i4 + i3);
                }
                o((jVar.f30641c * j3) + i4);
                return b0Var;
            }
            if (i5 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (i5 == 4) {
                if (j2 < b.d.get(this)) {
                    jVar.a();
                }
                return new g(t());
            }
            if (i5 == 5) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }

    @Override // d1.b, d1.s
    public final Object b(Object obj) {
        return H(obj, false);
    }

    @Override // d1.b, d1.s
    public final Object j(Object obj, h0.g gVar) {
        d0.e i2;
        Object H = H(obj, true);
        boolean z2 = H instanceof g;
        if (!z2) {
            return b0.f30125a;
        }
        if (z2) {
        }
        q0.l lVar = this.f30157b;
        if (lVar == null || (i2 = t0.i(lVar, obj, null)) == null) {
            throw t();
        }
        kotlin.jvm.internal.q.a(i2, t());
        throw i2;
    }

    @Override // d1.b
    public final boolean x() {
        return this.f30186m == 2;
    }
}
