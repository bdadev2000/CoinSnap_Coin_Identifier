package mb;

/* loaded from: classes3.dex */
public final class u0 extends b2 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22107b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22108c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22109d;

    public u0(long j3, long j10, String str, String str2) {
        this.a = j3;
        this.f22107b = j10;
        this.f22108c = str;
        this.f22109d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        if (this.a == ((u0) b2Var).a) {
            u0 u0Var = (u0) b2Var;
            if (this.f22107b == u0Var.f22107b && this.f22108c.equals(u0Var.f22108c)) {
                String str = u0Var.f22109d;
                String str2 = this.f22109d;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.a;
        long j10 = this.f22107b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f22108c.hashCode()) * 1000003;
        String str = this.f22109d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.a);
        sb2.append(", size=");
        sb2.append(this.f22107b);
        sb2.append(", name=");
        sb2.append(this.f22108c);
        sb2.append(", uuid=");
        return vd.e.h(sb2, this.f22109d, "}");
    }
}
