package g4;

import Q7.n0;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2291a {

    /* renamed from: a, reason: collision with root package name */
    public final long f20426a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20427c;

    public C2291a(long j7, long j9, long j10) {
        this.f20426a = j7;
        this.b = j9;
        this.f20427c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2291a)) {
            return false;
        }
        C2291a c2291a = (C2291a) obj;
        if (this.f20426a == c2291a.f20426a && this.b == c2291a.b && this.f20427c == c2291a.f20427c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f20426a;
        long j9 = this.b;
        int i9 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f20427c;
        return i9 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f20426a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return n0.k(sb, this.f20427c, "}");
    }
}
