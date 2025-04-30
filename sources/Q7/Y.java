package Q7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public abstract class Y extends V7.k implements G, P, F7.l {

    /* renamed from: f, reason: collision with root package name */
    public d0 f2545f;

    @Override // Q7.P
    public final f0 c() {
        return null;
    }

    @Override // Q7.G
    public final void d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        d0 k6 = k();
        while (true) {
            Object F4 = k6.F();
            if (F4 instanceof Y) {
                if (F4 == this) {
                    I i9 = AbstractC0255x.f2596i;
                    do {
                        atomicReferenceFieldUpdater2 = d0.b;
                        if (atomicReferenceFieldUpdater2.compareAndSet(k6, F4, i9)) {
                            return;
                        }
                    } while (atomicReferenceFieldUpdater2.get(k6) == F4);
                } else {
                    return;
                }
            } else {
                if (!(F4 instanceof P) || ((P) F4).c() == null) {
                    return;
                }
                while (true) {
                    Object h6 = h();
                    if (h6 instanceof V7.r) {
                        V7.k kVar = ((V7.r) h6).f3537a;
                        return;
                    }
                    if (h6 == this) {
                        return;
                    }
                    G7.j.c(h6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    V7.k kVar2 = (V7.k) h6;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = V7.k.f3524d;
                    V7.r rVar = (V7.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new V7.r(kVar2);
                        atomicReferenceFieldUpdater3.set(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = V7.k.b;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, h6, rVar)) {
                            kVar2.e();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == h6);
                }
            }
        }
    }

    public U getParent() {
        return k();
    }

    @Override // Q7.P
    public final boolean isActive() {
        return true;
    }

    public final d0 k() {
        d0 d0Var = this.f2545f;
        if (d0Var != null) {
            return d0Var;
        }
        G7.j.k("job");
        throw null;
    }

    public abstract void l(Throwable th);

    @Override // V7.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0255x.g(this) + "[job@" + AbstractC0255x.g(k()) + ']';
    }
}
