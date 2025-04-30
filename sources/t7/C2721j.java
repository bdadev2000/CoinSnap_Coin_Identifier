package t7;

import java.io.Serializable;

/* renamed from: t7.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2721j implements Serializable {
    public final Throwable b;

    public C2721j(Throwable th) {
        G7.j.e(th, "exception");
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2721j) {
            if (G7.j.a(this.b, ((C2721j) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.b + ')';
    }
}
