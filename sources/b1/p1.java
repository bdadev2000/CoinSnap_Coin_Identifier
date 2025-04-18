package b1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class p1 extends g1.b {

    /* renamed from: b, reason: collision with root package name */
    public final g1.p f22362b;

    /* renamed from: c, reason: collision with root package name */
    public g1.p f22363c;
    public final /* synthetic */ r1 d;
    public final /* synthetic */ Object e;

    public p1(g1.p pVar, r1 r1Var, Object obj) {
        this.d = r1Var;
        this.e = obj;
        this.f22362b = pVar;
    }

    @Override // g1.b
    public final void b(Object obj, Object obj2) {
        g1.p pVar = (g1.p) obj;
        boolean z2 = obj2 == null;
        g1.p pVar2 = this.f22362b;
        g1.p pVar3 = z2 ? pVar2 : this.f22363c;
        if (pVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.p.f30629a;
            while (!atomicReferenceFieldUpdater.compareAndSet(pVar, this, pVar3)) {
                if (atomicReferenceFieldUpdater.get(pVar) != this) {
                    return;
                }
            }
            if (z2) {
                g1.p pVar4 = this.f22363c;
                p0.a.p(pVar4);
                pVar2.n(pVar4);
            }
        }
    }

    @Override // g1.b
    public final android.support.v4.media.session.i c(Object obj) {
        if (this.d.T() == this.e) {
            return null;
        }
        return g1.a.e;
    }
}
