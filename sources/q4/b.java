package Q4;

import D0.l;
import z.AbstractC2965e;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2512a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2513c;

    public b(String str, long j7, int i9) {
        this.f2512a = str;
        this.b = j7;
        this.f2513c = i9;
    }

    public static l a() {
        l lVar = new l((byte) 0, 5);
        lVar.f627d = 0L;
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f2512a;
        if (str != null ? str.equals(bVar.f2512a) : bVar.f2512a == null) {
            if (this.b == bVar.b) {
                int i9 = bVar.f2513c;
                int i10 = this.f2513c;
                if (i10 == 0) {
                    if (i9 == 0) {
                        return true;
                    }
                } else if (AbstractC2965e.a(i10, i9)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        String str = this.f2512a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j7 = this.b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        int i11 = this.f2513c;
        if (i11 != 0) {
            i9 = AbstractC2965e.d(i11);
        }
        return i9 ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f2512a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i9 = this.f2513c;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    str = "null";
                } else {
                    str = "AUTH_ERROR";
                }
            } else {
                str = "BAD_CONFIG";
            }
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
