package w2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends va.b {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26675i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26676j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26677k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26678l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26679m;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f26675i = atomicReferenceFieldUpdater;
        this.f26676j = atomicReferenceFieldUpdater2;
        this.f26677k = atomicReferenceFieldUpdater3;
        this.f26678l = atomicReferenceFieldUpdater4;
        this.f26679m = atomicReferenceFieldUpdater5;
    }

    @Override // va.b
    public final boolean g(h hVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f26678l;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == cVar);
        return false;
    }

    @Override // va.b
    public final boolean h(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f26679m;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // va.b
    public final boolean i(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f26677k;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override // va.b
    public final void q(g gVar, g gVar2) {
        this.f26676j.lazySet(gVar, gVar2);
    }

    @Override // va.b
    public final void r(g gVar, Thread thread) {
        this.f26675i.lazySet(gVar, thread);
    }
}
