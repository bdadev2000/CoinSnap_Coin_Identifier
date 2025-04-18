package k4;

/* loaded from: classes.dex */
public final class s {
    public final String a;

    public s(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.a.equals(((s) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vd.e.h(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
