package b1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes4.dex */
public final class n extends j1 {

    /* renamed from: f, reason: collision with root package name */
    public final l f22347f;

    public n(l lVar) {
        this.f22347f = lVar;
    }

    @Override // q0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y((Throwable) obj);
        return d0.b0.f30125a;
    }

    @Override // b1.l1
    public final void y(Throwable th) {
        r1 x = x();
        l lVar = this.f22347f;
        Throwable n2 = lVar.n(x);
        if (lVar.t()) {
            h0.g gVar = lVar.d;
            p0.a.q(gVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            g1.i iVar = (g1.i) gVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.i.f30615i;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                android.support.v4.media.session.i iVar2 = g1.a.d;
                if (!p0.a.g(obj, iVar2)) {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(iVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, n2)) {
                    if (atomicReferenceFieldUpdater.get(iVar) != iVar2) {
                        break;
                    }
                }
                return;
            }
        }
        lVar.A(n2);
        if (lVar.t()) {
            return;
        }
        lVar.k();
    }
}
