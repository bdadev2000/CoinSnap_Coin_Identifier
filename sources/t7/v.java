package t7;

/* loaded from: classes3.dex */
public final class v implements Comparable {
    public final short b;

    public /* synthetic */ v(short s5) {
        this.b = s5;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return G7.j.f(this.b & 65535, ((v) obj).b & 65535);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (this.b != ((v) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Short.hashCode(this.b);
    }

    public final String toString() {
        return String.valueOf(65535 & this.b);
    }
}
