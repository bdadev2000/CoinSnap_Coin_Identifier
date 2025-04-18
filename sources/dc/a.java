package dc;

/* loaded from: classes3.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16968b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16969c;

    public a(String str, long j3, long j10) {
        this.a = str;
        this.f16968b = j3;
        this.f16969c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a.equals(aVar.a) && this.f16968b == aVar.f16968b && this.f16969c == aVar.f16969c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j3 = this.f16968b;
        long j10 = this.f16969c;
        return ((hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f16968b);
        sb2.append(", tokenCreationTimestamp=");
        return a4.j.j(sb2, this.f16969c, "}");
    }
}
