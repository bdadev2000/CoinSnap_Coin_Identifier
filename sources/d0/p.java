package d0;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class p implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public q0.a f30141a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f30142b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30143c;

    public p(q0.a aVar) {
        p0.a.s(aVar, "initializer");
        this.f30141a = aVar;
        this.f30142b = x.f30144a;
        this.f30143c = this;
    }

    private final Object writeReplace() {
        return new d(getValue());
    }

    @Override // d0.h
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f30142b;
        x xVar = x.f30144a;
        if (obj2 != xVar) {
            return obj2;
        }
        synchronized (this.f30143c) {
            obj = this.f30142b;
            if (obj == xVar) {
                q0.a aVar = this.f30141a;
                p0.a.p(aVar);
                obj = aVar.invoke();
                this.f30142b = obj;
                this.f30141a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f30142b != x.f30144a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
