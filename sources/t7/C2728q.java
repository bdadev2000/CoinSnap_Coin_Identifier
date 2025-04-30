package t7;

/* renamed from: t7.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2728q implements Comparable {
    public final int b;

    public /* synthetic */ C2728q(int i9) {
        this.b = i9;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return G7.j.f(this.b ^ Integer.MIN_VALUE, ((C2728q) obj).b ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2728q)) {
            return false;
        }
        if (this.b != ((C2728q) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return String.valueOf(this.b & 4294967295L);
    }
}
