package y7;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public static final y f28012c = new y(0, 0);
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28013b;

    public y(long j3, long j10) {
        this.a = j3;
        this.f28013b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        if (this.a == yVar.a && this.f28013b == yVar.f28013b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.f28013b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.a);
        sb2.append(", position=");
        return a4.j.j(sb2, this.f28013b, "]");
    }
}
