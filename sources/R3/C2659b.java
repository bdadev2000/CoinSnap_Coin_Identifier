package r3;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2659b {

    /* renamed from: a, reason: collision with root package name */
    public final long f22822a;
    public final k3.j b;

    /* renamed from: c, reason: collision with root package name */
    public final k3.i f22823c;

    public C2659b(long j7, k3.j jVar, k3.i iVar) {
        this.f22822a = j7;
        this.b = jVar;
        this.f22823c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2659b)) {
            return false;
        }
        C2659b c2659b = (C2659b) obj;
        if (this.f22822a == c2659b.f22822a && this.b.equals(c2659b.b) && this.f22823c.equals(c2659b.f22823c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f22822a;
        return ((((((int) ((j7 >>> 32) ^ j7)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f22823c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f22822a + ", transportContext=" + this.b + ", event=" + this.f22823c + "}";
    }
}
