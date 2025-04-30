package f1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y2.AbstractC2947c;

/* renamed from: f1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2256e extends AbstractC2947c {
    public final AtomicReferenceFieldUpdater b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20253c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20254d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20255e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20256f;

    public C2256e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.b = atomicReferenceFieldUpdater;
        this.f20253c = atomicReferenceFieldUpdater2;
        this.f20254d = atomicReferenceFieldUpdater3;
        this.f20255e = atomicReferenceFieldUpdater4;
        this.f20256f = atomicReferenceFieldUpdater5;
    }

    @Override // y2.AbstractC2947c
    public final boolean e(AbstractC2260i abstractC2260i, C2255d c2255d, C2255d c2255d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f20255e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2260i, c2255d, c2255d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2260i) == c2255d);
        return false;
    }

    @Override // y2.AbstractC2947c
    public final boolean f(AbstractC2260i abstractC2260i, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f20256f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2260i, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2260i) == obj);
        return false;
    }

    @Override // y2.AbstractC2947c
    public final boolean g(AbstractC2260i abstractC2260i, C2259h c2259h, C2259h c2259h2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f20254d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2260i, c2259h, c2259h2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2260i) == c2259h);
        return false;
    }

    @Override // y2.AbstractC2947c
    public final void s(C2259h c2259h, C2259h c2259h2) {
        this.f20253c.lazySet(c2259h, c2259h2);
    }

    @Override // y2.AbstractC2947c
    public final void t(C2259h c2259h, Thread thread) {
        this.b.lazySet(c2259h, thread);
    }
}
