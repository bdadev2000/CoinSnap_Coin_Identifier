package Q7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Q7.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0240h extends W {

    /* renamed from: g, reason: collision with root package name */
    public final C0238f f2568g;

    public C0240h(C0238f c0238f) {
        this.f2568g = c0238f;
    }

    @Override // F7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        l((Throwable) obj);
        return t7.y.f23029a;
    }

    @Override // Q7.Y
    public final void l(Throwable th) {
        d0 k6 = k();
        C0238f c0238f = this.f2568g;
        Throwable r9 = c0238f.r(k6);
        if (c0238f.x()) {
            w7.f fVar = c0238f.f2565f;
            G7.j.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            V7.h hVar = (V7.h) fVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V7.h.f3513j;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                H0.a aVar = V7.a.f3506d;
                if (G7.j.a(obj, aVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, r9)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                            break;
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
            }
        }
        c0238f.l(r9);
        if (!c0238f.x()) {
            c0238f.p();
        }
    }
}
