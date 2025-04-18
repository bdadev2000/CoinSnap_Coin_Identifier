package d1;

import b1.f0;
import b1.m2;
import e1.t0;
import g.i0;
import g1.a0;
import g1.z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f30145a = d.f30172p;

    /* renamed from: b, reason: collision with root package name */
    public b1.l f30146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f30147c;

    public a(b bVar) {
        this.f30147c = bVar;
    }

    @Override // b1.m2
    public final void a(z zVar, int i2) {
        b1.l lVar = this.f30146b;
        if (lVar != null) {
            lVar.a(zVar, i2);
        }
    }

    public final Object b(j0.c cVar) {
        j jVar;
        b1.l lVar;
        Boolean bool;
        j jVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f30152i;
        b bVar = this.f30147c;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.w(b.f30148c.get(bVar), true)) {
                this.f30145a = d.f30168l;
                Throwable r2 = bVar.r();
                if (r2 == null) {
                    return Boolean.FALSE;
                }
                int i2 = a0.f30592a;
                throw r2;
            }
            long andIncrement = b.d.getAndIncrement(bVar);
            long j2 = d.f30160b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (jVar3.f30641c != j3) {
                j q2 = bVar.q(j3, jVar3);
                if (q2 == null) {
                    continue;
                } else {
                    jVar = q2;
                }
            } else {
                jVar = jVar3;
            }
            Object E = bVar.E(jVar, i3, andIncrement, null);
            android.support.v4.media.session.i iVar = d.f30169m;
            if (E == iVar) {
                throw new IllegalStateException("unreachable".toString());
            }
            android.support.v4.media.session.i iVar2 = d.f30171o;
            if (E == iVar2) {
                if (andIncrement < bVar.u()) {
                    jVar.a();
                }
                jVar3 = jVar;
            } else {
                if (E != d.f30170n) {
                    jVar.a();
                    this.f30145a = E;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f30147c;
                b1.l n2 = kotlin.jvm.internal.e.n(f0.r(cVar));
                try {
                    this.f30146b = n2;
                    lVar = n2;
                    try {
                        Object E2 = bVar2.E(jVar, i3, andIncrement, this);
                        if (E2 == iVar) {
                            a(jVar, i3);
                        } else {
                            i0 i0Var = null;
                            h0.l lVar2 = lVar.f22340f;
                            q0.l lVar3 = bVar2.f30157b;
                            if (E2 == iVar2) {
                                if (andIncrement < bVar2.u()) {
                                    jVar.a();
                                }
                                j jVar4 = (j) b.f30152i.get(bVar2);
                                while (true) {
                                    if (bVar2.w(b.f30148c.get(bVar2), true)) {
                                        b1.l lVar4 = this.f30146b;
                                        p0.a.p(lVar4);
                                        this.f30146b = null;
                                        this.f30145a = d.f30168l;
                                        Throwable r3 = bVar.r();
                                        if (r3 == null) {
                                            lVar4.resumeWith(Boolean.FALSE);
                                        } else {
                                            lVar4.resumeWith(kotlin.jvm.internal.q.d(r3));
                                        }
                                    } else {
                                        long andIncrement2 = b.d.getAndIncrement(bVar2);
                                        long j4 = d.f30160b;
                                        long j5 = andIncrement2 / j4;
                                        int i4 = (int) (andIncrement2 % j4);
                                        if (jVar4.f30641c != j5) {
                                            j q3 = bVar2.q(j5, jVar4);
                                            if (q3 != null) {
                                                jVar2 = q3;
                                            }
                                        } else {
                                            jVar2 = jVar4;
                                        }
                                        q0.l lVar5 = lVar3;
                                        Object E3 = bVar2.E(jVar2, i4, andIncrement2, this);
                                        if (E3 == d.f30169m) {
                                            a(jVar2, i4);
                                            break;
                                        }
                                        if (E3 == d.f30171o) {
                                            if (andIncrement2 < bVar2.u()) {
                                                jVar2.a();
                                            }
                                            lVar3 = lVar5;
                                            jVar4 = jVar2;
                                        } else {
                                            if (E3 == d.f30170n) {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                            jVar2.a();
                                            this.f30145a = E3;
                                            this.f30146b = null;
                                            bool = Boolean.TRUE;
                                            if (lVar5 != null) {
                                                i0Var = t0.f(lVar5, E3, lVar2);
                                            }
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f30145a = E2;
                                this.f30146b = null;
                                bool = Boolean.TRUE;
                                if (lVar3 != null) {
                                    i0Var = t0.f(lVar3, E2, lVar2);
                                }
                            }
                            lVar.m(bool, i0Var);
                        }
                        Object o2 = lVar.o();
                        i0.a aVar = i0.a.f30806a;
                        return o2;
                    } catch (Throwable th) {
                        th = th;
                        lVar.w();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    lVar = n2;
                }
            }
        }
    }

    public final Object c() {
        Object obj = this.f30145a;
        android.support.v4.media.session.i iVar = d.f30172p;
        if (obj == iVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
        this.f30145a = iVar;
        if (obj != d.f30168l) {
            return obj;
        }
        Throwable s2 = this.f30147c.s();
        int i2 = a0.f30592a;
        throw s2;
    }
}
