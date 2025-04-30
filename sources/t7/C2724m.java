package t7;

import java.io.Serializable;

/* renamed from: t7.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2724m implements InterfaceC2717f, Serializable {
    public F7.a b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f23024c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23025d;

    public C2724m(F7.a aVar) {
        G7.j.e(aVar, "initializer");
        this.b = aVar;
        this.f23024c = u.f23028a;
        this.f23025d = this;
    }

    private final Object writeReplace() {
        return new C2715d(getValue());
    }

    @Override // t7.InterfaceC2717f
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f23024c;
        u uVar = u.f23028a;
        if (obj2 != uVar) {
            return obj2;
        }
        synchronized (this.f23025d) {
            obj = this.f23024c;
            if (obj == uVar) {
                F7.a aVar = this.b;
                G7.j.b(aVar);
                obj = aVar.invoke();
                this.f23024c = obj;
                this.b = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f23024c != u.f23028a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
