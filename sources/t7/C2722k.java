package t7;

import java.io.Serializable;

/* renamed from: t7.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2722k implements Serializable {
    public final Object b;

    public /* synthetic */ C2722k(Object obj) {
        this.b = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof C2721j) {
            return ((C2721j) obj).b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2722k)) {
            return false;
        }
        if (!G7.j.a(this.b, ((C2722k) obj).b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        if (obj instanceof C2721j) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
