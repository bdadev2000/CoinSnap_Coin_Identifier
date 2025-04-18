package mb;

/* loaded from: classes3.dex */
public final class c1 extends e2 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21870b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21871c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21872d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21873e;

    public c1(long j3, String str, String str2, long j10, int i10) {
        this.a = j3;
        this.f21870b = str;
        this.f21871c = str2;
        this.f21872d = j10;
        this.f21873e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        if (this.a == ((c1) e2Var).a) {
            c1 c1Var = (c1) e2Var;
            if (this.f21870b.equals(c1Var.f21870b)) {
                String str = c1Var.f21871c;
                String str2 = this.f21871c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f21872d == c1Var.f21872d && this.f21873e == c1Var.f21873e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.a;
        int hashCode2 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f21870b.hashCode()) * 1000003;
        String str = this.f21871c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        long j10 = this.f21872d;
        return ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f21873e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.a);
        sb2.append(", symbol=");
        sb2.append(this.f21870b);
        sb2.append(", file=");
        sb2.append(this.f21871c);
        sb2.append(", offset=");
        sb2.append(this.f21872d);
        sb2.append(", importance=");
        return vd.e.g(sb2, this.f21873e, "}");
    }
}
