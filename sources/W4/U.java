package w4;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class U extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23791a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23792c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23793d;

    public U(String str, String str2, long j7, long j9) {
        this.f23791a = j7;
        this.b = j9;
        this.f23792c = str;
        this.f23793d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f23791a == ((U) y0Var).f23791a) {
            U u8 = (U) y0Var;
            if (this.b == u8.b && this.f23792c.equals(u8.f23792c)) {
                String str = u8.f23793d;
                String str2 = this.f23793d;
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
        long j7 = this.f23791a;
        long j9 = this.b;
        int hashCode2 = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f23792c.hashCode()) * 1000003;
        String str = this.f23793d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f23791a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.f23792c);
        sb.append(", uuid=");
        return AbstractC2914a.h(sb, this.f23793d, "}");
    }
}
