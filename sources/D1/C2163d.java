package d1;

/* renamed from: d1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2163d {

    /* renamed from: a, reason: collision with root package name */
    public final String f19796a;
    public final int b;

    public C2163d(String str, int i9) {
        this.f19796a = str;
        this.b = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2163d)) {
            return false;
        }
        C2163d c2163d = (C2163d) obj;
        if (this.b != c2163d.b) {
            return false;
        }
        return this.f19796a.equals(c2163d.f19796a);
    }

    public final int hashCode() {
        return (this.f19796a.hashCode() * 31) + this.b;
    }
}
