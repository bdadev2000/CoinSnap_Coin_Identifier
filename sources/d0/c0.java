package d0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c0 implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public q0.a f30126a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30127b;

    private final Object writeReplace() {
        return new d(getValue());
    }

    @Override // d0.h
    public final Object getValue() {
        if (this.f30127b == x.f30144a) {
            q0.a aVar = this.f30126a;
            p0.a.p(aVar);
            this.f30127b = aVar.invoke();
            this.f30126a = null;
        }
        return this.f30127b;
    }

    public final String toString() {
        return this.f30127b != x.f30144a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
