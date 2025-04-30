package c4;

import java.io.Serializable;
import java.util.Arrays;
import z2.i;

/* loaded from: classes2.dex */
public final class h implements e, Serializable {
    private static final long serialVersionUID = 0;
    public final Object b;

    public h(Object obj) {
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return i.h(this.b, ((h) obj).b);
        }
        return false;
    }

    @Override // c4.e
    public final Object get() {
        return this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
