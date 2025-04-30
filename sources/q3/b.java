package q3;

import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f22753a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f22754c;

    public b(long j7, long j9, Set set) {
        this.f22753a = j7;
        this.b = j9;
        this.f22754c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f22753a == bVar.f22753a && this.b == bVar.b && this.f22754c.equals(bVar.f22754c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f22753a;
        int i9 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        long j9 = this.b;
        return ((i9 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f22754c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f22753a + ", maxAllowedDelay=" + this.b + ", flags=" + this.f22754c + "}";
    }
}
