package b1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public abstract class l1 extends g1.p implements q0, d1, q0.l {
    public r1 d;

    @Override // b1.d1
    public final v1 c() {
        return null;
    }

    @Override // b1.q0
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        r1 x = x();
        while (true) {
            Object T = x.T();
            if (!(T instanceof l1)) {
                if (!(T instanceof d1) || ((d1) T).c() == null) {
                    return;
                }
                while (true) {
                    Object q2 = q();
                    if (q2 instanceof g1.w) {
                        g1.p pVar = ((g1.w) q2).f30640a;
                        return;
                    }
                    if (q2 == this) {
                        return;
                    }
                    p0.a.q(q2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    g1.p pVar2 = (g1.p) q2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = g1.p.f30631c;
                    g1.w wVar = (g1.w) atomicReferenceFieldUpdater3.get(pVar2);
                    if (wVar == null) {
                        wVar = new g1.w(pVar2);
                        atomicReferenceFieldUpdater3.lazySet(pVar2, wVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = g1.p.f30629a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, q2, wVar)) {
                            pVar2.m();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == q2);
                }
            } else {
                if (T != this) {
                    return;
                }
                s0 s0Var = f0.f22313j;
                do {
                    atomicReferenceFieldUpdater2 = r1.f22370a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(x, T, s0Var)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(x) == T);
            }
        }
    }

    public h1 getParent() {
        return x();
    }

    @Override // b1.d1
    public final boolean isActive() {
        return true;
    }

    @Override // g1.p
    public final String toString() {
        return getClass().getSimpleName() + '@' + f0.o(this) + "[job@" + f0.o(x()) + ']';
    }

    public final r1 x() {
        r1 r1Var = this.d;
        if (r1Var != null) {
            return r1Var;
        }
        p0.a.B0("job");
        throw null;
    }

    public abstract void y(Throwable th);
}
