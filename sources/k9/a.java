package k9;

/* loaded from: classes3.dex */
public final class a {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20384b;

    public a(long j3, long j10) {
        this.a = j3;
        this.f20384b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.f20384b == aVar.f20384b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.f20384b);
    }
}
