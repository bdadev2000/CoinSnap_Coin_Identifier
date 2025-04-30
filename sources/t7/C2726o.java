package t7;

/* renamed from: t7.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2726o implements Comparable {
    public final byte b;

    public /* synthetic */ C2726o(byte b) {
        this.b = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return G7.j.f(this.b & 255, ((C2726o) obj).b & 255);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2726o)) {
            return false;
        }
        if (this.b != ((C2726o) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Byte.hashCode(this.b);
    }

    public final String toString() {
        return String.valueOf(this.b & 255);
    }
}
