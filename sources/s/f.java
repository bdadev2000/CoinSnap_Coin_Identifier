package s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24132b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24133c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24134d;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24135f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24136g;

    public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(0);
        this.f24132b = atomicReferenceFieldUpdater;
        this.f24133c = atomicReferenceFieldUpdater2;
        this.f24134d = atomicReferenceFieldUpdater3;
        this.f24135f = atomicReferenceFieldUpdater4;
        this.f24136g = atomicReferenceFieldUpdater5;
    }

    @Override // s.a
    public final boolean e(i iVar, e eVar, e eVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24135f;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, eVar, eVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == eVar);
        return false;
    }

    @Override // s.a
    public final boolean f(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24136g;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // s.a
    public final boolean g(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24134d;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }

    @Override // s.a
    public final void p(h hVar, h hVar2) {
        this.f24133c.lazySet(hVar, hVar2);
    }

    @Override // s.a
    public final void q(h hVar, Thread thread) {
        this.f24132b.lazySet(hVar, thread);
    }
}
