package d0;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class o implements h, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30138c = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile q0.a f30139a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f30140b;

    private final Object writeReplace() {
        return new d(getValue());
    }

    @Override // d0.h
    public final Object getValue() {
        Object obj = this.f30140b;
        x xVar = x.f30144a;
        if (obj != xVar) {
            return obj;
        }
        q0.a aVar = this.f30139a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30138c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != xVar) {
                }
            }
            this.f30139a = null;
            return invoke;
        }
        return this.f30140b;
    }

    public final String toString() {
        return this.f30140b != x.f30144a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
