package Q4;

import z.AbstractC2965e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2508a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2509c;

    /* renamed from: d, reason: collision with root package name */
    public final b f2510d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2511e;

    public a(String str, String str2, String str3, b bVar, int i9) {
        this.f2508a = str;
        this.b = str2;
        this.f2509c = str3;
        this.f2510d = bVar;
        this.f2511e = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f2508a;
        if (str != null ? str.equals(aVar.f2508a) : aVar.f2508a == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(aVar.b) : aVar.b == null) {
                String str3 = this.f2509c;
                if (str3 != null ? str3.equals(aVar.f2509c) : aVar.f2509c == null) {
                    b bVar = this.f2510d;
                    if (bVar != null ? bVar.equals(aVar.f2510d) : aVar.f2510d == null) {
                        int i9 = this.f2511e;
                        if (i9 == 0) {
                            if (aVar.f2511e == 0) {
                                return true;
                            }
                        } else if (AbstractC2965e.a(i9, aVar.f2511e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i9 = 0;
        String str = this.f2508a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f2509c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        b bVar = this.f2510d;
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        int i14 = this.f2511e;
        if (i14 != 0) {
            i9 = AbstractC2965e.d(i14);
        }
        return i9 ^ i13;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f2508a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.f2509c);
        sb.append(", authToken=");
        sb.append(this.f2510d);
        sb.append(", responseCode=");
        int i9 = this.f2511e;
        if (i9 != 1) {
            if (i9 != 2) {
                str = "null";
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
