package w4;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class L extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23747a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23748c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23749d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23750e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23751f;

    public L(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f23747a = str;
        this.b = str2;
        this.f23748c = str3;
        this.f23749d = str4;
        this.f23750e = str5;
        this.f23751f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f23747a.equals(((L) w0Var).f23747a)) {
            L l = (L) w0Var;
            if (this.b.equals(l.b)) {
                String str = l.f23748c;
                String str2 = this.f23748c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = l.f23749d;
                    String str4 = this.f23749d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = l.f23750e;
                        String str6 = this.f23750e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = l.f23751f;
                            String str8 = this.f23751f;
                            if (str8 == null) {
                                if (str7 == null) {
                                    return true;
                                }
                            } else if (str8.equals(str7)) {
                                return true;
                            }
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
        int hashCode4 = (((this.f23747a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i9 = 0;
        String str = this.f23748c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 ^ hashCode) * (-721379959);
        String str2 = this.f23749d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f23750e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        String str4 = this.f23751f;
        if (str4 != null) {
            i9 = str4.hashCode();
        }
        return i12 ^ i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f23747a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", displayVersion=");
        sb.append(this.f23748c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f23749d);
        sb.append(", developmentPlatform=");
        sb.append(this.f23750e);
        sb.append(", developmentPlatformVersion=");
        return AbstractC2914a.h(sb, this.f23751f, "}");
    }
}
