package mb;

/* loaded from: classes3.dex */
public final class h1 extends k2 {
    public final String a;

    public h1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            return this.a.equals(((h1) ((k2) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return vd.e.h(new StringBuilder("Log{content="), this.a, "}");
    }
}
