package mb;

/* loaded from: classes3.dex */
public final class k0 extends z1 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21986b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21987c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21988d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21989e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21990f;

    public k0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.f21986b = str2;
        this.f21987c = str3;
        this.f21988d = str4;
        this.f21989e = str5;
        this.f21990f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        if (this.a.equals(((k0) z1Var).a)) {
            k0 k0Var = (k0) z1Var;
            if (this.f21986b.equals(k0Var.f21986b)) {
                String str = k0Var.f21987c;
                String str2 = this.f21987c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = k0Var.f21988d;
                    String str4 = this.f21988d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = k0Var.f21989e;
                        String str6 = this.f21989e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = k0Var.f21990f;
                            String str8 = this.f21990f;
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
        int hashCode4 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f21986b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f21987c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (((hashCode4 ^ hashCode) * 1000003) ^ 0) * 1000003;
        String str2 = this.f21988d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.f21989e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str4 = this.f21990f;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.a);
        sb2.append(", version=");
        sb2.append(this.f21986b);
        sb2.append(", displayVersion=");
        sb2.append(this.f21987c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f21988d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f21989e);
        sb2.append(", developmentPlatformVersion=");
        return vd.e.h(sb2, this.f21990f, "}");
    }
}
