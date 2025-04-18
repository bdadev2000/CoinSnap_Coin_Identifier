package ze;

/* loaded from: classes4.dex */
public final class b implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final int f28749b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28750c;

    public b(int i10, int i11) {
        this.f28749b = i10;
        this.f28750c = i11;
    }

    public final b a() {
        return new b(this.f28750c, this.f28749b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        return (this.f28749b * this.f28750c) - (bVar.f28749b * bVar.f28750c);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f28749b != bVar.f28749b || this.f28750c != bVar.f28750c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f28749b;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f28750c;
    }

    public final String toString() {
        return this.f28749b + "x" + this.f28750c;
    }
}
