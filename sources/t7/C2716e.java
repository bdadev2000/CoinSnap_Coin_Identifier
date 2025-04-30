package t7;

/* renamed from: t7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2716e implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final C2716e f23017c = new C2716e();
    public final int b = 131072;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2716e c2716e = (C2716e) obj;
        G7.j.e(c2716e, "other");
        return this.b - c2716e.b;
    }

    public final boolean equals(Object obj) {
        C2716e c2716e;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2716e) {
            c2716e = (C2716e) obj;
        } else {
            c2716e = null;
        }
        if (c2716e != null && this.b == c2716e.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return "2.0.0";
    }
}
