package S7;

import Q7.AbstractC0255x;
import Q7.C0238f;
import Q7.r0;
import V7.u;
import V7.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t7.AbstractC2712a;

/* loaded from: classes3.dex */
public final class b implements r0 {
    public Object b = e.f2835p;

    /* renamed from: c, reason: collision with root package name */
    public C0238f f2812c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f2813d;

    public b(c cVar) {
        this.f2813d = cVar;
    }

    @Override // Q7.r0
    public final void a(u uVar, int i9) {
        C0238f c0238f = this.f2812c;
        if (c0238f != null) {
            c0238f.a(uVar, i9);
        }
    }

    public final Object b(T7.d dVar) {
        C0238f c0238f;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f2819j;
        c cVar = this.f2813d;
        k kVar = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.t(c.f2814d.get(cVar), true)) {
                this.b = e.l;
                Throwable o3 = cVar.o();
                if (o3 == null) {
                    return Boolean.FALSE;
                }
                int i9 = v.f3541a;
                throw o3;
            }
            long andIncrement = c.f2815f.getAndIncrement(cVar);
            long j7 = e.b;
            long j9 = andIncrement / j7;
            int i10 = (int) (andIncrement % j7);
            if (kVar.f3540d != j9) {
                k n2 = cVar.n(j9, kVar);
                if (n2 == null) {
                    continue;
                } else {
                    kVar = n2;
                }
            }
            Object D8 = cVar.D(kVar, i10, andIncrement, null);
            H0.a aVar = e.m;
            if (D8 != aVar) {
                H0.a aVar2 = e.f2834o;
                if (D8 == aVar2) {
                    if (andIncrement < cVar.r()) {
                        kVar.a();
                    }
                } else if (D8 == e.f2833n) {
                    c cVar2 = this.f2813d;
                    C0238f h6 = AbstractC0255x.h(F2.h.x(dVar));
                    try {
                        this.f2812c = h6;
                        c0238f = h6;
                        try {
                            Object D9 = cVar2.D(kVar, i10, andIncrement, this);
                            if (D9 == aVar) {
                                a(kVar, i10);
                            } else {
                                V7.p pVar = null;
                                w7.k kVar2 = c0238f.f2566g;
                                F7.l lVar = cVar2.f2821c;
                                if (D9 == aVar2) {
                                    if (andIncrement < cVar2.r()) {
                                        kVar.a();
                                    }
                                    k kVar3 = (k) c.f2819j.get(cVar2);
                                    while (true) {
                                        if (cVar2.t(c.f2814d.get(cVar2), true)) {
                                            C0238f c0238f2 = this.f2812c;
                                            G7.j.b(c0238f2);
                                            this.f2812c = null;
                                            this.b = e.l;
                                            Throwable o9 = cVar.o();
                                            if (o9 == null) {
                                                c0238f2.e(Boolean.FALSE);
                                            } else {
                                                c0238f2.e(AbstractC2712a.b(o9));
                                            }
                                        } else {
                                            long andIncrement2 = c.f2815f.getAndIncrement(cVar2);
                                            long j10 = e.b;
                                            long j11 = andIncrement2 / j10;
                                            int i11 = (int) (andIncrement2 % j10);
                                            if (kVar3.f3540d != j11) {
                                                k n9 = cVar2.n(j11, kVar3);
                                                if (n9 != null) {
                                                    kVar3 = n9;
                                                }
                                            }
                                            F7.l lVar2 = lVar;
                                            Object D10 = cVar2.D(kVar3, i11, andIncrement2, this);
                                            if (D10 == e.m) {
                                                a(kVar3, i11);
                                                break;
                                            }
                                            if (D10 == e.f2834o) {
                                                if (andIncrement2 < cVar2.r()) {
                                                    kVar3.a();
                                                }
                                                lVar = lVar2;
                                            } else if (D10 != e.f2833n) {
                                                kVar3.a();
                                                this.b = D10;
                                                this.f2812c = null;
                                                bool = Boolean.TRUE;
                                                if (lVar2 != null) {
                                                    pVar = new V7.p(lVar2, D10, kVar2);
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                        }
                                    }
                                } else {
                                    kVar.a();
                                    this.b = D9;
                                    this.f2812c = null;
                                    bool = Boolean.TRUE;
                                    if (lVar != null) {
                                        pVar = new V7.p(lVar, D9, kVar2);
                                    }
                                }
                                c0238f.B(bool, pVar);
                            }
                            return c0238f.s();
                        } catch (Throwable th) {
                            th = th;
                            c0238f.A();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c0238f = h6;
                    }
                } else {
                    kVar.a();
                    this.b = D8;
                    return Boolean.TRUE;
                }
            } else {
                throw new IllegalStateException("unreachable".toString());
            }
        }
    }
}
