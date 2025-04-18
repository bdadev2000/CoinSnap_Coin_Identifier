package o7;

/* loaded from: classes3.dex */
public final class b {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final i7.i f23140b;

    /* renamed from: c, reason: collision with root package name */
    public final i7.h f23141c;

    public b(long j3, i7.i iVar, i7.h hVar) {
        this.a = j3;
        if (iVar != null) {
            this.f23140b = iVar;
            this.f23141c = hVar;
            return;
        }
        throw new NullPointerException("Null transportContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && this.f23140b.equals(bVar.f23140b) && this.f23141c.equals(bVar.f23141c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f23140b.hashCode()) * 1000003) ^ this.f23141c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.f23140b + ", event=" + this.f23141c + "}";
    }
}
