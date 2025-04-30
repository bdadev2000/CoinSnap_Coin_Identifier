package O4;

import Q7.n0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2177a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2178c;

    public a(String str, long j7, long j9) {
        this.f2177a = str;
        this.b = j7;
        this.f2178c = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2177a.equals(aVar.f2177a) && this.b == aVar.b && this.f2178c == aVar.f2178c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2177a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.b;
        long j9 = this.f2178c;
        return ((hashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f2177a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return n0.k(sb, this.f2178c, "}");
    }
}
