package va;

import a4.j;

/* loaded from: classes3.dex */
public final class a {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26374b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26375c;

    public a(long j3, long j10, long j11) {
        this.a = j3;
        this.f26374b = j10;
        this.f26375c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.f26374b == aVar.f26374b && this.f26375c == aVar.f26375c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        long j10 = this.f26374b;
        int i10 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f26375c;
        return i10 ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f26374b);
        sb2.append(", uptimeMillis=");
        return j.j(sb2, this.f26375c, "}");
    }
}
