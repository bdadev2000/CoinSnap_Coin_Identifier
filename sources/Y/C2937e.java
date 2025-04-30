package y;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2937e extends R2.b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24258a;
    public final AtomicReferenceFieldUpdater b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24259c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24260d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24261e;

    public C2937e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f24258a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.f24259c = atomicReferenceFieldUpdater3;
        this.f24260d = atomicReferenceFieldUpdater4;
        this.f24261e = atomicReferenceFieldUpdater5;
    }

    @Override // R2.b
    public final boolean f(h hVar, C2936d c2936d, C2936d c2936d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24260d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, c2936d, c2936d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == c2936d);
        return false;
    }

    @Override // R2.b
    public final boolean g(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24261e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // R2.b
    public final boolean h(h hVar, C2939g c2939g, C2939g c2939g2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24259c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, c2939g, c2939g2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == c2939g);
        return false;
    }

    @Override // R2.b
    public final void v(C2939g c2939g, C2939g c2939g2) {
        this.b.lazySet(c2939g, c2939g2);
    }

    @Override // R2.b
    public final void w(C2939g c2939g, Thread thread) {
        this.f24258a.lazySet(c2939g, thread);
    }
}
