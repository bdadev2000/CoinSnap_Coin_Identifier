package z8;

/* loaded from: classes3.dex */
public final class q {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28652b;

    public q(long j3, long j10) {
        this.a = j3;
        this.f28652b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.a == qVar.a && this.f28652b == qVar.f28652b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.f28652b);
    }
}
