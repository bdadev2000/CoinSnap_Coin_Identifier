package n7;

import java.util.Set;

/* loaded from: classes3.dex */
public final class b {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22462b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f22463c;

    public b(long j3, long j10, Set set) {
        this.a = j3;
        this.f22462b = j10;
        this.f22463c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && this.f22462b == bVar.f22462b && this.f22463c.equals(bVar.f22463c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        int i10 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f22462b;
        return ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f22463c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.f22462b + ", flags=" + this.f22463c + "}";
    }
}
