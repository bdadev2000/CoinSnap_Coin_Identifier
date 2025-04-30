package Q7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class c0 extends V7.b {
    public final V7.k b;

    /* renamed from: c, reason: collision with root package name */
    public V7.k f2557c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f2558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2559e;

    public c0(V7.k kVar, d0 d0Var, P p2) {
        this.f2558d = d0Var;
        this.f2559e = p2;
        this.b = kVar;
    }

    @Override // V7.b
    public final void b(Object obj, Object obj2) {
        boolean z8;
        V7.k kVar;
        V7.k kVar2 = (V7.k) obj;
        if (obj2 == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        V7.k kVar3 = this.b;
        if (z8) {
            kVar = kVar3;
        } else {
            kVar = this.f2557c;
        }
        if (kVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V7.k.b;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar2, this, kVar)) {
                if (atomicReferenceFieldUpdater.get(kVar2) != this) {
                    return;
                }
            }
            if (z8) {
                V7.k kVar4 = this.f2557c;
                G7.j.b(kVar4);
                kVar3.f(kVar4);
            }
        }
    }

    @Override // V7.b
    public final H0.a c(Object obj) {
        if (this.f2558d.F() == this.f2559e) {
            return null;
        }
        return V7.a.f3507e;
    }
}
