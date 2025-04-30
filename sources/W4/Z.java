package w4;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class Z extends B0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23807a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23808c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23809d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23810e;

    public Z(long j7, String str, String str2, long j9, int i9) {
        this.f23807a = j7;
        this.b = str;
        this.f23808c = str2;
        this.f23809d = j9;
        this.f23810e = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        if (this.f23807a == ((Z) b02).f23807a) {
            Z z8 = (Z) b02;
            if (this.b.equals(z8.b)) {
                String str = z8.f23808c;
                String str2 = this.f23808c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f23809d == z8.f23809d && this.f23810e == z8.f23810e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j7 = this.f23807a;
        int hashCode2 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.f23808c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 ^ hashCode) * 1000003;
        long j9 = this.f23809d;
        return ((i9 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f23810e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f23807a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.f23808c);
        sb.append(", offset=");
        sb.append(this.f23809d);
        sb.append(", importance=");
        return AbstractC2914a.g(sb, this.f23810e, "}");
    }
}
