package d4;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2173a {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2173a) {
            return ((s) this).b.equals(((s) ((AbstractC2173a) obj)).b);
        }
        return false;
    }

    public final int hashCode() {
        return ((s) this).b.hashCode();
    }

    public final String toString() {
        return ((s) this).b.toString();
    }
}
