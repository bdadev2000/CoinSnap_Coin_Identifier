package h0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class n implements g, j0.d {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30727b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    public final g f30728a;

    @Nullable
    private volatile Object result;

    public n(i0.a aVar, g gVar) {
        this.f30728a = gVar;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        i0.a aVar = i0.a.f30807b;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30727b;
            i0.a aVar2 = i0.a.f30806a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return i0.a.f30806a;
        }
        if (obj == i0.a.f30808c) {
            return i0.a.f30806a;
        }
        if (obj instanceof d0.m) {
            throw ((d0.m) obj).f30136a;
        }
        return obj;
    }

    @Override // j0.d
    public final j0.d getCallerFrame() {
        g gVar = this.f30728a;
        if (gVar instanceof j0.d) {
            return (j0.d) gVar;
        }
        return null;
    }

    @Override // h0.g
    public final l getContext() {
        return this.f30728a.getContext();
    }

    @Override // h0.g
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            i0.a aVar = i0.a.f30807b;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30727b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            i0.a aVar2 = i0.a.f30806a;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f30727b;
            i0.a aVar3 = i0.a.f30808c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f30728a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f30728a;
    }

    public n(g gVar) {
        i0.a aVar = i0.a.f30807b;
        this.f30728a = gVar;
        this.result = aVar;
    }
}
