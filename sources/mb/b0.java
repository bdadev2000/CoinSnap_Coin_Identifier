package mb;

/* loaded from: classes3.dex */
public final class b0 extends s2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f21842b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21843c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21844d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21845e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21846f;

    /* renamed from: g, reason: collision with root package name */
    public final String f21847g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21848h;

    /* renamed from: i, reason: collision with root package name */
    public final String f21849i;

    /* renamed from: j, reason: collision with root package name */
    public final String f21850j;

    /* renamed from: k, reason: collision with root package name */
    public final r2 f21851k;

    /* renamed from: l, reason: collision with root package name */
    public final x1 f21852l;

    /* renamed from: m, reason: collision with root package name */
    public final u1 f21853m;

    public b0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, r2 r2Var, x1 x1Var, u1 u1Var) {
        this.f21842b = str;
        this.f21843c = str2;
        this.f21844d = i10;
        this.f21845e = str3;
        this.f21846f = str4;
        this.f21847g = str5;
        this.f21848h = str6;
        this.f21849i = str7;
        this.f21850j = str8;
        this.f21851k = r2Var;
        this.f21852l = x1Var;
        this.f21853m = u1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        b0 b0Var = (b0) ((s2) obj);
        if (this.f21842b.equals(b0Var.f21842b)) {
            if (this.f21843c.equals(b0Var.f21843c) && this.f21844d == b0Var.f21844d && this.f21845e.equals(b0Var.f21845e)) {
                String str = b0Var.f21846f;
                String str2 = this.f21846f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = b0Var.f21847g;
                    String str4 = this.f21847g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = b0Var.f21848h;
                        String str6 = this.f21848h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.f21849i.equals(b0Var.f21849i) && this.f21850j.equals(b0Var.f21850j)) {
                                r2 r2Var = b0Var.f21851k;
                                r2 r2Var2 = this.f21851k;
                                if (r2Var2 != null ? r2Var2.equals(r2Var) : r2Var == null) {
                                    x1 x1Var = b0Var.f21852l;
                                    x1 x1Var2 = this.f21852l;
                                    if (x1Var2 != null ? x1Var2.equals(x1Var) : x1Var == null) {
                                        u1 u1Var = b0Var.f21853m;
                                        u1 u1Var2 = this.f21853m;
                                        if (u1Var2 == null) {
                                            if (u1Var == null) {
                                                return true;
                                            }
                                        } else if (u1Var2.equals(u1Var)) {
                                            return true;
                                        }
                                    }
                                }
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
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((((((this.f21842b.hashCode() ^ 1000003) * 1000003) ^ this.f21843c.hashCode()) * 1000003) ^ this.f21844d) * 1000003) ^ this.f21845e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f21846f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f21847g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.f21848h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i12 ^ hashCode3) * 1000003) ^ this.f21849i.hashCode()) * 1000003) ^ this.f21850j.hashCode()) * 1000003;
        r2 r2Var = this.f21851k;
        if (r2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f21852l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i14 = (i13 ^ hashCode5) * 1000003;
        u1 u1Var = this.f21853m;
        if (u1Var != null) {
            i10 = u1Var.hashCode();
        }
        return i14 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f21842b + ", gmpAppId=" + this.f21843c + ", platform=" + this.f21844d + ", installationUuid=" + this.f21845e + ", firebaseInstallationId=" + this.f21846f + ", firebaseAuthenticationToken=" + this.f21847g + ", appQualitySessionId=" + this.f21848h + ", buildVersion=" + this.f21849i + ", displayVersion=" + this.f21850j + ", session=" + this.f21851k + ", ndkPayload=" + this.f21852l + ", appExitInfo=" + this.f21853m + "}";
    }
}
