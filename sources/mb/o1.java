package mb;

/* loaded from: classes3.dex */
public final class o1 extends q2 {
    public final String a;

    public o1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q2) {
            return this.a.equals(((o1) ((q2) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return vd.e.h(new StringBuilder("User{identifier="), this.a, "}");
    }
}
