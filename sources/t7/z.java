package t7;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class z implements InterfaceC2717f, Serializable {
    public F7.a b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23030c;

    private final Object writeReplace() {
        return new C2715d(getValue());
    }

    @Override // t7.InterfaceC2717f
    public final Object getValue() {
        if (this.f23030c == u.f23028a) {
            F7.a aVar = this.b;
            G7.j.b(aVar);
            this.f23030c = aVar.invoke();
            this.b = null;
        }
        return this.f23030c;
    }

    public final String toString() {
        if (this.f23030c != u.f23028a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
