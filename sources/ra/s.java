package ra;

import java.io.Serializable;
import java.util.Arrays;
import v8.u0;

/* loaded from: classes3.dex */
public final class s implements p, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24073b;

    public s(Object obj) {
        this.f24073b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return u0.t(this.f24073b, ((s) obj).f24073b);
        }
        return false;
    }

    @Override // ra.p
    public final Object get() {
        return this.f24073b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24073b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24073b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
        sb2.append("Suppliers.ofInstance(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
